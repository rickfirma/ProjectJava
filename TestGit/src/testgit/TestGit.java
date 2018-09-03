/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgit;
import java.util.Scanner;
/**
 *
 * @author Rick
 */
public class TestGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int soma;
        char nome;
        
       
        System.out.println("Olá rick, bem vindo ao Git");
        
        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        System.out.println("digite outro número");
        num2 = input.nextInt();
        soma = num1 + num2;
        System.out.printf("A soma é %d\n", soma);
        
    }
    
}
