grammar IsiLang;

@header{
	import src.br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import src.br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import src.br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import src.br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import src.br.com.professorisidro.isilanguage.ast.IsiProgram;
	import src.br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import src.br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import src.br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import src.br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import src.br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import src.br.com.professorisidro.isilanguage.ast.CommandRepeticao;
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbol symbol;
	private IsiProgram program = new IsiProgram();
	private ArrayList<AbstractCommand> curThread;
	private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
	
	public void verificaID(String id){
		if (!symbolTable.exists(id)){
			throw new IsiSemanticException("Symbol "+id+" not declared");
		}
	}

	public void verificaValorID(String id){
    		if (!symbolTable.initialized(id)){
    			throw new IsiSemanticException("Symbol "+id+" not initialized");
    		}
    	}

	public void setarInitialized(String id){
        		symbolTable.get(id).setInitialized(true);
        	}

	public void exibeComandos(){
		for (AbstractCommand c: program.getComandos()){
			System.out.println(c);
		}
	}
	
	public void generateCode(){
		program.generateTarget();
	}
}

inicio_e_fim_do_programa	: 'programa' declarar_variaveis bloco  'fimprog.'
           {  program.setVarTable(symbolTable);
           	  program.setComandos(stack.pop());
           	 
           } 
		;
		
declarar_variaveis    :  (declara_variavel)+
        ;
        
        
declara_variavel :  tipos_variaveis NOME_VARIAVEL  {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    } 
              (  VIRGULA
              	 NOME_VARIAVEL {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              )* 
               PONTO_FINAL
           ;
           
tipos_variaveis       : 'int' { _tipo = IsiVariable.INT;  }
                      | 'real'  { _tipo = IsiVariable.REAL;  }
                      | 'texto'  { _tipo = IsiVariable.TEXT;  }
           ;
        
bloco	: { curThread = new ArrayList<AbstractCommand>(); 
	        stack.push(curThread);  
          }
          (comandos)+
		;
		

comandos : leitura
 		|  escrita
 		|  atribuicao
 		|  condicional
 		|  repeticao
		;

leitura	: 'leia' ABRE_PARENTESES
                     NOME_VARIAVEL { verificaID(_input.LT(-1).getText());
                     	  _readID = _input.LT(-1).getText();
                     	  setarInitialized(_readID);
                        } 
                     FECHA_PARENTESES
                     PONTO_FINAL
                     
              {
              	IsiVariable var = (IsiVariable)symbolTable.get(_readID);
              	CommandLeitura cmd = new CommandLeitura(_readID, var);
              	stack.peek().add(cmd);
              }   
			;
			
escrita	: 'escreva'
                 ABRE_PARENTESES
                 ( TEXTO { _writeID = _input.LT(-1).getText(); }
                 | NOME_VARIAVEL { verificaID(_input.LT(-1).getText());
                  verificaValorID(_input.LT(-1).getText());
	                  _writeID = _input.LT(-1).getText();
                     } )
                 FECHA_PARENTESES
                 PONTO_FINAL
               {
               	  CommandEscrita cmd = new CommandEscrita(_writeID);
               	  stack.peek().add(cmd);
               }
			;
			
atribuicao	:  NOME_VARIAVEL { verificaID(_input.LT(-1).getText());
                    _exprID = _input.LT(-1).getText();
                    setarInitialized(_exprID);
                   } 
               ATRIBUIR { _exprContent = ""; }
               expressoes
               PONTO_FINAL
               {
               	 CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
               	 stack.peek().add(cmd);
               }
			;
			
			
condicional  :  'se' ABRE_PARENTESES
                    (NOME_VARIAVEL | NUMERO_REAL | INTEIRO)    { _exprDecision = _input.LT(-1).getText(); }
                    OPERADORES_RELACIONAIS { _exprDecision += _input.LT(-1).getText(); }
                    (NOME_VARIAVEL | NUMERO_REAL | INTEIRO) {_exprDecision += _input.LT(-1).getText(); }
                    FECHA_PARENTESES
                    'entao'
                    ABRE_CHAVES
                    { curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (comandos)+
                    
                    FECHA_CHAVES
                    {
                       listaTrue = stack.pop();	
                    } 
                   ('senao' 
                   	 ABRE_CHAVES
                   	 {
                   	 	curThread = new ArrayList<AbstractCommand>();
                   	 	stack.push(curThread);
                   	 } 
                   	(comandos+)
                   	FECHA_CHAVES
                   	{
                   		listaFalse = stack.pop();
                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
                   		stack.peek().add(cmd);
                   	}
                   )?
            ;

repeticao  :  'enquanto' ABRE_PARENTESES
                    (NOME_VARIAVEL | NUMERO_REAL | INTEIRO)    { _exprDecision = _input.LT(-1).getText(); }
                    OPERADORES_RELACIONAIS { _exprDecision += _input.LT(-1).getText(); }
                    (NOME_VARIAVEL | NUMERO_REAL | INTEIRO) {_exprDecision += _input.LT(-1).getText(); }
                    FECHA_PARENTESES
                    'fazer'
                    ABRE_CHAVES
                    { curThread = new ArrayList<AbstractCommand>();
                      stack.push(curThread);
                    }
                    (comandos)+

                    FECHA_CHAVES
                    {
                       listaTrue = stack.pop();
                       CommandRepeticao cmd = new CommandRepeticao(_exprDecision, listaTrue);
                       stack.peek().add(cmd);
                    }
            ;
			
expressoes		:  termo (OPERADORES  { _exprContent += _input.LT(-1).getText();} termo)*;
			
termo		: NOME_VARIAVEL { verificaID(_input.LT(-1).getText()); _exprContent += _input.LT(-1).getText(); verificaValorID(_input.LT(-1).getText()); }
            | 
              NUMERO_REAL
              {
              	_exprContent += _input.LT(-1).getText();
              }
            |
              INTEIRO
               {
                  	_exprContent += _input.LT(-1).getText();
               }

            |
              TEXTO
               {
                 	_exprContent += _input.LT(-1).getText();
               }
			;
			
	
ABRE_PARENTESES	: '(';
	
FECHA_PARENTESES : ')';
	
PONTO_FINAL	: '.';
	
OPERADORES	: '+' | '-' | '*' | '/';
	
ATRIBUIR : ':=' ;
	 
VIRGULA  : ',';
     
ABRE_CHAVES  : '{';
     
FECHA_CHAVES  : '}';

OPERADORES_RELACIONAIS : '>' | '<' | '>=' | '<=' | '==' | '!=';
      
NOME_VARIAVEL	: [a-z] ([a-z] | [A-Z] | [0-9])*;

TEXTO	:'"' ([a-z] | [A-Z] | [0-9] | ' ' | '('| ')'| '{'| '}'| '/'| '?'| '!'| '.'| ','| ':'| ';'| '@'| '#')* '"';
	
NUMERO_REAL	: [0-9]+ ('.' [0-9]+)?;

INTEIRO	: [0-9]+;
		
IGNORAR	: (' ' | '\t' | '\n' | '\r') -> skip;