/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cev.poo.ExAula03;

/**
 *
 * @author zacar
 */
public class ExAula03 {

    
    public static void main(String[] args) {
        
        Caderno cad1 = new Caderno();
        cad1.cor = "Preto";
        cad1.capa = "Dura";
        cad1.qntdFolhas = 96;
       cad1.fechar();
        cad1.status();
        cad1.serEscrito();
      System.out.println("----------------");
        Caderno cad2 = new Caderno();
        cad2.cor = "Vermelho";
        cad2.capa = "Mole";
        cad2.qntdFolhas = 80;
       cad2.abrir();
        cad2.status();
        cad2.serEscrito();
    }
    
}
