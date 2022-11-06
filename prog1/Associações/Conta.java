import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public abstract class Conta{
    protected int numero;
    protected double saldo = 0;
    protected String nome;

    //Cliente cliente;
    ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

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
        Movimentacao mov = new Movimentacao("12/12/2022", deposvalor, 'D');
        this.movimentacoes.add(mov);

        //System.out.println("saldo após o depósito = "+this.getSaldo()+ "R$");
        //resumoExtrato();
    }

    public boolean sacar (double valor){
        if(this.saldo >= valor){
            System.out.println("saldo inicial = "+this.getSaldo()+ "R$");
            this.saldo -= valor;
            Movimentacao mov = new Movimentacao("12/12/2022", valor, 'S');
            this.movimentacoes.add(mov);

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

    abstract  void  fazManutencao();

    public void extrato(){
        for(int i = 0; i < movimentacoes.size(); i++){
            System.out.println("*LISTA DAS MOVIMENTAÇÔES*W");
            System.out.println("Data: "+movimentacoes.get(i).Data);
            System.out.println("Valor: "+movimentacoes.get(i).valor);
            System.out.println("Tipo: "+movimentacoes.get(i).tipo);
        }
    }

    
}