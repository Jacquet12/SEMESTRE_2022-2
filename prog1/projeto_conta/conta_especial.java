public class conta_especial extends Conta{
    private double limite;
    private double taxManutencao;


    public conta_especial(int numero, String nome, double limite, double taxManutencao){
        this.numero = numero;
        this.nome = nome;
        this.limite = limite;
        this.taxManutencao = taxManutencao;
    }

    void setLimite(int limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    void setTaxaManutencao(int taxaManutencao ){
        this.taxManutencao = taxaManutencao;
    }

    public double geTaxaManutencao(){
        return taxManutencao;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public boolean sacar (double valor){
        super.sacar(valor);
        System.out.println("Você tem "+this.limite + "R$ disponivel na tua conta!");
        return true;
    }
    @Override
    public void fazManutencao(){
        this.saldo -= taxManutencao;
    }
    
    public void resumoExtrato(){
        System.out.print("Nome :" + getNome() + " Saldo :" + getSaldo() + " Saldo Extra :" + getLimite() +" Taxa de manutenção :" + geTaxaManutencao());

    }

    
}
