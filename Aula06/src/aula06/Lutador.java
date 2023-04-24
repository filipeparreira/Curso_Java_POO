package aula06;

public class Lutador implements iLutador{
    private String nome;
    private String nascionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nascionalidade, int idade, float peso, float altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if (peso < 52.2f){
            this.categoria = "Inválido";
        }else if (peso <= 70.3f){
            this.categoria = "Leva";
        }else if (peso <= 83.9f){
            this.categoria = "Médio";
            
        }else if (peso <= 120.2f){
            this.categoria =  "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    @Override
    public String apresentar() {
        return "Lutador: " + this.getNome() + "\nOrigem: " + this.getNascionalidade() +
                "\nCategoria: " + this.getCategoria() + "\nIdade: " + this.getIdade() +
                " anos\nPeso: " + this.getPeso() + " Kg\nAltura: " + this.getAltura() +
                " m\nVitórias: " + this.getVitorias() + "\nDerrotas: " + this.getDerrotas() +
                "\nEmpates: " + this.getEmpates(); 
    }

    @Override
    public String status() {
        return this.getNome() + " é um Peso " + this.getCategoria() + " com " + this.getVitorias() +
                " vitorias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.";
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
}
