/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicolistasarbol;

/**
 *
 * @author wadeManuel
 */
public class Nodolista {
    private int info;
    private Nodolista prox;
    
    
    public Nodolista(int info){
    this.info=info;
    this.prox=null;
    
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodolista getProx() {
        return prox;
    }

    public void setProx(Nodolista prox) {
        this.prox = prox;
    }
    
    public boolean numeroPositvo(){
        return info>0;
    }
    
    
}
