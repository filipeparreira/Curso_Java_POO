package exercicio9;
/*
Exercicio 9
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/
public class Padaria extends EstabelecimentoComercial {
    private int qtdeMaxPaes;
    private Cozinha cozinha;
    
    public Padaria(){
        super();
        this.qtdeMaxPaes = 0;
        this.cozinha = new Cozinha();
    }
    public Padaria(String nome){
        super(nome);
        this.qtdeMaxPaes = 0;
        this.cozinha = new Cozinha();
    }
    public Padaria(String nome, String dono){
        super(nome, dono);
        this.qtdeMaxPaes = 0;
        this.cozinha = new Cozinha();
    }
    public Padaria(String nome, String dono, String endereco){
        super(nome, dono, endereco);
        this.qtdeMaxPaes = 0;
        this.cozinha = new Cozinha();
    }
    
    public void setQtdeMaxPaes(int maxPaes){
        this.qtdeMaxPaes = maxPaes;
    }    
    public void setCozinha(int tiposRefeicao, int qtdePanelas){
        this.cozinha.setTiposRef(tiposRefeicao);
        this.cozinha.setQtdePanelas(qtdePanelas);
    }
    
    @Override
    public String toString(){
        return "------------" + super.getNome() + "------------\n\nDono: " + super.getDono() +
                "\nEndereço: " + super.getEnd() + "\nRenda mensal: " + super.getVendas() +
                "\nQuantidade de funcionarios: " + super.getQtdeFuncionarios() + "\nQuantida de pães fabricados em 1 dia: " +
                this.qtdeMaxPaes + "Cozinha da " + super.getNome() + "\n" + this.cozinha.toString();
    }
    
}
