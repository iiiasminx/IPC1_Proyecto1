
package clasesss.transaccionando;


public class CuentaMonetaria {
    
    public int id, numero, montoi, montoa;
    public String cliente, fecha;

    public CuentaMonetaria(int id, int numero, int montoi, String cliente, String fecha) {
        this.id = id;
        this.numero = numero;
        this.montoi = montoi;
        this.cliente = cliente;
        this.fecha = fecha;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMonto() {
        return montoi;
    }

    public void setMonto(int monto) {
        this.montoi = monto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMontoi() {
        return montoi;
    }

    public void setMontoi(int montoi) {
        this.montoi = montoi;
    }

    public int getMontoa() {
        return montoa;
    }

    public void setMontoa(int montoa) {
        this.montoa = montoa;
    }
    
    
    
}
