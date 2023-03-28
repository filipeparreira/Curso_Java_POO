package exercicio8;

/*
Exercicio 8
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(){
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }
    public Data(int dia){
        this.dia = dia;
        this.mes = 0;
        this.ano = 0;
    }
    public Data(int dia, int mes){
        this.dia = dia;
        this.mes = mes;
        this.ano = 0;
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    //Acessores
    public String getData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    
    
    //Mutadores
    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    
    @Override 
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
}
