public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("=== Extrato Conta Corrente ===");
        super.extratoInfoComum();

        //System.out.println(String.format("Agência: %d", super.agencia));
        //System.out.println(String.format("Conta: %d", super.numeroConta));
        //System.out.println(String.format("Saldo: %.2f", super.saldo));

        
    }


}
  
