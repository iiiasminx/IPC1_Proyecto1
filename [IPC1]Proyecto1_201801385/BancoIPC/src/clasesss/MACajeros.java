
package clasesss;

import bancoipc.AdminMA;
import bancoipc.Ventana;
import bancoipc.BancoIPC;
import static bancoipc.BancoIPC.aagencias;
import static bancoipc.BancoIPC.acajeros;



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


public class MACajeros extends Ventana{
    
   JPanel panelli;
    JLabel lsaludo;
    JTextField lid, lefectivo, ldireccion, ltransacciones, lestado;
    JComboBox lista, estado;
    JButton editar, nuevo, aplicar, regresar;
    int posicion, aux; 
    String sestado;
    
    public MACajeros() {
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        
        panelli = new JPanel();
       this.getContentPane().add(panelli);
//       panelli.setLayout(new BoxLayout(panelli, BoxLayout.Y_AXIS));
       panelli.setLayout(null);
       panelli.setBackground(Color.pink);
        
        lsaludo = new JLabel("Cajeros");
        lsaludo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lsaludo.setBounds(250, 20, 100, 35);
       lsaludo.setFont(new Font("garamond", 0, 20));
       panelli.add(lsaludo);
       
       
       
       // COMBOBOX
       
       String[] estados = {"Activo", "Inactivo"};
       
       estado = new JComboBox(estados);
       estado.setBounds(370, 180, 150, 30);
       //(370, 120, 150, 30);
       estado.setBackground(Color.white);
       estado.setSelectedItem(null);
       panelli.add(estado);
       
       // LISTA ES EL NOMBRE DEL COMBOBOX QUE ME TIRA LAS AGENCIAS
        lista = new JComboBox(BancoIPC.acajeros);
        lista.setBounds(200, 60, 230, 30);
        lista.setBackground(Color.white);
        lista.setSelectedItem(null);
        panelli.add(lista);
        
                    ActionListener actionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        
        int posicion;
        posicion = lista.getSelectedIndex();
        
       lid.setText(String.valueOf(acajeros[posicion].id));
       lefectivo.setText(String.valueOf(acajeros[posicion].efectivo));
       ldireccion.setText(String.valueOf(acajeros[posicion].direccion));
       lestado.setText(String.valueOf(acajeros[posicion].estado));
       ltransacciones.setText(String.valueOf(acajeros[posicion].num_transacciones));
       }
    };
                     lista.addActionListener(actionListener);
        
     //    mete las cosas al panel o se muere un perrito -.-    
     //   JLabel lid, lnombre, lapellido, ldireccion, ltelefono;
        
        lid = new JTextField();
        lefectivo = new JTextField();
        ldireccion = new JTextField();
        ltransacciones = new JTextField();
        lestado = new JTextField();
        
        
        
        JLabel tid = new JLabel("Id");
        JLabel tdireccion = new JLabel("Dirección");
        JLabel testado = new JLabel("Estado");
        JLabel efectivo = new JLabel("Efectivo Q. ");
        JLabel transacciones = new JLabel("Transacciones");
        
        tid.setBounds(30, 120, 70, 30);
        tdireccion.setBounds(30, 180, 70, 30);
        transacciones.setBounds(30, 240, 70, 30);
        
        testado.setBounds(290, 120, 70, 30);
        efectivo.setBounds(290, 240, 70, 30);
        
        
        lid.setBounds(120, 120, 150, 30);
        ldireccion.setBounds(120, 180, 150, 30);
        ltransacciones.setBounds(120, 240, 150, 30);
        lestado.setBounds(370, 120, 150, 30);          
        lefectivo.setBounds(370, 240, 150, 30);
        
        
        
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
       panelli.add(ltransacciones);
        panelli.add(ldireccion);
        panelli.add(lefectivo);
        panelli.add(lestado);
        
        panelli.add(tid);
        panelli.add(testado);
        panelli.add(tdireccion);
        panelli.add(transacciones);
        panelli.add(efectivo);
        
        lid.setEditable(false); 
        lestado.setEditable(false); 
        ltransacciones.setEditable(false);        
        ldireccion.setEditable(false);
        lefectivo.setEditable(false);
        estado.setEnabled(false);
        
        eventoAgregar();
       eventoEditar();
       eventoOk();
       eventoRegresar();       
       
    }
    
     private void eventoAgregar() {
        
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                                
        if (ldireccion.getText().equals("")) {
            
          
        ldireccion.setEditable(true);        
        estado.setEnabled(true);
        lefectivo.setEditable(true);
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
                                
        if (ldireccion.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "No puedes editar esto :'c");
        } else {
            
        ldireccion.setEditable(true);        
        estado.setEnabled(true);
        lefectivo.setEditable(true);
        lefectivo.setEditable(true);
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
                
                eventoEstado();
                
                int posicion;
                
                posicion = lista.getSelectedIndex();
                
                
                MisCajeros auxiliar = new MisCajeros((posicion+1), ldireccion.getText(),
                        lefectivo.getText(),sestado, ltransacciones.getText() );

                
                
                BancoIPC.acajeros[posicion] = auxiliar;
                
//                                
                JOptionPane.showMessageDialog(null, "Tus cambios han sido guardados! :D");
                
               ldireccion.setEditable(false);        
            estado.setEnabled(false);
            lefectivo.setEditable(false);
            lefectivo.setEditable(false);;

            }
        };
        
        
        aplicar.addActionListener(oyente);
        
        

    
    }
    
    private void eventoEstado(){
        
             
       aux = estado.getSelectedIndex();
       
        if (aux == 0) {
            
            sestado = "Activo";
        } else if (aux == 1) {
            
            sestado = "Inactivo";
        } else {
            JOptionPane.showMessageDialog(null, "Por favor escoge el estado del cajero D:");
        }
       
       
       
                
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
