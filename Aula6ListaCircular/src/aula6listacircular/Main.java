/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6listacircular;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
        lista.adicionar(5);
        lista.adicionar(10);
        lista.adicionar(15);
        
         Nodo cursorInicial = lista.getCursor();
        
        do{
           lista.proximo();
           System.out.print(lista.getCursor().getDado() + " ");
         
        }while(cursorInicial != lista.getCursor());
    }
    
}
