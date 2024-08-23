import java.util.Scanner;
import java.util.Random;

    
public  class ProbabilidadesPares {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);

        //recebe um nuimero max para randomizar.

        System.out.println("Exponenciação: informe o valor da base:");
        int base = scanner.nextInt();
        System.out.println("Informe o valor do expoente:");
        int exponencial = scanner.nextInt();
        int multi = base;
        
        Random gerador = new Random();


        System.out.println("Todas as multiplicações para chegar ao resultado final:");

        for (int i=0; i< exponencial; i++) {

            //int aleatorio = gerador.nextInt(param1);
             multi = multi*base;

            System.out.print(" " + multi);
            
        }



    }

}