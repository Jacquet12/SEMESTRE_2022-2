import java.util.ArrayList;

public class ContaEspecial extends Conta{
    private double limite;
    private double taxManutencao;
    ArrayList<Movimentacao> movimentacaos = new ArrayList<Movimentacao>();

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
        double valor = this.geTaxaManutencao();
        this.saldo -= valor;
        Movimentacao mov = new Movimentacao("12/12/2022",valor, 'S');
        this.movimentacoes.add(mov);
    }
    
    public void resumoExtrato(){
        System.out.print("Nome :" + this.getNome() + " Saldo :" + this.getSaldo() + " Saldo Extra :" + this.getLimite() +" Taxa de manutenção :" + this.geTaxaManutencao()+"\n");

    }

    public void addMovimentacao(String nome, double valor, char tipo){
        this.movimentacaos.add(new Movimentacao(nome, valor, tipo));
    }

    
}
