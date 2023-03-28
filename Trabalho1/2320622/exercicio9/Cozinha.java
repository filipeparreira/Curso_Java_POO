package exercicio9;

class Cozinha {
    private int tiposRefeicao;
    private int qtdePanelas;
    
    public Cozinha(){
        this.tiposRefeicao = 0;
        this.qtdePanelas = 0;
    }
    public Cozinha(int tiposRefeicao){
        this.tiposRefeicao = tiposRefeicao;
        this.qtdePanelas = 0;
    }
    public Cozinha(int tiposRefeicao, int qtdePanelas){
        this.tiposRefeicao = tiposRefeicao;
        this.qtdePanelas = qtdePanelas;
    }
    
    public void setTiposRef(int tiposRefeicao){
        this.tiposRefeicao = tiposRefeicao;
    }
    public void setQtdePanelas(int qtdePanelas){
        this.qtdePanelas = qtdePanelas;
    }
        
    public int getTiposRef(){
        return this.tiposRefeicao;
    }
    public int getQtdePanelas(){
        return this.qtdePanelas;
    }
    
    @Override
    public String toString(){
        return "\nQuantos tipos de refeição tem? " + this.tiposRefeicao +
                "\nQuantas panelas tem na cozinha? " + this.qtdePanelas;
    }
}
