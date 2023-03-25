package exercicio01lista01;

public class Cozinha {
    private int tiposRefeicao;
    private int qtdePanelas;
    
    // Construtores
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
    
    // Mutadores
    public void setTiposRef(int tipos){
        this.tiposRefeicao = tipos;
    }
    public void setQntPanelas(int panelas){
        this.qtdePanelas = panelas;
    }
    
    //Acessores
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
