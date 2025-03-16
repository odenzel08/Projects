import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = sc.nextInt(); 
        sc.nextLine(); 

        System.out.println("Digite a agência:");
        int agencia = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do titular da conta:");
        String nome = sc.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numeroDaConta + "e seu saldo " + saldo + "já está disponível para saque");	


        sc.close();
    }
}
