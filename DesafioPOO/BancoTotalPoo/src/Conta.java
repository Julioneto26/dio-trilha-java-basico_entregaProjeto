public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 10;
    private static int SEQUENCIAL = 1001;
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    

    public Conta(){

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;

    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
        saldo += valor;

    }
    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub

        saldo -= valor;
        
    }
    @Override
    public void transferir(double valor, Conta contadestino) {
        // TODO Auto-generated method stub
        this.sacar(valor);
        contadestino.depositar(valor);
        
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    protected void extratoInfoComum() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    
}
