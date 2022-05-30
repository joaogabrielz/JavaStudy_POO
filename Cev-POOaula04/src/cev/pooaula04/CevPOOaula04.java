/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cev.pooaula04;

/**
 *
 * @author zacar
 */
public class CevPOOaula04 {

   
    public static void main(String[] args) {
        
      //  Caneta c1 = new Caneta();
        
//        c1.setModelo("Bic");
//        c1.modelo = "Bicer"; //Da pois é Publico
//        
//        c1.setPonta(0.5f);
//    //  c1.ponta = 0.5f; //Privado nao da, acesso direto ao atributo
//    
//        c1.status();    
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " ponta " + c1.getPonta());
//        
   ////------------------------

        Caneta c2 = new Caneta(); //Construtor sem parametros
        c2.status();

         Caneta c3 = new Caneta("Nic", "Verde", 0.4f); //Construtor com parametros
         c3.status();
    }
    
}
