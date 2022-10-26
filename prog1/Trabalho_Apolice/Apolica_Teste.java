import java.util.Scanner;
public class Apolica_Teste {
    public static void main(String [] args){
        Apolice variable = new Apolice();
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome_Segurado: ");
        variable.nomeSegurado = ler.nextLine();

        System.out.println("Digite a idade: ");
        variable.idade = ler.nextInt();

        System.out.println("Digite o valor premio: ");
        variable.valorPremio = ler.nextFloat();

        System.out.println("Digite o nome da cidade: ");
        variable.cidade = ler.next();

        variable.calcularPremio();
        variable.imprimir();
        variable.oferecerDesconto(null);
        


    }
}
