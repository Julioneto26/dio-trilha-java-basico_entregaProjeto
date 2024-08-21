import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //TODO: importar a classe Scanner para coleta de dados via  terminal.

      Scanner scanner = new Scanner(System.in);

      //Feito.

      // TODO: inicializar variáveis e coletar dados

     
      System.out.println("Por favor, digite o número da Agência !");

      int agencia = scanner.nextInt();

       
      System.out.println("Por favor, digite o número da Conta !");

      scanner.nextLine();
      String conta = scanner.nextLine();


      System.out.println("Por favor, digite o nome do Cliente !");
   
      String nomeCliente = scanner.nextLine();


      System.out.println("Por favor, digite o Saldo de sua conta !");

      float saldo = scanner.nextFloat();


      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
