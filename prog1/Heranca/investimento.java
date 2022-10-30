public class investimento extends Conta {
    protected double taxaRendimento;

    public investimento(int numero, String nome, double taxaRendimento){
        super(numero, nome);
        this.taxaRendimento = taxaRendimento;
    }

    void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento(){
        return this.taxaRendimento;
    }

    @Override
    public void  fazManutencao(){
        this.saldo += (this.taxaRendimento * this.saldo) / 100;
        //setSaldo(((this.taxaRendimento * this.saldo) / 100)+this.saldo);
    }

    
    public void resumoExtrato(){
        System.out.println(" Nome :" +this.getNome()       +" Porcentagem :"       +this.getTaxaRendimento()      +"Saldo :"+this.getSaldo());
    }

    

    
}
