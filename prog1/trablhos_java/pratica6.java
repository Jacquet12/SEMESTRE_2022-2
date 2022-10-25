public class pratica6 {
    public static void main(String [] args){
        
        for( int i = 2; i<= 48; i++){
            boolean verificador = true;

            if(i % 2 == 0 && i != 2){
                verificador = false;
            }
            if(verificador == true){
                for(int j = 3; j <= (i/2); j++){
                    if( i % j == 0){
                        verificador = false;
                        break;
                    }
                }
            }
            if(verificador == true){
                System.out.println(+i);
            }

        }
       
    }    
        
}
