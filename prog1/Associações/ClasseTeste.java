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

        //Conta cont = new Conta(numero, nome);

        //cont.depositar(deposvalor);
        //cont.sacar(valor);
        //cont.resumoExtrato(); 
        System.out.println("******************************************************");

        Cliente cl1 = new Cliente("Jacquet", 7098763);
        Cliente cl2 = new Cliente("James", 7098764);
        

        ContaEspecial conta1 = new ContaEspecial(numero, nome, limite, taxaManutencao);
        conta1.depositar(deposvalor);

        Movimentacao mov = new Movimentacao("12", deposvalor, 'D');
        conta1.movimentacoes.add(mov);

        conta1.fazManutencao();
        conta1.sacar(valor);
        conta1.resumoExtrato();
        conta1.extrato();

        System.out.println("\n");
        cl1.conta = conta1;
        cl2.conta = conta1;
        System.out.println("\n");
        System.out.println("investimento!!!");
        
        Investimento invest = new Investimento(numero, nome, TaxaRendimento);
        invest.depositar(deposvalor);
        invest.sacar(valor);
        invest.fazManutencao();
        invest.resumoExtrato();
        invest.extrato();

        System.out.println("\n");
        cl1.conta = invest;
        cl2.conta = invest;
        CarteiraPrime cart = new CarteiraPrime();
        cart.addCliente(cl1);
        cart.listar();

        cart.addCliente(cl2);
        cart.listar();
        


    }
}
