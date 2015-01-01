public class MDC {

	/*
	 * 
	 * MDC - MAXIMO DIVISOR COMUM
	 * 
	 * Objetivo:
	 * 
	 * Determinar o maior divisor comum, entre dois inteiros positivos a e b
	 * 
	 * Como chamar o metodo:
	 * 
	 * Basta chamar o metodo passando por parametro os inteiro a e b, no qual
	 * deseja saber o maior divisor comum
	 * 
	 * Ex.: int resposta = mdc( 1, 2 );
	 * 
	 * Complexidade do algoritmo:
	 * 
	 * O(?)
	 * 
	 * Problemas resolvidos:
	 * 
	 * 
	 * Observacoes:
	 */

	static int mdc(int a, int b) {

		if (b == 0)
			return a;

		else
			return mdc(b, a % b);

	}

}
