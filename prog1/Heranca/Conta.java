public class Conta{
    protected int numero;
    protected double saldo = 0;
    protected String nome;

    public Conta(){

    }

    public Conta (int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }


    void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void depositar(double deposvalor){
        //System.out.println("saldo inicial = "+this.getSaldo()+ "R$");
        this.saldo += deposvalor;
        //System.out.println("saldo após o depósito = "+this.getSaldo()+ "R$");
        //resumoExtrato();
    }

    public boolean sacar (double valor){
        if(this.saldo >= valor){
            System.out.println("saldo inicial = "+this.getSaldo()+ "R$");
            this.saldo -= valor;
            resumoExtrato();
            return true;
        }else{
            System.out.println("saldo insuficiente!!!");
            return false;
        }
       
    }

    public void resumoExtrato(){
        System.out.println("** resumo extrato da sua conta** ");
        System.out.println("Nome :" +this.getNome());
        System.out.println("Saldo atual:" + this.getSaldo());
    }

    public void  fazManutencao(){
        
    }

    
}