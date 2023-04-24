package aula06;

public class Principal {
    public interface Controlador{
        public abstract void ligar();
        public abstract void desligar();
        public abstract void abrirMenu();
        public abstract void fecharMenu();
        public abstract void maisVolume();
        public abstract void menosVolume();
        public abstract void ligarMudo();
        public abstract void desligarMudo();
        public abstract void play();
        public abstract void pause();       
    }
    public class ControleRemoto implements Controlador{
        private boolean ligado;
        private boolean tocando;
        private int volume;
        
        public ControleRemoto(){
            this.volume = 50;
            this.tocando = false;
            this.ligado = false;
        }
        public void setVolume(int volume){this.volume = volume;}
        public void setTocando(boolean toc){this.tocando = toc;}
        public void setLigado(boolean ligado){this.ligado = ligado;}
        
        public int getVolume(){return this.volume;}
        public boolean getLigado(){return this.ligado;}
        public boolean getTocando(){return this.tocando;}
        
        public void ligar(){
            this.setLigado(true);
        }
        public void desligar(){
            this.setLigado(false);
        }
        public void abrirMenu(){
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Reproduzindo: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i<=this.getVolume(); i+=10){
                System.out.print(" |");
            }
            System.out.println("");
        }   
        public void fecharMenu(){
            System.out.println("Fechando menu.");
        }
        public void maisVolume(){
            if (this.getLigado()){
                this.setVolume(this.getVolume() + 1);
            }
        }
        public void menosVolume(){
            if (this.getLigado()){
                this.setVolume(this.getVolume() - 1);
            }
        }
        public void ligarMudo(){
            if (this.getLigado() && this.getVolume() > 0){
                this.setVolume(0);
            }
        }
        public void desligarMudo(){
            if (this.getLigado() && this.getVolume() == 0){
                this.setVolume(50);
            }
        }
        public void play(){
            if (this.getLigado() && !(this.getTocando())){
                this.setTocando(true);
            }
        }
        public void pause(){
            if (this.getLigado() && this.getTocando()){
                this.setTocando(false);
            }
        }
    
    }
    
    public Principal(){
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.ligarMudo();
        c1.abrirMenu();
        c1.volume = 50;
        c1.abrirMenu();

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Principal();
    }
    
}
