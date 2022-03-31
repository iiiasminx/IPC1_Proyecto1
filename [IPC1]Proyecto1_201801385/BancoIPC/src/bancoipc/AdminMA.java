
package bancoipc;

import YaNo.Inicio;
import clasesss.MAAgencias;
import clasesss.MAAutobanco;
import clasesss.MACajeros;
import clasesss.MAClientes;
import clasesss.MAEmpleados1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import javax.swing.*;

public class AdminMA extends Ventana{
    
    JPanel panel;
    JLabel saludo;
    JLabel instrucciones;
    JComboBox aquien;
    JButton magia, regresar;
    
     public AdminMA() {
        
        iniciarComponentes();
    }
    private void iniciarComponentes(){
       
       panel = new JPanel();
       this.getContentPane().add(panel);
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       panel.setBackground(Color.pink);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       saludo = new JLabel("Bienvenido al Módulo Administrativo");
       saludo.setAlignmentX(Component.CENTER_ALIGNMENT);
       saludo.setFont(new Font("garamond", 0, 20));
       panel.add(saludo);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       instrucciones = new JLabel("Por favor, escoge a donde quieres ir: ");
       instrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
       instrucciones.setFont(new Font("garamond", 0, 16));
       panel.add(instrucciones);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       String[] opciones = {"Clientes", "Agencias Bancarias", "Agenicas c/ autobanco", 
           "Cajeros", "Tarjetas de crédito", "Préstamos", "Empleados"};
       aquien = new JComboBox(opciones);
       aquien.setBackground(Color.white);
       aquien.setSelectedItem(null);
       aquien.setAlignmentX(Component.CENTER_ALIGNMENT);
       aquien.setPreferredSize(new Dimension(230, 30));
       aquien.setMaximumSize(new Dimension(300, 30));
       panel.add(aquien);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       magia = new JButton("Ir");
       magia.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(magia);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       regresar = new JButton("Regresar");
       regresar.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(regresar);
       
       eventoMagia();
       eventoRegresar();
   }

    private void eventoMagia() {
        ActionListener abracadabra = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String seleccion=(String)aquien.getSelectedItem();
                saludo.setText(seleccion);
               
                if (seleccion == "Clientes") {
                    
                    
                    MAClientes t1 = new MAClientes();
                    t1.setVisible(true);
//                    Inicio t1 = new Inicio();
//                    t1.setVisible(true);
                    dispose();
                    
                } 
                else if (seleccion == "Agencias Bancarias") {
                    
                    MAAgencias t1 = new MAAgencias();
                    t1.setVisible(true);
                    dispose();
                }
                else if (seleccion == "Agenicas c/ autobanco") {
                    
                    MAAutobanco t1 = new MAAutobanco();
                    t1.setVisible(true);
                    dispose();
                }
                else if (seleccion == "Cajeros") {
                    
                    MACajeros t1 = new MACajeros();
                    t1.setVisible(true);
                    dispose();
                }
                else if (seleccion == "Empleados") {
                    
                    MAEmpleados1 t1 = new MAEmpleados1();
                    t1.setVisible(true);
                    dispose();
                }
                else if (seleccion == "Tarjetas de crédito") {
                    
                    instrucciones.setText("Tarjetas de crédito");
                }
                else if (seleccion == "Préstamos") {
                    
                    instrucciones.setText("Préstamos");
                }
                else { 
                JOptionPane.showMessageDialog(null, "Algo malo ha ocurrido, por "
                        + "favor contacte al programador e intetelo más tarde :'c");
                }
               
            }
        };
        
        magia.addActionListener(abracadabra);
    }

    private void eventoRegresar() {
        
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                // aquí escribo todo lo que tiene que pasar con el botón
                
                LogInn holi = new LogInn();
                holi.setVisible(true);
                dispose();
                
            }
        };
        
        regresar.addActionListener(oyente);
    
    }
}


       
