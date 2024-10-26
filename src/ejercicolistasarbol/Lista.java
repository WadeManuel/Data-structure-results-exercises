/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicolistasarbol;

/**
 *
 * @author wadeManuel
 */
public class Lista {
    private Nodolista cab;
    
    public Lista(){
     cab=null;
    }
    
    public boolean esVacia(){
    return cab==null;
    }
    
    //Agregar por final
    
    public void agregarFinal(int info)
    {
        Nodolista aux=cab;
        if(!esVacia())
        {
            while(aux.getProx() != null)
            {
                aux=aux.getProx();
                
            }
            aux.setProx(new Nodolista(info));
       
        }else{
            
        cab=new Nodolista(info);
        
        }    
    }
    
    
    public void mostrarLista()
    {
        Nodolista aux=cab;
        while(aux != null){
            System.out.print("["+aux.getInfo()+"]-->");
            aux=aux.getProx();
        }
    }
    
    public Integer sumarPositivo()
    {
        int suma=0;
        Nodolista aux=cab;
        if(!esVacia())
        {
            while(aux != null)
            {
                if(aux.numeroPositvo())
                {
                   suma+=aux.getInfo();
                }
                aux=aux.getProx();
            }
        }     
    return suma;
    }
    
    public Integer sumarNegativos()
    {
        int suma=0;
        Nodolista aux=cab;
        if(!esVacia())
        {
            while(aux != null)
            {
                if(aux.numeroPositvo()==false)
                {
                  suma+=aux.getInfo();
                }
                aux=aux.getProx();
            }
            
           
        }
    
         return suma;
    
    }
    
    
    
    
}
