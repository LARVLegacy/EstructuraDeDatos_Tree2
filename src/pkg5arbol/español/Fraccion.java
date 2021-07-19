
package pkg5arbol.español;

public class Fraccion {
     
    private int num;
    private int den;

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
   
    public double resto(int num,int den){
        double resto = num%den;
        if (resto==0){
            System.out.println(num + " es múltiplo de " + den);
            return resto;
        }else
            System.out.println(num + " NO es múltiplo de " + den);
            return resto;
        
    }

    public static boolean esMultiplo(int n1,int n2){
        if (n1%n2==0)
		return true;
	else
		return false;
    }
    
     @Override
    public String toString() {
        return "Fraccion{" + "num=" + num + ", den=" + den + '}';
    }
}
