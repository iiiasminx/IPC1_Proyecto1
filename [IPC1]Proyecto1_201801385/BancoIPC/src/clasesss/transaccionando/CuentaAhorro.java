
package clasesss.transaccionando;


public class CuentaAhorro {
    
    public int id, numero, monto_inicial, monto_actual;
    public String cliente, fecha;

    public CuentaAhorro(int id, int numero, int monto_inicial, String cliente, String fecha) {
        this.id = id;
        this.numero = numero;
        this.monto_inicial = monto_inicial;
        this.cliente = cliente;
        this.fecha = fecha;
        this.monto_actual = monto_actual;
        
        monto_actual = monto_inicial; 
    }

      

    @Override
    public String toString() {
        return  id + " " + cliente ;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getMonto_inicial() {
        return monto_inicial;
    }

    public void setMonto_inicial(int monto_inicial) {
        this.monto_inicial = monto_inicial;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
