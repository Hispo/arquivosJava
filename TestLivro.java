/**
 * Programa que calcula páginas lidas de um livro, não lidas,
 * porcentagem lida e porcentagem não lida.
 * @author Edson F
 * @version 2.0 Alteração para validação de páginas lidas
 * evitando de serem maiores que o total ou menor que 0.
 * Acrescimo do tratamento de exceções, para evitar entrada
 * de letras.
 */
public class TestLivro {
	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.entradasUsuario();
		livro.setPaginasLidas();
		
		System.out.println("\nFaltam " + livro.calculaPaginas() + " páginas!");

		System.out.printf("Foram lidos %.2f%% do livro!\n",
				livro.calculaPorcentagemLida());

		System.out.printf("Faltam %.2f%% para terminar o livro!",
				livro.calculaPorcentagemNaoLida());
	}
}