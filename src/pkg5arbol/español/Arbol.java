
package pkg5arbol.español;

public class Arbol {
    
    Nodo raiz;

    public Arbol(){
        raiz=null;
    }
    
    public void insertar(int i, Fraccion fraccion){
        Nodo n= new Nodo(i);
        n.contenido = fraccion;
        
        if(raiz==null){
            raiz=n;
        }else{
            Nodo aux = raiz;
            while(aux!=null){
                n.padre=aux;
                if(n.llave>= aux.llave){
                    aux=aux.derecha;
                }else{
                    aux=aux.izquierda;
                }
            }
            
            if(n.llave<n.padre.llave){
                n.padre.izquierda = n;
            }else{
                n.padre.derecha=n;
            }
        }
    }
    
    public void recorrer (Nodo n){
        if(n != null){
            recorrer(n.izquierda);
            System.out.println("Indice "+n.llave+" x "+n.contenido);
            recorrer(n.derecha);
        }
    }
    
}
