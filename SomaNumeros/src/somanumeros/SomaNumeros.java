/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somanumeros;

import java.util.Scanner;

/**
 *
 * @author filipe
 */
public class SomaNumeros {

    public SomaNumeros(){
        float num1, num2, soma;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: ");
        num1 = teclado.nextFloat();
        System.out.print("Numero 2: ");
        num2 = teclado.nextFloat();
        soma = num1 + num2;
        System.out.println("A soma entre os numeros é: " + soma);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new SomaNumeros();
    }
    
}
