
package clasesss;


public class MisAgencias {
    
    // nombre, id, direccion, tel, num cajas, num desks, efectivo
    
    public int id;
    public String nombre, direccion, telefono, num_cajas, num_escritorios, efectivo;
    
    // FALTA EFECTIVO

    public MisAgencias(int id, String nombre, String direccion, String telefono, String num_cajas, String num_escritorios, String efectivo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.num_cajas = num_cajas;
        this.num_escritorios = num_escritorios;
        this.efectivo = efectivo;
    }

    

   
    // Esto es lo que quiero que se muestre en el combobox
    @Override
    public String toString() {
        
        return   id + " " + nombre + "   " + telefono;
        
    }
    
       
    // GET SET MIS AGENCIAS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNum_cajas() {
        return num_cajas;
    }

    public void setNum_cajas(String num_cajas) {
        this.num_cajas = num_cajas;
    }

    public String getNum_escritorios() {
        return num_escritorios;
    }

    public void setNum_escritorios(String num_escritorios) {
        this.num_escritorios = num_escritorios;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }
    
    
    
    
    
}
