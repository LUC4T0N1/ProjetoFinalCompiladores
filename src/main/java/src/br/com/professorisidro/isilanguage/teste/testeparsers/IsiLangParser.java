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
		T__9=10, T__10=11, T__11=12, ABRE_PARENTESES=13, FECHA_PARENTESES=14, 
		PONTO_FINAL=15, OPERADORES=16, ATRIBUIR=17, VIRGULA=18, ABRE_CHAVES=19, 
		FECHA_CHAVES=20, OPERADORES_RELACIONAIS=21, NOME_VARIAVEL=22, TEXTO=23, 
		NUMERO_REAL=24, INTEIRO=25, IGNORAR=26;
	public static final int
		RULE_inicio_e_fim_do_programa = 0, RULE_declarar_variaveis = 1, RULE_declara_variavel = 2, 
		RULE_tipos_variaveis = 3, RULE_bloco = 4, RULE_comandos = 5, RULE_leitura = 6, 
		RULE_escrita = 7, RULE_atribuicao = 8, RULE_condicional = 9, RULE_repeticao = 10, 
		RULE_expressoes = 11, RULE_termo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio_e_fim_do_programa", "declarar_variaveis", "declara_variavel", 
			"tipos_variaveis", "bloco", "comandos", "leitura", "escrita", "atribuicao", 
			"condicional", "repeticao", "expressoes", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'int'", "'real'", "'texto'", "'leia'", 
			"'escreva'", "'se'", "'entao'", "'senao'", "'enquanto'", "'fazer'", "'('", 
			"')'", "'.'", null, "':='", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ABRE_PARENTESES", "FECHA_PARENTESES", "PONTO_FINAL", "OPERADORES", 
			"ATRIBUIR", "VIRGULA", "ABRE_CHAVES", "FECHA_CHAVES", "OPERADORES_RELACIONAIS", 
			"NOME_VARIAVEL", "TEXTO", "NUMERO_REAL", "INTEIRO", "IGNORAR"
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
			setState(26);
			match(T__0);
			setState(27);
			declarar_variaveis();
			setState(28);
			bloco();
			setState(29);
			match(T__1);
			  program.setVarTable(symbolTable);
			           	  program.setComandos(stack.pop());
			           	 
			           
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				declara_variavel();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
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
			setState(37);
			tipos_variaveis();
			setState(38);
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
			                    
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(40);
				match(VIRGULA);
				setState(41);
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
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__2);
				 _tipo = IsiVariable.INT;  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__3);
				 _tipo = IsiVariable.REAL;  
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__4);
				 _tipo = IsiVariable.TEXT;  
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
			          
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				comandos();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << NOME_VARIAVEL))) != 0) );
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				leitura();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				escrita();
				}
				break;
			case NOME_VARIAVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				atribuicao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				condicional();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				repeticao();
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
		enterRule(_localctx, 12, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			match(ABRE_PARENTESES);
			setState(73);
			match(NOME_VARIAVEL);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                     	  setarInitialized(_readID);
			                        
			setState(75);
			match(FECHA_PARENTESES);
			setState(76);
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
		enterRule(_localctx, 14, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__6);
			setState(80);
			match(ABRE_PARENTESES);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(81);
				match(TEXTO);
				 _writeID = _input.LT(-1).getText(); 
				}
				break;
			case NOME_VARIAVEL:
				{
				setState(83);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText());
				                  verificaValorID(_input.LT(-1).getText());
					                  _writeID = _input.LT(-1).getText();
				                     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			match(FECHA_PARENTESES);
			setState(88);
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
		public TerminalNode NOME_VARIAVEL() { return getToken(IsiLangParser.NOME_VARIAVEL, 0); }
		public TerminalNode ATRIBUIR() { return getToken(IsiLangParser.ATRIBUIR, 0); }
		public ExpressoesContext expressoes() {
			return getRuleContext(ExpressoesContext.class,0);
		}
		public TerminalNode PONTO_FINAL() { return getToken(IsiLangParser.PONTO_FINAL, 0); }
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
		enterRule(_localctx, 16, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(NOME_VARIAVEL);
			 verificaID(_input.LT(-1).getText());
			                    _exprID = _input.LT(-1).getText();
			                    setarInitialized(_exprID);
			                   
			setState(93);
			match(ATRIBUIR);
			 _exprContent = ""; 
			setState(95);
			expressoes();
			setState(96);
			match(PONTO_FINAL);

			               	 CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
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
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__7);
			setState(100);
			match(ABRE_PARENTESES);
			setState(101);
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
			setState(103);
			match(OPERADORES_RELACIONAIS);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(105);
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
			setState(107);
			match(FECHA_PARENTESES);
			setState(108);
			match(T__8);
			setState(109);
			match(ABRE_CHAVES);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				comandos();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << NOME_VARIAVEL))) != 0) );
			setState(116);
			match(FECHA_CHAVES);

			                       listaTrue = stack.pop();	
			                    
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(118);
				match(T__9);
				setState(119);
				match(ABRE_CHAVES);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				{
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121);
					comandos();
					}
					}
					setState(124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << NOME_VARIAVEL))) != 0) );
				}
				setState(126);
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
		enterRule(_localctx, 20, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__10);
			setState(132);
			match(ABRE_PARENTESES);
			setState(133);
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
			setState(135);
			match(OPERADORES_RELACIONAIS);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(137);
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
			setState(139);
			match(FECHA_PARENTESES);
			setState(140);
			match(T__11);
			setState(141);
			match(ABRE_CHAVES);
			 curThread = new ArrayList<AbstractCommand>();
			                      stack.push(curThread);
			                    
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				comandos();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << NOME_VARIAVEL))) != 0) );
			setState(148);
			match(FECHA_CHAVES);

			                       listaTrue = stack.pop();
			                       CommandRepeticao cmd = new CommandRepeticao(_exprDecision, listaTrue);
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
		enterRule(_localctx, 22, RULE_expressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			termo();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES) {
				{
				{
				setState(152);
				match(OPERADORES);
				 _exprContent += _input.LT(-1).getText();
				setState(154);
				termo();
				}
				}
				setState(159);
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
		enterRule(_localctx, 24, RULE_termo);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(NOME_VARIAVEL);
				 verificaID(_input.LT(-1).getText()); _exprContent += _input.LT(-1).getText(); verificaValorID(_input.LT(-1).getText()); 
				}
				break;
			case NUMERO_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NUMERO_REAL);

				              	_exprContent += _input.LT(-1).getText();
				              
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(INTEIRO);

				                  	_exprContent += _input.LT(-1).getText();
				               
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3$\n\3\r"+
		"\3\16\3%\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\6\6?\n\6\r\6\16\6@\3\7\3\7\3\7\3"+
		"\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tX\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13s\n\13\r\13"+
		"\16\13t\3\13\3\13\3\13\3\13\3\13\3\13\6\13}\n\13\r\13\16\13~\3\13\3\13"+
		"\3\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\6\f\u0093\n\f\r\f\16\f\u0094\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009e"+
		"\n\r\f\r\16\r\u00a1\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ab\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2\30\30"+
		"\32\33\2\u00b1\2\34\3\2\2\2\4#\3\2\2\2\6\'\3\2\2\2\b:\3\2\2\2\n<\3\2\2"+
		"\2\fG\3\2\2\2\16I\3\2\2\2\20Q\3\2\2\2\22]\3\2\2\2\24e\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u0099\3\2\2\2\32\u00aa\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2"+
		"\36\37\5\n\6\2\37 \7\4\2\2 !\b\2\1\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2"+
		"$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'(\5\b\5\2()\7\30\2\2)/\b\4"+
		"\1\2*+\7\24\2\2+,\7\30\2\2,.\b\4\1\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/"+
		"\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\21\2\2\63\7\3\2\2\2\64\65"+
		"\7\5\2\2\65;\b\5\1\2\66\67\7\6\2\2\67;\b\5\1\289\7\7\2\29;\b\5\1\2:\64"+
		"\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;\t\3\2\2\2<>\b\6\1\2=?\5\f\7\2>=\3\2\2"+
		"\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2BH\5\16\b\2CH\5\20\t\2DH\5"+
		"\22\n\2EH\5\24\13\2FH\5\26\f\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2"+
		"GF\3\2\2\2H\r\3\2\2\2IJ\7\b\2\2JK\7\17\2\2KL\7\30\2\2LM\b\b\1\2MN\7\20"+
		"\2\2NO\7\21\2\2OP\b\b\1\2P\17\3\2\2\2QR\7\t\2\2RW\7\17\2\2ST\7\31\2\2"+
		"TX\b\t\1\2UV\7\30\2\2VX\b\t\1\2WS\3\2\2\2WU\3\2\2\2XY\3\2\2\2YZ\7\20\2"+
		"\2Z[\7\21\2\2[\\\b\t\1\2\\\21\3\2\2\2]^\7\30\2\2^_\b\n\1\2_`\7\23\2\2"+
		"`a\b\n\1\2ab\5\30\r\2bc\7\21\2\2cd\b\n\1\2d\23\3\2\2\2ef\7\n\2\2fg\7\17"+
		"\2\2gh\t\2\2\2hi\b\13\1\2ij\7\27\2\2jk\b\13\1\2kl\t\2\2\2lm\b\13\1\2m"+
		"n\7\20\2\2no\7\13\2\2op\7\25\2\2pr\b\13\1\2qs\5\f\7\2rq\3\2\2\2st\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\26\2\2w\u0083\b\13\1\2xy\7\f\2"+
		"\2yz\7\25\2\2z|\b\13\1\2{}\5\f\7\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\26\2\2\u0081\u0082\b\13\1\2\u0082"+
		"\u0084\3\2\2\2\u0083x\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\7\r\2\2\u0086\u0087\7\17\2\2\u0087\u0088\t\2\2\2\u0088\u0089\b"+
		"\f\1\2\u0089\u008a\7\27\2\2\u008a\u008b\b\f\1\2\u008b\u008c\t\2\2\2\u008c"+
		"\u008d\b\f\1\2\u008d\u008e\7\20\2\2\u008e\u008f\7\16\2\2\u008f\u0090\7"+
		"\25\2\2\u0090\u0092\b\f\1\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\26\2\2\u0097\u0098\b\f\1\2\u0098\27\3\2\2\2\u0099\u009f"+
		"\5\32\16\2\u009a\u009b\7\22\2\2\u009b\u009c\b\r\1\2\u009c\u009e\5\32\16"+
		"\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3"+
		"\u00ab\b\16\1\2\u00a4\u00a5\7\32\2\2\u00a5\u00ab\b\16\1\2\u00a6\u00a7"+
		"\7\33\2\2\u00a7\u00ab\b\16\1\2\u00a8\u00a9\7\31\2\2\u00a9\u00ab\b\16\1"+
		"\2\u00aa\u00a2\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\33\3\2\2\2\16%/:@GWt~\u0083\u0094\u009f\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}