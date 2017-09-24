/**
 * Programa que calcula p�ginas lidas de um livro, n�o lidas,
 * porcentagem lida e porcentagem n�o lida.
 * @author Edson F
 * @version 2.0 Altera��o para valida��o de p�ginas lidas
 * evitando de serem maiores que o total ou menor que 0.
 * Acrescimo do try...catch, para evitar entrada de letras.
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Livro {

	// VARI�VEIS
	private int paginaTotal;
	private int paginasLidas;
	private int paginasNaoLidas;
	private double porcentagemLida;
	private double porcentagemNaoLida;
	private boolean continueLoop = true;

	Scanner entrada = new Scanner(System.in);

	/**
	 * M�todo que recebe entradas do usu�rio. Try...catch usado para evitar
	 * entrada de letras onde s� s�o aceitos n�meros.
	 */
	public void entradasUsuario() {
		do {
			try {
				System.out.print("Digite o n�mero de p�ginas do livro: ");
				paginaTotal = entrada.nextInt();

				System.out.print("Digite o total de paginas lidas: ");
				paginasLidas = entrada.nextInt();
				continueLoop = false;

			} catch (InputMismatchException e) {
				System.err.println("Valor inv�lido! ");
				entrada.nextLine();
				System.out
						.println("Apenas n�meros inteiros s�o v�lidos, por favor tente novamente!");

			} // fim do catch
		} while (continueLoop);
	}

	/**
	 * M�todo que valida as p�ginas lidas, n�o permitindo que as p�ginas lidas
	 * sejam maiores que o total do livro ou menores que 0. Dando-lhe valor 0
	 * por padr�o.
	 */
	public void setPaginasLidas() {
		paginasLidas = (paginasLidas > paginaTotal || paginasLidas < 0) ? 0
				: paginasLidas;
	}

	/**
	 * M�todo que calcula p�ginas n�o lidas.
	 * 
	 * @return paginasNaoLidas
	 */
	public int calculaPaginas() {

		return paginasNaoLidas = paginaTotal - paginasLidas;
	}

	/**
	 * M�todo que calcula a porcentagem de p�ginas lidas. Foi colocado o
	 * (double) para evitar o truncamento do resultado.
	 * 
	 * @return porcentagemLida
	 */
	public double calculaPorcentagemLida() {

		return porcentagemLida = (double) paginasLidas * 100 / paginaTotal;

	}

	/**
	 * M�todo que calcula a porcentagem restante para terminar o livro. Foi
	 * colocado o (double) para evitar o truncamento do resultado.
	 * 
	 * @return porcentagemNaoLida
	 */
	public double calculaPorcentagemNaoLida() {
		return porcentagemNaoLida = (double) paginasNaoLidas * 100
				/ paginaTotal;
	}
}