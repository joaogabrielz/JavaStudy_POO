/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.estudo;

/**
 *
 * @author zacar
 */
public class Pessoa {
    

    //caracteristicas - atributos - var. instancia
	public String nome;
	public int idade;
	
        
        //comportamentos - metodos
        //getters
        public String getNome(){
            return nome;
        }
        
        public int getIdade(){
            return idade;
        }
        
        //setters
        public void setNome(String nomePar){;
            nome = nomePar;
        }
	
        public void setNome(){
            nome = Input.readString("Digite um NOVO nome: ");
        }
         
        public void setIdade(int idadePar){
            idade = idadePar;
        }
	public void imprimeDados() {
		System.out.println(nome + " tem " + idade);
	}
	
	//construtor
	public Pessoa() {		
		nome  = Input.readString("Digite um nome: ");
		idade = Input.readInt("Digite a idade: ");
		System.out.println("Objeto criado!");
	}
	
        //contrutor 2 (com parametros)
        public Pessoa(String nomePar, int idadePar) {
            nome = nomePar;
            idade = idadePar;
	}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa meuobj , meuobj2, meuobj3;
		
		meuobj = new Pessoa();
		meuobj.imprimeDados();
		
                
                meuobj.setNome();
               //meuobj.setNome("Lucio");
                meuobj.imprimeDados();
                
                meuobj.setIdade(15);
                meuobj.imprimeDados();
                //meuobj2 = meuobj;
                //meuobj2.imprimeDados();
		/*meuobj2 = new pessoa();
		meuobj2.imprimeDados();
                
                meuobj3 = new pessoa("Caio",25);
                meuobj3.imprimeDados();*/
    }
    
}
