
package YaNo;

import bancoipc.BancoIPC;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PAdminMT extends JFrame {
    
    JPanel panel, panelagencia;
    JLabel saludo;
    JLabel instrucciones, adonde;
    JComboBox aquien, ruta;
    JButton magia, regresar;

    public PAdminMT(){
        
        this.setSize(700, 700);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setTitle("BDE - 2019");
       this.setLocationRelativeTo(null);
        iniciarComponentes();
        
        
    }
    
    private void iniciarComponentes(){
        
       saludo = new JLabel("Bienvenido al Módulo Transacciones");
       saludo.setAlignmentX(Component.CENTER_ALIGNMENT);
       saludo.setFont(new Font("garamond", 0, 30));
       
       instrucciones = new JLabel("Escoge el cliente que deseas simular: ");
       instrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
       instrucciones.setFont(new Font("garamond", 0, 20));
              
       aquien = new JComboBox(BancoIPC.aclientes);
       aquien.setBackground(Color.white);
       aquien.setSelectedItem(null);
       aquien.setAlignmentX(Component.CENTER_ALIGNMENT);
       aquien.setPreferredSize(new Dimension(230, 30));
       aquien.setMaximumSize(new Dimension(300, 30));
       
       adonde = new JLabel("¿A donde deseas dirigirte? ");
       adonde.setAlignmentX(Component.CENTER_ALIGNMENT);
       adonde.setFont(new Font("garamond", 0, 16));
        
        panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setSize(500, 50);
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.add(saludo);
        panel.add(instrucciones);
        panel.add(aquien);
        panel.add(adonde);
        
        
        
//        //Contenedor2
//        JPanel contenedor2 = new JPanel();
//        contenedor2.setBackground(Color.white);
//        contenedor2.setSize(500, 400);
//        GroupLayout groupLayout = new GroupLayout(contenedor2);
//        groupLayout.setAutoCreateGaps(true);
//        groupLayout.setAutoCreateContainerGaps(true);
//        contenedor2.setLayout(groupLayout);
//        
//        groupLayout.setHorizontalGroup(
//                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, true)
//                        .addComponent(contenedor1)
//                        .addComponent(scrollPanel));
//        groupLayout.setVerticalGroup(
//                groupLayout.createSequentialGroup()
//                        .addComponent(contenedor1)
//                        .addComponent(scrollPanel));
//        
//        setJMenuBar(barraMenu);
//        add(contenedor2);
    }
    
}
