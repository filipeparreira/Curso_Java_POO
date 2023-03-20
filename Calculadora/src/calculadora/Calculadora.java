/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author filipe
 */
public class Calculadora {
    private int campo1;
    private int campo2;
    private int op;
    private float res;
    private String marca;
    private String cor;
    private float tamanho;
    
    //Construtor
    public Calculadora(int campo1, int campo2, int op){
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.op = op;       
        this.marca = "";
        this.cor = "";
        this.tamanho = 0;
    }
    
    public Calculadora(){
        this.campo1 = 0;
        this.campo2 = 0;
        this.op = 0;
        this.marca = "";
        this.cor = "";
        this.tamanho = 0;
    }
    
    //Métodos Mutadores
    public void setCampo1(int campo1){
        this.campo1 = campo1;
    }
    public void setCampo2(int campo2){
        this.campo2 = campo2;
    }
    public void setOp(int op){
        this.op = op;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTam(float tam){
        this.tamanho = tam;
    }
    
    //Métodos Acessores
    public int getCampo1(){
        return this.campo1;
    }
    public int getCampo2(){
        return this.campo2;
    }
    public int getOp(){
        return this.op;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getCor(){
        return this.cor;
    }
    public float getTam(){
        return this.tamanho;
    }
    
    public void resolvaOp(){
        int num1 = this.campo1;
        int num2 = this.campo2;
        int operacao = this.op;
        
        switch(operacao){
            case 0:
                this.res = 0;
            case 1:
                this.res = num1 + num2;
                break;
            case 2:
                this.res = num1 - num2;
                break;
            case 3:
                this.res = num1 * num2;
                break;
            case 4:
                this.res = num1 / num2;
                break;
            default:
                this.res = -999;
        }//switch
    }//ResolvaOp
    
    @Override
    public String toString(){
        return "Campo1: " + this.campo1 + "\nCampo2: " + this.campo2 + "\nOp: " +
                this.op + "\nMarca: " + this.marca + "\nCor: " + this.cor + "\nTamanho: " +
                this.tamanho + "\nResultado da operação: " + this.res;
    }
    
    
}
