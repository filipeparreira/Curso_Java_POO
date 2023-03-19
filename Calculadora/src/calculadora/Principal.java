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
        Calculadora calculadora = new Calculadora();
        calculadora.setCampo1(5);
        calculadora.setCampo2(5);
        calculadora.setOp(1);
        calculadora.resolvaOp();
        //System.out.println(calculadora.getCampo1());
        System.out.println(calculadora.toString());
    }
    
}
