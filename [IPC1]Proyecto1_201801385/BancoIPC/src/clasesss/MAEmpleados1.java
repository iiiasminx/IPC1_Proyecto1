
package clasesss;

import bancoipc.AdminMA;
import bancoipc.Ventana;
import bancoipc.BancoIPC;
import static bancoipc.BancoIPC.aempleados;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class MAEmpleados1 extends Ventana{
    
   JPanel panelli;
    JLabel lsaludo;
    JTextField lid, lnombre, larea, lsubarea;
    JComboBox lista, area;
    JButton editar, nuevo, aplicar, regresar;
    int posicion, aux; 
    String sarea;
    
    public MAEmpleados1() {
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        
        panelli = new JPanel();
       this.getContentPane().add(panelli);
//       panelli.setLayout(new BoxLayout(panelli, BoxLayout.Y_AXIS));
       panelli.setLayout(null);
       panelli.setBackground(Color.pink);
        
        lsaludo = new JLabel("Empleados");
        lsaludo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lsaludo.setBounds(250, 20, 100, 35);
       lsaludo.setFont(new Font("garamond", 0, 20));
       panelli.add(lsaludo);
       
       // LISTA ES EL NOMBRE DEL COMBOBOX QUE ME TIRA LAS AGENCIAS
        lista = new JComboBox(BancoIPC.aempleados);
        lista.setBounds(200, 60, 230, 30);
        lista.setBackground(Color.white);
        lista.setSelectedItem(null);
        panelli.add(lista);
        
        ActionListener actionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        
        int posicion;
        posicion = lista.getSelectedIndex();
        
       lid.setText(String.valueOf(aempleados[posicion].id));
       lnombre.setText(String.valueOf(aempleados[posicion].nombre));
       larea.setText(String.valueOf(aempleados[posicion].area));
       lsubarea.setText(String.valueOf(aempleados[posicion].subarea));
       }
    };
                     lista.addActionListener(actionListener);
        
     //    mete las cosas al panel o se muere un perrito -.-    
     //   JLabel lid, lnombre, lapellido, ldireccion, ltelefono;
        
        lid = new JTextField();
        lnombre = new JTextField();
        larea = new JTextField();
        lsubarea = new JTextField();
        
        JLabel tid = new JLabel("Id");
        JLabel tnombre = new JLabel("Nombre");
        JLabel tarea = new JLabel("Area");
        JLabel tsubaera = new JLabel("Sub Área");
                
        tid.setBounds(30, 120, 70, 30);
        tnombre.setBounds(30, 180, 70, 30);
                
        tarea.setBounds(290, 120, 70, 30);
        tsubaera.setBounds(290, 240, 70, 30);
        
        
        lid.setBounds(120, 120, 150, 30);
        lnombre.setBounds(120, 180, 150, 30);
        
                
        larea.setBounds(370, 120, 150, 30);
        lsubarea.setBounds(370, 240, 150, 30);
        
          regresar = new JButton("Regresar");
        regresar.setBounds(10, 10, 100, 30);
        panelli.add(regresar);
        
        aplicar = new JButton("Ok");
        nuevo = new JButton("Agregar");
        editar = new JButton("Editar");
        
        nuevo.setBounds(290, 360, 85, 30);
        editar.setBounds(380, 360, 85, 30);
        aplicar.setBounds(470, 360, 70, 30);
        
        panelli.add(editar);
        panelli.add(nuevo);
        panelli.add(aplicar);
                
        
        panelli.add(lid);
       panelli.add(lnombre);
       panelli.add(larea);
        panelli.add(lsubarea);
        
        String[] saarea = {"Agencia", "Autobanco", "Call Center", "Oficinas Centrales"};
       area = new JComboBox(saarea);
        area.setBounds(370, 180, 150, 30);
        area.setBackground(Color.white);
        area.setSelectedItem(null);
        panelli.add(area);
        
         lid.setEditable(false); 
         larea.setEditable(false);        
        
         
        lnombre.setEditable(false); 
        lsubarea.setEditable(false);
        area.setEnabled(false);
        
        panelli.add(tid);
        panelli.add(tnombre);
        panelli.add(tarea);
        panelli.add(tsubaera);
    
        eventoAgregar();
       eventoEditar();
       eventoOk();
       eventoRegresar(); 
    }
    
    private void eventoAgregar() {
        
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                                
        if (lnombre.getText().equals("")) {
            
          
        lnombre.setEditable(true);        
        lsubarea.setEditable(true);
        area.setEnabled(true);
        
        } else {
            
            JOptionPane.showMessageDialog(null, "Ya hay un cliente aquí :'c");
                   
        
        }  
            }
        };

        
        nuevo.addActionListener(oyente);
        
    
    }
    
    private void eventoEditar() {
        
        
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                                
        if (lnombre.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "No puedes editar esto :'c");
        } else {
            
        lnombre.setEditable(true);        
        lsubarea.setEditable(true);
        area.setEnabled(true);
//        lefectivo.setEditable(true);
           
        
        }  
            }
        };

        
        editar.addActionListener(oyente);
        
        
        
    }
    
     private void eventoOk() {
        
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                eventoArea();
                
                int posicion;
                
                posicion = lista.getSelectedIndex();
                
                
                MisEmpleados auxiliar = new MisEmpleados((posicion+1), lnombre.getText(),
                        sarea, lsubarea.getText() );

                
                
                BancoIPC.aempleados[posicion] = auxiliar;
                
//                                
                JOptionPane.showMessageDialog(null, "Tus cambios han sido guardados! :D");
                
               lnombre.setEditable(false); 
                lsubarea.setEditable(false);
                area.setEnabled(false);

            }
        };
        
        
        aplicar.addActionListener(oyente);
        
        

    
    }
     
     private void eventoRegresar() {
        
         ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                AdminMA holi = new AdminMA();
                holi.setVisible(true);
                dispose();
                
            }
        };
        
        regresar.addActionListener(oyente);
    }
     
     private void eventoArea(){
        
         aux = area.getSelectedIndex();
       
        if (aux == 0) {
            
            sarea = "Agencia";
        } else if (aux == 1) {
            
            sarea = "Autobanco";
        } else if (aux == 2) {
             
            sarea = "Call Center";
         } else if (aux == 3) {
             
             sarea = "Oficinas Centrales";
         }
        
        else {
            JOptionPane.showMessageDialog(null, "Por favor escoge el estado del cajero D:");
        }
       
         
     }
    
}
