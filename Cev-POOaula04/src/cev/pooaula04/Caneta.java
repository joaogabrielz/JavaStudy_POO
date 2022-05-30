/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cev.pooaula04;


public class Caneta {
    
    public String modelo;
    private float ponta;
    
    private String cor;
    private boolean tampada;
    
    public Caneta(){ //Chamado assim q objeto e instanciado
        this.tampar();
        this.cor = "AZUL bebe";
    }
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public String getModelo(){
    return this.modelo;
    }
    public void setModelo(String m){
    this.modelo = m;
    }
    
    
    public float getPonta(){
    return ponta;
    }
    public void setPonta(float p){
    this.ponta = p;
    }
    
    public void status(){
        System.out.println(">About");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada?  " + this.tampada);
    }
    
    public void tampar(){
    this.tampada = true;
    }
    public void destampar(){
    this.tampada = false;
    }
    
}
