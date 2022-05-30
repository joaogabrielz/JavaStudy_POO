/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cev.pooAula02;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
       System.out.println("Modelo: > " + this.modelo);
       System.out.println("Uma Caneta: > " + this.cor);
       System.out.println("Ponta: > " + this.ponta);
       System.out.println("Carga: > " + this.carga);
       System.out.println("Esta tampada?: > " + this.tampada);   
    }
    
    void rabiscar(){
        if (this.tampada) { //se true
            System.out.println("ERRO, caneta tampada");
        }
        else{
            System.out.println("Estou rabiscando...");
        }
       
    }
    void tampar(){
    this.tampada = true;
    }
    void destampar(){
    this.tampada = false;
    }
}
