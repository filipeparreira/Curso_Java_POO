package exercicio8;
import java.util.Random;

/*
Exercicio 8
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Descobrir {
    
    private int numFuncionarios;
    private Random gerador = new Random();
  
    public Descobrir(){
        this.numFuncionarios = 0;
    }
    public Descobrir(int numFuncionarios){
        this.numFuncionarios = numFuncionarios;
    }
    
    public void setNumFuncionarios(int numFunc){
        this.numFuncionarios = numFunc;
    }
        
    public int getNumFuncionarios(){
        return this.numFuncionarios;
    }
    
    public int setFuncionarioMes(){
        return gerador.nextInt(1,numFuncionarios);
    }
}
