public class Investimento extends Conta {
    protected double taxaRendimento;

    public Investimento(int numero, String nome, double taxaRendimento){
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
        double valor = this.getTaxaRendimento();
        this.saldo += (valor * this.saldo) / 100;
        Movimentacao mov = new Movimentacao("12/12/2022",valor, 'M');
        this.movimentacoes.add(mov);
        //setSaldo(((this.taxaRendimento * this.saldo) / 100)+this.saldo);
    }

    
    public void resumoExtrato(){
        System.out.print("Nome :" +this.getNome()+"\n"+" Porcentagem :" +this.getTaxaRendimento()+"\n"+"Saldo :"+this.getSaldo()+"\n");
    }

    

    
}
