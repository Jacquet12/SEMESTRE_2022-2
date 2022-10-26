import java.lang.String;
public class Apolice{

    int numApolice;
    String nomeSegurado;
    int idade;
    float valorPremio;
    String cidade;
    static int ultimoNumApolice = 0;

    public Apolice (){
        ultimoNumApolice ++; 
        numApolice = ultimoNumApolice ++;
    }

    public Apolice(String nomeSegurado, int idade , float valorPremio ){
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
        
    }

    public void imprimir(){
        System.out.print("NumApolice :" +numApolice+"\n"+"Nomesegurado: "+nomeSegurado+"\n"+"Idade: " +idade+"\n"+"valorPremio: " +valorPremio+"\n");
    }

    void calcularPremio(){
        if(idade >= 18 && idade <= 25){
            valorPremio +=(valorPremio * 20)/100;
        }else if(idade > 25 && idade <= 36){
            valorPremio +=(valorPremio * 15)/100;
        }else if(idade > 36 ){
            valorPremio +=(valorPremio * 10)/100;
        }
    }

    public float oferecerDesconto (String cidade){
        String nome = cidade;
        if( nome == "Floríanopolis"){
            valorPremio -= valorPremio * 0.05;
        }else if(nome == "Chapecó"){
            valorPremio -= valorPremio * 0.06;
        }else if(nome == "Joaçaba"){
            valorPremio -= valorPremio * 0.07;
        }else if(nome == "Joinville"){
            valorPremio -= valorPremio * 0.08;
        }
        System.out.println("Valor do desconto: " +valorPremio);
        return valorPremio;

        
        
    }

    public void Exibe(){
        System.out.println("Ultimp_Numero: \n" +ultimoNumApolice);
    }



}



