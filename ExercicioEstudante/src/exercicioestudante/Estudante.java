/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioestudante;

/**
 *
 * @author filipe
 */
public class Estudante {

/*
   TODO: Crie os metodos acessores e mutadores para
          cada uma das variaveis de instancia
*/

	//Variaveis de instancia
	private String nome;
	private String endereco;
	private String RA;
	private String sexo;
	
        //Construtores
	public Estudante(String nome, String endereco, String RA) { //<--parametro
            this.RA = RA;
            this.endereco = endereco;
            this.nome = nome;		
            this.sexo = "";
	}	
        
    public Estudante(){
        this.RA = "";
        this.endereco = "";
        this.nome = "";
        this.sexo = "";
    }
        
    //Metodos Acessores 
    public String getNome(){
        return this.nome;
    }
    public String getEnd(){
        return this.endereco;
    }
    public String getRA(){
        return this.RA;
    }
	public String getSexo(){
	    return this.sexo;
	}
        
    //Metodos Mutadores
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEnd(String end){
        this.endereco = end;
    }
    public void setRA(String RA){
        this.RA = RA;
    }
	public void setSexo(String sexo){
	    this.sexo = sexo;
	}
    @Override 
    public String toString(){
        return "Nome: " + this.nome + "\nRA: " + this.RA + "\nEndereco: " +
                this.endereco + "\nSexo: " + this.sexo;
    }

}


