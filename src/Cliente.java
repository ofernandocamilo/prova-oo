import java.util.Scanner;

public class Cliente {
	int codigo;
	String nome;
	String cpf;
    private Scanner input;
    private Scanner input2;
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void ler_nome(){
		input = new Scanner(System.in);
		this.nome = input.nextLine();
	}
	
	public void ler_cpf(){
		input2 = new Scanner(System.in);
		this.cpf = input2.nextLine();
	}
	
	Cliente(){
		codigo = 0;
		nome = null;
		cpf = "000.000.000-00";
		;
	}
}
