/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes;

/**
 *
 * @author filipe
 */
public class Funcoes {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b){
        int soma = a + b;
        return soma;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int res = soma(5, 2);
        System.out.println("A soma é: " + res);
    }
    
}
