
package questão.pkg3;

import java.util.Scanner;


public class Questão3
{
    float PrimeiroS;
    
    public static void main(String[] args) 
    {
        System.out.println("bem vindo.");
        System.out.println("digite seu saldo inicial");
        Scanner scan = new Scanner (System.in);
        float primeiroS = scan.nextInt();
       
        
        
        /*if (primeiroS <=0)
        {
            primeiroS = 0;
        }  */
        ContaBancária abrir = new ContaBancária();
       
        
        System.out.println("Seu saldo é de:" +  abrir.AbreConta(primeiroS));
    }
    
}
