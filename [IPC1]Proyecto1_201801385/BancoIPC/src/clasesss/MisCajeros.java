
package clasesss;

public class MisCajeros {
    
    public int id;
    public String direccion, efectivo, estado, num_transacciones;

    public MisCajeros(int id, String direccion, String efectivo, String estado, String num_transacciones) {
        this.id = id;
        this.direccion = direccion;
        this.efectivo = efectivo;
        this.estado = estado;
        this.num_transacciones = num_transacciones;
    }

    @Override
    public String toString() {
        return  id + " " + direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNum_transacciones() {
        return num_transacciones;
    }

    public void setNum_transacciones(String num_transacciones) {
        this.num_transacciones = num_transacciones;
    }
    
    
    
    
    
}
