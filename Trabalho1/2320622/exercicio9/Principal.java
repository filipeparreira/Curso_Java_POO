package exercicio9;
/*
Exercicio 9
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/
public class Principal {

    public static void main(String[] args) {
        Padaria padaria = new Padaria("Padaria Pão de Mel", "Zé Ribeiro", "Rua Caximbás");
        padaria.setQtdeFuncionarios(4);
        padaria.setQtdeMaxPaes(96);
        padaria.setVendas(1326.65f);
        padaria.setCozinha(3, 5);
        System.out.println(padaria);
    }
    
}
