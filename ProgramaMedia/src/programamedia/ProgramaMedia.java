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
        /*---------------Tira a média de uma nota----------------
        System.out.println("Digite a primeira nota: ");
        *   float n1 = teclado.nextFloat();
        *   System.out.println("Digite a segunda nota: ");
        *   float n2 = teclado.nextFloat();
        *   float media = (n1 + n2) / 2;
        *   System.out.println("Média: " + media);
        *   if(media>7){
        *       System.out.println("Parabens!!");
        *   }
        */
        /*---------------Verifica se é maior de idade -----------
        *   System.out.print("Informe seu ano de nascimento: ");
        *   int ano = teclado.nextInt();
        *   int idade = 2023 - ano;
        *   if(idade >= 18){
        *       System.out.println("Maior");
        *   }else{
        *       System.out.println("Menor");
        *   }
        */
        /*---------------Virifica par---------------------------------
        *   System.out.print("Digite um numero inteiro: ");
        *   int num = teclado.nextInt();
        *   int res = num % 2;
        *   if (res == 1){
        *       System.out.println("O numero digitado não é par :(");
        *   }else{
        *       System.out.println("O numero digitado é par  :)");
        *   }
        
        
        */
        /*-----------------Verifica Voto-----------------------------
        *    System.out.print("Digite seu ano de nascimento: ");
        *    int ano = teclado.nextInt();
        *    int idade = 2023 - ano;
        *    System.out.println("Sua idade é: " + idade + " anos");
        *    if (idade < 16){
        *        System.out.println("Você não pode votar!!");
        *    }else{
        *        if ((idade >= 16 && idade < 18) || (idade > 70)){
        *            System.out.println("Seu voto é opicional.");
        *        }else{
        *            System.out.println("Seu voto é obrigatorio!!!!");
        *        }
        }*/
        System.out.print("Digite o numero de pernas do ser: ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }   
        System.out.println("O tipo do ser é: " + tipo);
    }
    
}
