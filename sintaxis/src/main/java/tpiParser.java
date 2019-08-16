// Generated from C:/Users/MPi5/Desktop/sintaxis/src/main/Antlr4\tpi.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tpiParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_programa = 1, RULE_titulo = 2, RULE_cuerpo = 3, RULE_ambiente = 4, 
		RULE_lineaambiente = 5, RULE_variable = 6, RULE_constante = 7, RULE_proceso = 8, 
		RULE_lineacod = 9, RULE_asignacion = 10, RULE_asignacioninc = 11, RULE_sentencias = 12, 
		RULE_condicional = 13, RULE_iterativas = 14, RULE_lineasegun = 15, RULE_funcion = 16, 
		RULE_arg = 17, RULE_expresion = 18, RULE_siexpresion = 19, RULE_factor = 20, 
		RULE_termino = 21, RULE_hoja = 22, RULE_dato = 23, RULE_operadorrelacional = 24, 
		RULE_addoperador = 25, RULE_multioperador = 26, RULE_numero = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "programa", "titulo", "cuerpo", "ambiente", "lineaambiente", 
			"variable", "constante", "proceso", "lineacod", "asignacion", "asignacioninc", 
			"sentencias", "condicional", "iterativas", "lineasegun", "funcion", "arg", 
			"expresion", "siexpresion", "factor", "termino", "hoja", "dato", "operadorrelacional", 
			"addoperador", "multioperador", "numero"
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

	@Override
	public String getGrammarFileName() { return "tpi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tpiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<String> var = new ArrayList<String>();
		public List<String> no_var = new ArrayList<String>();
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tpiParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(tpiParser.NEWLINE, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			programa();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(57);
				match(NEWLINE);
				}
			}

			setState(60);
			match(EOF);
			System.out.println("================");
				 System.out.println("Variables: "+_localctx.var);
				 System.out.println("Constantes: "+_localctx.no_var);
				 System.out.println("================");
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

	public static class ProgramaContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(tpiParser.NEWLINE, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode FINACCION() { return getToken(tpiParser.FINACCION, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			titulo();
			setState(64);
			match(NEWLINE);
			setState(65);
			cuerpo();
			setState(66);
			match(FINACCION);
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

	public static class TituloContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public TerminalNode ACCION() { return getToken(tpiParser.ACCION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public TerminalNode ES() { return getToken(tpiParser.ES, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ACCION);
			setState(69);
			((TituloContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(70);
			match(ES);

			      ((StartContext)getInvokingContext(0)).no_var.add((((TituloContext)_localctx).IDENTIFICADOR!=null?((TituloContext)_localctx).IDENTIFICADOR.getText():null));
			   
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

	public static class CuerpoContext extends ParserRuleContext {
		public AmbienteContext ambiente() {
			return getRuleContext(AmbienteContext.class,0);
		}
		public ProcesoContext proceso() {
			return getRuleContext(ProcesoContext.class,0);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitCuerpo(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			ambiente();
			setState(74);
			proceso();
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

	public static class AmbienteContext extends ParserRuleContext {
		public TerminalNode AMBIENTE() { return getToken(tpiParser.AMBIENTE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(tpiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(tpiParser.NEWLINE, i);
		}
		public LineaambienteContext lineaambiente() {
			return getRuleContext(LineaambienteContext.class,0);
		}
		public AmbienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterAmbiente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitAmbiente(this);
		}
	}

	public final AmbienteContext ambiente() throws RecognitionException {
		AmbienteContext _localctx = new AmbienteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ambiente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(AMBIENTE);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				match(NEWLINE);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(82);
				lineaambiente();
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

	public static class LineaambienteContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public LineaambienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineaambiente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterLineaambiente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitLineaambiente(this);
		}
	}

	public final LineaambienteContext lineaambiente() throws RecognitionException {
		LineaambienteContext _localctx = new LineaambienteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lineaambiente);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				constante();
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

	public static class VariableContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode DPUNTOS() { return getToken(tpiParser.DPUNTOS, 0); }
		public TerminalNode TIPODEDATO() { return getToken(tpiParser.TIPODEDATO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(tpiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(tpiParser.NEWLINE, i);
		}
		public LineaambienteContext lineaambiente() {
			return getRuleContext(LineaambienteContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((VariableContext)_localctx).ID = match(IDENTIFICADOR);
			setState(90);
			match(DPUNTOS);
			setState(91);
			match(TIPODEDATO);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				match(NEWLINE);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(97);
				lineaambiente();
				}
			}


			   String aux1 = Integer.toString((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getCharPositionInLine():0));
			   String aux2 = Integer.toString((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getLine():0));
			   if ( (!((StartContext)getInvokingContext(0)).var.contains((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null))) & (!((StartContext)getInvokingContext(0)).no_var.contains((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null))) ) {
			      ((StartContext)getInvokingContext(0)).var.add((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null));
			   } else {
			      System.err.println("Variable ya definida: "+(((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null) + " <"+ aux2 + "," + aux1 + ">");
			   };
			   
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

	public static class ConstanteContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode IGUAL() { return getToken(tpiParser.IGUAL, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(tpiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(tpiParser.NEWLINE, i);
		}
		public LineaambienteContext lineaambiente() {
			return getRuleContext(LineaambienteContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitConstante(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((ConstanteContext)_localctx).ID = match(IDENTIFICADOR);
			setState(103);
			match(IGUAL);
			setState(104);
			termino();
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				match(NEWLINE);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(110);
				lineaambiente();
				}
			}


			   String aux1 = Integer.toString((((ConstanteContext)_localctx).ID!=null?((ConstanteContext)_localctx).ID.getCharPositionInLine():0));
			   String aux2 = Integer.toString((((ConstanteContext)_localctx).ID!=null?((ConstanteContext)_localctx).ID.getLine():0));
			   if ( (!((StartContext)getInvokingContext(0)).var.contains((((ConstanteContext)_localctx).ID!=null?((ConstanteContext)_localctx).ID.getText():null))) & (!((StartContext)getInvokingContext(0)).no_var.contains((((ConstanteContext)_localctx).ID!=null?((ConstanteContext)_localctx).ID.getText():null))) ) {
			      ((StartContext)getInvokingContext(0)).no_var.add((((ConstanteContext)_localctx).ID!=null?((ConstanteContext)_localctx).ID.getText():null));
			   } else {
			      System.err.println("Variable ya definida: "+(((ConstanteContext)_localctx).ID!=null?((ConstanteContext)_localctx).ID.getText():null)+ " <"+ aux2 + "," + aux1 + ">");
			   };
			   
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

	public static class ProcesoContext extends ParserRuleContext {
		public TerminalNode PROCESO() { return getToken(tpiParser.PROCESO, 0); }
		public TerminalNode NEWLINE() { return getToken(tpiParser.NEWLINE, 0); }
		public LineacodContext lineacod() {
			return getRuleContext(LineacodContext.class,0);
		}
		public ProcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterProceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitProceso(this);
		}
	}

	public final ProcesoContext proceso() throws RecognitionException {
		ProcesoContext _localctx = new ProcesoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_proceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(PROCESO);
			setState(116);
			match(NEWLINE);
			setState(117);
			lineacod();
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

	public static class LineacodContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(tpiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(tpiParser.NEWLINE, i);
		}
		public LineacodContext lineacod() {
			return getRuleContext(LineacodContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public AsignacionincContext asignacioninc() {
			return getRuleContext(AsignacionincContext.class,0);
		}
		public LineacodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineacod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterLineacod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitLineacod(this);
		}
	}

	public final LineacodContext lineacod() throws RecognitionException {
		LineacodContext _localctx = new LineacodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lineacod);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				asignacion();
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(NEWLINE);
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(125);
					lineacod();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				funcion();
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(NEWLINE);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(134);
					lineacod();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				sentencias();
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					match(NEWLINE);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(143);
					lineacod();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				asignacioninc();
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					match(NEWLINE);
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(152);
					lineacod();
					}
					break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ASIGNACION() { return getToken(tpiParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((AsignacionContext)_localctx).ID = match(IDENTIFICADOR);
			setState(158);
			match(ASIGNACION);
			setState(159);
			expresion();

			   String aux1 = Integer.toString((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getCharPositionInLine():0));
			   String aux2 = Integer.toString((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getLine():0));
			   if ( (!((StartContext)getInvokingContext(0)).var.contains((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) & (!((StartContext)getInvokingContext(0)).no_var.contains((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))) ) {
			      System.err.println("Variable no definida: "+ (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + " <"+ aux2 + "," + aux1 + ">");
			   } else if ( ((StartContext)getInvokingContext(0)).no_var.contains( (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null))){
			      System.err.println("Variable " +(((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null) + " es una constate"+ " <"+ aux2 + "," + aux1 + ">");
			   };
			   
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

	public static class AsignacionincContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ASGINACIONINC() { return getToken(tpiParser.ASGINACIONINC, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public AsignacionincContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacioninc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterAsignacioninc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitAsignacioninc(this);
		}
	}

	public final AsignacionincContext asignacioninc() throws RecognitionException {
		AsignacionincContext _localctx = new AsignacionincContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacioninc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((AsignacionincContext)_localctx).ID = match(IDENTIFICADOR);
			setState(163);
			match(ASGINACIONINC);
			setState(164);
			numero();

			   String aux1 = Integer.toString((((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getCharPositionInLine():0));
			   String aux2 = Integer.toString((((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getLine():0));
			   if ( (!((StartContext)getInvokingContext(0)).var.contains((((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getText():null))) & (!((StartContext)getInvokingContext(0)).no_var.contains((((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getText():null))) ) {
			      System.err.println("Variable no definida: "+ (((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getText():null) + " <"+ aux2 + "," + aux1 + ">");
			   } else if ( ((StartContext)getInvokingContext(0)).no_var.contains( (((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getText():null))){
			      System.err.println("Variable " +(((AsignacionincContext)_localctx).ID!=null?((AsignacionincContext)_localctx).ID.getText():null) + " es una constate"+ " <"+ aux2 + "," + aux1 + ">" );
			   };
			   
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

	public static class SentenciasContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public IterativasContext iterativas() {
			return getRuleContext(IterativasContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitSentencias(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencias);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
			case SEGUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				condicional();
				}
				break;
			case MIENTRAS:
			case REPETIR:
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				iterativas();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(tpiParser.SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(tpiParser.ENTONCES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(tpiParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(tpiParser.NEWLINE, i);
		}
		public List<LineacodContext> lineacod() {
			return getRuleContexts(LineacodContext.class);
		}
		public LineacodContext lineacod(int i) {
			return getRuleContext(LineacodContext.class,i);
		}
		public TerminalNode FINSI() { return getToken(tpiParser.FINSI, 0); }
		public TerminalNode SINO() { return getToken(tpiParser.SINO, 0); }
		public TerminalNode SEGUN() { return getToken(tpiParser.SEGUN, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public TerminalNode HACER() { return getToken(tpiParser.HACER, 0); }
		public LineasegunContext lineasegun() {
			return getRuleContext(LineasegunContext.class,0);
		}
		public TerminalNode DEFECTO() { return getToken(tpiParser.DEFECTO, 0); }
		public TerminalNode FINSEGUN() { return getToken(tpiParser.FINSEGUN, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicional);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(SI);
				setState(172);
				expresion();
				setState(173);
				match(ENTONCES);
				setState(174);
				match(NEWLINE);
				setState(175);
				lineacod();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINO) {
					{
					setState(176);
					match(SINO);
					setState(177);
					match(NEWLINE);
					setState(178);
					lineacod();
					}
				}

				setState(181);
				match(FINSI);
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(SEGUN);
				setState(184);
				match(IDENTIFICADOR);
				setState(185);
				match(HACER);
				setState(186);
				match(NEWLINE);
				setState(187);
				lineasegun();
				setState(188);
				match(DEFECTO);
				setState(189);
				match(NEWLINE);
				setState(190);
				lineacod();
				setState(191);
				match(FINSEGUN);
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

	public static class IterativasContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(tpiParser.REPETIR, 0); }
		public TerminalNode NEWLINE() { return getToken(tpiParser.NEWLINE, 0); }
		public LineacodContext lineacod() {
			return getRuleContext(LineacodContext.class,0);
		}
		public TerminalNode HASTAQUE() { return getToken(tpiParser.HASTAQUE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARA() { return getToken(tpiParser.PARA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(tpiParser.HASTA, 0); }
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public TerminalNode HACER() { return getToken(tpiParser.HACER, 0); }
		public TerminalNode FINPARA() { return getToken(tpiParser.FINPARA, 0); }
		public TerminalNode MIENTRAS() { return getToken(tpiParser.MIENTRAS, 0); }
		public TerminalNode FINMIENTRAS() { return getToken(tpiParser.FINMIENTRAS, 0); }
		public IterativasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterIterativas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitIterativas(this);
		}
	}

	public final IterativasContext iterativas() throws RecognitionException {
		IterativasContext _localctx = new IterativasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iterativas);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPETIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(REPETIR);
				setState(196);
				match(NEWLINE);
				setState(197);
				lineacod();
				setState(198);
				match(HASTAQUE);
				setState(199);
				expresion();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(PARA);
				setState(202);
				asignacion();
				setState(203);
				match(HASTA);
				setState(204);
				dato();
				setState(205);
				match(T__0);
				setState(206);
				dato();
				setState(207);
				match(HACER);
				setState(208);
				match(NEWLINE);
				setState(209);
				lineacod();
				setState(210);
				match(FINPARA);
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(MIENTRAS);
				setState(213);
				expresion();
				setState(214);
				match(HACER);
				setState(215);
				match(NEWLINE);
				setState(216);
				lineacod();
				setState(217);
				match(FINMIENTRAS);
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

	public static class LineasegunContext extends ParserRuleContext {
		public HojaContext hoja() {
			return getRuleContext(HojaContext.class,0);
		}
		public TerminalNode DPUNTOS() { return getToken(tpiParser.DPUNTOS, 0); }
		public LineacodContext lineacod() {
			return getRuleContext(LineacodContext.class,0);
		}
		public LineasegunContext lineasegun() {
			return getRuleContext(LineasegunContext.class,0);
		}
		public LineasegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineasegun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterLineasegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitLineasegun(this);
		}
	}

	public final LineasegunContext lineasegun() throws RecognitionException {
		LineasegunContext _localctx = new LineasegunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lineasegun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			hoja();
			setState(222);
			match(DPUNTOS);
			setState(223);
			lineacod();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOTL) | (1L << PAR) | (1L << REAL) | (1L << NUMEROENTERO) | (1L << BOOL) | (1L << IDENTIFICADOR) | (1L << TXT))) != 0)) {
				{
				setState(224);
				lineasegun();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(tpiParser.LEER, 0); }
		public TerminalNode PAR() { return getToken(tpiParser.PAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode IPAR() { return getToken(tpiParser.IPAR, 0); }
		public TerminalNode ESCRIBIR() { return getToken(tpiParser.ESCRIBIR, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcion);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEER:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(LEER);
				setState(228);
				match(PAR);
				setState(229);
				arg();
				setState(230);
				match(IPAR);
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(ESCRIBIR);
				setState(233);
				match(PAR);
				setState(234);
				arg();
				setState(235);
				match(IPAR);
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

	public static class ArgContext extends ParserRuleContext {
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arg);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				dato();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(240);
					match(T__0);
					setState(241);
					arg();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				expresion();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(245);
					match(T__0);
					setState(246);
					arg();
					}
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode PAR() { return getToken(tpiParser.PAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode IPAR() { return getToken(tpiParser.IPAR, 0); }
		public SiexpresionContext siexpresion() {
			return getRuleContext(SiexpresionContext.class,0);
		}
		public OperadorrelacionalContext operadorrelacional() {
			return getRuleContext(OperadorrelacionalContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresion);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(PAR);
				setState(252);
				expresion();
				setState(253);
				match(IPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				siexpresion();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DESIGUAL) | (1L << MENORA) | (1L << MAYORA) | (1L << MENOROI) | (1L << MAYOROI))) != 0)) {
					{
					setState(256);
					operadorrelacional();
					setState(257);
					expresion();
					}
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

	public static class SiexpresionContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AddoperadorContext addoperador() {
			return getRuleContext(AddoperadorContext.class,0);
		}
		public SiexpresionContext siexpresion() {
			return getRuleContext(SiexpresionContext.class,0);
		}
		public SiexpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siexpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterSiexpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitSiexpresion(this);
		}
	}

	public final SiexpresionContext siexpresion() throws RecognitionException {
		SiexpresionContext _localctx = new SiexpresionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_siexpresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			factor();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << MAS) | (1L << OR))) != 0)) {
				{
				setState(264);
				addoperador();
				setState(265);
				siexpresion();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public MultioperadorContext multioperador() {
			return getRuleContext(MultioperadorContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			termino();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(270);
				multioperador();
				setState(271);
				factor();
				}
				break;
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

	public static class TerminoContext extends ParserRuleContext {
		public HojaContext hoja() {
			return getRuleContext(HojaContext.class,0);
		}
		public TerminalNode MAS() { return getToken(tpiParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(tpiParser.MENOS, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==MENOS || _la==MAS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(278);
			hoja();
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

	public static class HojaContext extends ParserRuleContext {
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode PAR() { return getToken(tpiParser.PAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode IPAR() { return getToken(tpiParser.IPAR, 0); }
		public TerminalNode NOTL() { return getToken(tpiParser.NOTL, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(tpiParser.BOOL, 0); }
		public HojaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hoja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterHoja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitHoja(this);
		}
	}

	public final HojaContext hoja() throws RecognitionException {
		HojaContext _localctx = new HojaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_hoja);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				dato();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(PAR);
				setState(282);
				expresion();
				setState(283);
				match(IPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(NOTL);
				setState(286);
				factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(BOOL);
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

	public static class DatoContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(tpiParser.IDENTIFICADOR, 0); }
		public TerminalNode TXT() { return getToken(tpiParser.TXT, 0); }
		public TerminalNode BOOL() { return getToken(tpiParser.BOOL, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitDato(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dato);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
			case REAL:
			case NUMEROENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				numero();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				((DatoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);

				   if ( (!((StartContext)getInvokingContext(0)).var.contains((((DatoContext)_localctx).IDENTIFICADOR!=null?((DatoContext)_localctx).IDENTIFICADOR.getText():null))) & (!((StartContext)getInvokingContext(0)).no_var.contains((((DatoContext)_localctx).IDENTIFICADOR!=null?((DatoContext)_localctx).IDENTIFICADOR.getText():null))) ) {
				      String aux1 = Integer.toString((((DatoContext)_localctx).IDENTIFICADOR!=null?((DatoContext)_localctx).IDENTIFICADOR.getCharPositionInLine():0));
				      String aux2 = Integer.toString((((DatoContext)_localctx).IDENTIFICADOR!=null?((DatoContext)_localctx).IDENTIFICADOR.getLine():0));
				      System.err.println("Variable no definida: "+ (((DatoContext)_localctx).IDENTIFICADOR!=null?((DatoContext)_localctx).IDENTIFICADOR.getText():null) + " <"+ aux2 + "," + aux1 + ">");
				   }
				   
				}
				break;
			case TXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(TXT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(BOOL);
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

	public static class OperadorrelacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(tpiParser.IGUAL, 0); }
		public TerminalNode DESIGUAL() { return getToken(tpiParser.DESIGUAL, 0); }
		public TerminalNode MENORA() { return getToken(tpiParser.MENORA, 0); }
		public TerminalNode MAYORA() { return getToken(tpiParser.MAYORA, 0); }
		public TerminalNode MENOROI() { return getToken(tpiParser.MENOROI, 0); }
		public TerminalNode MAYOROI() { return getToken(tpiParser.MAYOROI, 0); }
		public OperadorrelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorrelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterOperadorrelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitOperadorrelacional(this);
		}
	}

	public final OperadorrelacionalContext operadorrelacional() throws RecognitionException {
		OperadorrelacionalContext _localctx = new OperadorrelacionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operadorrelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DESIGUAL) | (1L << MENORA) | (1L << MAYORA) | (1L << MENOROI) | (1L << MAYOROI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AddoperadorContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(tpiParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(tpiParser.MENOS, 0); }
		public TerminalNode OR() { return getToken(tpiParser.OR, 0); }
		public AddoperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addoperador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterAddoperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitAddoperador(this);
		}
	}

	public final AddoperadorContext addoperador() throws RecognitionException {
		AddoperadorContext _localctx = new AddoperadorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_addoperador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << MAS) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultioperadorContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(tpiParser.MULTI, 0); }
		public TerminalNode DIVENT() { return getToken(tpiParser.DIVENT, 0); }
		public TerminalNode DIV() { return getToken(tpiParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(tpiParser.MOD, 0); }
		public TerminalNode AND() { return getToken(tpiParser.AND, 0); }
		public TerminalNode POT() { return getToken(tpiParser.POT, 0); }
		public MultioperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multioperador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterMultioperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitMultioperador(this);
		}
	}

	public final MultioperadorContext multioperador() throws RecognitionException {
		MultioperadorContext _localctx = new MultioperadorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multioperador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTI) | (1L << DIVENT) | (1L << DIV) | (1L << MOD) | (1L << AND) | (1L << POT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(tpiParser.REAL, 0); }
		public TerminalNode MENOS() { return getToken(tpiParser.MENOS, 0); }
		public TerminalNode NUMEROENTERO() { return getToken(tpiParser.NUMEROENTERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tpiListener ) ((tpiListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numero);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MENOS) {
					{
					setState(303);
					match(MENOS);
					}
				}

				setState(306);
				match(REAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MENOS) {
					{
					setState(307);
					match(MENOS);
					}
				}

				setState(310);
				match(NUMEROENTERO);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\6\6Q\n\6"+
		"\r\6\16\6R\3\6\5\6V\n\6\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\6\b`\n\b\r\b"+
		"\16\ba\3\b\5\be\n\b\3\b\3\b\3\t\3\t\3\t\3\t\6\tm\n\t\r\t\16\tn\3\t\5\t"+
		"r\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6\13|\n\13\r\13\16\13}\3\13\5"+
		"\13\u0081\n\13\3\13\3\13\6\13\u0085\n\13\r\13\16\13\u0086\3\13\5\13\u008a"+
		"\n\13\3\13\3\13\6\13\u008e\n\13\r\13\16\13\u008f\3\13\5\13\u0093\n\13"+
		"\3\13\3\13\6\13\u0097\n\13\r\13\16\13\u0098\3\13\5\13\u009c\n\13\5\13"+
		"\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00ac"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00e4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00f0\n\22\3\23\3\23\3\23\5\23\u00f5\n\23\3\23\3\23\3\23\5"+
		"\23\u00fa\n\23\5\23\u00fc\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0106\n\24\5\24\u0108\n\24\3\25\3\25\3\25\3\25\5\25\u010e\n\25\3"+
		"\26\3\26\3\26\3\26\5\26\u0114\n\26\3\27\5\27\u0117\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u012a\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\5\35\u0133\n"+
		"\35\3\35\3\35\5\35\u0137\n\35\3\35\5\35\u013a\n\35\3\35\2\2\36\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\6\3\2\37 \4\2"+
		"\34\34+/\3\2\37!\3\2\"\'\2\u014a\2:\3\2\2\2\4A\3\2\2\2\6F\3\2\2\2\bK\3"+
		"\2\2\2\nN\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20h\3\2\2\2\22u\3\2\2\2\24\u009d"+
		"\3\2\2\2\26\u009f\3\2\2\2\30\u00a4\3\2\2\2\32\u00ab\3\2\2\2\34\u00c3\3"+
		"\2\2\2\36\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00ef\3\2\2\2$\u00fb\3\2\2\2"+
		"&\u0107\3\2\2\2(\u0109\3\2\2\2*\u010f\3\2\2\2,\u0116\3\2\2\2.\u0122\3"+
		"\2\2\2\60\u0129\3\2\2\2\62\u012b\3\2\2\2\64\u012d\3\2\2\2\66\u012f\3\2"+
		"\2\28\u0139\3\2\2\2:<\5\4\3\2;=\79\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>"+
		"?\7\2\2\3?@\b\2\1\2@\3\3\2\2\2AB\5\6\4\2BC\79\2\2CD\5\b\5\2DE\7\6\2\2"+
		"E\5\3\2\2\2FG\7\4\2\2GH\7\66\2\2HI\7\5\2\2IJ\b\4\1\2J\7\3\2\2\2KL\5\n"+
		"\6\2LM\5\22\n\2M\t\3\2\2\2NP\7\7\2\2OQ\79\2\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\f\7\2UT\3\2\2\2UV\3\2\2\2V\13\3\2\2\2W"+
		"Z\5\16\b\2XZ\5\20\t\2YW\3\2\2\2YX\3\2\2\2Z\r\3\2\2\2[\\\7\66\2\2\\]\7"+
		"\35\2\2]_\7\t\2\2^`\79\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3"+
		"\2\2\2ce\5\f\7\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\b\1\2g\17\3\2\2\2h"+
		"i\7\66\2\2ij\7\34\2\2jl\5,\27\2km\79\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pr\5\f\7\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\t\1\2"+
		"t\21\3\2\2\2uv\7\b\2\2vw\79\2\2wx\5\24\13\2x\23\3\2\2\2y{\5\26\f\2z|\7"+
		"9\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081"+
		"\5\24\13\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u009e\3\2\2\2\u0082"+
		"\u0084\5\"\22\2\u0083\u0085\79\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u008a\5\24\13\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u009e\3"+
		"\2\2\2\u008b\u008d\5\32\16\2\u008c\u008e\79\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u0093\5\24\13\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u009e\3\2\2\2\u0094\u0096\5\30\r\2\u0095\u0097\79\2\2\u0096\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u009c\5\24\13\2\u009b\u009a\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009e\3\2\2\2\u009dy\3\2\2\2\u009d\u0082\3\2\2\2\u009d\u008b"+
		"\3\2\2\2\u009d\u0094\3\2\2\2\u009e\25\3\2\2\2\u009f\u00a0\7\66\2\2\u00a0"+
		"\u00a1\7\63\2\2\u00a1\u00a2\5&\24\2\u00a2\u00a3\b\f\1\2\u00a3\27\3\2\2"+
		"\2\u00a4\u00a5\7\66\2\2\u00a5\u00a6\7\64\2\2\u00a6\u00a7\58\35\2\u00a7"+
		"\u00a8\b\r\1\2\u00a8\31\3\2\2\2\u00a9\u00ac\5\34\17\2\u00aa\u00ac\5\36"+
		"\20\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ae"+
		"\7\17\2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\79\2\2"+
		"\u00b1\u00b5\5\24\13\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\79\2\2\u00b4\u00b6"+
		"\5\24\13\2\u00b5\u00b2\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00b8\7\22\2\2\u00b8\u00c4\3\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb"+
		"\7\66\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\79\2\2\u00bd\u00be\5 \21\2"+
		"\u00be\u00bf\7\27\2\2\u00bf\u00c0\79\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2"+
		"\7\30\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00ad\3\2\2\2\u00c3\u00b9\3\2\2\2"+
		"\u00c4\35\3\2\2\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\79\2\2\u00c7\u00c8"+
		"\5\24\13\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\5&\24\2\u00ca\u00de\3\2\2\2"+
		"\u00cb\u00cc\7\23\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\7\24\2\2\u00ce"+
		"\u00cf\5\60\31\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\5\60\31\2\u00d1\u00d2"+
		"\7\13\2\2\u00d2\u00d3\79\2\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\7\25\2"+
		"\2\u00d5\u00de\3\2\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9"+
		"\7\13\2\2\u00d9\u00da\79\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\7\f\2\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00c5\3\2\2\2\u00dd\u00cb\3\2\2\2\u00dd\u00d6"+
		"\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0\5.\30\2\u00e0\u00e1\7\35\2\2\u00e1"+
		"\u00e3\5\24\13\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4!\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e8"+
		"\5$\23\2\u00e8\u00e9\7*\2\2\u00e9\u00f0\3\2\2\2\u00ea\u00eb\7\32\2\2\u00eb"+
		"\u00ec\7)\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\7*\2\2\u00ee\u00f0\3\2\2"+
		"\2\u00ef\u00e5\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f4"+
		"\5\60\31\2\u00f2\u00f3\7\3\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f2\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00fc\3\2\2\2\u00f6\u00f9\5&\24\2\u00f7\u00f8"+
		"\7\3\2\2\u00f8\u00fa\5$\23\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc%\3\2\2\2"+
		"\u00fd\u00fe\7)\2\2\u00fe\u00ff\5&\24\2\u00ff\u0100\7*\2\2\u0100\u0108"+
		"\3\2\2\2\u0101\u0105\5(\25\2\u0102\u0103\5\62\32\2\u0103\u0104\5&\24\2"+
		"\u0104\u0106\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u0101\3\2\2\2\u0108\'\3\2\2\2\u0109"+
		"\u010d\5*\26\2\u010a\u010b\5\64\33\2\u010b\u010c\5(\25\2\u010c\u010e\3"+
		"\2\2\2\u010d\u010a\3\2\2\2\u010d\u010e\3\2\2\2\u010e)\3\2\2\2\u010f\u0113"+
		"\5,\27\2\u0110\u0111\5\66\34\2\u0111\u0112\5*\26\2\u0112\u0114\3\2\2\2"+
		"\u0113\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114+\3\2\2\2\u0115\u0117\t"+
		"\2\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\5.\30\2\u0119-\3\2\2\2\u011a\u0123\5\60\31\2\u011b\u011c\7)\2\2"+
		"\u011c\u011d\5&\24\2\u011d\u011e\7*\2\2\u011e\u0123\3\2\2\2\u011f\u0120"+
		"\7(\2\2\u0120\u0123\5*\26\2\u0121\u0123\7\65\2\2\u0122\u011a\3\2\2\2\u0122"+
		"\u011b\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0121\3\2\2\2\u0123/\3\2\2\2"+
		"\u0124\u012a\58\35\2\u0125\u0126\7\66\2\2\u0126\u012a\b\31\1\2\u0127\u012a"+
		"\7\67\2\2\u0128\u012a\7\65\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\61\3\2\2\2\u012b\u012c"+
		"\t\3\2\2\u012c\63\3\2\2\2\u012d\u012e\t\4\2\2\u012e\65\3\2\2\2\u012f\u0130"+
		"\t\5\2\2\u0130\67\3\2\2\2\u0131\u0133\7\37\2\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013a\7\61\2\2\u0135\u0137\7"+
		"\37\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\7\62\2\2\u0139\u0132\3\2\2\2\u0139\u0136\3\2\2\2\u013a9\3\2\2\2"+
		"&<RUYadnq}\u0080\u0086\u0089\u008f\u0092\u0098\u009b\u009d\u00ab\u00b5"+
		"\u00c3\u00dd\u00e3\u00ef\u00f4\u00f9\u00fb\u0105\u0107\u010d\u0113\u0116"+
		"\u0122\u0129\u0132\u0136\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}