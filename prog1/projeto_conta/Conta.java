public class Conta{
    protected int numero;
    protected double saldo;
    protected String nome;

    public Conta(){

    }

    public Conta (int numero, double saldo, String nome){
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }


    void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("saldo insuficiente!!!");
            return false;
        }
    }

    public void resumoEtrato(){
        System.out.println("** resumo extrato da sua conta** ");
        System.out.println("Nome :" +this.nome);
        System.out.println("Saldo :" + this.saldo);
    }

    public void  fazManutencao(){
        
    }

    
}