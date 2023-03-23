package exercicio01lista01;

public class Principal {

    public static void main(String[] args) {
        Padaria padoca = new Padaria("Padoca", "João", "Rua Catapimbas");
        Padaria salomao = new Padaria("Padaria do Salomão", "Salomão", "Rua Salmos");
        
        padoca.setFuncionarios(8);
        padoca.setMaxPaes(85);
        padoca.setVendas(1864.43f);
        padoca.cozinha();
        
        
        
        salomao.setFuncionarios(12);
        salomao.setMaxPaes(135);
        salomao.setVendas(2125.47f);
        
        
    }
    
}
