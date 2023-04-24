package aula05;

public class Principal {
    public class Conta{
        protected String tipo; // cc - conta corrente (+50) | cp - conta polpança (+150)
        public int numeroConta;
        private String dono;
        private boolean status; //0 - fechada | 1 - aberta
        private float saldo;
        
        public Conta(){
            this.saldo = 0f;
            this.status = false;
        }
        
        public void setNumConta(int numero){this.numeroConta = numero;}
        public void setTipo(String tipo){this.tipo = tipo;}
        public void setDono(String dono){this.dono = dono;}
        public void setStatus(boolean status){this.status = status;}
        public void setSaldo(float saldo){this.saldo = saldo;}
        
        public int getNumConta(){return this.numeroConta;}
        public String getTipo(){return this.tipo;}
        public String getDono(){return this.dono;}
        public boolean getStatus(){return this.status;}
        public float getSaldo(){return this.saldo;}
        
        public void abrirConta(String tipo){
            this.setTipo(tipo);
            this.setStatus(true);
            if (tipo.equals("cc")){
                this.saldo += 50f;
            }
            if (tipo.equals("cp")){
                this.saldo += 150f;
            }
            System.out.println("Conta aberta.");
        }
        public void fecharConta(){
            if (this.saldo > 0){
                System.out.println("Não é possivel fechar a conta: Conta com dinheiro.");
            }else if (this.saldo < 0){
                System.out.println("Não é possivel fechar a conta: Conta devendo dinheiro.");
            }else {
                System.out.println("Conta fechada!!");
                this.setStatus(false);
            }
        }
        public void depositar(float valor){
            if (this.getStatus() == true){
                this.setSaldo((this.getSaldo() + valor));
            } else if (this.getStatus() == false){
                System.out.println("Não é possivel depositar, conta fechada.");
            }
        }
        public void sacar(float valor){
            if (this.getStatus() && this.getSaldo() >= 0){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Valor sacado.");
            }else{
                System.out.println("Não é possível sacar.");
            }
        }
        public void pagarMensal(){
            //CC - 12 reais
            //CP - 20 reais
            float mensalidade = 0;
            if (this.getTipo().equals("cc")){
                mensalidade = 12f;
            } else if (this.getTipo().equals("cp")){
                mensalidade = 20f;
            }
            if (this.getStatus() && this.getSaldo() >= 0){
                System.out.println("Mensalidade paga.");
                this.setSaldo(this.getSaldo() - mensalidade);
            }else{
                System.out.println("Impossivel pagar mensalidade.");
            }
        }
        public String toString(){
            return "Conta nº: " + this.getNumConta() + "\nDono: " + this.getDono() + "\nTipo de Conta: " + this.getTipo() +
                    "\nSaldo: R$" + this.getSaldo() + "\nStatus: " + this.getStatus() + "\n\n";
        }
    }
    public Principal(){
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        
        p1.depositar(100f);
        p2.depositar(500f);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    public static void main(String[] args) {
        new Principal();
        
    }
    
}
