
package YaNO;

import bancoipc.LogInn;
import bancoipc.Ventana;
import YaNo.CTablaEditar;
import clasesss.Contador;
import clasesss.MisClientes;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.SwingConstants;


public class ClientesMA extends Ventana implements ActionListener{
    
    private MisClientes[] lista;
    JLabel saludo;
    JPanel funcionaxfa = new JPanel();
    JMenuBar menu;
    JMenu opciones, regresar;
    JMenuItem buscar, editar, eliminar, regreesar;
    
    
    public ClientesMA(){
  
           iniciarComponentes();
           
    }
//
    private void iniciarComponentes() {
//        
                
        saludo = new JLabel("Clientes");
        saludo.setAlignmentX(Component.CENTER_ALIGNMENT);
        saludo.setBounds(250, 20, 100, 35);
       saludo.setFont(new Font("garamond", 0, 20));
       
       // JMenuuuuu 
       
       
       menu=new JMenuBar();
        setJMenuBar(menu);
        
        opciones=new JMenu("Opciones");
        regresar = new JMenu("Regresar");
        menu.add(opciones);
        menu.add(regresar);
        
        editar = new JMenuItem("Editar");
        editar.addActionListener(this);
        eliminar = new JMenuItem("Eliminar");
        eliminar.addActionListener(this);
        buscar = new JMenuItem("Buscar");
        buscar.addActionListener(this);
        regreesar = new JMenuItem("Regresar");
        regreesar.addActionListener(this);
        
        opciones.add(editar);
        opciones.add(buscar);
        opciones.add(eliminar);
        regresar.add(regreesar);
        
          // LA TABLITAAA
//        
        final JTable tabla = new JTable();
        tabla.setLayout(null);
        tabla.setBounds(new Rectangle(500,400)); 
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        
        JScrollPane deslizador  = new JScrollPane(tabla, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        
        lista = new MisClientes[100];
//        lista[Contador.getContando()] = new MisClientes(1, "Ana Bolena", "Londres, Inglaterra","21324567", "-", "1bBDE", "-", "1dBDE");
//        lista[Contador.getContando()] = new MisClientes(2, "Juana de Castilla", "Castilla, España","13242435", "1aBDE", "-", "1cBDE", "-");
//        lista[Contador.getContando()] = new MisClientes(3, "Gustavo Béquer", "Aragón, España","10293847", "-", "2bBDE", "-", "-");
//        lista[Contador.getContando()] = new MisClientes(4, "Mariana de Braganza",  "Lisboa, Portugal","12093498", "2aBDE", "3bBDE", "-", "2dBDE");
//        lista[Contador.getContando()] = new MisClientes(5, "Jane Austen",  "Londres, Inglaterra","1230982", "12ws", "-", "-", "-");
//        lista[Contador.getContando()] = new MisClientes(6, "Mario Benedetti",  "Montevideo, Uruguay","12903489", "-", "dw12e", "-", "21ee");
//        lista[Contador.getContando()] = new MisClientes(7, "Julio Verne", "Paris, Francia","13452676", "1eqw", "-", "-", "-");
//        lista[Contador.getContando()] = new MisClientes(8, "Víctor Hugo",  "Paris, Francia","12345678", "-", "21e12", "1e2e", "-");
//        lista[Contador.getContando()] = new MisClientes(9, "Julio César",  "Roma, Italia","87654321", "34eew3", "3tf43", "-", "3wr4e");
//        lista[Contador.getContando()] = new MisClientes(10, "Miguel Asturias",  "Guatemala, Guatemala","19898787", "3r4w3", "-", "-", "3r4e");
//        tabla.setModel(new CTablaEditar(lista));
   
      
        
        funcionaxfa.setBackground(Color.pink);
        funcionaxfa.setLayout(new BoxLayout(funcionaxfa, BoxLayout.PAGE_AXIS));
        funcionaxfa.add(saludo);
        funcionaxfa.add(deslizador);
        
        this.getContentPane().add(funcionaxfa);


        Dimension tamaño = new Dimension();
        tamaño.height =     (tabla.getRowCount()*tabla.getRowHeight())+
        tabla.getTableHeader().getPreferredSize().height;
        tamaño.width = tabla.getColumnModel().getTotalColumnWidth();
        deslizador.setMaximumSize(tamaño);
        
        
        
    }
    
    private void cerrarFila(){
        int contador = 0;
        MisClientes[] vv = new MisClientes[lista.length];
        for(int i = 0; i < lista.length; i++){
            MisClientes cliente = lista[i];
            if(cliente != null){
                vv[contador] = cliente;
                contador++;
            }
        }
        Contador.setContando(contador);
        System.arraycopy(vv, 0, lista, 0, lista.length);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buscar) {
            setSize(640,480);
        }
        if (e.getSource()==editar) {
            setSize(1024,768);
        }
        if (e.getSource()==eliminar) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==regreesar) {
            LogInn l2 = new LogInn();
            l2.setVisible(true);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
}
