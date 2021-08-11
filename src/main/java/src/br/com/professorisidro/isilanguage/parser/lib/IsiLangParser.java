// Generated from D:/ProjetoFinalCompiladores/src/main/java\IsiLang.g4 by ANTLR 4.9.1
package src.br.com.professorisidro.isilanguage.parser.lib;

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
	import src.br.com.professorisidro.isilanguage.ast.CommandTamanho;
	import src.br.com.professorisidro.isilanguage.ast.CommandPrintTamanho;


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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ABRE_PARENTESES=17, 
		FECHA_PARENTESES=18, PONTO_FINAL=19, OPERADORES=20, ATRIBUIR=21, ADICIONAR=22, 
		VIRGULA=23, ABRE_CHAVES=24, OBTER=25, FECHA_CHAVES=26, OPERADORES_RELACIONAIS=27, 
		NOME_VARIAVEL=28, TEXTO=29, NUMERO_REAL=30, INTEIRO=31, IGNORAR=32;
	public static final int
		RULE_inicio_e_fim_do_programa = 0, RULE_tamanho_lista = 1, RULE_declarar_variaveis = 2, 
		RULE_declara_variavel = 3, RULE_tipos_variaveis = 4, RULE_bloco = 5, RULE_comandos = 6, 
		RULE_obter = 7, RULE_leitura = 8, RULE_escrita = 9, RULE_atribuicao = 10, 
		RULE_condicional = 11, RULE_repeticao = 12, RULE_expressoes = 13, RULE_termo = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio_e_fim_do_programa", "tamanho_lista", "declarar_variaveis", "declara_variavel", 
			"tipos_variaveis", "bloco", "comandos", "obter", "leitura", "escrita", 
			"atribuicao", "condicional", "repeticao", "expressoes", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'tamanho'", "'int'", "'real'", "'texto'", 
			"'lista<int>'", "'lista<texto>'", "'lista<real>'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'enquanto'", "'fazer'", "'('", "')'", 
			"'.'", null, "':='", "'adc'", "','", "'{'", "'.obter'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ABRE_PARENTESES", "FECHA_PARENTESES", 
			"PONTO_FINAL", "OPERADORES", "ATRIBUIR", "ADICIONAR", "VIRGULA", "ABRE_CHAVES", 
			"OBTER", "FECHA_CHAVES", "OPERADORES_RELACIONAIS", "NOME_VARIAVEL", "TEXTO", 
			"NUMERO_REAL", "INTEIRO", "IGNORAR"
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
		private String _condLeft;
		private String _condRight;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;


		public void validarCondicao(String condLeft, String condRight, String expr){
	    		if (!symbolTable.validarCondicao(condLeft, condRight)){
	    			throw new IsiSemanticException("Conditional expression " + expr + " is invalid (wrong types).");
	    		}
	    	}

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
	                if(symbolTable.get(id)!= null)
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

	      public void verificarLista(String id){
	                 IsiVariable var = (IsiVariable)symbolTable.get(id);
	                 if (var.getType() != 3 && var.getType() != 4 && var.getType() != 5){
	                     throw new IsiSemanticException("variable "+ id +" is not a list");
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
			setState(30);
			match(T__0);
			setState(31);
			declarar_variaveis();
			setState(32);
			bloco();
			setState(33);
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

	public static class Tamanho_listaContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(IsiLangParser.ABRE_PARENTESES, 0); }
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(IsiLangParser.FECHA_PARENTESES, 0); }
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public Tamanho_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanho_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTamanho_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTamanho_lista(this);
		}
	}

	public final Tamanho_listaContext tamanho_lista() throws RecognitionException {
		Tamanho_listaContext _localctx = new Tamanho_listaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tamanho_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__2);
			setState(37);
			match(ABRE_PARENTESES);
			setState(38);
			match(NOME_VARIAVEL);
			_readID = _input.LT(-1).getText(); verificarLista(_readID);verificaID(_readID); verificaValorID(_readID);
			setState(40);
			match(FECHA_PARENTESES);
			setState(41);
			match(PONTO_FINAL);

			                     CommandTamanho cmd = new CommandTamanho(_readID);
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
		enterRule(_localctx, 4, RULE_declarar_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				declara_variavel();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) );
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
		enterRule(_localctx, 6, RULE_declara_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			tipos_variaveis();
			setState(50);
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
			                    
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(52);
				match(VIRGULA);
				setState(53);
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
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
		enterRule(_localctx, 8, RULE_tipos_variaveis);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__3);
				 _tipo = IsiVariable.INT;  
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__4);
				 _tipo = IsiVariable.REAL;  
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__5);
				 _tipo = IsiVariable.TEXT;  
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__6);
				 _tipo = IsiVariable.LISTA_INT;  
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(T__7);
				 _tipo = IsiVariable.LISTA_TEXTO;  
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(T__8);
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
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				comandos();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME_VARIAVEL))) != 0) );
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
		public Tamanho_listaContext tamanho_lista() {
			return getRuleContext(Tamanho_listaContext.class,0);
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
		enterRule(_localctx, 12, RULE_comandos);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				leitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				escrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				atribuicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				repeticao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				obter();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				tamanho_lista();
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
		enterRule(_localctx, 14, RULE_obter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(NOME_VARIAVEL);
			 _readID = _input.LT(-1).getText(); verificaID(_readID); verificaValorID(_readID);
			setState(93);
			match(OBTER);
			setState(94);
			match(ABRE_PARENTESES);
			{
			setState(95);
			match(NUMERO_REAL);
			}
			_exprContent = _input.LT(-1).getText();
			setState(97);
			match(FECHA_PARENTESES);
			setState(98);
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
		enterRule(_localctx, 16, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__9);
			setState(102);
			match(ABRE_PARENTESES);
			setState(103);
			match(NOME_VARIAVEL);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                     	  setarInitialized(_readID);
			                        
			setState(105);
			match(FECHA_PARENTESES);
			setState(106);
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
		public List<TerminalNode> ABRE_PARENTESES() { return getTokens(IsiLangParser.ABRE_PARENTESES); }
		public TerminalNode ABRE_PARENTESES(int i) {
			return getToken(IsiLangParser.ABRE_PARENTESES, i);
		}
		public List<TerminalNode> FECHA_PARENTESES() { return getTokens(IsiLangParser.FECHA_PARENTESES); }
		public TerminalNode FECHA_PARENTESES(int i) {
			return getToken(IsiLangParser.FECHA_PARENTESES, i);
		}
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLangParser.TEXTO, 0); }
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
		enterRule(_localctx, 18, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__10);
			setState(110);
			match(ABRE_PARENTESES);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
			case TEXTO:
				{
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXTO:
					{
					setState(111);
					match(TEXTO);
					 _writeID = _input.LT(-1).getText(); 
					}
					break;
				case NOME_VARIAVEL:
					{
					setState(113);
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
				setState(117);
				match(FECHA_PARENTESES);
				setState(118);
				match(PONTO_FINAL);

				               	  CommandEscrita cmd = new CommandEscrita(_writeID);
				               	  stack.peek().add(cmd);
				               
				}
				}
				break;
			case T__2:
				{
				{
				setState(120);
				match(T__2);
				setState(121);
				match(ABRE_PARENTESES);
				setState(122);
				match(NOME_VARIAVEL);
				_readID = _input.LT(-1).getText(); verificarLista(_readID);verificaID(_readID); verificaValorID(_readID);
				setState(124);
				match(FECHA_PARENTESES);
				setState(125);
				match(FECHA_PARENTESES);
				setState(126);
				match(PONTO_FINAL);

				                  CommandPrintTamanho cmd = new CommandPrintTamanho(_readID);
				                  stack.peek().add(cmd);
				               
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                    _exprID = _input.LT(-1).getText();
				                    setarInitialized(_exprID);
				                   
				setState(132);
				match(ATRIBUIR);
				 _exprContent = ""; 
				setState(134);
				expressoes();
				setState(135);
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
				setState(138);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                 _exprID = _input.LT(-1).getText();
				                 setarInitialized(_exprID);
				               
				setState(140);
				match(PONTO_FINAL);
				setState(141);
				match(ADICIONAR);
				 _exprContent = ""; 
				setState(143);
				match(ABRE_PARENTESES);
				setState(144);
				expressoes();
				setState(145);
				match(FECHA_PARENTESES);
				setState(146);
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
				setState(149);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                                    _exprID = _input.LT(-1).getText();
				                                    setarInitialized(_exprID);
				                                   
				setState(151);
				match(ATRIBUIR);
				 _exprContent = ""; 
				setState(153);
				match(NOME_VARIAVEL);
				 _readIDLista = _input.LT(-1).getText(); verificaID(_readIDLista); verificaValorID(_readIDLista);
				setState(155);
				match(OBTER);
				setState(156);
				match(ABRE_PARENTESES);
				{
				setState(157);
				match(NUMERO_REAL);
				}
				_exprContent = _input.LT(-1).getText();
				setState(159);
				match(FECHA_PARENTESES);
				setState(160);
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
		enterRule(_localctx, 22, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__11);
			setState(165);
			match(ABRE_PARENTESES);
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _exprDecision = _input.LT(-1).getText(); _condLeft = _input.LT(-1).getText(); setarUsada(_input.LT(-1).getText());
			setState(168);
			match(OPERADORES_RELACIONAIS);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOME_VARIAVEL) | (1L << NUMERO_REAL) | (1L << INTEIRO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); _condRight = _input.LT(-1).getText(); setarUsada(_input.LT(-1).getText());
			setState(172);
			match(FECHA_PARENTESES);
			 validarCondicao(_condLeft, _condRight, _exprDecision);
			setState(174);
			match(T__12);
			setState(175);
			match(ABRE_CHAVES);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				comandos();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME_VARIAVEL))) != 0) );
			setState(182);
			match(FECHA_CHAVES);

			                       listaTrue = stack.pop();	
			                    
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(184);
				match(T__13);
				setState(185);
				match(ABRE_CHAVES);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				{
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					comandos();
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME_VARIAVEL))) != 0) );
				}
				setState(192);
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
		enterRule(_localctx, 24, RULE_repeticao);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(197);
				match(T__14);
				setState(198);
				match(ABRE_PARENTESES);
				setState(199);
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
				setState(201);
				match(OPERADORES_RELACIONAIS);
				 _exprDecision += _input.LT(-1).getText(); 
				setState(203);
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
				setState(205);
				match(FECHA_PARENTESES);
				setState(206);
				match(T__15);
				setState(207);
				match(ABRE_CHAVES);
				 curThread = new ArrayList<AbstractCommand>();
				                      stack.push(curThread);
				                    
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					comandos();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME_VARIAVEL))) != 0) );
				setState(214);
				match(FECHA_CHAVES);

				                       listaTrue = stack.pop();
				                       CommandRepeticao cmd = new CommandRepeticao(_exprDecision, listaTrue);
				                       stack.peek().add(cmd);
				                    
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(217);
				match(T__15);
				setState(218);
				match(ABRE_CHAVES);
				 curThread = new ArrayList<AbstractCommand>();
				                          stack.push(curThread);
				                        
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					comandos();
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << NOME_VARIAVEL))) != 0) );
				setState(225);
				match(FECHA_CHAVES);
				setState(226);
				match(T__14);
				setState(227);
				match(ABRE_PARENTESES);
				setState(228);
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
				setState(230);
				match(OPERADORES_RELACIONAIS);
				 _exprDecision += _input.LT(-1).getText(); 
				setState(232);
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
				setState(234);
				match(FECHA_PARENTESES);
				setState(235);
				match(PONTO_FINAL);

				                           listaTrue = stack.pop();
				                           CommandDoWhile cmd = new CommandDoWhile(_exprDecision, listaTrue);
				                           stack.peek().add(cmd);
				                        
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
		enterRule(_localctx, 26, RULE_expressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			termo();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES) {
				{
				{
				setState(241);
				match(OPERADORES);
				 _exprContent += _input.LT(-1).getText();
				setState(243);
				termo();
				}
				}
				setState(248);
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
		enterRule(_localctx, 28, RULE_termo);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
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
				setState(251);
				match(NUMERO_REAL);

				              	_exprContent += _input.LT(-1).getText();
				              
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(INTEIRO);

				                  	_exprContent += _input.LT(-1).getText();
				               
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\60\n\4\r\4\16\4\61\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"v\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0083"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a5"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00b5"+
		"\n\r\r\r\16\r\u00b6\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00bf\n\r\r\r\16\r\u00c0"+
		"\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u00d5\n\16\r\16\16\16\u00d6\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\6\16\u00e0\n\16\r\16\16\16\u00e1\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00f7\n\17\f\17\16\17\u00fa\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0104\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\3\4\2\36\36 !\2\u0112\2 \3\2\2\2\4&\3\2\2\2\6/\3"+
		"\2\2\2\b\63\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22g"+
		"\3\2\2\2\24o\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00f0\3\2\2"+
		"\2\34\u00f2\3\2\2\2\36\u0103\3\2\2\2 !\7\3\2\2!\"\5\6\4\2\"#\5\f\7\2#"+
		"$\7\4\2\2$%\b\2\1\2%\3\3\2\2\2&\'\7\5\2\2\'(\7\23\2\2()\7\36\2\2)*\b\3"+
		"\1\2*+\7\24\2\2+,\7\25\2\2,-\b\3\1\2-\5\3\2\2\2.\60\5\b\5\2/.\3\2\2\2"+
		"\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2\2\63\64\5\n\6\2\64"+
		"\65\7\36\2\2\65;\b\5\1\2\66\67\7\31\2\2\678\7\36\2\28:\b\5\1\29\66\3\2"+
		"\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\25\2\2?\t\3"+
		"\2\2\2@A\7\6\2\2AM\b\6\1\2BC\7\7\2\2CM\b\6\1\2DE\7\b\2\2EM\b\6\1\2FG\7"+
		"\t\2\2GM\b\6\1\2HI\7\n\2\2IM\b\6\1\2JK\7\13\2\2KM\b\6\1\2L@\3\2\2\2LB"+
		"\3\2\2\2LD\3\2\2\2LF\3\2\2\2LH\3\2\2\2LJ\3\2\2\2M\13\3\2\2\2NP\b\7\1\2"+
		"OQ\5\16\b\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2T\\\5\22"+
		"\n\2U\\\5\24\13\2V\\\5\26\f\2W\\\5\30\r\2X\\\5\32\16\2Y\\\5\20\t\2Z\\"+
		"\5\4\3\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2["+
		"Z\3\2\2\2\\\17\3\2\2\2]^\7\36\2\2^_\b\t\1\2_`\7\33\2\2`a\7\23\2\2ab\7"+
		" \2\2bc\b\t\1\2cd\7\24\2\2de\7\25\2\2ef\b\t\1\2f\21\3\2\2\2gh\7\f\2\2"+
		"hi\7\23\2\2ij\7\36\2\2jk\b\n\1\2kl\7\24\2\2lm\7\25\2\2mn\b\n\1\2n\23\3"+
		"\2\2\2op\7\r\2\2p\u0082\7\23\2\2qr\7\37\2\2rv\b\13\1\2st\7\36\2\2tv\b"+
		"\13\1\2uq\3\2\2\2us\3\2\2\2vw\3\2\2\2wx\7\24\2\2xy\7\25\2\2y\u0083\b\13"+
		"\1\2z{\7\5\2\2{|\7\23\2\2|}\7\36\2\2}~\b\13\1\2~\177\7\24\2\2\177\u0080"+
		"\7\24\2\2\u0080\u0081\7\25\2\2\u0081\u0083\b\13\1\2\u0082u\3\2\2\2\u0082"+
		"z\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086\b\f\1\2\u0086"+
		"\u0087\7\27\2\2\u0087\u0088\b\f\1\2\u0088\u0089\5\34\17\2\u0089\u008a"+
		"\7\25\2\2\u008a\u008b\b\f\1\2\u008b\u00a5\3\2\2\2\u008c\u008d\7\36\2\2"+
		"\u008d\u008e\b\f\1\2\u008e\u008f\7\25\2\2\u008f\u0090\7\30\2\2\u0090\u0091"+
		"\b\f\1\2\u0091\u0092\7\23\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7\24\2"+
		"\2\u0094\u0095\7\25\2\2\u0095\u0096\b\f\1\2\u0096\u00a5\3\2\2\2\u0097"+
		"\u0098\7\36\2\2\u0098\u0099\b\f\1\2\u0099\u009a\7\27\2\2\u009a\u009b\b"+
		"\f\1\2\u009b\u009c\7\36\2\2\u009c\u009d\b\f\1\2\u009d\u009e\7\33\2\2\u009e"+
		"\u009f\7\23\2\2\u009f\u00a0\7 \2\2\u00a0\u00a1\b\f\1\2\u00a1\u00a2\7\24"+
		"\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a5\b\f\1\2\u00a4\u0084\3\2\2\2\u00a4"+
		"\u008c\3\2\2\2\u00a4\u0097\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\16\2"+
		"\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\t\2\2\2\u00a9\u00aa\b\r\1\2\u00aa"+
		"\u00ab\7\35\2\2\u00ab\u00ac\b\r\1\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\b"+
		"\r\1\2\u00ae\u00af\7\24\2\2\u00af\u00b0\b\r\1\2\u00b0\u00b1\7\17\2\2\u00b1"+
		"\u00b2\7\32\2\2\u00b2\u00b4\b\r\1\2\u00b3\u00b5\5\16\b\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00c5\b\r\1\2\u00ba\u00bb\7"+
		"\20\2\2\u00bb\u00bc\7\32\2\2\u00bc\u00be\b\r\1\2\u00bd\u00bf\5\16\b\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c4\b\r\1\2"+
		"\u00c4\u00c6\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\31"+
		"\3\2\2\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00ca\t\2\2\2"+
		"\u00ca\u00cb\b\16\1\2\u00cb\u00cc\7\35\2\2\u00cc\u00cd\b\16\1\2\u00cd"+
		"\u00ce\t\2\2\2\u00ce\u00cf\b\16\1\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\7"+
		"\22\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00d4\b\16\1\2\u00d3\u00d5\5\16\b\2"+
		"\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\34\2\2\u00d9\u00da\b\16\1\2"+
		"\u00da\u00f1\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7\32\2\2\u00dd\u00df"+
		"\b\16\1\2\u00de\u00e0\5\16\b\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\7\34\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\7\23\2\2\u00e6\u00e7\t\2\2"+
		"\2\u00e7\u00e8\b\16\1\2\u00e8\u00e9\7\35\2\2\u00e9\u00ea\b\16\1\2\u00ea"+
		"\u00eb\t\2\2\2\u00eb\u00ec\b\16\1\2\u00ec\u00ed\7\24\2\2\u00ed\u00ee\7"+
		"\25\2\2\u00ee\u00ef\b\16\1\2\u00ef\u00f1\3\2\2\2\u00f0\u00c7\3\2\2\2\u00f0"+
		"\u00db\3\2\2\2\u00f1\33\3\2\2\2\u00f2\u00f8\5\36\20\2\u00f3\u00f4\7\26"+
		"\2\2\u00f4\u00f5\b\17\1\2\u00f5\u00f7\5\36\20\2\u00f6\u00f3\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\36\2\2\u00fc\u0104\b\20\1\2\u00fd"+
		"\u00fe\7 \2\2\u00fe\u0104\b\20\1\2\u00ff\u0100\7!\2\2\u0100\u0104\b\20"+
		"\1\2\u0101\u0102\7\37\2\2\u0102\u0104\b\20\1\2\u0103\u00fb\3\2\2\2\u0103"+
		"\u00fd\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104\37\3\2\2"+
		"\2\22\61;LR[u\u0082\u00a4\u00b6\u00c0\u00c5\u00d6\u00e1\u00f0\u00f8\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}