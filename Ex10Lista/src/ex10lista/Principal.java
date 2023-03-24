package ex10lista;

/*
Equipe: Filipe Augusto Parreira Almeida

b)A entrada e saída informada anteriormente estão corretas, porém ao tentar entrar com um nome composto (frase) a saída era somente a primeira palavra, portanto modifiquei o método ".next()" para ".nextLine()", sendo assim, o algoritmo agora aceita entrada de frases 

c)Foi acrescentado a função ".media()", onde após uma alteração no código da main o estudante pode escolher se quer ou não saber sua média em determina disciplina, caso ele queira, ele irá inserir o nome da disciplina e quantas provas/trabalhos tem na disciplina, para isso foi necessario improtar a classe Scanner para a classe Estudante; também foi aprimorado o método toString, acrescentando um titulo à saída.

d)Entrada:
Filipe Augusto
1234567890
21
1,75
123456
Engenharia de Computação
exemplo@alunos.utfpr.edu.br
1
Programação Orientada à Objeto
3
7
6
5

Saída:
Sua média na disciplina de POO é: 6.0


------------Informações do Estudante------------
Nome: Filipe Augusto
CPF: 1234567890
Idade: 21 anos
Altura: 1.75 m
RA: 123456
Curso: Engenharia de Computação
E-mail: exemplo@alunos.utfpr.edu.br

*/

import java.util.Scanner;

public class Principal {
        
    
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
                
                System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
                System.out.print("Digite seu cpf: ");
                String cpf = entrada.next();
                System.out.print("Digite sua idade: ");
                int idade = entrada.nextInt();
		System.out.print("Digite sua altura (em metros): ");
                float altura = entrada.nextFloat();
                System.out.print("Digite seu ra: ");
                int ra = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Digite seu curso: ");
                String curso = entrada.nextLine();
                System.out.print("Digite seu email: ");
                String email = entrada.nextLine();
                System.out.print("Deseja saber a sua média de alguma disciplina? [1- Sim / 2- Não] ");
                int escolhaMedia = entrada.nextInt();
                
            switch (escolhaMedia) {
                case 1 -> {
                        Estudante et = new Estudante(nome, cpf, idade, altura, ra, curso, email);
                        System.out.println(et.media());
                        System.out.print(et);
                    }
                case 2 -> {
                        Estudante et = new Estudante(nome, cpf, idade, altura, ra, curso, email);
                        System.out.print(et);
                    }
                default -> System.out.println("Escolha inválida");
            }
                
            entrada.close();
	}
}
