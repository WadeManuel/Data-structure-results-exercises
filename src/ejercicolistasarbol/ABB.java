/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicolistasarbol;

/**
 *
 * @author wadeManuel
 */
public class ABB {
    private Nodoarbol raiz;
    
    public ABB(){
    raiz=null;
    }
    
    //Funcion para insertar los valores del arbol
    
    public void Insertar(int info)
    {
        if(raiz == null)
        {
            this.raiz=new Nodoarbol(info);
        }else
        {
            this.raiz.Insertar(info);
        }
    
    }
    
    
    /*Recorrido en Posorden*/
    public void dispararPreorden(){
        this.preorden(this.raiz);
    }
    public void preorden(Nodoarbol nodo){
        if(nodo==null){
        return ;//Detener recursividad base
        }else{
        System.out.print("["+nodo.getInfo()+"]");
        preorden(nodo.getIzq());
        preorden(nodo.getDer());
        }
    }
    
    
    
    public Integer hallarMenor()
    {
    return hallarMenor(this.raiz);
    }
    
    private Integer hallarMenor(Nodoarbol aux)
    {
        int menor=raiz.getInfo();
        if( raiz != null)
        {
            while(aux.getIzq() != null)
            {
                aux=aux.getIzq();
                menor=aux.getInfo();
            }
        }
        
        
        return menor;
    
    }
    
    public Integer contarPrimos()
    {
    return contarPrimos(this.raiz);
    }
    
    private Integer contarPrimos(Nodoarbol aux){
    int contarPrimos=0;
    
        if(aux != null)
        {
            if(aux.esPrimo())
            {
                contarPrimos++;
            }
            
            contarPrimos+=contarPrimos(aux.getIzq());
            contarPrimos+=contarPrimos(aux.getDer());
        }
        
        return contarPrimos;
    }
    
    
    
    
    public Integer divisionRaizMenor()
    {
    return raiz.getInfo()/hallarMenor();
    }
    
    
}
