package interviews.formatting;

/**
 * Imprime o array A em uma tabela com K colunas. Todas as células têm a largura
 * do maior número, com valores alinhados à direita. A última linha pode ser
 * incompleta e a borda acompanha apenas as células existentes.
 *
 * <pre>
 * Exemplo (K = 4):
 * +-----+-----+-----+-----+
 * |    4|   35|   80|  123|
 * +-----+-----+-----+-----+
 * |12345|   44|    8|    5|
 * +-----+-----+-----+-----+
 * |   24|    3|
 * +-----+-----+
 * </pre>
 */
public class TablePrinter {

	public static void main(String[] args) {
		int[] A = { 4, 35, 80, 123, 12345, 44, 8, 5, 24, 3 };
		solution(A, 4);
		System.out.println();
		solution(new int[] { 4, 35, 80, 123, 12345, 44, 8, 5 }, 10);
	}

	public static void solution(int[] A, int K) {
		int largura = 0;
		for (int k : A) {
			largura = Math.max(largura, String.valueOf(k).length());
		}
		String hifens = "-".repeat(largura);

		for (int inicio = 0; inicio < A.length; inicio += K) {
			int colunas = Math.min(K, A.length - inicio);

			if (inicio == 0)
				System.out.println(borda(hifens, colunas));

			StringBuilder linha = new StringBuilder("|");
			for (int c = 0; c < colunas; c++) {
				linha.append(String.format("%" + largura + "d|", A[inicio + c]));
			}
			System.out.println(linha);
			System.out.println(borda(hifens, colunas));
		}
	}

	private static String borda(String hifens, int colunas) {
		return "+" + (hifens + "+").repeat(colunas);
	}
}
