
package clasesss;


public class Contador {
    
    private static int contando = 0;

    public Contador() {
    }

    public static int getContando() {
        return contando++;
    }

    public static void setContando(int contando) {
        Contador.contando = contando;
    }
    
    
}

