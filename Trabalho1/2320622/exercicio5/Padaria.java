package exercicio5;

/*
Exercicio 5
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Padaria {
    private String nome;
    private String dono;
    private String endereco;
    private float vendasMensais;
    private int qtdeMaxPaes;
    private int qtdeFuncionarios;
    private Cozinha cozinha;
    
    public Padaria(){
        this.nome = "";
        this.dono = "";
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeMaxPaes = 0;
        this.qtdeFuncionarios = 0;
        this.cozinha = new Cozinha();
    }
    public Padaria(String nome){
        this.nome = nome;
        this.dono = "";
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeMaxPaes = 0;
        this.qtdeFuncionarios = 0;
        this.cozinha = new Cozinha();
    }
    public Padaria(String nome, String dono){
        this.nome = nome;
        this.dono = dono;
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeMaxPaes = 0;
        this.qtdeFuncionarios = 0;
        this.cozinha = new Cozinha();
    }
    public Padaria(String nome, String dono, String end){
        this.nome = nome;
        this.dono = dono;
        this.endereco = end;
        this.vendasMensais = 0f;
        this.qtdeMaxPaes = 0;
        this.qtdeFuncionarios = 0;
        this.cozinha = new Cozinha();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public void setEnd(String end){
        this.endereco = end;
    }
    public void setVendas(float vendas){
        this.vendasMensais = vendas; 
    }
    public void setMaxPaes(int paes){
        this.qtdeMaxPaes = paes;
    }
    public void setFuncionarios(int funcionarios){
        this.qtdeFuncionarios = funcionarios;
    }
    public void setCozinha(int qtdeRef, int qtdePan){
        this.cozinha = new Cozinha(qtdeRef, qtdePan);
    }
    
    
    public String getNome(){
        return this.nome;
    }
    public String getDono(){
        return this.dono;
    }
    public String getEnd(){
        return this.endereco;
    }
    public float getVendas(){
        return this.vendasMensais;
    }
    public int getMaxPaes(){
        return this.qtdeMaxPaes;
    }
    public int getFuncionarios(){
        return this.qtdeFuncionarios;
    }
    public String getCozinha(){
        return this.cozinha.toString();
    }
    
    @Override 
    public String toString(){
        return "\n-------------- " + this.nome + " --------------\nDono: " + this.dono +
                "\nEndereço: " + this.endereco + "\nVendas Mensais: R$" + this.vendasMensais +
                "\nQuantidade Máxima de pães: " + this.qtdeMaxPaes + "\nQuantidade de Funcionarios: " +
                this.qtdeFuncionarios + "\n\nCozinha da " + this.nome + ":" + "\nQuantos tipos de refeição? " +
                this.cozinha.getTiposRef() + "\nQuantas panelas? " + this.cozinha.getQntPanelas();    
    }
    
}

