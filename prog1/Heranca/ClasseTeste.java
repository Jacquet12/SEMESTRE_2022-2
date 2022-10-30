import java.util.Scanner;

public class ClasseTeste {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int numero = scan.nextInt();

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

        System.out.println("Digite o valor a taxa de rendimento:");
        double TaxaRendimento = scan.nextDouble();

        Conta cont = new Conta(numero, nome);

        cont.depositar(deposvalor);
        cont.sacar(valor);
        //cont.resumoExtrato(); 
        System.out.println("******************************************************");

        ContaEspecial conta1 = new ContaEspecial(numero, nome, limite, taxaManutencao);
        conta1.depositar(deposvalor);
        conta1.fazManutencao();
        conta1.resumoExtrato();
        System.out.println("\n");
        System.out.println("investimento!!!");
        
        investimento val = new investimento(numero, nome, TaxaRendimento);
        val.depositar(deposvalor);
        val.fazManutencao();
        val.resumoExtrato();



    }
}
