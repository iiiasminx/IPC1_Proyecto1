
package YaNo;


import bancoipc.LogInn;
import clasesss.MAClientes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Inicio extends JFrame{
    
      private JLabel saludo;
    private JButton clientes;
    private JButton regresar;
     private JPanel panelli;
    
   
    
    public Inicio(){
       
        super("Inicio");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
       panelli = new JPanel();
       this.getContentPane().add(panelli);
       panelli.setBackground(Color.pink);
       panelli.setLayout(null);
        
       saludo = new JLabel("Ir a Clientes.");
        saludo.setBounds(60, 10, 150, 25);
        saludo.setHorizontalAlignment(SwingConstants.CENTER);
        saludo.setFont(new Font("garamond", 0, 20));
        panelli.add(saludo);
//                
//        Titulo = new JLabel("Ir a Clientes");
//        Titulo.setBounds(100, 10, 500, 250);
//        
        clientes = new JButton();
        clientes.setText("Ir a Clientes");
        clientes.setBounds(60, 70, 150, 25);
         clientes.addActionListener(new java.awt.event.ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                MAClientes menu=new MAClientes();
                menu.setVisible(true);
                dispose ();
                
            }

            });
         
        panelli.add(clientes);

        
        
         regresar = new JButton();
        regresar.setText("Regresar");
        regresar.setBounds(60, 120, 150, 25);
         regresar.addActionListener(new java.awt.event.ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                
                LogInn l1=new LogInn();
                l1.setVisible(true);
                dispose ();
                
            }

            });
         
        panelli.add(regresar);

        
    }
}
