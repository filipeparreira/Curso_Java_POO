package exercicio2;

/*
Exercicio 2
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Principal {

   public static void main(String[] args) {
       Padaria padaria = new Padaria("Padaria Pão de Mel", "José", "Rua Trigo");
       Cozinha cozinha = new Cozinha(3, 5);
       
       padaria.setFuncionarios(4);
       padaria.setMaxPaes(70);
       padaria.setVendas(1600.37f);
       
       System.out.println("Nome: " + padaria.getNome());
       System.out.println("Dono: " + padaria.getDono());
       System.out.println("End.: " + padaria.getEnd());
       System.out.println("Quantidade Funcionarios: " + padaria.getFuncionarios());
       System.out.println("Quantidade maxima de paes: " + padaria.getMaxPaes());
       System.out.println("Vendas mensais: R$ " + padaria.getVendas());
       System.out.println("Quantidade de tipos de prato: " + cozinha.getTiposRef());
       System.out.println("Quantidade de panelas: " + cozinha.getQntPanelas() + "\n\n");
       
       System.out.println(padaria.toString());
       System.out.println(cozinha.toString());
   
   }
    
}
