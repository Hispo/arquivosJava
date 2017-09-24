/**
 * Programa que calcula p�ginas lidas de um livro, n�o lidas,
 * porcentagem lida e porcentagem n�o lida.
 * @author Edson F
 * @version 2.0 Altera��o para valida��o de p�ginas lidas
 * evitando de serem maiores que o total ou menor que 0.
 * Acrescimo do tratamento de exce��es, para evitar entrada
 * de letras.
 */
public class TestLivro {
	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.entradasUsuario();
		livro.setPaginasLidas();
		
		System.out.println("\nFaltam " + livro.calculaPaginas() + " p�ginas!");

		System.out.printf("Foram lidos %.2f%% do livro!\n",
				livro.calculaPorcentagemLida());

		System.out.printf("Faltam %.2f%% para terminar o livro!",
				livro.calculaPorcentagemNaoLida());
	}
}