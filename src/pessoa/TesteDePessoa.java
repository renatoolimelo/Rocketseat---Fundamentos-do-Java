package pessoa;

public class TesteDePessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCpf("333222211");
		pessoa1.setNome("Daniele");
		pessoa1.setIdade(33);
		
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.imprimirDadosDaPessoa());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCpf("11122233344");
		pessoa2.setNome("Maria");
		pessoa2.setIdade(19);
		
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.imprimirDadosDaPessoa());
		
		Professor professor = new Professor();
		professor.setCpf("333222211");
		professor.setNome("Daniele");
		professor.setIdade(33);
		professor.setSalario(50000);
		System.out.println(professor.imprimirDadosDaPessoa());
		
		Aluno aluno = new Aluno();
		aluno.setCpf("11122233344");
		aluno.setNome("Maria");
		aluno.setIdade(19);
		aluno.setMatricula(123456);
		System.out.println(aluno.imprimirDadosDaPessoa());
	}

}
