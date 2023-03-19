/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author filipe
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*--------------While-----------------
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 5 || cc == 7){
                continue;
            }
            System.out.println("Cambalhota " + cc);
        }
        */
        //--------------Do While---------------
        int num, soma=0;
        String res;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um numero: ");
            num = teclado.nextInt();
            soma += num;
            System.out.print("Deseja continuar somando? (S/N)");
            res = teclado.next();
        }while(res.equals("s"));        
        System.out.println("A soma de todos os numeros digitados é: " + soma);
    }
    
}
