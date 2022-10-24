import java.util.Scanner;

public class Classe_de_Teste {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int numero = scan.nextInt();

        System.out.println("Digite o saldo:");
        double  saldo= scan.nextDouble();

        System.out.println("Digite o nome:");
        String nome = scan.next();

        System.out.println("Digite o valor a depositar:");
        double deposvalor = scan.nextDouble();

        System.out.println("Digite o valor a sacar:");
        double valor = scan.nextDouble();

        System.out.println("Digite o limite:");
        double limite = scan.nextDouble();

        System.out.println("Digite o valor a taxa de matutencão:");
        double taxaManutencao = scan.nextDouble();

        Conta cont = new Conta(numero, saldo, nome);

        cont.depositar(deposvalor);
        cont.sacar(valor);
        cont.resumoEtrato(); 
        System.out.println("******************************************************");

        conta_especial conta1 = new conta_especial(numero, nome, limite, taxaManutencao);
        conta1.fazManutencao();
        conta1.resumoExtrato();;



    }
}
