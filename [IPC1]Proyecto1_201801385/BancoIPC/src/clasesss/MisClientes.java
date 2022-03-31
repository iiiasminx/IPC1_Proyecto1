package clasesss;


public class MisClientes {
    
    
    // VARIABLES QUE VAYAN EN EL CONSTRUCTOR
    
    // MIS CLIENTES
    public int id,id_cahorro, id_cmonetaria;
    public int sumacuenta, sumadinero;
    public String nombre, direccion, telefono, efectivo;
    public int id_prestamos, id_tarjetas, sumadeudas;

//    public MisClientes(int id, int id_cahorro, int id_cmonetaria, int sumacuenta, int sumadinero, String nombre, String direccion, String telefono, String id_prestamos, String id_tarjetas) {
//        
//              
//        this.id = id;
//        this.id_cahorro = id_cahorro;
//        this.id_cmonetaria = id_cmonetaria;
//        this.sumacuenta = sumacuenta;
//        this.sumadinero = sumadinero;
//        this.nombre = nombre;
//        this.direccion = direccion;
//        this.telefono = telefono;
//        this.id_prestamos = id_prestamos;
//        this.id_tarjetas = id_tarjetas;
//        
//        
//    }

    public MisClientes(int id, int id_cahorro, int id_cmonetaria, int sumacuenta, int sumadinero, String nombre, String direccion, String telefono, int id_prestamos, int id_tarjetas, int sumadeudas) {
        this.id = id;
        this.id_cahorro = id_cahorro;
        this.id_cmonetaria = id_cmonetaria;
        this.sumacuenta = sumacuenta;
        this.sumadinero = sumadinero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_prestamos = id_prestamos;
        this.id_tarjetas = id_tarjetas;
        this.sumadeudas = sumadeudas;
    }


    
    
    
    // Esto es lo que quiero que se muestre en el combobox

    @Override
    public String toString() {
        return  id + " " + nombre ;
    }

     
          
        
    // GET SET MIS CLIENTES

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cahorro() {
        return id_cahorro;
    }

    public void setId_cahorro(int id_cahorro) {
        this.id_cahorro = id_cahorro;
    }

    public int getId_cmonetaria() {
        return id_cmonetaria;
    }

    public void setId_cmonetaria(int id_cmonetaria) {
        this.id_cmonetaria = id_cmonetaria;
    }

    public int getSumacuenta() {
        return sumacuenta;
    }

    public void setSumacuenta(int sumacuenta) {
        this.sumacuenta = sumacuenta;
    }

    public int getSumadinero() {
        return sumadinero;
    }

    public void setSumadinero(int sumadinero) {
        this.sumadinero = sumadinero;
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

    public int getId_prestamos() {
        return id_prestamos;
    }

    public void setId_prestamos(int id_prestamos) {
        this.id_prestamos = id_prestamos;
    }

    public int getId_tarjetas() {
        return id_tarjetas;
    }

    public void setId_tarjetas(int id_tarjetas) {
        this.id_tarjetas = id_tarjetas;
    }



    
    


    
}
