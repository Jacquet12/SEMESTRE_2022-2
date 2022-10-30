import java.util.Scanner;
public class pratica8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite um numero:");

       int myvector []= new int[10];
       int i;

       for (i = 0; i<10; i++){
        myvector[i] = input.nextInt();
       }
       System.out.println("=-=================================");
       int j, maior = 0;
       for( j = 0; j<10; j++){
        if(myvector[j]> maior){
            maior = myvector[j];
        }

       }
       int menor = maior;
       for( int c = 0; c < 10; c++){
        if(myvector[c]<menor){
            menor = myvector[c];
        }
       }
       System.out.println("o maior valor é :"+maior);
       System.out.println("o menor valor valor é:"+menor);
        
    }
}