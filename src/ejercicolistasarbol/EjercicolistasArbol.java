/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicolistasarbol;

import javax.swing.JOptionPane;

/**
 *
 * @author wadeManuel
 */
public class EjercicolistasArbol {

   
    public static void main(String[] args) {
        
        Lista lista=new Lista();
        lista.agregarFinal(20);
        lista.agregarFinal(-140);
        lista.agregarFinal(-330);
        lista.agregarFinal(450);
        lista.agregarFinal(30);
        lista.agregarFinal(-90);
        lista.agregarFinal(290);
        lista.agregarFinal(30);
        lista.agregarFinal(490);
        lista.mostrarLista();
        
        System.out.println("\n La suma de los positivos es :"+lista.sumarPositivo());
          System.out.println("\n La suma de los negativo es :"+lista.sumarNegativos());
          Integer R = lista.sumarPositivo()/lista.sumarNegativos();
        System.out.println("\n La division entre sumaPositivo y sumaNegativa es :"+R);
        
        
        ABB arbol=new ABB();
        arbol.Insertar(13);
        arbol.Insertar(11);
        arbol.Insertar(17);
        arbol.Insertar(23);
        arbol.Insertar(29);
        arbol.Insertar(31);
        arbol.Insertar(37);
        arbol.Insertar(-140);
        arbol.Insertar(-330);
        arbol.Insertar(450);
        arbol.Insertar(-90);
        arbol.Insertar(290);
        arbol.Insertar(30);
        arbol.Insertar(490);
        arbol.dispararPreorden();
        
        System.out.println("\nEl menor valor del arbol es :"+arbol.hallarMenor());
        
        System.out.println("\n La divison entre el valor del arbol y el menor es :"+arbol.divisionRaizMenor());
        
        if(R >= arbol.divisionRaizMenor())
        {
            System.out.println("\n  R Es mayor a la divison del valor de la raiz entre el menor");
        }else
        {
            System.out.println("\n R Es menor a la division del valor de la raiz entre el menor");
        }
        
        if(R==arbol.divisionRaizMenor())
            {
            System.out.println("\n R Es igual a la division del valor de la raiz entre el menor");
            }
        
       System.out.println("\n La  cantidad de primos del arbol son : "+arbol.contarPrimos());
      
      
    }
    
}
