import java.util.Scanner;

class ParametrosInvalidosException extends Exception{

ParametrosInvalidosException(String mensagem) {

    super (mensagem);

}

}

public class Contador {
    public static void main(String[] args) throws Exception {
       
        //TODO: inicializar scanner e ler variaveis.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro:");

    int parametroUm = scanner.nextInt();

    System.out.println("Digite o segundo parâmetro:");

    int parametroDois = scanner.nextInt();

    //TODO: Try catch para tratar excecao.
    
    try {
            contar(parametroUm, parametroDois);
            
        }
     catch (ParametrosInvalidosException e) {
        // TODO: handle exception

        System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
    }
}


static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    //TODO: Executar verificaçao se parametroum é maior que o parametrodois.

    if (parametroDois <= parametroUm) {
        
        throw new ParametrosInvalidosException("Parâmetros inválidos: o primeiro parâmetro é maior que o segundo.");
    }

    while (parametroUm <= parametroDois) {
        
        System.out.println(parametroUm);
        parametroUm += 1;

    }

}

}