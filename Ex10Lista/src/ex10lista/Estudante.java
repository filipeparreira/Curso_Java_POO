package ex10lista;
import java.util.Scanner;

public class Estudante {
	private String nome;
        private String CPF;
        private int idade;
        private float altura;
        private int ra;
        private String curso;
        private String email;
        
	public Estudante(String nome, String CPF, int idade, float altura, int ra, String curso, String email) {
            this.nome = nome;
            this.CPF = CPF;    
            this.idade = idade;
            this.altura = altura;
            this.ra = ra;
            this.curso = curso;
            this.email = email;
	}
        @Override
	public String toString(){
		return "\n\n------------Informações do Estudante------------" +
                        "\nNome: " + getNome() + "\n" +
                        "CPF: " + getCPF() + "\n" +
                        "Idade: " + getIdade() + " anos\n" +
                        "Altura: " + getAltura() + " m\n" + 
                        "RA: " + getRa() + "\n" +
                        "Curso: " + getCurso() + "\n" +
                        "E-mail: " + getEmail() + "\n\n";
                        
	}


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPF() {
        return CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public int getIdade(){
        return idade;
    }
    
    public void getIdade(int idade){
        this.idade = idade;
    }
    
    public int getRa(){
        return ra;
    }
    public void setRa(int ra){
        this.ra = ra;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }  
    
    public String media(){
        int count = 0;
        float media = 0;
        String fraseRet;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\n------------ Média ------------");
        System.out.print("Digite a disciplina cursada: ");
        String disciplina = entrada.nextLine();
        System.out.print("Quantidade de provas/trabalhos presentes na disciplina informada: ");
        int numProvas = entrada.nextInt();
        
        float vetNotas[] = new float[numProvas];

        if (numProvas == 0 || numProvas < 0){
            fraseRet = "\nNenhuma prova/trabalho informado ou entrada inválida.";
        }else{
            System.out.println("\n->Disciplina: " + disciplina);
            while(count < numProvas){
                System.out.printf("Nota prova/trabalho %d: ", count+1);
                vetNotas[count] = entrada.nextFloat();
                count++;
            }
            count = 0;
            while(count < numProvas){
                media += vetNotas[count];
                count++;
            }
            media = media/vetNotas.length;
            fraseRet = "Sua média na disciplina de " + disciplina +  
                " é: " + media;
        }
        return fraseRet;
    }//media
}

