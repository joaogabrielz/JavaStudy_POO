/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cev.poo.ExAula02;

/**
 *
 * @author zacar
 */
public class Caderno {
    
    String capa;
    String cor;
    int qntdFolhas;
    boolean fechado;
    
    void fechar(){
    this.fechado = true;
    }
    void abrir(){
    this.fechado = false;
    }
    void serEscrito(){
        if(!this.fechado){ // False
            System.out.println("Estou sendo Escrito :)");
        }
        else{
          System.out.println("[X]Estou fechado..");
        }
    }
    
    void status(){
        System.out.println("Capa: " + this.capa);
        System.out.println("Cor: " + this.cor);
        System.out.println("qntdFolhas: " + this.qntdFolhas);
        System.out.println("Esta Aberto?: " + this.fechado);
    }
}
