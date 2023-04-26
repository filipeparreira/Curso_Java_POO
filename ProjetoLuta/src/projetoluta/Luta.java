package projetoluta;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Luta(){
        this.aprovada = false;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && !(l1.equals(l2))){
            this.setAprovada(true);
            this.setDesafiante(l2);
            this.setDesafiado(l1);
        } else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void lutar(){
        Random gerador = new Random();
        int vencedor;
        if (this.getAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            vencedor = gerador.nextInt(0, 3);
            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou a luta!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }                   
        }else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
