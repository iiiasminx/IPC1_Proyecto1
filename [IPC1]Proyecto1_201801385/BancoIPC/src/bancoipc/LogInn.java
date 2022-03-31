
package bancoipc;


import YaNo.PAdminMT;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LogInn extends Ventana {
    
    JPanel panelli;
    JComboBox modulos;
    JButton magia;
    JLabel saludo;
    JTextField usert;
    JPasswordField contraseñat;
    JLabel userl;
    JLabel contraseñal;


public LogInn(){
    
    iniciarComponentesLI();
}  

    private void iniciarComponentesLI() {
        
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       panelli = new JPanel();
       this.getContentPane().add(panelli);
       panelli.setBackground(Color.pink);
       panelli.setLayout(null);
       
             
        saludo = new JLabel("Bienvenido.");
        saludo.setBounds(200, 20, 200, 45);
        saludo.setHorizontalAlignment(SwingConstants.CENTER);
        saludo.setFont(new Font("garamond", 0, 40));
        panelli.add(saludo);
        
        userl = new JLabel("Usuario:");
        contraseñal = new JLabel("Contraseña");
        
        userl.setBounds(150, 90, 120, 30);
        contraseñal.setBounds(150, 150, 120, 30);
        panelli.add(userl);
        panelli.add(contraseñal);       
        
        
        usert = new JTextField();
        contraseñat = new JPasswordField();
        
        usert.setBounds(260, 90, 200, 30);
        contraseñat.setBounds(260, 150, 200, 30);
        panelli.add(usert);
        panelli.add(contraseñat);
        
        
        String[] opciones = {"Módulo Administrativo", 
        "Módulo Transacciones", "Módulo Reportes"};
        modulos = new JComboBox(opciones);
        modulos.setBounds(200, 230, 180, 30);
        modulos.setBackground(Color.white);
        modulos.setSelectedItem(null);
        panelli.add(modulos);
        
        magia = new JButton("Entrar");
        magia.setBounds(250, 280, 100, 45);
        panelli.add(magia);
        
        eventoMagia();
    }

    private void eventoMagia() {
        
        ActionListener entremos = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String seleccion=(String)modulos.getSelectedItem();
                String nusuario = usert.getText();
                String constraseña = contraseñat.getText();
                
                if (seleccion == "Módulo Administrativo" && nusuario.equals("admin")
                        && constraseña.equals("1234")) {
                    
                    AdminMA t1 = new AdminMA();
                    t1.setVisible(true);
                    dispose();
                                        
                } 
                else if (seleccion == "Módulo Empleados"&& nusuario.equals("admin")
                        && constraseña.equals("1234")) {
                    
                    AdminMA t1 = new AdminMA();
                    t1.setVisible(true);
                    dispose();
                }
                else if (seleccion == "Módulo Transacciones"&& nusuario.equals("admin")
                        && constraseña.equals("1234")) {
                    
                    AdminMT t1 = new AdminMT();
                    t1.setVisible(true);
                    dispose();
                    
                    
                }
                else if (seleccion == "Módulo Reportes"&& nusuario.equals("admin")
                        && constraseña.equals("1234")) {
                    
                    AdminMR t1 = new AdminMR();
                    t1.setVisible(true);
                    dispose();
                }
                else { 
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos :'c");
                }
            }
        };
        
        magia.addActionListener(entremos);
    }
  
    
    
}
