/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicolistasarbol;

/**
 *
 * @author wadeManuel
 */
public class Nodoarbol {
    private int info;
    private Nodoarbol izq;
    private Nodoarbol der;
    
    
    public Nodoarbol(int info)
    {
    this.info=info;
    this.der=null;
    this.izq=null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodoarbol getIzq() {
        return izq;
    }

    public void setIzq(Nodoarbol izq) {
        this.izq = izq;
    }

    public Nodoarbol getDer() {
        return der;
    }

    public void setDer(Nodoarbol der) {
        this.der = der;
    }
    
    
    
    
    
    public void Insertar(int info){
        if(info<this.info){
        //Insertar por el nodo izquierda
            if(this.izq==null){
            this.izq=new Nodoarbol(info);
            }else{
            this.izq.Insertar(info);
            }
        }else{
        //Insertar por el nodo de la derecha
            if(this.der==null){
              this.der=new Nodoarbol(info);   
            }else{
            this.der.Insertar(info);
            }
        }
    }
    
    public boolean esPrimo()
    {
        int contar=0;
        for(int i = 1 ; i <= info; i++ )
        {
            if(info%i==0)
            {
                contar++;
            }
        }
        return contar==2;
    }
    
    
        
    
   
    
    
    
    
    
    
}
