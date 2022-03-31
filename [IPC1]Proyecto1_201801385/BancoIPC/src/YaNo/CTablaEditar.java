
package YaNo;

import clasesss.MisClientes;
import javax.swing.table.*;
import javax.swing.table.AbstractTableModel;


public class CTablaEditar extends AbstractTableModel{
    
    private MisClientes[] lista;
    
    private final String[] columnas = new String[]{"Id.", "Nombre", "Apellido", 
        "Direccion", "Teléfono", "Id. Ahorro", "Id. Monetarias",
        "Id. Prestamos", "Id. Tarjetas", "# Transacciones"};

    public CTablaEditar(MisClientes[] lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
       
    
    @Override
    public int getRowCount() {
        
        return this.lista.length;        
    }

    @Override
    public int getColumnCount() {
        
        return this.columnas.length;
    }

    @Override 
    public String getColumnName(int columnIndex) {
            return this.columnas[columnIndex];
    }
      
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        String que_columna = "";
        
        
        MisClientes misclientes = this.lista[rowIndex];
        
        if(misclientes != null){
            switch(columnIndex){
                case 0:
                    que_columna = String.valueOf(rowIndex+1);
                    break;
                case 1:
                    que_columna = misclientes.getNombre();
                    break;
                case 2:
                    que_columna = misclientes.getDireccion();
                    break;
                case 3:
                    que_columna = misclientes.getTelefono();
                    break;
                case 4:
//                    que_columna = misclientes.getId_cahorro();
                    break;
                case 5:
//                    que_columna = misclientes.getId_cmonetaria();
                    break;
//                case 6:
//                    que_columna = misclientes.getId_prestamos();
//                    break;
//                case 7:
//                    que_columna = misclientes.getId_tarjetas();
//                    break;
                   
            }
        
        }
        return que_columna;
}
}
 
//                case 5:
//                    quee_columna = misclientes.getNum_cahorro();
//                    break;
//                case 6:
//                    quee_columna = misclientes.getId_cahorro();
//                    break;    
//                case 7:
//                    quee_columna = misclientes.getNum_cmonetarias();
//                    break;    
//                case 8:
//                    quee_columna = misclientes.getId_cmonetaria();
//                    break;
//                case 9:
//                    quee_columna = misclientes.getNum_prestamos();
//                    break;    
//                case 10:
//                    quee_columna = misclientes.getId_prestamos();
//                    break;    
//                case 11:
//                    quee_columna = misclientes.getNum_tarjetas();
//                    break;   
//                case 12:
//                    quee_columna = misclientes.getId_tarjetas();
//                    break;
//                case 13:
//                    quee_columna = misclientes.getNum_transacciones();
//                    break; 