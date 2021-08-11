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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#inicio_e_fim_do_programa}.
	 * @param ctx the parse tree
	 */
	void enterInicio_e_fim_do_programa(IsiLangParser.Inicio_e_fim_do_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#inicio_e_fim_do_programa}.
	 * @param ctx the parse tree
	 */
	void exitInicio_e_fim_do_programa(IsiLangParser.Inicio_e_fim_do_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#tamanho_lista}.
	 * @param ctx the parse tree
	 */
	void enterTamanho_lista(IsiLangParser.Tamanho_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#tamanho_lista}.
	 * @param ctx the parse tree
	 */
	void exitTamanho_lista(IsiLangParser.Tamanho_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declarar_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_variaveis(IsiLangParser.Declarar_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declarar_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_variaveis(IsiLangParser.Declarar_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declara_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclara_variavel(IsiLangParser.Declara_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declara_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclara_variavel(IsiLangParser.Declara_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#tipos_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterTipos_variaveis(IsiLangParser.Tipos_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#tipos_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitTipos_variaveis(IsiLangParser.Tipos_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(IsiLangParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(IsiLangParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#obter}.
	 * @param ctx the parse tree
	 */
	void enterObter(IsiLangParser.ObterContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#obter}.
	 * @param ctx the parse tree
	 */
	void exitObter(IsiLangParser.ObterContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(IsiLangParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(IsiLangParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(IsiLangParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(IsiLangParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(IsiLangParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(IsiLangParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(IsiLangParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(IsiLangParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(IsiLangParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(IsiLangParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expressoes}.
	 * @param ctx the parse tree
	 */
	void enterExpressoes(IsiLangParser.ExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expressoes}.
	 * @param ctx the parse tree
	 */
	void exitExpressoes(IsiLangParser.ExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiLangParser.TermoContext ctx);
}