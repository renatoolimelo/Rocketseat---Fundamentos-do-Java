package excecoes;

import pessoa.Pessoa;

public class Excecoes {
	
	public static void main(String[] args){
		
		int numero = 10;
		
		try {
			validarNumero(numero);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
		
		Pessoa p = null;
		p.getCpf();
		
	}
	
	public static void validarNumero(int numero) throws Exception {	
		if (numero < 100) {
			throw new Exception("O número é menor do que 100.");
		}
	}

}
