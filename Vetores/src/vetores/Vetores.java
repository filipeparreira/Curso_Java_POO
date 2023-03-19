/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author filipe
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n[] = {2,8,9,23,5};
        System.out.println("Tamanho do vetor: " + n.length);
        for (int cont = 0; cont < n.length; cont++ ){
            System.out.println("Posição " + cont + ": " + n[cont]);
        }*/
        /*String mes[] = {"Jan", "Fev", "Mar", "Abr", "Maio", "Jun", "Jul", "Ago",
            "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int cont = 0; cont < mes.length; cont++){
            System.out.println("O mês: " + mes[cont] + " tem " + dias[cont] + " dias");
        }*/
        /*int vet[] = {9, 6, 2, 8, 1, -4, 7, 3};
        for(int valor: vet){
            System.out.println(valor);
        }
        Arrays.sort(vet);
        for(int valor: vet){
            System.out.println(valor);
        }
        int pos = Arrays.binarySearch(vet, 3);
        System.out.println(pos);*/
        int vet[] = new int[20];
        Arrays.fill(vet, 0);
        for(int valores: vet){
            System.out.print(valores +" ");
        }
    }
    
}
