public class ContaEspecial extends Conta{
    private double limite;
    private double taxManutencao;

    public ContaEspecial(){

    }

    public ContaEspecial(int numero, String nome, double limite, double taxManutencao){
        super(numero, nome);
        
        this.limite = limite;
        this.taxManutencao = taxManutencao;

    }

    void setLimite(int limite){
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }

    void setTaxaManutencao(int taxaManutencao ){
        this.taxManutencao = taxaManutencao;
    }

    public double geTaxaManutencao(){
        return this.taxManutencao;
    }

  /*
    public double getSaldo(){
        super.getSaldo();
        return saldo;
    } */

    @Override
    public boolean sacar (double valor){
        super.sacar(valor);
        System.out.println("Você tem "+this.limite + "R$ disponivel na tua conta!");
        return true;
    }
    @Override
    public void fazManutencao(){
        //super.fazManutencao();
        //System.out.println("saldo :"+this.getSaldo());
        //System.out.println("saldo com super :"+super.getSaldo());
        this.saldo -= this.geTaxaManutencao();
    }
    
    public void resumoExtrato(){
        System.out.print("Nome :" + this.getNome() + " Saldo :" + this.getSaldo() + " Saldo Extra :" + this.getLimite() +" Taxa de manutenção :" + this.geTaxaManutencao()+"\n");

    }

    
}
