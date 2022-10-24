public class investimento extends Conta {
    protected double taxaRendimento;

    public investimento(int numero, String nome, double taxaRendimento){
        this.numero = numero;
        this.nome = nome;
        this.taxaRendimento = taxaRendimento;
    }

    void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    
    public void fazManutenção() {
        this.saldo += (taxaRendimento * saldo) / 100;
    }

    public void resumoExtrato(){
        System.out.println("Saldo :" +this.getSaldo() +"Nopme :" +this.nome +"Porcentagem :" +this.taxaRendimento);
    }

    

    
}
