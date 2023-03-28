package exercicio5;
import java.util.Scanner;

/*
Exercicio 5
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Principal {

   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
      
       Padaria padariaUser = new Padaria();
       
       System.out.print("Digite o nome da Padaria: ");
       String nome = teclado.nextLine();
       System.out.print("Digite o nome do dono: ");
       String dono = teclado.nextLine();
       System.out.print("Digite o endereço: ");
       String end = teclado.nextLine();
       System.out.print("Digite o numero de funcionarios: ");
       int numFunc = teclado.nextInt();
       teclado.nextLine();
       System.out.print("Digite o numero máximo de pães: ");
       int numMaxPaes = teclado.nextInt();
       teclado.nextLine();
       System.out.print("Digite a renda mensal: ");
       float vendas = teclado.nextFloat();
       teclado.nextLine();
       System.out.print("Digite a quantidade de refeições que a cozinha faz: ");
       int qtdeRef = teclado.nextInt();
       teclado.nextLine();
       System.out.print("Digite a quantidade de panelas dentro da cozinha: ");
       int qtdePan = teclado.nextInt();
       teclado.nextLine();
        
       padariaUser.setNome(nome);
       padariaUser.setDono(dono);
       padariaUser.setEnd(end);
       padariaUser.setFuncionarios(numFunc);
       padariaUser.setMaxPaes(numMaxPaes);
       padariaUser.setVendas(vendas);
       padariaUser.setCozinha(qtdeRef, qtdePan);
       
       System.out.println(padariaUser.toString());
   }
    
}
