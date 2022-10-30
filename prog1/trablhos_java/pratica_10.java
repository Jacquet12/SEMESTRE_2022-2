import java.util.Scanner;
public class pratica_10 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int i;
        int j;
        int matriz[][] = new int[4][4];
        for( i=0; i<4; i++){
            for( j=0; j<4; j++){
                matriz[i][j] = input.nextInt();
            }
        }

        for( i=0; i<4; i++){
            for( j=0; j<4; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
        int soma = 0;
        for( i=0; i<4; i++){
            for( j=0; j<4; j++){
                if(i > j){
                    soma +=matriz[i][j];
                }
            }
        
        }
        System.out.println("Soma:" +soma);

        
    }
}
