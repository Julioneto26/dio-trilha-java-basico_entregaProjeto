public class Main {


    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(102);
        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(200);

        cc.transferir(55, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        poupanca.transferir(65, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
