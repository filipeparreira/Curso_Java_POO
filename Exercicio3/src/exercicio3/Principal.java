package exercicio3;

/*
Exercicio 3
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Principal {

   public static void main(String[] args) {
       Padaria salomao = new Padaria("Padaria do Salomão", "Salomão", "Rua Isaque");
       Padaria trigo = new Padaria("Padaria Trigo Feliz", "Felício", "Rua Felicidade");
       
       salomao.setFuncionarios(8);
       salomao.setMaxPaes(186);
       salomao.setVendas(3678.34f);
       
       trigo.setFuncionarios(5);
       trigo.setMaxPaes(110);
       trigo.setVendas(2257.61f);
       
       System.out.println(salomao.toString());
       System.out.println("\n\n" + trigo.toString());
       
   }
    
}
