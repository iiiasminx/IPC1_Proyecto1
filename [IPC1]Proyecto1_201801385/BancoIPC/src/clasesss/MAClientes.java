
package clasesss;


import bancoipc.AdminMA;
import bancoipc.Ventana;
import bancoipc.BancoIPC;
import static bancoipc.BancoIPC.acajeros;
import static bancoipc.BancoIPC.aclientes;
import static bancoipc.BancoIPC.acuentasa;
import static bancoipc.BancoIPC.acuentasm;


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
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class MAClientes extends Ventana{
    
    JPanel panelli;
    JLabel lsaludo;
    JTextField lid, lnombre, ldireccion, ltelefono, lcahorro;
    JTextField lcmonetaria, lprestamo, ltarjeta, lefectivo;
    JComboBox lista;
    JButton editar, nuevo, aplicar, regresar;
    public int posicion, total;
    public MAClientes() {
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        
        panelli = new JPanel();
       this.getContentPane().add(panelli);
//       panelli.setLayout(new BoxLayout(panelli, BoxLayout.Y_AXIS));
       panelli.setLayout(null);
       panelli.setBackground(Color.pink);
        
        lsaludo = new JLabel("Clientes");
        lsaludo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lsaludo.setBounds(250, 20, 100, 35);
       lsaludo.setFont(new Font("garamond", 0, 30));
       panelli.add(lsaludo);
       
           
        lista = new JComboBox(BancoIPC.aclientes);
        lista.setBounds(200, 60, 230, 30);
        lista.setBackground(Color.white);
        lista.setSelectedItem(null);
        panelli.add(lista);
        
                    ActionListener actionListener;
        actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
                int posicion;
                posicion = lista.getSelectedIndex();
                
                lid.setText(String.valueOf(aclientes[posicion].id));
                lnombre.setText(String.valueOf(aclientes[posicion].nombre));
                ldireccion.setText(String.valueOf(aclientes[posicion].direccion));
                ltelefono.setText(String.valueOf(aclientes[posicion].telefono));
                
                
                lprestamo.setText(String.valueOf(aclientes[posicion].id_prestamos));
                ltarjeta.setText(String.valueOf(aclientes[posicion].id_tarjetas));
                
                // Suma de efectivo completo
                
                int mon =  acuentasm[posicion].montoi;
                int ahorro = acuentasa[posicion].monto_inicial;
                
                total = mon + ahorro;
                
                lefectivo.setText(String.valueOf(total));
                
                
                
                // fin suma
                
                lcmonetaria.setText(String.valueOf(acuentasm[posicion].numero));
                lcahorro.setText(String.valueOf(acuentasa[posicion].numero));
            }
        };
                     lista.addActionListener(actionListener);
        
     //    mete las cosas al panel o se muere un perrito -.-    
     //   JLabel lid, lnombre, lapellido, ldireccion, ltelefono;
        
        lid = new JTextField();
        lid.setEditable(false);
        
        lnombre = new JTextField();
        lnombre.setEditable(false);
        ldireccion = new JTextField();
        ldireccion.setEditable(false);
        ltelefono = new JTextField();
        ltelefono.setEditable(false);
        lcahorro = new JTextField();
        lcahorro.setEditable(false);
        lcmonetaria = new JTextField();
        lcmonetaria.setEditable(false);
        lprestamo = new JTextField();
        lprestamo.setEditable(false);
        ltarjeta = new JTextField();
        ltarjeta.setEditable(false);
        lefectivo = new JTextField();
        lefectivo.setEditable(false);
                      
        
        
        JLabel tid = new JLabel("Id");
        JLabel tnombre = new JLabel("Nombre");
        JLabel tdireccion = new JLabel("Dirección");
        JLabel telefono = new JLabel("Telefono");
        JLabel cahorro = new JLabel("# C. Ahorro");
        JLabel cmonetaria = new JLabel("# C. Monet.");
        JLabel prestamo = new JLabel("Préstamo");
        JLabel tarjeta = new JLabel("M. Tarjeta");
        JLabel transacciones = new JLabel("Efectivo");
        
        tid.setBounds(30, 120, 70, 30);
        tnombre.setBounds(30, 180, 70, 30);
        cahorro.setBounds(30, 240, 70, 30);
        prestamo.setBounds(30, 300, 70, 30);
        transacciones.setBounds(30, 360, 94, 30);
        
        tdireccion.setBounds(290, 120, 70, 30);
        telefono.setBounds(290, 180, 70, 30);
        cmonetaria.setBounds(290, 240, 70, 30);
        tarjeta.setBounds(290, 300, 70, 30);
                
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
        
        
        lid.setBounds(120, 120, 150, 30);
        lnombre.setBounds(120, 180, 150, 30);
        lcahorro.setBounds(120, 240, 150, 30);
        lprestamo.setBounds(120, 300, 150, 30);
        lefectivo.setBounds(120, 360, 150, 30);
        
        
        
        ldireccion.setBounds(370, 120, 150, 30);
        ltelefono.setBounds(370, 180, 150, 30);
        lcmonetaria.setBounds(370, 240, 150, 30);
        ltarjeta.setBounds(370, 300, 150, 30);
       
        
        
        panelli.add(lid);
        panelli.add(lnombre);
        panelli.add(ldireccion);
        panelli.add(ltelefono);
        panelli.add(lcahorro);
        panelli.add(lcmonetaria);
        panelli.add(lprestamo);
        panelli.add(ltarjeta);
        panelli.add(lefectivo);
        
        
        
        panelli.add(tid);
        panelli.add(tnombre);
        panelli.add(tdireccion);
        panelli.add(telefono);
        panelli.add(cahorro);
        panelli.add(prestamo);
        panelli.add(cmonetaria);
        panelli.add(tarjeta);
        panelli.add(transacciones);
        
        
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
//        lcahorro.setEditable(true);
//        lcmonetaria.setEditable(true);
//        lprestamo.setEditable(true);
//        ltarjeta.setEditable(true);
//        ltransacciones.setEditable(true);   
        
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
                
                int cahorro = Integer.parseInt(lcahorro.getText());
                int cmonetaria = Integer.parseInt(lcmonetaria.getText());
                int prestamo = Integer.parseInt(lprestamo.getText());
                int tarjeta = Integer.parseInt(ltarjeta.getText());
                
                int sumacuenta = cahorro + cmonetaria;
                
                int sumadinero = Integer.parseInt(lefectivo.getText());
                int sumadeudas = prestamo + tarjeta;
                
                
                
                
                MisClientes auxiliar = new MisClientes((posicion+1), cahorro, cmonetaria,
                        sumacuenta, sumadinero, lnombre.getText(),   
                        ldireccion.getText() ,ltelefono.getText(),
                         prestamo, tarjeta, sumadeudas);

                
                
                BancoIPC.aclientes[posicion] = auxiliar;
                
//                                
                JOptionPane.showMessageDialog(null, "Tus cambios han sido guardados! :D");
                
                lnombre.setEditable(false);        
                ldireccion.setEditable(false);        
                ltelefono.setEditable(false);
                
            }
        };
        
        
        aplicar.addActionListener(oyente);
        
        

    
    }
    

    
   private void eventoRegresar() {
        
         ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                // aquí escribo todo lo que tiene que pasar con el botón
                
                AdminMA holi = new AdminMA();
                holi.setVisible(true);
                dispose();
                
            }
        };
        
        regresar.addActionListener(oyente);
    }
}
