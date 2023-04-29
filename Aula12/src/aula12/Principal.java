package aula12;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Mamifero();
        a1.alimentar();
        a1.locomover();
        
        a1 = new Peixe();
        a1.alimentar();
        a1.locomover();
        
        //a1 = new Ave();
        ((Ave) a1).alimentar();
        ((Ave) a1).locomover();
    }
    
}
