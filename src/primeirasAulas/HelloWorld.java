package primeirasAulas;

public class HelloWorld {

	public static void main(String[] args) {

		int dadoDoTipoInt = 10;
		double dadoDoTipoDouble = 3.14;
		float dadoDoTipoFloat = 3.14f;
		long dadoDoTipoLong = 8934723423949453355L;
		String dadoDoTipoString = "Colocar o meu texto";
		boolean dadoDoTipoBoolean = true;

		if (dadoDoTipoInt == 10) {
			System.out.println("Entrou no if");
		} else if (dadoDoTipoInt == 12) {
			System.out.println("Entrou no if 12");
		} else {
			System.out.println("Entrou no else");
		}
		
		int valorInicial = 0;
		while (valorInicial < 3) {
			System.out.println("O valor inicial é menor que 3");
			valorInicial++;
		}
		System.out.println("Saiu do While");
		
		System.out.println("iniciando o for");
		for (int i = 0; i < 4; i++) {
			System.out.println("O valor do i é: " + i);
		}
		System.out.println("Finalizando o FOR");
	}

}
