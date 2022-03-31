
package clasesss;

import bancoipc.AdminMA;
import bancoipc.Ventana;
import bancoipc.BancoIPC;
import static bancoipc.BancoIPC.aagencias;
import static bancoipc.BancoIPC.aclientes;


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


public class MAAgencias extends Ventana{
    
   JPanel panelli;
    JLabel lsaludo;
    JTextField lid, lnombre, ldireccion, ltelefono, lnum_cajas, lnum_escritorios, lefectivo;
    JComboBox lista;
    JButton editar, nuevo, aplicar, regresar;
    int posicion; 
    
    public MAAgencias() {
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        
        panelli = new JPanel();
       this.getContentPane().add(panelli);
//       panelli.setLayout(new BoxLayout(panelli, BoxLayout.Y_AXIS));
       panelli.setLayout(null);
       panelli.setBackground(Color.pink);
        
        lsaludo = new JLabel("Agencias");
        lsaludo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lsaludo.setBounds(250, 20, 100, 35);
       lsaludo.setFont(new Font("garamond", 0, 20));
       panelli.add(lsaludo);
       
           
       // LISTA ES EL NOMBRE DEL COMBOBOX QUE ME TIRA LAS AGENCIAS
        lista = new JComboBox(BancoIPC.aagencias);
        lista.setBounds(200, 60, 230, 30);
        lista.setBackground(Color.white);
        lista.setSelectedItem(null);
        panelli.add(lista);
        
                    ActionListener actionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        
        int posicion;
        posicion = lista.getSelectedIndex();
        
       lid.setText(String.valueOf(aagencias[posicion].id));
       lnombre.setText(String.valueOf(aagencias[posicion].nombre));
       ldireccion.setText(String.valueOf(aagencias[posicion].direccion));
       ltelefono.setText(String.valueOf(aagencias[posicion].telefono));
       lnum_cajas.setText(String.valueOf(aagencias[posicion].num_cajas));
       lnum_escritorios.setText(String.valueOf(aagencias[posicion].num_escritorios));
       lefectivo.setText(String.valueOf(aagencias[posicion].efectivo));
      }
    };
                     lista.addActionListener(actionListener);
        
     //    mete las cosas al panel o se muere un perrito -.-    
     //   JLabel lid, lnombre, lapellido, ldireccion, ltelefono;
        
        lid = new JTextField();
        lnombre = new JTextField();
        ldireccion = new JTextField();
        ltelefono = new JTextField();
        lnum_cajas = new JTextField();
        lnum_escritorios = new JTextField();
        lefectivo = new JTextField();
        
        
        JLabel tid = new JLabel("Id");
        JLabel tnombre = new JLabel("Nombre");
        JLabel tdireccion = new JLabel("Dirección");
        JLabel telefono = new JLabel("Telefono");
        JLabel ncajas = new JLabel("Cajas");
        JLabel ndesks = new JLabel("Escritorios");
        JLabel efectivo = new JLabel("Efectivo Q.");
        
        tid.setBounds(30, 120, 70, 30);
        tnombre.setBounds(30, 180, 70, 30);
        ncajas.setBounds(30, 240, 70, 30);
        efectivo.setBounds(30, 300, 70, 30);
        
        
        tdireccion.setBounds(290, 120, 70, 30);
        telefono.setBounds(290, 180, 70, 30);
        ndesks.setBounds(290, 240, 70, 30);
        
        lid.setBounds(120, 120, 150, 30);
        lnombre.setBounds(120, 180, 150, 30);
        lnum_cajas.setBounds(120, 240, 150, 30);
        lefectivo.setBounds(120, 300, 150, 30);
        
        ldireccion.setBounds(370, 120, 150, 30);
        ltelefono.setBounds(370, 180, 150, 30);
        lnum_escritorios.setBounds(370, 240, 150, 30);
        
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
        panelli.add(ldireccion);
        panelli.add(ltelefono);
        panelli.add(lnum_cajas);
        panelli.add(lnum_escritorios);
        panelli.add(lefectivo);
        
        panelli.add(tid);
        panelli.add(tnombre);
        panelli.add(tdireccion);
        panelli.add(telefono);
        panelli.add(ncajas);
        panelli.add(ndesks);
        panelli.add(efectivo);
        
        lid.setEditable(false); 
        lnombre.setEditable(false);        
                ldireccion.setEditable(false);        
                ltelefono.setEditable(false);
                lnum_cajas.setEditable(false);
                lnum_escritorios.setEditable(false);
                lefectivo.setEditable(false);
        
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
        ldireccion.setEditable(true);        
        ltelefono.setEditable(true);
        lnum_cajas.setEditable(true);
        lnum_escritorios.setEditable(true);
        lefectivo.setEditable(true);
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
        ldireccion.setEditable(true);        
        ltelefono.setEditable(true);
        lnum_cajas.setEditable(true);
        lnum_escritorios.setEditable(true);
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
                
                
                int posicion;
                
                posicion = lista.getSelectedIndex();
                
                
                MisAgencias auxiliar = new MisAgencias((posicion+1), lnombre.getText(), 
                        ldireccion.getText() ,ltelefono.getText(),lnum_cajas.getText(),
                        lnum_escritorios.getText(), lefectivo.getText());

                
                
                BancoIPC.aagencias[posicion] = auxiliar;
                
//                                
                JOptionPane.showMessageDialog(null, "Tus cambios han sido guardados! :D");
                
                lnombre.setEditable(false);        
                ldireccion.setEditable(false);        
                ltelefono.setEditable(false);
                lnum_cajas.setEditable(false);
                lnum_escritorios.setEditable(false);
                lefectivo.setEditable(false);
                
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
}
