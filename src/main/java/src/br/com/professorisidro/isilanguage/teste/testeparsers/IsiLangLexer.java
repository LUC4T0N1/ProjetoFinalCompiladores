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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ABRE_PARENTESES", 
			"FECHA_PARENTESES", "PONTO_FINAL", "OPERADORES", "ATRIBUIR", "ADICIONAR", 
			"VIRGULA", "ABRE_CHAVES", "OBTER", "FECHA_CHAVES", "OPERADORES_RELACIONAIS", 
			"NOME_VARIAVEL", "TEXTO", "NUMERO_REAL", "INTEIRO", "IGNORAR"
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d7\n\33\3\34\3\34\7\34\u00db\n\34"+
		"\f\34\16\34\u00de\13\34\3\35\3\35\7\35\u00e2\n\35\f\35\16\35\u00e5\13"+
		"\35\3\35\3\35\3\36\6\36\u00ea\n\36\r\36\16\36\u00eb\3\36\3\36\6\36\u00f0"+
		"\n\36\r\36\16\36\u00f1\5\36\u00f4\n\36\3\37\6\37\u00f7\n\37\r\37\16\37"+
		"\u00f8\3 \3 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!\3\2\t\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;"+
		"C\\c|\n\2\"#%%*+..\60=A\\c}\177\177\3\2\62;\5\2\13\f\17\17\"\"\2\u0107"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5J\3\2\2\2\7S\3\2\2\2\tW\3\2\2"+
		"\2\13\\\3\2\2\2\rb\3\2\2\2\17m\3\2\2\2\21z\3\2\2\2\23\u0086\3\2\2\2\25"+
		"\u008b\3\2\2\2\27\u0093\3\2\2\2\31\u0096\3\2\2\2\33\u009c\3\2\2\2\35\u00a2"+
		"\3\2\2\2\37\u00ab\3\2\2\2!\u00b1\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2"+
		"\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bc\3\2\2\2-\u00c0\3\2\2\2/\u00c2\3"+
		"\2\2\2\61\u00c4\3\2\2\2\63\u00cb\3\2\2\2\65\u00d6\3\2\2\2\67\u00d8\3\2"+
		"\2\29\u00df\3\2\2\2;\u00e9\3\2\2\2=\u00f6\3\2\2\2?\u00fa\3\2\2\2AB\7r"+
		"\2\2BC\7t\2\2CD\7q\2\2DE\7i\2\2EF\7t\2\2FG\7c\2\2GH\7o\2\2HI\7c\2\2I\4"+
		"\3\2\2\2JK\7h\2\2KL\7k\2\2LM\7o\2\2MN\7r\2\2NO\7t\2\2OP\7q\2\2PQ\7i\2"+
		"\2QR\7\60\2\2R\6\3\2\2\2ST\7k\2\2TU\7p\2\2UV\7v\2\2V\b\3\2\2\2WX\7t\2"+
		"\2XY\7g\2\2YZ\7c\2\2Z[\7n\2\2[\n\3\2\2\2\\]\7v\2\2]^\7g\2\2^_\7z\2\2_"+
		"`\7v\2\2`a\7q\2\2a\f\3\2\2\2bc\7n\2\2cd\7k\2\2de\7u\2\2ef\7v\2\2fg\7c"+
		"\2\2gh\7>\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2kl\7@\2\2l\16\3\2\2\2mn\7n\2\2"+
		"no\7k\2\2op\7u\2\2pq\7v\2\2qr\7c\2\2rs\7>\2\2st\7v\2\2tu\7g\2\2uv\7z\2"+
		"\2vw\7v\2\2wx\7q\2\2xy\7@\2\2y\20\3\2\2\2z{\7n\2\2{|\7k\2\2|}\7u\2\2}"+
		"~\7v\2\2~\177\7c\2\2\177\u0080\7>\2\2\u0080\u0081\7t\2\2\u0081\u0082\7"+
		"g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7@\2\2\u0085\22"+
		"\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7c\2\2\u008a\24\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7x\2\2"+
		"\u0091\u0092\7c\2\2\u0092\26\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7"+
		"g\2\2\u0095\30\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7c\2\2\u009a\u009b\7q\2\2\u009b\32\3\2\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7s\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\u00a9\7v\2\2\u00a9\u00aa\7q\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7"+
		"h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7|\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7*\2\2\u00b2\"\3\2\2\2\u00b3\u00b4"+
		"\7+\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6&\3\2\2\2\u00b7\u00b8"+
		"\t\2\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bb\7?\2\2\u00bb*\3"+
		"\2\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7e\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\60"+
		"\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7d\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7t\2\2\u00ca\62\3\2\2\2\u00cb"+
		"\u00cc\7\177\2\2\u00cc\64\3\2\2\2\u00cd\u00d7\t\3\2\2\u00ce\u00cf\7@\2"+
		"\2\u00cf\u00d7\7?\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d7\7?\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3\u00d7\7?\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d7\7?\2\2\u00d6"+
		"\u00cd\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d2\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\66\3\2\2\2\u00d8\u00dc\t\4\2\2\u00d9\u00db"+
		"\t\5\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd8\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\7$\2\2\u00e0"+
		"\u00e2\t\6\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7$\2\2\u00e7:\3\2\2\2\u00e8\u00ea\t\7\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f3\3\2"+
		"\2\2\u00ed\u00ef\7\60\2\2\u00ee\u00f0\t\7\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4<\3\2\2\2\u00f5\u00f7"+
		"\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9>\3\2\2\2\u00fa\u00fb\t\b\2\2\u00fb\u00fc\3\2\2\2"+
		"\u00fc\u00fd\b \2\2\u00fd@\3\2\2\2\f\2\u00d6\u00da\u00dc\u00e1\u00e3\u00eb"+
		"\u00f1\u00f3\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}