// Generated from C:/Users/MPi5/Desktop/sintaxis/src/main/Antlr4\tpi.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tpiParser}.
 */
public interface tpiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tpiParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(tpiParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(tpiParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(tpiParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(tpiParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(tpiParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(tpiParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(tpiParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(tpiParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#ambiente}.
	 * @param ctx the parse tree
	 */
	void enterAmbiente(tpiParser.AmbienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#ambiente}.
	 * @param ctx the parse tree
	 */
	void exitAmbiente(tpiParser.AmbienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#lineaambiente}.
	 * @param ctx the parse tree
	 */
	void enterLineaambiente(tpiParser.LineaambienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#lineaambiente}.
	 * @param ctx the parse tree
	 */
	void exitLineaambiente(tpiParser.LineaambienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(tpiParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(tpiParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(tpiParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(tpiParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#proceso}.
	 * @param ctx the parse tree
	 */
	void enterProceso(tpiParser.ProcesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#proceso}.
	 * @param ctx the parse tree
	 */
	void exitProceso(tpiParser.ProcesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#lineacod}.
	 * @param ctx the parse tree
	 */
	void enterLineacod(tpiParser.LineacodContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#lineacod}.
	 * @param ctx the parse tree
	 */
	void exitLineacod(tpiParser.LineacodContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(tpiParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(tpiParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#asignacioninc}.
	 * @param ctx the parse tree
	 */
	void enterAsignacioninc(tpiParser.AsignacionincContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#asignacioninc}.
	 * @param ctx the parse tree
	 */
	void exitAsignacioninc(tpiParser.AsignacionincContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(tpiParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(tpiParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(tpiParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(tpiParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#iterativas}.
	 * @param ctx the parse tree
	 */
	void enterIterativas(tpiParser.IterativasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#iterativas}.
	 * @param ctx the parse tree
	 */
	void exitIterativas(tpiParser.IterativasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#lineasegun}.
	 * @param ctx the parse tree
	 */
	void enterLineasegun(tpiParser.LineasegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#lineasegun}.
	 * @param ctx the parse tree
	 */
	void exitLineasegun(tpiParser.LineasegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(tpiParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(tpiParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(tpiParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(tpiParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(tpiParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(tpiParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#siexpresion}.
	 * @param ctx the parse tree
	 */
	void enterSiexpresion(tpiParser.SiexpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#siexpresion}.
	 * @param ctx the parse tree
	 */
	void exitSiexpresion(tpiParser.SiexpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tpiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tpiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(tpiParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(tpiParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#hoja}.
	 * @param ctx the parse tree
	 */
	void enterHoja(tpiParser.HojaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#hoja}.
	 * @param ctx the parse tree
	 */
	void exitHoja(tpiParser.HojaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(tpiParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(tpiParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#operadorrelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorrelacional(tpiParser.OperadorrelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#operadorrelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorrelacional(tpiParser.OperadorrelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#addoperador}.
	 * @param ctx the parse tree
	 */
	void enterAddoperador(tpiParser.AddoperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#addoperador}.
	 * @param ctx the parse tree
	 */
	void exitAddoperador(tpiParser.AddoperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#multioperador}.
	 * @param ctx the parse tree
	 */
	void enterMultioperador(tpiParser.MultioperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#multioperador}.
	 * @param ctx the parse tree
	 */
	void exitMultioperador(tpiParser.MultioperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpiParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(tpiParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpiParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(tpiParser.NumeroContext ctx);
}