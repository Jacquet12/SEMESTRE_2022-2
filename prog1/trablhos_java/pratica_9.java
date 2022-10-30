import java.util.Random;

public class pratica_9{
    public static void main(String [] args){
        int vetor [] = new int [50];
       // 1 + (int) (Math.random() * 100); 
        for(int i = 0; i < 50; i++){

           vetor[i] = 1 + (int) (Math.random() * 100); 

        }

        int soma = 0, soma1 = 0, cont = 0,media2;
        for( int j = 0; j<50 ; j++){
            System.out.println(+vetor[j]);
            soma += vetor[j];
        }

        int media = soma / 50;

        for(int c = 0; c<50; c++ ){
            if (vetor[c] < media){
                soma1 += vetor[c];
                cont = cont + 1;
            }
        }
        media2 = soma1 / cont;

        
        System.out.println("media = " +media);
        System.out.println("media2 = " +media2);
        System.out.println("contador = " +cont);
    }

   
}