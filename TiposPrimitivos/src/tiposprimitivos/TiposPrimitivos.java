/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;
import java.util.Scanner;
/**
 *
 * @author filipe
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */ 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = teclado.nextFloat();
        System.out.printf("%s, sua nota é: %.2f\n",nome,nota);
    }
    
}
