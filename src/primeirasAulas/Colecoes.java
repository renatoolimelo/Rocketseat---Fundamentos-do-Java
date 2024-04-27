package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {

	public static void main(String[] args) {

		Map<String, Integer> notas = new HashMap<>();

		notas.put("Dani", 9);
		notas.put("Vini", 10);
		notas.put("Elias", 10);

		int nota = notas.get("Dani");
		System.out.println(nota);

		for (Map.Entry<String, Integer> entry : notas.entrySet()) {
			System.out.println(entry);
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("A chave é " + key + " e o valor é " + value);
		}
	}
}
