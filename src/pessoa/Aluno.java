package pessoa;

public class Aluno extends Pessoa{

	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String imprimirDadosDaPessoa() {
		System.out.println(super.imprimirDadosDaPessoa());
		return "Você é aluno.";
	}

}
