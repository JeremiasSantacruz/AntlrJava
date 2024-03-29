// Generated from C:/Users/MPi5/Desktop/sintaxis/src/main/Antlr4\tpi.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tpiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ACCION=2, ES=3, FINACCION=4, AMBIENTE=5, PROCESO=6, TIPODEDATO=7, 
		MIENTRAS=8, HACER=9, FINMIENTRAS=10, HASTAQUE=11, REPETIR=12, SI=13, ENTONCES=14, 
		SINO=15, FINSI=16, PARA=17, HASTA=18, FINPARA=19, SEGUN=20, DEFECTO=21, 
		FINSEGUN=22, CADENA=23, ESCRIBIR=24, LEER=25, IGUAL=26, DPUNTOS=27, SEMI=28, 
		MENOS=29, MAS=30, OR=31, MULTI=32, DIVENT=33, DIV=34, MOD=35, AND=36, 
		POT=37, NOTL=38, PAR=39, IPAR=40, DESIGUAL=41, MENORA=42, MAYORA=43, MENOROI=44, 
		MAYOROI=45, COMA=46, REAL=47, NUMEROENTERO=48, ASIGNACION=49, ASGINACIONINC=50, 
		BOOL=51, IDENTIFICADOR=52, TXT=53, WHITESPACE=54, NEWLINE=55, COMENTARIO1=56, 
		COMENTARIO2=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ACCION", 
			"ES", "FINACCION", "AMBIENTE", "PROCESO", "TIPODEDATO", "MIENTRAS", "HACER", 
			"FINMIENTRAS", "HASTAQUE", "REPETIR", "SI", "ENTONCES", "SINO", "FINSI", 
			"PARA", "HASTA", "FINPARA", "SEGUN", "DEFECTO", "FINSEGUN", "CADENA", 
			"ESCRIBIR", "LEER", "IGUAL", "DPUNTOS", "SEMI", "MENOS", "MAS", "OR", 
			"MULTI", "DIVENT", "DIV", "MOD", "AND", "POT", "NOTL", "PAR", "IPAR", 
			"DESIGUAL", "MENORA", "MAYORA", "MENOROI", "MAYOROI", "COMA", "REAL", 
			"NUMEROENTERO", "ASIGNACION", "ASGINACIONINC", "BOOL", "IDENTIFICADOR", 
			"TXT", "WHITESPACE", "NEWLINE", "COMENTARIO1", "COMENTARIO2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'='", "':'", "';'", "'-'", "'+'", null, "'*'", "'/'", null, 
			null, null, "'**'", "'_no'", "'('", "')'", "'<>'", "'<'", "'>'", "'<='", 
			"'>='", null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ACCION", "ES", "FINACCION", "AMBIENTE", "PROCESO", "TIPODEDATO", 
			"MIENTRAS", "HACER", "FINMIENTRAS", "HASTAQUE", "REPETIR", "SI", "ENTONCES", 
			"SINO", "FINSI", "PARA", "HASTA", "FINPARA", "SEGUN", "DEFECTO", "FINSEGUN", 
			"CADENA", "ESCRIBIR", "LEER", "IGUAL", "DPUNTOS", "SEMI", "MENOS", "MAS", 
			"OR", "MULTI", "DIVENT", "DIV", "MOD", "AND", "POT", "NOTL", "PAR", "IPAR", 
			"DESIGUAL", "MENORA", "MAYORA", "MENOROI", "MAYOROI", "COMA", "REAL", 
			"NUMEROENTERO", "ASIGNACION", "ASGINACIONINC", "BOOL", "IDENTIFICADOR", 
			"TXT", "WHITESPACE", "NEWLINE", "COMENTARIO1", "COMENTARIO2"
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


	public tpiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tpi.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0249\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0121\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3"+
		"G\3G\3H\3H\3H\3I\3I\3J\6J\u01e4\nJ\rJ\16J\u01e5\3J\3J\6J\u01ea\nJ\rJ\16"+
		"J\u01eb\3K\6K\u01ef\nK\rK\16K\u01f0\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\5M\u01fd"+
		"\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0208\nN\3O\3O\7O\u020c\nO\fO\16O\u020f"+
		"\13O\3O\3O\6O\u0213\nO\rO\16O\u0214\7O\u0217\nO\fO\16O\u021a\13O\3P\3"+
		"P\3P\3P\7P\u0220\nP\fP\16P\u0223\13P\3P\3P\3Q\3Q\3Q\3Q\3R\5R\u022c\nR"+
		"\3R\3R\6R\u0230\nR\rR\16R\u0231\3S\3S\7S\u0236\nS\fS\16S\u0239\13S\3S"+
		"\3S\3S\3S\3T\3T\7T\u0241\nT\fT\16T\u0244\13T\3T\3T\3T\3T\5\u0221\u0237"+
		"\u0242\2U\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\4;\5=\6?\7A\b"+
		"C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g"+
		"\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089"+
		",\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b"+
		"\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\3\2!\4\2CCcc\4\2DDd"+
		"d\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2"+
		"MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2..\60\60\3"+
		"\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0240\2\3\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\3\u00a9\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2\2\t\u00af\3\2\2"+
		"\2\13\u00b1\3\2\2\2\r\u00b3\3\2\2\2\17\u00b5\3\2\2\2\21\u00b7\3\2\2\2"+
		"\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd\3\2\2\2\31\u00bf\3\2\2\2\33"+
		"\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2\2\2#\u00c9"+
		"\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d1\3\2\2\2"+
		"-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00db"+
		"\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e6\3\2\2\2=\u00ea\3\2\2\2"+
		"?\u00f5\3\2\2\2A\u00fe\3\2\2\2C\u0120\3\2\2\2E\u0122\3\2\2\2G\u012b\3"+
		"\2\2\2I\u0131\3\2\2\2K\u013e\3\2\2\2M\u0148\3\2\2\2O\u0150\3\2\2\2Q\u0153"+
		"\3\2\2\2S\u015c\3\2\2\2U\u0161\3\2\2\2W\u0168\3\2\2\2Y\u016d\3\2\2\2["+
		"\u0173\3\2\2\2]\u017c\3\2\2\2_\u0182\3\2\2\2a\u018b\3\2\2\2c\u0195\3\2"+
		"\2\2e\u019c\3\2\2\2g\u01a5\3\2\2\2i\u01aa\3\2\2\2k\u01ac\3\2\2\2m\u01ae"+
		"\3\2\2\2o\u01b0\3\2\2\2q\u01b2\3\2\2\2s\u01b4\3\2\2\2u\u01b7\3\2\2\2w"+
		"\u01b9\3\2\2\2y\u01bb\3\2\2\2{\u01c0\3\2\2\2}\u01c5\3\2\2\2\177\u01c8"+
		"\3\2\2\2\u0081\u01cb\3\2\2\2\u0083\u01cf\3\2\2\2\u0085\u01d1\3\2\2\2\u0087"+
		"\u01d3\3\2\2\2\u0089\u01d6\3\2\2\2\u008b\u01d8\3\2\2\2\u008d\u01da\3\2"+
		"\2\2\u008f\u01dd\3\2\2\2\u0091\u01e0\3\2\2\2\u0093\u01e3\3\2\2\2\u0095"+
		"\u01ee\3\2\2\2\u0097\u01f2\3\2\2\2\u0099\u01fc\3\2\2\2\u009b\u0207\3\2"+
		"\2\2\u009d\u0209\3\2\2\2\u009f\u021b\3\2\2\2\u00a1\u0226\3\2\2\2\u00a3"+
		"\u022f\3\2\2\2\u00a5\u0233\3\2\2\2\u00a7\u023e\3\2\2\2\u00a9\u00aa\7."+
		"\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\t"+
		"\3\2\2\u00ae\b\3\2\2\2\u00af\u00b0\t\4\2\2\u00b0\n\3\2\2\2\u00b1\u00b2"+
		"\t\5\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\t\6\2\2\u00b4\16\3\2\2\2\u00b5\u00b6"+
		"\t\7\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\t\b\2\2\u00b8\22\3\2\2\2\u00b9\u00ba"+
		"\t\t\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\t\n\2\2\u00bc\26\3\2\2\2\u00bd\u00be"+
		"\t\13\2\2\u00be\30\3\2\2\2\u00bf\u00c0\t\f\2\2\u00c0\32\3\2\2\2\u00c1"+
		"\u00c2\t\r\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\t\16\2\2\u00c4\36\3\2\2\2"+
		"\u00c5\u00c6\t\17\2\2\u00c6 \3\2\2\2\u00c7\u00c8\t\20\2\2\u00c8\"\3\2"+
		"\2\2\u00c9\u00ca\t\21\2\2\u00ca$\3\2\2\2\u00cb\u00cc\t\22\2\2\u00cc&\3"+
		"\2\2\2\u00cd\u00ce\t\23\2\2\u00ce(\3\2\2\2\u00cf\u00d0\t\24\2\2\u00d0"+
		"*\3\2\2\2\u00d1\u00d2\t\25\2\2\u00d2,\3\2\2\2\u00d3\u00d4\t\26\2\2\u00d4"+
		".\3\2\2\2\u00d5\u00d6\t\27\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\t\30\2\2\u00d8"+
		"\62\3\2\2\2\u00d9\u00da\t\31\2\2\u00da\64\3\2\2\2\u00db\u00dc\t\32\2\2"+
		"\u00dc\66\3\2\2\2\u00dd\u00de\t\33\2\2\u00de8\3\2\2\2\u00df\u00e0\5\5"+
		"\3\2\u00e0\u00e1\5\t\5\2\u00e1\u00e2\5\t\5\2\u00e2\u00e3\5\25\13\2\u00e3"+
		"\u00e4\5!\21\2\u00e4\u00e5\5\37\20\2\u00e5:\3\2\2\2\u00e6\u00e7\7a\2\2"+
		"\u00e7\u00e8\5\r\7\2\u00e8\u00e9\5)\25\2\u00e9<\3\2\2\2\u00ea\u00eb\5"+
		"\17\b\2\u00eb\u00ec\5\25\13\2\u00ec\u00ed\5\37\20\2\u00ed\u00ee\7a\2\2"+
		"\u00ee\u00ef\5\5\3\2\u00ef\u00f0\5\t\5\2\u00f0\u00f1\5\t\5\2\u00f1\u00f2"+
		"\5\25\13\2\u00f2\u00f3\5!\21\2\u00f3\u00f4\5\37\20\2\u00f4>\3\2\2\2\u00f5"+
		"\u00f6\5\5\3\2\u00f6\u00f7\5\35\17\2\u00f7\u00f8\5\7\4\2\u00f8\u00f9\5"+
		"\25\13\2\u00f9\u00fa\5\r\7\2\u00fa\u00fb\5\37\20\2\u00fb\u00fc\5+\26\2"+
		"\u00fc\u00fd\5\r\7\2\u00fd@\3\2\2\2\u00fe\u00ff\5#\22\2\u00ff\u0100\5"+
		"\'\24\2\u0100\u0101\5!\21\2\u0101\u0102\5\t\5\2\u0102\u0103\5\r\7\2\u0103"+
		"\u0104\5)\25\2\u0104\u0105\5!\21\2\u0105B\3\2\2\2\u0106\u0107\5\t\5\2"+
		"\u0107\u0108\5\5\3\2\u0108\u0109\5\13\6\2\u0109\u010a\5\r\7\2\u010a\u010b"+
		"\5\37\20\2\u010b\u010c\5\5\3\2\u010c\u0121\3\2\2\2\u010d\u010e\5\r\7\2"+
		"\u010e\u010f\5\37\20\2\u010f\u0110\5+\26\2\u0110\u0111\5\r\7\2\u0111\u0112"+
		"\5\'\24\2\u0112\u0113\5!\21\2\u0113\u0121\3\2\2\2\u0114\u0115\5\'\24\2"+
		"\u0115\u0116\5\r\7\2\u0116\u0117\5\5\3\2\u0117\u0118\5\33\16\2\u0118\u0121"+
		"\3\2\2\2\u0119\u011a\5\37\20\2\u011a\u011b\5-\27\2\u011b\u011c\5\35\17"+
		"\2\u011c\u011d\5\r\7\2\u011d\u011e\5\'\24\2\u011e\u011f\5!\21\2\u011f"+
		"\u0121\3\2\2\2\u0120\u0106\3\2\2\2\u0120\u010d\3\2\2\2\u0120\u0114\3\2"+
		"\2\2\u0120\u0119\3\2\2\2\u0121D\3\2\2\2\u0122\u0123\5\35\17\2\u0123\u0124"+
		"\5\25\13\2\u0124\u0125\5\r\7\2\u0125\u0126\5\37\20\2\u0126\u0127\5+\26"+
		"\2\u0127\u0128\5\'\24\2\u0128\u0129\5\5\3\2\u0129\u012a\5)\25\2\u012a"+
		"F\3\2\2\2\u012b\u012c\5\23\n\2\u012c\u012d\5\5\3\2\u012d\u012e\5\t\5\2"+
		"\u012e\u012f\5\r\7\2\u012f\u0130\5\'\24\2\u0130H\3\2\2\2\u0131\u0132\5"+
		"\17\b\2\u0132\u0133\5\25\13\2\u0133\u0134\5\37\20\2\u0134\u0135\7a\2\2"+
		"\u0135\u0136\5\35\17\2\u0136\u0137\5\25\13\2\u0137\u0138\5\r\7\2\u0138"+
		"\u0139\5\37\20\2\u0139\u013a\5+\26\2\u013a\u013b\5\'\24\2\u013b\u013c"+
		"\5\5\3\2\u013c\u013d\5)\25\2\u013dJ\3\2\2\2\u013e\u013f\5\23\n\2\u013f"+
		"\u0140\5\5\3\2\u0140\u0141\5)\25\2\u0141\u0142\5+\26\2\u0142\u0143\5\5"+
		"\3\2\u0143\u0144\7a\2\2\u0144\u0145\5%\23\2\u0145\u0146\5-\27\2\u0146"+
		"\u0147\5\r\7\2\u0147L\3\2\2\2\u0148\u0149\5\'\24\2\u0149\u014a\5\r\7\2"+
		"\u014a\u014b\5#\22\2\u014b\u014c\5\r\7\2\u014c\u014d\5+\26\2\u014d\u014e"+
		"\5\25\13\2\u014e\u014f\5\'\24\2\u014fN\3\2\2\2\u0150\u0151\5)\25\2\u0151"+
		"\u0152\5\25\13\2\u0152P\3\2\2\2\u0153\u0154\5\r\7\2\u0154\u0155\5\37\20"+
		"\2\u0155\u0156\5+\26\2\u0156\u0157\5!\21\2\u0157\u0158\5\37\20\2\u0158"+
		"\u0159\5\t\5\2\u0159\u015a\5\r\7\2\u015a\u015b\5)\25\2\u015bR\3\2\2\2"+
		"\u015c\u015d\5)\25\2\u015d\u015e\5\25\13\2\u015e\u015f\5\37\20\2\u015f"+
		"\u0160\5!\21\2\u0160T\3\2\2\2\u0161\u0162\5\17\b\2\u0162\u0163\5\25\13"+
		"\2\u0163\u0164\5\37\20\2\u0164\u0165\7a\2\2\u0165\u0166\5)\25\2\u0166"+
		"\u0167\5\25\13\2\u0167V\3\2\2\2\u0168\u0169\5#\22\2\u0169\u016a\5\5\3"+
		"\2\u016a\u016b\5\'\24\2\u016b\u016c\5\5\3\2\u016cX\3\2\2\2\u016d\u016e"+
		"\5\23\n\2\u016e\u016f\5\5\3\2\u016f\u0170\5)\25\2\u0170\u0171\5+\26\2"+
		"\u0171\u0172\5\5\3\2\u0172Z\3\2\2\2\u0173\u0174\5\17\b\2\u0174\u0175\5"+
		"\25\13\2\u0175\u0176\5\37\20\2\u0176\u0177\7a\2\2\u0177\u0178\5#\22\2"+
		"\u0178\u0179\5\5\3\2\u0179\u017a\5\'\24\2\u017a\u017b\5\5\3\2\u017b\\"+
		"\3\2\2\2\u017c\u017d\5)\25\2\u017d\u017e\5\r\7\2\u017e\u017f\5\21\t\2"+
		"\u017f\u0180\5-\27\2\u0180\u0181\5\37\20\2\u0181^\3\2\2\2\u0182\u0183"+
		"\5\13\6\2\u0183\u0184\5\r\7\2\u0184\u0185\5\17\b\2\u0185\u0186\5\r\7\2"+
		"\u0186\u0187\5\t\5\2\u0187\u0188\5+\26\2\u0188\u0189\5!\21\2\u0189\u018a"+
		"\7<\2\2\u018a`\3\2\2\2\u018b\u018c\5\17\b\2\u018c\u018d\5\25\13\2\u018d"+
		"\u018e\5\37\20\2\u018e\u018f\7a\2\2\u018f\u0190\5)\25\2\u0190\u0191\5"+
		"\r\7\2\u0191\u0192\5\21\t\2\u0192\u0193\5-\27\2\u0193\u0194\5\37\20\2"+
		"\u0194b\3\2\2\2\u0195\u0196\5\t\5\2\u0196\u0197\5\5\3\2\u0197\u0198\5"+
		"\13\6\2\u0198\u0199\5\r\7\2\u0199\u019a\5\37\20\2\u019a\u019b\5\5\3\2"+
		"\u019bd\3\2\2\2\u019c\u019d\5\r\7\2\u019d\u019e\5)\25\2\u019e\u019f\5"+
		"\t\5\2\u019f\u01a0\5\'\24\2\u01a0\u01a1\5\25\13\2\u01a1\u01a2\5\7\4\2"+
		"\u01a2\u01a3\5\25\13\2\u01a3\u01a4\5\'\24\2\u01a4f\3\2\2\2\u01a5\u01a6"+
		"\5\33\16\2\u01a6\u01a7\5\r\7\2\u01a7\u01a8\5\r\7\2\u01a8\u01a9\5\'\24"+
		"\2\u01a9h\3\2\2\2\u01aa\u01ab\7?\2\2\u01abj\3\2\2\2\u01ac\u01ad\7<\2\2"+
		"\u01adl\3\2\2\2\u01ae\u01af\7=\2\2\u01afn\3\2\2\2\u01b0\u01b1\7/\2\2\u01b1"+
		"p\3\2\2\2\u01b2\u01b3\7-\2\2\u01b3r\3\2\2\2\u01b4\u01b5\7a\2\2\u01b5\u01b6"+
		"\5!\21\2\u01b6t\3\2\2\2\u01b7\u01b8\7,\2\2\u01b8v\3\2\2\2\u01b9\u01ba"+
		"\7\61\2\2\u01bax\3\2\2\2\u01bb\u01bc\7a\2\2\u01bc\u01bd\5\13\6\2\u01bd"+
		"\u01be\5\25\13\2\u01be\u01bf\5/\30\2\u01bfz\3\2\2\2\u01c0\u01c1\7a\2\2"+
		"\u01c1\u01c2\5\35\17\2\u01c2\u01c3\5!\21\2\u01c3\u01c4\5\13\6\2\u01c4"+
		"|\3\2\2\2\u01c5\u01c6\7a\2\2\u01c6\u01c7\5\65\33\2\u01c7~\3\2\2\2\u01c8"+
		"\u01c9\7,\2\2\u01c9\u01ca\7,\2\2\u01ca\u0080\3\2\2\2\u01cb\u01cc\7a\2"+
		"\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7q\2\2\u01ce\u0082\3\2\2\2\u01cf\u01d0"+
		"\7*\2\2\u01d0\u0084\3\2\2\2\u01d1\u01d2\7+\2\2\u01d2\u0086\3\2\2\2\u01d3"+
		"\u01d4\7>\2\2\u01d4\u01d5\7@\2\2\u01d5\u0088\3\2\2\2\u01d6\u01d7\7>\2"+
		"\2\u01d7\u008a\3\2\2\2\u01d8\u01d9\7@\2\2\u01d9\u008c\3\2\2\2\u01da\u01db"+
		"\7>\2\2\u01db\u01dc\7?\2\2\u01dc\u008e\3\2\2\2\u01dd\u01de\7@\2\2\u01de"+
		"\u01df\7?\2\2\u01df\u0090\3\2\2\2\u01e0\u01e1\t\34\2\2\u01e1\u0092\3\2"+
		"\2\2\u01e2\u01e4\t\35\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\5\u0091"+
		"I\2\u01e8\u01ea\t\35\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0094\3\2\2\2\u01ed\u01ef\t\35"+
		"\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u0096\3\2\2\2\u01f2\u01f3\7<\2\2\u01f3\u01f4\7?\2"+
		"\2\u01f4\u0098\3\2\2\2\u01f5\u01f6\7/\2\2\u01f6\u01f7\7<\2\2\u01f7\u01fd"+
		"\7?\2\2\u01f8\u01f9\7-\2\2\u01f9\u01fa\7<\2\2\u01fa\u01fb\7?\2\2\u01fb"+
		"\u01fd\7\"\2\2\u01fc\u01f5\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fd\u009a\3\2"+
		"\2\2\u01fe\u01ff\7V\2\2\u01ff\u0200\7T\2\2\u0200\u0201\7W\2\2\u0201\u0208"+
		"\7G\2\2\u0202\u0203\7H\2\2\u0203\u0204\7C\2\2\u0204\u0205\7N\2\2\u0205"+
		"\u0206\7U\2\2\u0206\u0208\7G\2\2\u0207\u01fe\3\2\2\2\u0207\u0202\3\2\2"+
		"\2\u0208\u009c\3\2\2\2\u0209\u020d\t\36\2\2\u020a\u020c\t\37\2\2\u020b"+
		"\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0218\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\7a\2\2\u0211"+
		"\u0213\t\37\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0212\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0210\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u009e\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021b\u0221\7$\2\2\u021c\u021d\7^\2\2\u021d\u0220"+
		"\7$\2\2\u021e\u0220\13\2\2\2\u021f\u021c\3\2\2\2\u021f\u021e\3\2\2\2\u0220"+
		"\u0223\3\2\2\2\u0221\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7$\2\2\u0225\u00a0\3\2\2\2\u0226"+
		"\u0227\t \2\2\u0227\u0228\3\2\2\2\u0228\u0229\bQ\2\2\u0229\u00a2\3\2\2"+
		"\2\u022a\u022c\7\17\2\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u0230\7\f\2\2\u022e\u0230\7\17\2\2\u022f\u022b\3"+
		"\2\2\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u00a4\3\2\2\2\u0233\u0237\7B\2\2\u0234\u0236\13\2"+
		"\2\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0238\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7\f"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023d\bS\2\2\u023d\u00a6\3\2\2\2\u023e"+
		"\u0242\7%\2\2\u023f\u0241\13\2\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2"+
		"\2\2\u0242\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0245\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0246\7%\2\2\u0246\u0247\3\2\2\2\u0247\u0248\bT\2"+
		"\2\u0248\u00a8\3\2\2\2\23\2\u0120\u01e5\u01eb\u01f0\u01fc\u0207\u020d"+
		"\u0214\u0218\u021f\u0221\u022b\u022f\u0231\u0237\u0242\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}