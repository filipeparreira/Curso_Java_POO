package exercicio01lista01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        Padaria padariaUser = new Padaria();
        Padaria padoca = new Padaria("Padoca", "João", "Rua Catapimbas");
        Padaria salomao = new Padaria("Padaria do Salomão", "Salomão", "Rua Salmos");
        
        
        padoca.setFuncionarios(8);
        padoca.setMaxPaes(85);
        padoca.setVendas(1864.43f);
        padoca.setCozinha(13, 8);
        
        salomao.setFuncionarios(12);
        salomao.setMaxPaes(135);
        salomao.setVendas(2125.47f);
        salomao.setCozinha(10, 5);
        
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
        
        
        System.out.println(padariaUser);
        System.out.println(padoca);
        System.out.println(salomao);
        
    }
    
}
