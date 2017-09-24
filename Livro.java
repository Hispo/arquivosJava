/**
 * Programa que calcula páginas lidas de um livro, não lidas,
 * porcentagem lida e porcentagem não lida.
 * @author Edson F
 * @version 2.0 Alteração para validação de páginas lidas
 * evitando de serem maiores que o total ou menor que 0.
 * Acrescimo do try...catch, para evitar entrada de letras.
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Livro {

	// VARIÁVEIS
	private int paginaTotal;
	private int paginasLidas;
	private int paginasNaoLidas;
	private double porcentagemLida;
	private double porcentagemNaoLida;
	private boolean continueLoop = true;

	Scanner entrada = new Scanner(System.in);

	/**
	 * Método que recebe entradas do usuário. Try...catch usado para evitar
	 * entrada de letras onde só são aceitos números.
	 */
	public void entradasUsuario() {
		do {
			try {
				System.out.print("Digite o número de páginas do livro: ");
				paginaTotal = entrada.nextInt();

				System.out.print("Digite o total de paginas lidas: ");
				paginasLidas = entrada.nextInt();
				continueLoop = false;

			} catch (InputMismatchException e) {
				System.err.println("Valor inválido! ");
				entrada.nextLine();
				System.out
						.println("Apenas números inteiros são válidos, por favor tente novamente!");

			} // fim do catch
		} while (continueLoop);
	}

	/**
	 * Método que valida as páginas lidas, não permitindo que as páginas lidas
	 * sejam maiores que o total do livro ou menores que 0. Dando-lhe valor 0
	 * por padrão.
	 */
	public void setPaginasLidas() {
		paginasLidas = (paginasLidas > paginaTotal || paginasLidas < 0) ? 0
				: paginasLidas;
	}

	/**
	 * Método que calcula páginas não lidas.
	 * 
	 * @return paginasNaoLidas
	 */
	public int calculaPaginas() {

		return paginasNaoLidas = paginaTotal - paginasLidas;
	}

	/**
	 * Método que calcula a porcentagem de páginas lidas. Foi colocado o
	 * (double) para evitar o truncamento do resultado.
	 * 
	 * @return porcentagemLida
	 */
	public double calculaPorcentagemLida() {

		return porcentagemLida = (double) paginasLidas * 100 / paginaTotal;

	}

	/**
	 * Método que calcula a porcentagem restante para terminar o livro. Foi
	 * colocado o (double) para evitar o truncamento do resultado.
	 * 
	 * @return porcentagemNaoLida
	 */
	public double calculaPorcentagemNaoLida() {
		return porcentagemNaoLida = (double) paginasNaoLidas * 100
				/ paginaTotal;
	}
}