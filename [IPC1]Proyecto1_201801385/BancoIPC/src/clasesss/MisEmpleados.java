
package clasesss;


public class MisEmpleados {
    
    int id;
    String nombre, area, subarea;

    public MisEmpleados(int id, String nombre, String area, String subarea) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.subarea = subarea;
    }

    

    @Override
    public String toString() {
        return  id + " " + nombre;
    }
    
   
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }


    
    
}
