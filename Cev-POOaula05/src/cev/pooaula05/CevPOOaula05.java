/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cev.pooaula05;

/**
 *
 * @author zacar
 */
public class CevPOOaula05 {

  
    public static void main(String[] args) {
       
            Conta c1 = new Conta();
            c1.setNumConta(1111);
            c1.setDono("Jao");
            c1.abrirConta("CC"); //50RS
           
            Conta c2 = new Conta();
            c2.setNumConta(222);
            c2.setDono("maria");
            c2.abrirConta("CP"); //150RS
         
            
            c1.depositar(100);
            c2.depositar(40);
            
            c2.sacar(1000);
            c1.sacar(150);
            c1.fecharConta();
            
            c1.estadoAtual();
            c2.estadoAtual();
    }
    
}
