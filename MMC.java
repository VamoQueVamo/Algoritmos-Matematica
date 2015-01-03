public class MMC {

	/*
	 * 
	 * MMC - MINIMO MULTIPLO COMUM
	 * 
	 * Objetivo:
	 * 
	 * Determinar o minimo multiplo comum, entre dois inteiros positivos a e b
	 * 
	 * Como chamar o metodo:
	 * 
	 * Basta chamar o metodo passando por parametro os inteiro a e b, no qual
	 * deseja saber o minimo multiplo comum Ex.: int resposta = mmc( 1, 2 );
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

	static int mmc(int a, int b) {

		if (b == 0)
			return a;

		else
			return a / mdc(a, b) * b;

	}

	static int mdc(int a, int b) {

		if (b == 0)
			return a;

		else
			return mdc(b, a % b);

	}

}
