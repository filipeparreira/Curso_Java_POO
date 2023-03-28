package exercicio9;
/*
Exercicio 9
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/
public class EstabelecimentoComercial {
    private String nome;
    private String dono;
    private String endereco;
    private float vendasMensais;
    private int qtdeFuncionarios;
    
    public EstabelecimentoComercial(){
        this.nome = "";
        this.dono = "";
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeFuncionarios = 0;
    }
    public EstabelecimentoComercial(String nome){
        this.nome = nome;
        this.dono = "";
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeFuncionarios = 0;
    }
    public EstabelecimentoComercial(String nome, String dono){
        this.nome = nome;
        this.dono = dono;
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeFuncionarios = 0;
    }
    public EstabelecimentoComercial(String nome, String dono, String end){
        this.nome = nome;
        this.dono = dono;
        this.endereco = end;
        this.vendasMensais = 0f;
        this.qtdeFuncionarios = 0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public void setEnd(String endereco){
        this.endereco = endereco;
    }
    public void setVendas(float vendas){
        this.vendasMensais = vendas;
    }
    public void setQtdeFuncionarios(int funcionarios){
        this.qtdeFuncionarios = funcionarios;
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
    public int getQtdeFuncionarios(){
        return this.qtdeFuncionarios;
    }
    
    @Override
    public String toString(){
        return "---------toString dentro da superclasse---------\n---------" +
                this.nome + "---------\nDono: " + this.dono + "\nEndereço: " +
                this.endereco + "\nFaturamento mensal: R$ " + this.vendasMensais +
                "\nQuantidade de funcionarios: " + this.qtdeFuncionarios;
    }
}
