package exercicio8;

/*
Exercicio 8
Autor(es): Filipe Augusto Parreira Almeida
Data: 27/03/2023
*/

public class Estacionamento {
    private String tipoVeiculo;
    private String placa;
    private String horaIn;
    private String horaOut;
    private float valorEstc;
    
    public Estacionamento(){
        this.tipoVeiculo = "";
        this.placa = "";
        this.horaIn = "";
        this.horaOut = "";
        this.valorEstc = 0;
    }  
    public Estacionamento(String tipoVeiculo){
        this.tipoVeiculo = tipoVeiculo;
        this.placa = "";
        this.horaIn = "";
        this.horaOut = "";
        this.valorEstc = 0;
    }    
    public Estacionamento(String tipoVeiculo, String placa){
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.horaIn = "";
        this.horaOut = "";
        this.valorEstc = 0;
    }    
    public Estacionamento(String tipoVeiculo, String placa, String horaIn){
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.horaIn = horaIn;
        this.horaOut = "";
        this.valorEstc = 0;
    }
    public Estacionamento(String tipoVeiculo, String placa, String horaIn, String horaOut){
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.valorEstc = 0;
    }
    
    public String getTipoVeiculo(){
        return this.tipoVeiculo;
    }
    public String getPlaca(){
        return this.placa;       
    }
    public String getHoraIn(){
        return this.horaIn;        
    }
    public String getHoraOut(){
        return this.horaOut;
    }
    
    public void setTipoVeiculo(String tipo){
        this.tipoVeiculo = tipo;        
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setHoraIn(String hora){
        this.horaIn = hora;
    }
    public void setHoraOut(String hora){
        this.horaOut = hora;
    }
        
    private float valorEstacionamento(){
        Integer horaEntrada[] = new Integer[2];
        Integer horaSaida[] = new Integer[2];
        int horas, minutos;
        
        if (this.horaIn.isEmpty() || this.horaOut.isEmpty()){
            this.valorEstc = 0;
        }else{
            horaEntrada[0] = Integer.valueOf(this.horaIn.substring(0, 2));
            horaEntrada[1] = Integer.valueOf(this.horaIn.substring(3, 5));
            horaSaida[0] = Integer.valueOf(this.horaOut.substring(0, 2));
            horaSaida[1] = Integer.valueOf(this.horaOut.substring(3, 5));
            
            horas = (horaSaida[0] - horaEntrada[0]) * 60;
            minutos = horaSaida[1] - horaEntrada[1];
            minutos = minutos + horas;
            
            if (minutos < 30){
                this.valorEstc = 0;
            } else if (minutos >= 30 && minutos < 60){
                this.valorEstc = 10;
            } else {
                this.valorEstc = 20;                
            } 
        }
        return this.valorEstc;
    }
            
    
    @Override
    public String toString(){
        return "--------------- Tipo carro: " + this.tipoVeiculo + " ---------------\n"+
                "Placa: " + this.placa + "\nHora entrada: " + this.horaIn + "\nHora saida: " +
                this.horaOut + "\nValor estacionamento R$ " + valorEstacionamento();
    }
}
