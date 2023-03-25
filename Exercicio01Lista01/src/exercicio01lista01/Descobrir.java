package exercicio01lista01;

import java.util.Random;

public class Descobrir {
    
    private int numFuncionarios;
    private Random gerador = new Random();
  
    
    public Descobrir(){
        this.numFuncionarios = 0;
    }
    public Descobrir(int numFuncionarios){
        this.numFuncionarios = numFuncionarios;
    }
    
    
    //Mutadores
    public void setNumFuncionarios(int numFunc){
        this.numFuncionarios = numFunc;
    }
    
    
    //Acessores
    public int getNumFuncionarios(){
        return this.numFuncionarios;
    }
    
    
    public int setFuncionarioMes(){
        return gerador.nextInt(1,numFuncionarios);
    }
}
