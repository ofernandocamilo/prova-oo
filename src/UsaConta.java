import java.util.Scanner;

public class UsaConta {

	private static Scanner input;

    public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.setTitular(c1);
		c2.setTitular(c2);
			
		System.out.println("........Testando push para o GitHub.......");
		System.out.println("*****CADASTRO DE CLIENTES*****");
		System.out.print("Digite o nome do Cliente 1: ");
		c1.ler_nome();
		
		System.out.print("Digite o CPF do Cliente 1: ");
		c1.ler_cpf();
		
		System.out.println("\n");
		
		System.out.print("Digite o nome do Cliente 2: ");
		c2.ler_nome();
		
		System.out.print("Digite o CPF do Cliente 2: ");
		c2.ler_cpf();
		
		System.out.println("\n");	
		System.out.println("*****DADOS DA CONTA:*****\n");
		System.out.println("Cliente 1: ");
		System.out.println("Titular: " + c1.getTitular().getNome());
		System.out.println("CPF: " + c1.getCPF());
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Número: " + c1.getNumero());
		System.out.println("Saldo:" + c1.getSaldo());
		System.out.println("Limite: " + c1.getLimite());
		System.out.println("Tipo: " + c1.getTipo());
		
		System.out.println("\n");
		System.out.println("Cliente 2: ");
		System.out.println("Titular: " + c2.getTitular().getNome());
		System.out.println("CPF: " + c1.getCPF());
		System.out.println("Agencia: " + c2.getAgencia());
		System.out.println("Numero: " + c2.getNumero());
		System.out.println("Saldo:" + c2.getSaldo());
		System.out.println("Limite: " + c2.getLimite());
		System.out.println("Tipo: " + c2.getTipo());

		
		System.out.println("\n");	
		System.out.println("*****DEPÓSITO/SAQUE:*****");
		System.out.print("Digite um valor para o dep�sito na conta do Cliente 1: ");
		c1.depositar();
		
		System.out.println("Novo Saldo atualizado: " + c1.getSaldo() + "\n");
		
		System.out.print("Digite um valor para o saque na conta do Cliente 1: ");
		c1.sacar();
		System.out.println("Novo Saldo atualizado: " + c1.getSaldo() + "\n");
		
		System.out.println("\n");	
		System.out.println("*****TRANSFERENCIAS:*****");
		
		System.out.print("Digite um valor para transferir da Conta do Cliente 1 para o Cliente 2: ");
		transferenciaBancaria(c1,c2);
		
		System.out.println("Saldo da conta Cliente 1: " + c1.getSaldo());
		System.out.println("Saldo da conta Cliente 2: " + c2.getSaldo());

	}
	
    public static void transferenciaBancaria(Conta c1, Conta c2) {
		double valor;
		input = new Scanner(System.in);
		valor = input.nextDouble();
		
		if(c1.getSaldo() + c1.getLimite() < valor) {
			System.out.println("Saque não efetuado! Saldo insuficiente!");
		}
		else {
			c1.setSaldo(c1.getSaldo() - valor);
		}
		
		c2.setSaldo(c1.getSaldo() + valor);
    }

}
