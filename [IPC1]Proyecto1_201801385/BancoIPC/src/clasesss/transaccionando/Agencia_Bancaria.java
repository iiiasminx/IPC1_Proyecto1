
package clasesss.transaccionando;

import bancoipc.AdminMT;
import bancoipc.BancoIPC;
import static bancoipc.BancoIPC.aclientes;
import static bancoipc.BancoIPC.acuentasa;
import static bancoipc.BancoIPC.acuentasm;
import bancoipc.Ventana;
import clasesss.MisClientes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Agencia_Bancaria extends JFrame{
    
    JPanel panelli;
    JLabel lsaludo, ldueño, lquehacer, linfo1, lfecha, linea1, linfo2, linfo3,
            linfo4, lservicios, lfechav, ltpago, escogerID;    
    JTextField lid, lnombre, lcahorro;
    JTextField lcmonetaria, lprestamo, ltarjeta, lefectivo;
    JTextField tdueño,tinfo1, tfecha, tinfo2, tinfo3, tinfo4,tfechav;
    JComboBox accion, servicios, tpago, listaID;
    JButton ir, guardar, regresar;
    int cliente;
    String operacion, cheques;
    
    public Agencia_Bancaria() {
        
        this.setSize(600, 650);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setTitle("BDE - 2019");
       this.setLocationRelativeTo(null);
       
       
        iniciarComponentes();
        oyenteBotonIr();
        oyenteBotonGuardar();
        eventoRegresar();
    }
    
    private void iniciarComponentes(){
        
        cliente = AdminMT.posicioncliente;
        DateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fecha = new Date();

        
       panelli = new JPanel();
       this.getContentPane().add(panelli);
       panelli.setLayout(null);
       panelli.setBackground(Color.pink);
       
       // ENCABEZADO
           
        
       lsaludo = new JLabel("Agencia Bancaria");
       lsaludo.setAlignmentX(Component.CENTER_ALIGNMENT);
       lsaludo.setFont(new Font("garamond", 0, 28));
       lsaludo.setBounds(200, 20, 500, 33);
       panelli.add(lsaludo);
          
       
       ldueño = new JLabel("Usuari@ del Banco:");
       ldueño.setAlignmentX(Component.CENTER_ALIGNMENT);
       ldueño.setFont(new Font("garamond", 0, 14));
       ldueño.setBounds(20, 90, 150, 24);
       panelli.add(ldueño);
              
       tdueño = new JTextField();
       tdueño.setAlignmentX(Component.CENTER_ALIGNMENT);
       tdueño.setFont(new Font("garamond", 0, 14));
       tdueño.setEditable(false);
       tdueño.setBounds(20, 130, 200, 24);
       panelli.add(tdueño);
       
       tdueño.setText(String.valueOf(aclientes[cliente].nombre));
       
       lquehacer = new JLabel("¿Que desea hacer?");
       lquehacer.setAlignmentX(Component.CENTER_ALIGNMENT);
       lquehacer.setFont(new Font("garamond", 0, 14));
       lquehacer.setBounds(320, 90, 150, 24);
       panelli.add(lquehacer);
      
       String[] opciones = {"Solicitar Cuenta de ahorro", "Solicitar Cuenta Monetaria",
       "Retiro de efectivo"};
       
       accion = new JComboBox(opciones);
       accion.setBounds(320, 130, 200, 26);
       accion.setBackground(Color.white);
       accion.setSelectedItem(null);
       panelli.add(accion);
       
       ir = new JButton("Ir");
       ir.setBounds(460, 90, 60, 26);
       panelli.add(ir);
       
       
       lfecha = new JLabel("La fecha de hoy es:");
       lfecha.setAlignmentX(Component.CENTER_ALIGNMENT);
       lfecha.setFont(new Font("garamond", 0, 14));
       lfecha.setBounds(20, 170, 150, 24);
       
       panelli.add(lfecha);
       
       tfecha = new JTextField(formato.format(fecha));
       tfecha.setAlignmentX(Component.CENTER_ALIGNMENT);
       tfecha.setForeground(Color.black);
       tfecha.setEnabled(false);
       tfecha.setFont(new Font("garamond", 0, 14));
       
       tfecha.setBounds(20, 210, 200, 24);
       panelli.add(tfecha);
       
       guardar = new JButton("Guardar");
       guardar.setAlignmentX(Component.CENTER_ALIGNMENT);
       guardar.setFont(new Font("garamond", 0, 16));
       guardar.setEnabled(false);
       guardar.setBounds(220, 490, 150, 30);
       panelli.add(guardar);
       
       inicializarId();
       
       linea1 = new JLabel("--------------------------------------------------"
               + "-----------------------------------------------------------"
               + "--------------------");
       linea1.setBounds(10, 250, 580, 15);
       panelli.add(linea1);
       
       
       
       // COSAS QUE APARECEN Y DESAPARECEN
       // BOO :D
       
       linfo1 = new JLabel("Prueba");
       linfo1.setAlignmentX(Component.CENTER_ALIGNMENT);
       linfo1.setFont(new Font("garamond", 0, 14));
       linfo1.setBounds(20, 280, 150, 24);
       linfo1.setVisible(false);
       panelli.add(linfo1);
       
       tinfo1 = new JTextField();
       tinfo1.setAlignmentX(Component.CENTER_ALIGNMENT);
       tinfo1.setFont(new Font("garamond", 0, 14));
       tinfo1.setVisible(false);
       tinfo1.setBounds(20, 310, 200, 24);
       panelli.add(tinfo1);
       
       
       linfo2 = new JLabel("Prueba 2");
       linfo2.setAlignmentX(Component.CENTER_ALIGNMENT);
       linfo2.setFont(new Font("garamond", 0, 14));
       linfo2.setBounds(20, 350, 150, 24);
       linfo2.setVisible(false);
       panelli.add(linfo2);
       
       tinfo2 = new JTextField();
       tinfo2.setAlignmentX(Component.CENTER_ALIGNMENT);
       tinfo2.setFont(new Font("garamond", 0, 14));
       tinfo2.setVisible(false);
       tinfo2.setBounds(20, 380, 200, 24);
       panelli.add(tinfo2);
       
       // COLUMNA 
       
       String[] servicioss = {"Agua", "Luz", "Teléfono"};
       
       lservicios = new JLabel("¿Que servicio desea pagar?");
       lservicios.setAlignmentX(Component.CENTER_ALIGNMENT);
       lservicios.setFont(new Font("garamond", 0, 14));
       lservicios.setBounds(20, 420, 150, 24);
       lservicios.setVisible(false);
       panelli.add(lservicios);
       
       servicios = new JComboBox(servicioss);      
       servicios.setAlignmentX(Component.CENTER_ALIGNMENT);
       servicios.setFont(new Font("garamond", 0, 14));
       servicios.setVisible(false);
       servicios.setBounds(20, 450, 200, 24);
       panelli.add(servicios);
       
       linfo3 = new JLabel("Prueba 3");
       linfo3.setAlignmentX(Component.CENTER_ALIGNMENT);
       linfo3.setFont(new Font("garamond", 0, 14));
       linfo3.setBounds(310, 280, 150, 24);
       linfo3.setVisible(false);
       panelli.add(linfo3);
       
       tinfo3 = new JTextField();
       tinfo3.setAlignmentX(Component.CENTER_ALIGNMENT);
       tinfo3.setFont(new Font("garamond", 0, 14));
       tinfo3.setVisible(false);
       tinfo3.setBounds(310, 310, 200, 24);
       panelli.add(tinfo3);
       
       lfechav = new JLabel("Fecha de vencimiento:");
       lfechav.setAlignmentX(Component.CENTER_ALIGNMENT);
       lfechav.setFont(new Font("garamond", 0, 14));
       lfechav.setBounds(310, 350, 150, 24);
       lfechav.setVisible(false);
       panelli.add(lfechav);
       
       tfechav = new JTextField("2020/03/30 08:47:52");
       tfechav.setAlignmentX(Component.CENTER_ALIGNMENT);
       tfechav.setFont(new Font("garamond", 0, 14));
       tfechav.setVisible(false);
       tfechav.setEnabled(false);
       tfechav.setBounds(310, 380, 200, 24);
       panelli.add(tfechav);
       
       
       String[] pagoss = {"Efectivo","Tarjeta"};
       
       ltpago = new JLabel("¿Cómo desea pagar?");
       ltpago.setAlignmentX(Component.CENTER_ALIGNMENT);
       ltpago.setFont(new Font("garamond", 0, 14));
       ltpago.setBounds(310, 420, 150, 24);
       ltpago.setVisible(false);
       panelli.add(ltpago);
       
       tpago = new JComboBox(pagoss);      
       tpago.setAlignmentX(Component.CENTER_ALIGNMENT);
       tpago.setFont(new Font("garamond", 0, 14));
       tpago.setVisible(false);
       tpago.setBounds(310, 450, 200, 24);
       panelli.add(tpago);
       
         regresar = new JButton("Regresar");
        regresar.setBounds(10, 10, 100, 30);
        panelli.add(regresar);
       
       meterAuxiliares();   
    }
    
    private void oyenteBotonIr(){
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                guardar.setEnabled(true);
                
                int quehacer;
                quehacer = accion.getSelectedIndex();
                
                // AQUI VAN LOS IFS DEL TIPO DE OPERACION ALV
//                linfo1.setVisible(true);
//                tinfo1.setVisible(true);
//                linfo2.setVisible(true);
//                tinfo2.setVisible(true);
//                lservicios.setVisible(true);
//                servicios.setVisible(true);
//                linfo3.setVisible(true);
//                tinfo3.setVisible(true);
//                lfechav.setVisible(true);
//                tfechav.setVisible(true);
//                ltpago.setVisible(true);
//                tpago.setVisible(true);
                
                if (quehacer == 0 || quehacer == 1) {
                    
                linfo1.setVisible(true);
                linfo1.setText("Monto inicial Q.");
                tinfo1.setVisible(true);
                linfo2.setText("Numero de Cuentas");
                tinfo2.setVisible(true);
                linfo2.setVisible(true);
                escogerID.setVisible(true);
                guardar.setEnabled(true);
                tinfo2.setEnabled(false);
                escogerID.setVisible(true);
                
                listaID = new JComboBox(BancoIPC.aclientes);
                listaID.setBounds(320, 200, 150, 24);
                listaID.setBackground(Color.white);
                listaID.setSelectedItem(29);
                panelli.add(listaID);
                
                 ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        

                     lid.setText(String.valueOf(aclientes[cliente].id));
                     lnombre.setText(String.valueOf(aclientes[cliente].nombre));
                     tinfo2.setText(String.valueOf(acuentasa[cliente].numero)); // #Cahorro
                     lcmonetaria.setText(String.valueOf(acuentasm[cliente].numero)); // #Cmonetarias
                     lprestamo.setText(String.valueOf(aclientes[cliente].id_prestamos));
                     ltarjeta.setText(String.valueOf(aclientes[cliente].id_tarjetas));
                    }  
                  };
                     listaID.addActionListener(actionListener);

                } else if (quehacer == 2) {
                    
                    
//               
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor escoja una opción");
                
                }
                
                
            }
        };
        ir.addActionListener(oyente);
    }
    
    private void oyenteBotonGuardar(){
        ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
                int quehacer;
                quehacer = accion.getSelectedIndex();
                
                if (quehacer == 0) {
                    
                    // SOLICITUD D CUENTA DE AHORRO
                
                int posicion;
                
                posicion = listaID.getSelectedIndex();
                
                int num = Integer.parseInt(tinfo2.getText());
                
                int monto = Integer.parseInt(tinfo1.getText());
                
                                
                CuentaAhorro auxiliar = new CuentaAhorro((posicion+1), (num+1), monto, 
                        tdueño.getText(), tfecha.getText());
                BancoIPC.acuentasa[posicion] = auxiliar;
                                                
                lcahorro.setText(String.valueOf(acuentasa[cliente].monto_inicial));
                
                tinfo2.setText(String.valueOf(acuentasa[posicion].numero));
                
                int monet = acuentasm[posicion].numero;
                int ahorro = acuentasa[posicion].numero;
                
                aclientes[posicion].sumacuenta = monet +  ahorro;
                
//                linfo1.setVisible(false);
//                tinfo1.setVisible(false);
//                linfo2.setVisible(false);
//                tinfo2.setVisible(false);
//                escogerID.setVisible(false);
//                listaID.setVisible(false);
                                          
                JOptionPane.showMessageDialog(null, "Tienes una nueva cuenta de ahorro! :D \n"
                        + "Su id es: " + String.valueOf(acuentasa[posicion].id) + "\n A nombre de " 
                        + String.valueOf(acuentasa[posicion].cliente) + "\n Con fecha de: "
                + String.valueOf(acuentasa[posicion].fecha));
                
                } else if (quehacer == 1) {
                    
                    // SOLICITUD DE CUENTA MONETARIA
                    
                    int posicion;
                
                posicion = listaID.getSelectedIndex();
                
                int num = Integer.parseInt(tinfo2.getText());
                
                int monto = Integer.parseInt(tinfo1.getText());
                
                                
                CuentaMonetaria auxiliar = new CuentaMonetaria((posicion+1), (num+1), monto, 
                        tdueño.getText(), tfecha.getText());
                BancoIPC.acuentasm[posicion] = auxiliar;
                                                
                lcahorro.setText(String.valueOf(acuentasm[cliente].montoi));
                
                tinfo2.setText(String.valueOf(acuentasm[posicion].numero));
                
                
                int monet = acuentasm[posicion].numero;
                int ahorro = acuentasa[posicion].numero;
                
                aclientes[posicion].sumacuenta = monet +  ahorro;
                
//                linfo1.setVisible(false);
//                tinfo1.setVisible(false);
//                linfo2.setVisible(false);
//                tinfo2.setVisible(false);
//                escogerID.setVisible(false);
//                listaID.setVisible(false);
                
              asignacionCheques();      
                
                JOptionPane.showMessageDialog(null, "Tienes una nueva cuenta de Monetaria! :D \n"
                        + "Su id es: " + String.valueOf(acuentasm[posicion].id) + "\n A nombre de " 
                        + String.valueOf(acuentasm[posicion].cliente) + "\n Con fecha de: "
                + String.valueOf(acuentasm[posicion].fecha) + "\n\n Se te han asignado los cheques: " + cheques);
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor escoja una opción");
                
                }
                
                
            }
        };
        guardar.addActionListener(oyente);
    }
    
    private void inicializarId(){
        
        escogerID = new JLabel("Escoja su nombre");
        escogerID.setBounds(320, 170, 150, 24);
        panelli.add(escogerID);
        escogerID.setVisible(false);
        
               
    }
    
    private void meterAuxiliares(){
        
        lid = new JTextField();
        lid.setEditable(false);
        
        lnombre = new JTextField();
        lnombre.setVisible(true);
        lcahorro = new JTextField("ahorro");
        lcahorro.setVisible(true);
        lcmonetaria = new JTextField("monetaria");
        lcmonetaria.setVisible(true);
        lprestamo = new JTextField("prestamo");
        lprestamo.setVisible(true);
        ltarjeta = new JTextField("tarjeta");
        ltarjeta.setVisible(true);
        lefectivo = new JTextField("Efetivo");
        lefectivo.setVisible(true);
        
         lid.setBounds(600, 120, 150, 30);
        lnombre.setBounds(600, 180, 150, 30);
        lcahorro.setBounds(600, 240, 150, 30);
        lprestamo.setBounds(600, 300, 150, 30);
        lefectivo.setBounds(600, 360, 150, 30);
               
        
        lcmonetaria.setBounds(800, 240, 150, 30);
        ltarjeta.setBounds(800, 300, 150, 30);
        
        panelli.add(lid);
        panelli.add(lnombre);
        panelli.add(lcahorro);
        panelli.add(lcmonetaria);
        panelli.add(lprestamo);
        panelli.add(ltarjeta);
        panelli.add(lefectivo);
    }
    
    private void eventoRegresar() {
        
         ActionListener oyente = new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                // aquí escribo todo lo que tiene que pasar con el botón
                
                AdminMT holi = new AdminMT();
                holi.setVisible(true);
                dispose();
                
            }
        };
        
        regresar.addActionListener(oyente);
    }
    
    private void asignacionCheques(){
        
        int idd = cliente++;
        
        if (idd == 1) {
            
            cheques = "1 - 25";
        } else if (idd == 2) {
            
            cheques = "26 - 50";
        } else
            if (idd == 3) {
            
            cheques = "51 - 75";
        } else if (idd == 4) {
            
            cheques = "76 - 100";
        } else if (idd == 5) {
            
            cheques = "101 - 125";
        } else if (idd == 6) {
            
            cheques = "126 - 150";
        } else if (idd == 7) {
            
            cheques = "151 - 175";
        } else if (idd == 8) {
            
            cheques = "176 - 300";
        } else if (idd == 9) {
            
            cheques = "301 - 325";
        } else if (idd == 10) {
            
            cheques = "326 - 350";
        } else if (idd == 11) {
            
            cheques = "351 - 375";
        } else if (idd == 12) {
            
            cheques = "376 - 400";
        } else if (idd == 13) {
            
            cheques = "400 - 425";
        } else if (idd == 14) {
            
            cheques = "426 - 450";
        } else if (idd == 15) {
            
            cheques = "451 - 475";
        } else if (idd == 16) {
            
            cheques = "476 - 500";
        } else if (idd == 17) {
            
            cheques = "501 - 525";
        } else if (idd == 18) {
            
            cheques = "526 - 575";
        } else if (idd == 19) {
            
            cheques = "576 - 600";
        } else if (idd == 20) {
            
            cheques = "601 - 625";
        } else if (idd == 21) {
            
            cheques = "626 - 650";
        } else if (idd == 22) {
            
            cheques = "651 - 675";
        } else if (idd == 23) {
            
            cheques = "676 - 700";
        } else if (idd == 24) {
            
            cheques = "701 - 725";
        } else if (idd == 25) {
            
            cheques = "726 - 775";
        } else {
            cheques= "775 - 800";
        }
            
            
                
        
    }
}
