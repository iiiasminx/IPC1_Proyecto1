
package bancoipc;

import clasesss.MAClientes;
import clasesss.transaccionando.Agencia_Bancaria;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AdminMT extends Ventana{
    JPanel panel, panelagencia;
    JLabel saludo;
    JLabel instrucciones, adonde;
    JComboBox aquien, ruta;
    JButton magia, regresar;
    public static int posicioncliente;
    
    public AdminMT() {
       
         iniciarComponentes();
    }

    private void iniciarComponentes() {
        
        
        
       panel = new JPanel();
       this.getContentPane().add(panel);
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       panel.setBackground(Color.pink);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       saludo = new JLabel("Bienvenido al Módulo Transacciones");
       saludo.setAlignmentX(Component.CENTER_ALIGNMENT);
       saludo.setFont(new Font("garamond", 0, 30));
       panel.add(saludo);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       instrucciones = new JLabel("Escoge el cliente que deseas simular: ");
       instrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
       instrucciones.setFont(new Font("garamond", 0, 20));
       panel.add(instrucciones);
    
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       // AQUI VA LA LISTA DE CLIENTES
       aquien = new JComboBox(BancoIPC.aclientes);
       aquien.setBackground(Color.white);
       aquien.setSelectedItem(null);
       aquien.setAlignmentX(Component.CENTER_ALIGNMENT);
       aquien.setPreferredSize(new Dimension(230, 30));
       aquien.setMaximumSize(new Dimension(300, 30));
       panel.add(aquien);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       adonde = new JLabel("¿A donde deseas dirigirte? ");
       adonde.setAlignmentX(Component.CENTER_ALIGNMENT);
       adonde.setFont(new Font("garamond", 0, 16));
       panel.add(adonde);
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       String[] opciones = {"Agencia Bancaria", "Agenica c/ autobanco", 
           "Cajeros", "Llamar a call center"};
       ruta = new JComboBox(opciones);
       ruta.setBackground(Color.white);
       ruta.setSelectedItem(null);
       ruta.setAlignmentX(Component.CENTER_ALIGNMENT);
       ruta.setPreferredSize(new Dimension(230, 30));
       ruta.setMaximumSize(new Dimension(300, 30));
       panel.add(ruta);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       magia = new JButton("Ir");
       magia.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(magia);
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       regresar = new JButton("Regresar");
        regresar.setBounds(10, 10, 100, 30);
        regresar.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(regresar);
       
       panelagencia = new JPanel();
       panelagencia.setBackground(Color.blue);
       panelagencia.setVisible(false);
       this.getContentPane().add(panel);
       
       eventoMagia();
       eventoRegresar();
         
       
       
    }
       private void eventoMagia() {
        ActionListener abracadabra = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
              posicioncliente =  aquien.getSelectedIndex();
                
                String seleccion=(String)ruta.getSelectedItem();
                saludo.setText(seleccion);
               
                if (seleccion == "Agencia Bancaria") {
                    
                    Agencia_Bancaria a1 = new Agencia_Bancaria();
                    a1.setVisible(true);
                    dispose();             
                    
                } 
                else if (seleccion == "Agenica c/ autobanco") {
                    
                    instrucciones.setText("Cajeros");
                }
                else if (seleccion == "Llamar a call center") {
                    
                    instrucciones.setText("Agenicas c/ autobanco :'3 ");
                }
                else if (seleccion == "Cajeros") {
                    
                    instrucciones.setText("Cajeros :'3 ");
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
