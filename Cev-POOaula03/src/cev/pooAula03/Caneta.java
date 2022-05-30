/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cev.pooAula03;


public class Caneta {
    
    public String modelo; //+
    public String cor; //+
    private float ponta; //-
    protected int carga; //#
    private boolean tampada; //#
    
    public void status(){
       System.out.println("Modelo: > " + this.modelo);
       System.out.println("Uma Caneta: > " + this.cor);
       System.out.println("Ponta: > " + this.ponta);
       System.out.println("Carga: > " + this.carga);
       System.out.println("Esta tampada?: > " + this.tampada);   
    }
    
    public void rabiscar(){
        if (this.tampada) { //se true
            System.out.println("ERRO, caneta tampada");
        }
        else{
            System.out.println("Estou rabiscando...");
        }
       
    }
    public void tampar(){
    this.tampada = true;
    }
    public void destampar(){
    this.tampada = false;
    }
}
