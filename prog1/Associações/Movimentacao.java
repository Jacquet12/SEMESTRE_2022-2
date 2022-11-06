public class Movimentacao {
    String Data;
    double valor;
    char tipo;

    public Movimentacao(String Data, double valor, char tipo){
        this.Data = Data;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void setData(String Data){
        this.Data = Data;
    }

    public String getData(){
        return Data;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
    
    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    public char getTipo (){
        return tipo;
    }
}
