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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AP=9, 
		FP=10, SC=11, OP=12, ATTR=13, VIR=14, ACH=15, FCH=16, OPREL=17, ID=18, 
		NUMBER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "AP", 
			"FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'int'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'('", "')'", "';'", null, "'='", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AP", "FP", "SC", 
			"OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22w\n\22\3\23\3\23\7\23{\n\23\f\23\16\23~\13\23\3\24\6\24\u0081"+
		"\n\24\r\24\16\24\u0082\3\24\3\24\6\24\u0087\n\24\r\24\16\24\u0088\5\24"+
		"\u008b\n\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\b"+
		"\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\64\3\2\2\2"+
		"\7=\3\2\2\2\tA\3\2\2\2\13G\3\2\2\2\rL\3\2\2\2\17T\3\2\2\2\21W\3\2\2\2"+
		"\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2"+
		"\2\37i\3\2\2\2!k\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'\u0080\3\2\2\2)\u008c\3"+
		"\2\2\2+,\7r\2\2,-\7t\2\2-.\7q\2\2./\7i\2\2/\60\7t\2\2\60\61\7c\2\2\61"+
		"\62\7o\2\2\62\63\7c\2\2\63\4\3\2\2\2\64\65\7h\2\2\65\66\7k\2\2\66\67\7"+
		"o\2\2\678\7r\2\289\7t\2\29:\7q\2\2:;\7i\2\2;<\7=\2\2<\6\3\2\2\2=>\7k\2"+
		"\2>?\7p\2\2?@\7v\2\2@\b\3\2\2\2AB\7v\2\2BC\7g\2\2CD\7z\2\2DE\7v\2\2EF"+
		"\7q\2\2F\n\3\2\2\2GH\7n\2\2HI\7g\2\2IJ\7k\2\2JK\7c\2\2K\f\3\2\2\2LM\7"+
		"g\2\2MN\7u\2\2NO\7e\2\2OP\7t\2\2PQ\7g\2\2QR\7x\2\2RS\7c\2\2S\16\3\2\2"+
		"\2TU\7u\2\2UV\7g\2\2V\20\3\2\2\2WX\7u\2\2XY\7g\2\2YZ\7p\2\2Z[\7c\2\2["+
		"\\\7q\2\2\\\22\3\2\2\2]^\7*\2\2^\24\3\2\2\2_`\7+\2\2`\26\3\2\2\2ab\7="+
		"\2\2b\30\3\2\2\2cd\t\2\2\2d\32\3\2\2\2ef\7?\2\2f\34\3\2\2\2gh\7.\2\2h"+
		"\36\3\2\2\2ij\7}\2\2j \3\2\2\2kl\7\177\2\2l\"\3\2\2\2mw\t\3\2\2no\7@\2"+
		"\2ow\7?\2\2pq\7>\2\2qw\7?\2\2rs\7?\2\2sw\7?\2\2tu\7#\2\2uw\7?\2\2vm\3"+
		"\2\2\2vn\3\2\2\2vp\3\2\2\2vr\3\2\2\2vt\3\2\2\2w$\3\2\2\2x|\t\4\2\2y{\t"+
		"\5\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}&\3\2\2\2~|\3\2\2\2\177"+
		"\u0081\t\6\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u008a\3\2\2\2\u0084\u0086\7\60\2\2\u0085"+
		"\u0087\t\6\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b(\3\2\2\2\u008c\u008d\t\7\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008f\b\25\2\2\u008f*\3\2\2\2\t\2vz|\u0082\u0088\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}