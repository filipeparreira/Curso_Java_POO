/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioestudante;

/**
 *
 * @author filipe
 */
public class ExercicioEstudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudante rosa = new Estudante("Rosa","Rua 123","456"); //<-- argumentos
        Estudante filipe = new Estudante("Filipe", "Rua Catapimbas", "a2320622");
		
	filipe.setSexo("Masculino");
	rosa.setSexo("Femenino");
		
	System.out.println("Nome: " + filipe.getNome());
	System.out.println("RA: " + filipe.getRA());
	System.out.println("Endereco: " + filipe.getEnd());
	System.out.println("Sexo: " + filipe.getSexo());
		
	System.out.println("\nNome: " + rosa.getNome());
	System.out.println("RA: " + rosa.getRA());
	System.out.println("Endereco: " + rosa.getEnd());
	System.out.println("Sexo: " + rosa.getSexo());
    }
    
}
