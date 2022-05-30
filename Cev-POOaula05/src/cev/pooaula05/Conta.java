/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cev.pooaula05;

/**
 *
 * @author zacar
 */
public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }
    
    public int getNumConta(){
     return this.numConta;
    }
    public void setNumConta(int numconta){
     this.numConta = numconta;
    }
       
    public String getTipo(){
     return this.tipo;
    }
    public void setTipo(String tipo){
     this.tipo = tipo;
    }
      
    public String getDono(){
     return this.dono;
    }
    public void setDono(String dono){
     this.dono = dono;
    }
        
    public float getSaldo(){
     return this.saldo;
    }
    public void setSaldo(float saldo){
     this.saldo = saldo;
    }
    
    public boolean getStatus(){
     return this.status;
    }
    public void setStatus(boolean s){
     this.status = s;
    }
          
    
    public void abrirConta(String t){     
     this.setTipo(t);
     this.setStatus(true); //this.status = true;
     
     if(t == "CC"){
         this.setSaldo(50); //this.saldo = 50; R$
     }
     else if(t == "CP"){
         this.setSaldo(150);
     }   
        System.out.println("Conta aberta..");
    }
    
    public void fecharConta(){
     if(this.getSaldo() > 0){
         System.out.println("Conta sem grana"); //Evite Mostrar coisas em classes..
     }
     else if(this.getSaldo() < 0){
         System.out.println("A conta tem Débito"); //Evite Mostrar coisas em classes..
     }
     else{
      this.setStatus(false);
         System.out.println("Conta fechada com sucesso ..");
     }
    }
    
    public void depositar(float v){
      if(this.getStatus()){ // this.status == true
       this.setSaldo(this.getSaldo() + v); //this.saldo = this.saldo + v; 
          System.out.println("Desposito realizado com sucesso na conta de " + this.getDono());
      }
      else{
        System.out.println("Impossivel depositar em conta fechada..");
      }
    }
    
    public void sacar(float qt){
    if(this.getStatus()){     // se true
        if(this.getSaldo() >= qt){
            this.setSaldo(this.getSaldo() - qt);
            System.out.println("Saque realizado na conta de " + getDono());
        }
        else{
            System.out.println("Saldo insuficiente para saque..");
        }
     }
    else{
         System.out.println("Impossivel sacar em Conta fechada!");
     }       
    }
    
    public void pagarMensal(){
      float v = 0;
      if(this.getTipo() == "CC"){
        v = 12;
      }
      else if(this.getTipo() == "CC"){
        v = 20;
      }
      
      if(this.getSaldo() > v){
        this.setSaldo(this.getSaldo() - v);
          System.out.println("Mensalidade paga por " + getDono());
      }
      else{
        System.out.println("Impossivel pagar com conta fechada . ");
      }
    }
    
    public Conta(){
     this.status = false;
     this.saldo = 0.00f;
    }
    
    
    
}
