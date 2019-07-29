import java.util.Scanner;

public class Conta extends Cliente {
	private int codigo;
	private Cliente titular;
	//Cliente titular = new Cliente();
	private int agencia;
	private String numero;
	private String tipo;
	private double saldo;
	private double limite;
    private Scanner input;
    private Scanner input2;
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getAgencia(){
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
    public Cliente getTitular() {
        if (titular == null) titular = new Cliente();
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
	
	public void sacar(){
		double valor;
		input = new Scanner(System.in);
		valor = input.nextDouble();
		
		if(this.saldo + this.limite < valor) {
			System.out.println("Saque n�o efetuado! Saldo insuficiente!");
		}
		else {
			this.saldo -= valor;
		}
		
	}
	
	public void depositar() {
		double valor;
		input2 = new Scanner (System.in);
		valor = input2.nextDouble();
		
		this.saldo += valor;
	}
	
	Conta(){
		codigo = 0;
		//this.nome = nome;
		//this.cpf = cpf;
		agencia = 000;
		numero = "0000-0";
		tipo = "Conta Corrente";
		saldo = 0;
		limite = 1000;
	}
	
}
