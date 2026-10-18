package interviews.strings;

import java.util.ArrayList;
import java.util.List;

public class SearchSuggestions {

	public static void main(String[] args) {
		List<String> repository = List.of("mobile", "mouse", "moneypot", "monitor", "mousepad");
		// [[mobile, moneypot, monitor], [mouse, mousepad], [mouse, mousepad], [mouse,
		// mousepad]]
		System.out.println(searchSuggestions(repository, "mouse"));
	}

	public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

		List<List<String>> suggestions = new ArrayList<>();

		List<String> ordenado = new ArrayList<>();
		for (String produto : repository)
			ordenado.add(produto.toLowerCase());
		ordenado.sort(String::compareTo);

		String query = customerQuery.toLowerCase();

		for (int i = 2; i <= query.length(); i++) {
			String prefixo = query.substring(0, i);
			List<String> sugestoes = new ArrayList<>();

			// antes usava contains() (casava no meio da palavra) e removia itens
			// com índices que mudavam durante o loop; agora pega os 3 primeiros
			for (String produto : ordenado) {
				if (produto.startsWith(prefixo)) {
					sugestoes.add(produto);
					if (sugestoes.size() == 3)
						break;
				}
			}
			suggestions.add(sugestoes);
		}
		return suggestions;
	}
}
