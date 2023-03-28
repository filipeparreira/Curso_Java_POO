package exercicio7;

/*
Exercicio 7
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Cozinha {
    private int tiposRefeicao;
    private int qtdePanelas;
    
    public Cozinha(){
        this.tiposRefeicao = 0;
        this.qtdePanelas = 0;
    }
    public Cozinha(int tipos){
        this.tiposRefeicao = tipos;
        this.qtdePanelas = 0;
    }
    public Cozinha(int tipos, int panelas){
        this.tiposRefeicao = tipos;
        this.qtdePanelas = panelas;
    }
    
    
    public void setTiposRef(int tipos){
        this.tiposRefeicao = tipos;
    }
    public void setQntPanelas(int panelas){
        this.qtdePanelas = panelas;
    }
    
    
    public int getTiposRef(){
        return this.tiposRefeicao;
    }
    public int getQntPanelas(){
        return this.qtdePanelas;
    }
    
    @Override
    public String toString(){
        return "Quantidade de refeições: " + this.qtdePanelas + "\nQuantidade de panelas: " +
                this.qtdePanelas;
    }
    
}
