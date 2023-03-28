package exercicio7;

/*
Exercicio 7
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Principal {

   public static void main(String[] args) {
       Padaria salomao = new Padaria("Padaria do Salomão", "Salomão", "Rua Isaque");
       
       salomao.setFuncionarios(8);
       salomao.setMaxPaes(186);
       salomao.setVendas(3678.34f);
       salomao.setCozinha(3, 6);
       
       System.out.println(salomao.toString());
   }
    
}
