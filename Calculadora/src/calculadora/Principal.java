/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author filipe
 */
public class Principal {
    public static void main(String[] args) {
        //Instaciando os objetos
        Calculadora calculadora = new Calculadora(5, 5, 1);
        Calculadora calculadora2 = new Calculadora(5, 5, 2);
        Calculadora calculadora3 = new Calculadora(5, 5, 3);
        
        //Resolvendo as operações
        calculadora.resolvaOp();
        calculadora2.resolvaOp();
        calculadora3.resolvaOp();
        
        //Declarando marca, cor e tamanho
        calculadora.setMarca("Nokia");
        calculadora.setCor("Preta");
        calculadora.setTam(10.5f);
        
        calculadora2.setMarca("Casio");
        calculadora2.setCor("Azul");
        calculadora2.setTam(11.3f);
        
        calculadora3.setMarca("Sony");
        calculadora3.setCor("Cinza");
        calculadora3.setTam(8.5f);
        
        //Imprimindo o conteudo de cada calculadora
        System.out.println("Calculadora 1: \n" + calculadora.toString());
        System.out.println("\n\nCalculadora 2: \n" + calculadora2.toString());
        System.out.println("\n\nCalculadora 3: \n" + calculadora3.toString());
    }
    
}
