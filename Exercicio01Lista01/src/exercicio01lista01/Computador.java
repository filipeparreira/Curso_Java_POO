package exercicio01lista01;

public class Computador {
    private String nome;
    private String marca;
    private Data data;
    
    public Computador(){
        this.nome = "";
        this.marca = "";
        this.data = new Data();
    }
    public Computador(String nome){
        this.nome = nome;
        this.marca = "";
        this.data = new Data();
    }
    public Computador(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
        this.data = new Data();
    }
    public Computador(String nome, String marca, int dia){
        this.nome = nome;
        this.marca = marca;
        this.data = new Data(dia);
    }
    public Computador(String nome, String marca, int dia, int mes){
        this.nome = nome;
        this.marca = marca;
        this.data = new Data(dia, mes);
    }
    public Computador(String nome, String marca, int dia, int mes, int ano){
        this.nome = nome;
        this.marca = marca;
        this.data = new Data(dia, mes, ano);
    }
    
    
    //Acessores 
    public String getNome(){
        return this.nome;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getData(){
        return this.data.getData();
    }
    
    //Mutadores
    public Computador setNome(String nome){
        this.nome = nome;
        return this;
    }
    public Computador setMarca(String marca){
        this.marca = marca;
        return this;
    }
    public Computador setData(int dia, int mes, int ano){
        this.data = new Data(dia, mes, ano);
        return this;
    }
    
    @Override
    public String toString(){
        return "-------------- Computador --------------\nNome: " + this.nome +
                "\nMarca: " + this.marca + "\nData: " + this.data.toString();  
    }
}
