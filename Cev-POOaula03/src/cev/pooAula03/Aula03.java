/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cev.pooAula03;


public class Aula03 {

   
    public static void main(String[] args) {
        
       //Na main pode publico e Protegido, Mas nao privado
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Preto";
     // c1.ponta = 0.5f; // Privada nao pode
        c1.carga = 80;  // Pode pois, esta dentro de uma classe que utiliza classe Caneta
        
     // c1.tampada = false; //Privada n pode mexer
        c1.tampar(); //Publico pode mexer em privada pq esta na Classe e nao Fora
        c1.status();
        c1.rabiscar();
     
    }
    
}
