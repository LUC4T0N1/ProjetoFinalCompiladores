// Generated from D:/ProjetoFinalCompiladores/src/main/java\IsiLang.g4 by ANTLR 4.9.1
package src.br.com.professorisidro.isilanguage.teste.testeparsers;

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
	import src.br.com.professorisidro.isilanguage.ast.CommandDoWhile;
	import src.br.com.professorisidro.isilanguage.ast.CommandAdicionar;
	import src.br.com.professorisidro.isilanguage.ast.CommandObter;
	import src.br.com.professorisidro.isilanguage.ast.CommandAtribuirEObter;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ABRE_PARENTESES=16, 
		FECHA_PARENTESES=17, PONTO_FINAL=18, OPERADORES=19, ATRIBUIR=20, ADICIONAR=21, 
		VIRGULA=22, ABRE_CHAVES=23, OBTER=24, FECHA_CHAVES=25, OPERADORES_RELACIONAIS=26, 
		NOME_VARIAVEL=27, TEXTO=28, NUMERO_REAL=29, INTEIRO=30, IGNORAR=31;
	public static final int
		RULE_inicio_e_fim_do_programa = 0, RULE_declarar_variaveis = 1, RULE_declara_variavel = 2, 
		RULE_tipos_variaveis = 3, RULE_bloco = 4, RULE_comandos = 5, RULE_obter = 6, 
		RULE_leitura = 7, RULE_escrita = 8, RULE_atribuicao = 9, RULE_condicional = 10, 
		RULE_repeticao = 11, RULE_expressoes = 12, RULE_termo = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio_e_fim_do_programa", "declarar_variaveis", "declara_variavel", 
			"tipos_variaveis", "bloco", "comandos", "obter", "leitura", "escrita", 
			"atribuicao", "condicional", "repeticao", "expressoes", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'int'", "'real'", "'texto'", "'lista<int>'", 
			"'lista<texto>'", "'lista<real>'", "'leia'", "'escreva'", "'se'", "'entao'", 
			"'senao'", "'enquanto'", "'fazer'", "'('", "')'", "'.'", null, "':='", 
			"'adc'", "','", "'{'", "'.obter'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ABRE_PARENTESES", "FECHA_PARENTESES", "PONTO_FINAL", 
			"OPERADORES", "ATRIBUIR", "ADICIONAR", "VIRGULA", "ABRE_CHAVES", "OBTER", 
			"FECHA_CHAVES", "OPERADORES_RELACIONAIS", "NOME_VARIAVEL", "TEXTO", "NUMERO_REAL", 
			"INTEIRO", "IGNORAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _readIDLista;
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

	    public void verificaSeFoiUsada(IsiSymbol id){
	            if (!id.isUsed()){
	                System.out.println("\nWARNING: Variable "+id.getName()+" was daclared but is not being used");
	            }
	        }

	    public void setarUsada(String id){
	                symbolTable.get(id).setUsed(true);
	            }

	    public void verificaTipo(String id, String expr){
	              IsiVariable var = (IsiVariable)symbolTable.get(id);
	              if (!var.verificaTipo(expr, symbolTable)){
	                  throw new IsiSemanticException("variable "+ id +" is being assigned as the wrong type");
	              }
	          }

	    public void verificaTipoELista(String id, String idLista){
	                IsiVariable var = (IsiVariable)symbolTable.get(id);
	                IsiVariable varLista = (IsiVariable)symbolTable.get(idLista);
	                if (!var.verificaTipoELista(varLista)){
	                    throw new IsiSemanticException("variable "+ id +" is being assigned as the wrong type");
	                }
	            }

	   public void verificaTipoLista(String id, String expr){
	              IsiVariable var = (IsiVariable)symbolTable.get(id);
	              if (!var.verificaTipoLista(expr, symbolTable)){
	                  throw new IsiSemanticException("variable "+ id +" is being assigned as the wrong type");
	              }
	          }

		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Inicio_e_fim_do_programaContext extends ParserRuleContext {
		public Declarar_variaveisContext declarar_variaveis() {
			return getRuleContext(Declarar_variaveisContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Inicio_e_fim_do_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio_e_fim_do_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterInicio_e_fim_do_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitInicio_e_fim_do_programa(this);
		}
	}

	public final Inicio_e_fim_do_programaContext inicio_e_fim_do_programa() throws RecognitionException {
		Inicio_e_fim_do_programaContext _localctx = new Inicio_e_fim_do_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio_e_fim_do_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			declarar_variaveis();
			setState(30);
			bloco();
			setState(31);
			match(T__1);
			  program.setVarTable(symbolTable);
			           	  program.setComandos(stack.pop());
			              for(IsiSymbol var : symbolTable.getAll()){
			                    verificaSeFoiUsada(var);
			              }
			           
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarar_variaveisContext extends ParserRuleContext {
		public List<Declara_variavelContext> declara_variavel() {
			return getRuleContexts(Declara_variavelContext.class);
		}
		public Declara_variavelContext declara_variavel(int i) {
			return getRuleContext(Declara_variavelContext.class,i);
		}
		public Declarar_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclarar_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclarar_variaveis(this);
		}
	}

	public final Declarar_variaveisContext declarar_variaveis() throws RecognitionException {
		Declarar_variaveisContext _localctx = new Declarar_variaveisContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarar_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				declara_variavel();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declara_variavelContext extends ParserRuleContext {
		public Tipos_variaveisContext tipos_variaveis() {
			return getRuleContext(Tipos_variaveisContext.class,0);
		}
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(IsiLangParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(IsiLangParser.NOME_VARIAVEL, i);
		}
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(IsiLangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(IsiLangParser.VIRGULA, i);
		}
		public Declara_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclara_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclara_variavel(this);
		}
	}

	public final Declara_variavelContext declara_variavel() throws RecognitionException {
		Declara_variavelContext _localctx = new Declara_variavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declara_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			tipos_variaveis();
			setState(40);
			match(NOME_VARIAVEL);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new IsiVariable(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(42);
				match(VIRGULA);
				setState(43);
				match(NOME_VARIAVEL);

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
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(PONTO_FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_variaveisContext extends ParserRuleContext {
		public Tipos_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTipos_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTipos_variaveis(this);
		}
	}

	public final Tipos_variaveisContext tipos_variaveis() throws RecognitionException {
		Tipos_variaveisContext _localctx = new Tipos_variaveisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipos_variaveis);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__2);
				 _tipo = IsiVariable.INT;  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__3);
				 _tipo = IsiVariable.REAL;  
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__4);
				 _tipo = IsiVariable.TEXT;  
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T__5);
				 _tipo = IsiVariable.LISTA_INT;  
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(T__6);
				 _tipo = IsiVariable.LISTA_TEXTO;  
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(T__7);
				 _tipo = IsiVariable.LISTA_REAL;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				comandos();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << NOME_VARIAVEL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public ObterContext obter() {
			return getRuleContext(ObterContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandos);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				leitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				escrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				atribuicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				repeticao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				obter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObterContext extends ParserRuleContext {
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public TerminalNode OBTER() { return getToken(IsiLangParser.OBTER, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(IsiLangParser.NUMERO_REAL, 0); }
		public ObterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterObter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitObter(this);
		}
	}

	public final ObterContext obter() throws RecognitionException {
		ObterContext _localctx = new ObterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_obter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NOME_VARIAVEL);
			 _readID = _input.LT(-1).getText(); verificaID(_readID); verificaValorID(_readID);
			setState(82);
			match(OBTER);
			setState(83);
			match(ABRE_PARENTESES);
			{
			setState(84);
			match(NUMERO_REAL);
			}
			_exprContent = _input.LT(-1).getText();
			setState(86);
			match(FECHA_PARENTESES);
			setState(87);
			match(PONTO_FINAL);

			                CommandObter cmd = new CommandObter(_readID, _exprContent);
			                stack.peek().add(cmd);
			              
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__8);
			setState(91);
			match(ABRE_PARENTESES);
			setState(92);
			match(NOME_VARIAVEL);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                     	  setarInitialized(_readID);
			                        
			setState(94);
			match(FECHA_PARENTESES);
			setState(95);
			match(PONTO_FINAL);

			              	IsiVariable var = (IsiVariable)symbolTable.get(_readID);
			              	CommandLeitura cmd = new CommandLeitura(_readID, var);
			              	stack.peek().add(cmd);
			              
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLangParser.TEXTO, 0); }
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__9);
			setState(99);
			match(ABRE_PARENTESES);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(100);
				match(TEXTO);
				 _writeID = _input.LT(-1).getText(); 
				}
				break;
			case NOME_VARIAVEL:
				{
				setState(102);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                  verificaValorID(_input.LT(-1).getText());
				                  setarUsada(_input.LT(-1).getText());
					                  _writeID = _input.LT(-1).getText();
				                     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			match(FECHA_PARENTESES);
			setState(107);
			match(PONTO_FINAL);

			               	  CommandEscrita cmd = new CommandEscrita(_writeID);
			               	  stack.peek().add(cmd);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(IsiLangParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(IsiLangParser.NOME_VARIAVEL, i);
		}
		public TerminalNode ATRIBUIR() { return getToken(IsiLangParser.ATRIBUIR, 0); }
		public ExpressoesContext expressoes() {
			return getRuleContext(ExpressoesContext.class,0);
		}
		public List<TerminalNode> PONTO_FINAL() { return getTokens(IsiLangParser.PONTO_FINAL); }
		public TerminalNode PONTO_FINAL(int i) {
			return getToken(IsiLangParser.PONTO_FINAL, i);
		}
		public TerminalNode ADICIONAR() { return getToken(IsiLangParser.ADICIONAR, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public TerminalNode OBTER() { return getToken(IsiLangParser.OBTER, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(IsiLangParser.NUMERO_REAL, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(110);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                    _exprID = _input.LT(-1).getText();
				                    setarInitialized(_exprID);
				                   
				setState(112);
				match(ATRIBUIR);
				 _exprContent = ""; 
				setState(114);
				expressoes();
				setState(115);
				match(PONTO_FINAL);

				                 verificaTipo(_exprID, _exprContent);
				               	 CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
				               	 stack.peek().add(cmd);
				               
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(118);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                 _exprID = _input.LT(-1).getText();
				                 setarInitialized(_exprID);
				               
				setState(120);
				match(PONTO_FINAL);
				setState(121);
				match(ADICIONAR);
				 _exprContent = ""; 
				setState(123);
				match(ABRE_PARENTESES);
				setState(124);
				expressoes();
				setState(125);
				match(FECHA_PARENTESES);
				setState(126);
				match(PONTO_FINAL);

				                 verificaTipoLista(_exprID, _exprContent);
				                 CommandAdicionar cmd = new CommandAdicionar(_exprID, _exprContent);
				                 stack.peek().add(cmd);
				               
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(129);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                                    _exprID = _input.LT(-1).getText();
				                                    setarInitialized(_exprID);
				                                   
				setState(131);
				match(ATRIBUIR);
				 _exprContent = ""; 
				setState(133);
				match(NOME_VARIAVEL);
				 _readIDLista = _input.LT(-1).getText(); verificaID(_readIDLista); verificaValorID(_readIDLista);
				setState(135);
				match(OBTER);
				setState(136);
				match(ABRE_PARENTESES);
				{
				setState(137);
				match(NUMERO_REAL);
				}
				_exprContent = _input.LT(-1).getText();
				setState(139);
				match(FECHA_PARENTESES);
				setState(140);
				match(PONTO_FINAL);

				                               verificaTipoELista(_exprID, _readIDLista);
				                               CommandAtribuirEObter cmd = new CommandAtribuirEObter(_exprID, _readIDLista, _exprContent);
				                               stack.peek().add(cmd);
				                             
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode OPERADORES_RELACIONAIS() { return getToken(IsiLangParser.OPERADORES_RELACIONAIS, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> ABRE_CHAVES() { return getTokens(IsiLangParser.ABRE_CHAVES); }
		public TerminalNode ABRE_CHAVES(int i) {
			return getToken(IsiLangParser.ABRE_CHAVES, i);
		}
		public List<TerminalNode> FECHA_CHAVES() { return getTokens(IsiLangParser.FECHA_CHAVES); }
		public TerminalNode FECHA_CHAVES(int i) {
			return getToken(IsiLangParser.FECHA_CHAVES, i);
		}
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(IsiLangParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(IsiLangParser.NOME_VARIAVEL, i);
		}
		public List<TerminalNode> NUMERO_REAL() { return getTokens(IsiLangParser.NUMERO_REAL); }
		public TerminalNode NUMERO_REAL(int i) {
			return getToken(IsiLangParser.NUMERO_REAL, i);
		}
		public List<TerminalNode> INTEIRO() { return getTokens(IsiLangParser.INTEIRO); }
		public TerminalNode INTEIRO(int i) {
			return getToken(IsiLangParser.INTEIRO, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__10);
			setState(145);
			match(ABRE_PARENTESES);
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _exprDecision = _input.LT(-1).getText(); 
			setState(148);
			match(OPERADORES_RELACIONAIS);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(152);
			match(FECHA_PARENTESES);
			setState(153);
			match(T__11);
			setState(154);
			match(ABRE_CHAVES);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				comandos();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << NOME_VARIAVEL))) != 0) );
			setState(161);
			match(FECHA_CHAVES);

			                       listaTrue = stack.pop();	
			                    
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(163);
				match(T__12);
				setState(164);
				match(ABRE_CHAVES);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				{
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					comandos();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << NOME_VARIAVEL))) != 0) );
				}
				setState(171);
				match(FECHA_CHAVES);

				                   		listaFalse = stack.pop();
				                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
				                   		stack.peek().add(cmd);
				                   	
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode OPERADORES_RELACIONAIS() { return getToken(IsiLangParser.OPERADORES_RELACIONAIS, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(IsiLangParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(IsiLangParser.FECHA_CHAVES, 0); }
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(IsiLangParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(IsiLangParser.NOME_VARIAVEL, i);
		}
		public List<TerminalNode> NUMERO_REAL() { return getTokens(IsiLangParser.NUMERO_REAL); }
		public TerminalNode NUMERO_REAL(int i) {
			return getToken(IsiLangParser.NUMERO_REAL, i);
		}
		public List<TerminalNode> INTEIRO() { return getTokens(IsiLangParser.INTEIRO); }
		public TerminalNode INTEIRO(int i) {
			return getToken(IsiLangParser.INTEIRO, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeticao);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(176);
				match(T__13);
				setState(177);
				match(ABRE_PARENTESES);
				setState(178);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _exprDecision = _input.LT(-1).getText(); 
				setState(180);
				match(OPERADORES_RELACIONAIS);
				 _exprDecision += _input.LT(-1).getText(); 
				setState(182);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				_exprDecision += _input.LT(-1).getText(); 
				setState(184);
				match(FECHA_PARENTESES);
				setState(185);
				match(T__14);
				setState(186);
				match(ABRE_CHAVES);
				 curThread = new ArrayList<AbstractCommand>();
				                      stack.push(curThread);
				                    
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					comandos();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << NOME_VARIAVEL))) != 0) );
				setState(193);
				match(FECHA_CHAVES);

				                       listaTrue = stack.pop();
				                       CommandRepeticao cmd = new CommandRepeticao(_exprDecision, listaTrue);
				                       stack.peek().add(cmd);
				                    
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(196);
				match(T__14);
				setState(197);
				match(ABRE_CHAVES);
				 curThread = new ArrayList<AbstractCommand>();
				                          stack.push(curThread);
				                        
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					comandos();
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << NOME_VARIAVEL))) != 0) );
				setState(204);
				match(FECHA_CHAVES);

				                           listaTrue = stack.pop();
				                           CommandDoWhile cmd = new CommandDoWhile(_exprDecision, listaTrue);
				                           stack.peek().add(cmd);
				                        
				setState(206);
				match(T__13);
				setState(207);
				match(ABRE_PARENTESES);
				setState(208);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _exprDecision = _input.LT(-1).getText(); 
				setState(210);
				match(OPERADORES_RELACIONAIS);
				 _exprDecision += _input.LT(-1).getText(); 
				setState(212);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				_exprDecision += _input.LT(-1).getText(); 
				setState(214);
				match(FECHA_PARENTESES);
				setState(215);
				match(PONTO_FINAL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressoesContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OPERADORES() { return getTokens(IsiLangParser.OPERADORES); }
		public TerminalNode OPERADORES(int i) {
			return getToken(IsiLangParser.OPERADORES, i);
		}
		public ExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpressoes(this);
		}
	}

	public final ExpressoesContext expressoes() throws RecognitionException {
		ExpressoesContext _localctx = new ExpressoesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			termo();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES) {
				{
				{
				setState(220);
				match(OPERADORES);
				 _exprContent += _input.LT(-1).getText();
				setState(222);
				termo();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(IsiLangParser.NUMERO_REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(IsiLangParser.INTEIRO, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLangParser.TEXTO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termo);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                              _exprContent += _input.LT(-1).getText();
				                              verificaValorID(_input.LT(-1).getText());
				                              setarUsada(_input.LT(-1).getText()); 
				}
				break;
			case NUMERO_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(NUMERO_REAL);

				              	_exprContent += _input.LT(-1).getText();
				              
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(INTEIRO);

				                  	_exprContent += _input.LT(-1).getText();
				               
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(TEXTO);

				                 	_exprContent += _input.LT(-1).getText();
				               
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6"+
		"\3&\n\3\r\3\16\3\'\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6"+
		"\3\6\6\6G\n\6\r\6\16\6H\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nk\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00a0\n"+
		"\f\r\f\16\f\u00a1\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00aa\n\f\r\f\16\f\u00ab"+
		"\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\6\r\u00c0\n\r\r\r\16\r\u00c1\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r"+
		"\u00cb\n\r\r\r\16\r\u00cc\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16\3\16\7\16\u00e2\n\16\f\16\16\16"+
		"\u00e5\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3"+
		"\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2\35\35\37 \2\u00fc"+
		"\2\36\3\2\2\2\4%\3\2\2\2\6)\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fP\3\2\2\2\16"+
		"R\3\2\2\2\20\\\3\2\2\2\22d\3\2\2\2\24\u0090\3\2\2\2\26\u0092\3\2\2\2\30"+
		"\u00db\3\2\2\2\32\u00dd\3\2\2\2\34\u00ee\3\2\2\2\36\37\7\3\2\2\37 \5\4"+
		"\3\2 !\5\n\6\2!\"\7\4\2\2\"#\b\2\1\2#\3\3\2\2\2$&\5\6\4\2%$\3\2\2\2&\'"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)*\5\b\5\2*+\7\35\2\2+\61\b\4"+
		"\1\2,-\7\30\2\2-.\7\35\2\2.\60\b\4\1\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\24\2\2\65\7\3\2"+
		"\2\2\66\67\7\5\2\2\67C\b\5\1\289\7\6\2\29C\b\5\1\2:;\7\7\2\2;C\b\5\1\2"+
		"<=\7\b\2\2=C\b\5\1\2>?\7\t\2\2?C\b\5\1\2@A\7\n\2\2AC\b\5\1\2B\66\3\2\2"+
		"\2B8\3\2\2\2B:\3\2\2\2B<\3\2\2\2B>\3\2\2\2B@\3\2\2\2C\t\3\2\2\2DF\b\6"+
		"\1\2EG\5\f\7\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JQ\5"+
		"\20\t\2KQ\5\22\n\2LQ\5\24\13\2MQ\5\26\f\2NQ\5\30\r\2OQ\5\16\b\2PJ\3\2"+
		"\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\r\3\2\2\2RS\7"+
		"\35\2\2ST\b\b\1\2TU\7\32\2\2UV\7\22\2\2VW\7\37\2\2WX\b\b\1\2XY\7\23\2"+
		"\2YZ\7\24\2\2Z[\b\b\1\2[\17\3\2\2\2\\]\7\13\2\2]^\7\22\2\2^_\7\35\2\2"+
		"_`\b\t\1\2`a\7\23\2\2ab\7\24\2\2bc\b\t\1\2c\21\3\2\2\2de\7\f\2\2ej\7\22"+
		"\2\2fg\7\36\2\2gk\b\n\1\2hi\7\35\2\2ik\b\n\1\2jf\3\2\2\2jh\3\2\2\2kl\3"+
		"\2\2\2lm\7\23\2\2mn\7\24\2\2no\b\n\1\2o\23\3\2\2\2pq\7\35\2\2qr\b\13\1"+
		"\2rs\7\26\2\2st\b\13\1\2tu\5\32\16\2uv\7\24\2\2vw\b\13\1\2w\u0091\3\2"+
		"\2\2xy\7\35\2\2yz\b\13\1\2z{\7\24\2\2{|\7\27\2\2|}\b\13\1\2}~\7\22\2\2"+
		"~\177\5\32\16\2\177\u0080\7\23\2\2\u0080\u0081\7\24\2\2\u0081\u0082\b"+
		"\13\1\2\u0082\u0091\3\2\2\2\u0083\u0084\7\35\2\2\u0084\u0085\b\13\1\2"+
		"\u0085\u0086\7\26\2\2\u0086\u0087\b\13\1\2\u0087\u0088\7\35\2\2\u0088"+
		"\u0089\b\13\1\2\u0089\u008a\7\32\2\2\u008a\u008b\7\22\2\2\u008b\u008c"+
		"\7\37\2\2\u008c\u008d\b\13\1\2\u008d\u008e\7\23\2\2\u008e\u008f\7\24\2"+
		"\2\u008f\u0091\b\13\1\2\u0090p\3\2\2\2\u0090x\3\2\2\2\u0090\u0083\3\2"+
		"\2\2\u0091\25\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0094\7\22\2\2\u0094\u0095"+
		"\t\2\2\2\u0095\u0096\b\f\1\2\u0096\u0097\7\34\2\2\u0097\u0098\b\f\1\2"+
		"\u0098\u0099\t\2\2\2\u0099\u009a\b\f\1\2\u009a\u009b\7\23\2\2\u009b\u009c"+
		"\7\16\2\2\u009c\u009d\7\31\2\2\u009d\u009f\b\f\1\2\u009e\u00a0\5\f\7\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00b0\b\f\1\2"+
		"\u00a5\u00a6\7\17\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a9\b\f\1\2\u00a8\u00aa"+
		"\5\f\7\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00af\b"+
		"\f\1\2\u00af\u00b1\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\27\3\2\2\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\t\2"+
		"\2\2\u00b5\u00b6\b\r\1\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\b\r\1\2\u00b8"+
		"\u00b9\t\2\2\2\u00b9\u00ba\b\r\1\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\7"+
		"\21\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00bf\b\r\1\2\u00be\u00c0\5\f\7\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\b\r\1\2\u00c5"+
		"\u00dc\3\2\2\2\u00c6\u00c7\7\21\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00ca\b"+
		"\r\1\2\u00c9\u00cb\5\f\7\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\33"+
		"\2\2\u00cf\u00d0\b\r\1\2\u00d0\u00d1\7\20\2\2\u00d1\u00d2\7\22\2\2\u00d2"+
		"\u00d3\t\2\2\2\u00d3\u00d4\b\r\1\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\b"+
		"\r\1\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\b\r\1\2\u00d8\u00d9\7\23\2\2\u00d9"+
		"\u00da\7\24\2\2\u00da\u00dc\3\2\2\2\u00db\u00b2\3\2\2\2\u00db\u00c6\3"+
		"\2\2\2\u00dc\31\3\2\2\2\u00dd\u00e3\5\34\17\2\u00de\u00df\7\25\2\2\u00df"+
		"\u00e0\b\16\1\2\u00e0\u00e2\5\34\17\2\u00e1\u00de\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\33\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\7\35\2\2\u00e7\u00ef\b\17\1\2\u00e8\u00e9\7"+
		"\37\2\2\u00e9\u00ef\b\17\1\2\u00ea\u00eb\7 \2\2\u00eb\u00ef\b\17\1\2\u00ec"+
		"\u00ed\7\36\2\2\u00ed\u00ef\b\17\1\2\u00ee\u00e6\3\2\2\2\u00ee\u00e8\3"+
		"\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\35\3\2\2\2\21\'\61"+
		"BHPj\u0090\u00a1\u00ab\u00b0\u00c1\u00cc\u00db\u00e3\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}