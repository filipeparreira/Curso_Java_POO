package projetoluta;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        ArrayList<Lutador> lista = new ArrayList<>();
        lista.add(l);
        Lutador l1 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lista.add(l1);
        Lutador l2 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lista.add(l2);
        Lutador l3 = new Lutador("Dead Coda", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lista.add(l3);
        Lutador lutador = lista.get(2);
        lutador.apresentar();
        lutador.status();

    }
    
}
