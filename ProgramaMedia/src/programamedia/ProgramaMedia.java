/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author filipe
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
        if(media>7){
            System.out.println("Parabens!!");
        }*/
        System.out.print("Informe seu ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2023 - ano;
        if(idade >= 18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
        
    }
    
}
