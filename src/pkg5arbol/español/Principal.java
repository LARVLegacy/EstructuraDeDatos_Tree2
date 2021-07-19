
package pkg5arbol.español;

public class Principal {

    public static void main(String[] args) {
        
         Arbol arbol = new Arbol();
         
         
         int n=2, num, den, puesto;
         for(int i=0; i<=n; i++){
             puesto= (int)(Math.random()*500);
             num= (int) (Math.random()*500);
             den= (int) (Math.random()*500);
             Fraccion f = new Fraccion(num, den);
             
             arbol.insertar(puesto,f);
         }
         System.out.println("Todos los elementos son");
         arbol.recorrer(arbol.raiz);
         System.out.println("Lado izquierdo");
         arbol.recorrer(arbol.raiz.izquierda);
         System.out.println("Lado derecho");
         arbol.recorrer(arbol.raiz.derecha);
         
         
         
    
         
    }
}