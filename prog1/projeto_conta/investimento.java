public class investimento extends Conta {
    protected double taxaRendimento;

    public void fazManutenção() {
        this.saldo += (taxaRendimento * saldo) / 100;
    }

    
}
