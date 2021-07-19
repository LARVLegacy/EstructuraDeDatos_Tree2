/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5arbol.español;

public class Nodo{
     
    public Nodo padre;
    public Nodo derecha;
    public Nodo izquierda;
    public int llave;
    public Object contenido;
       
    public Nodo(int indice){
        llave=indice;
        derecha=null;
        izquierda=null;
        padre=null;
        contenido=null;
    }
        
 }