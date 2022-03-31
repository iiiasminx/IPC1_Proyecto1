
package bancoipc;

import static bancoipc.BancoIPC.aagencias;
import static bancoipc.BancoIPC.aautobancos;
import static bancoipc.BancoIPC.aclientes;
import static bancoipc.BancoIPC.aefectivoagencia;
import static bancoipc.BancoIPC.topdclientes;
import clasesss.MisClientes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
 import javax.swing.*;
import java.util.Arrays;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.IOException;


public class AdminMR extends JFrame{
    
    JPanel panel;
    JLabel saludo;
    JLabel instrucciones;
    JComboBox aquien;
    JButton magia, pdf, generar, regresar;
    JTextField imprimearray, ruta;
    JTextArea imprimearray1;
    DefaultListModel dlm;
            
     public AdminMR() {
        
        iniciarComponentes();
        
    }
    private void iniciarComponentes(){
        
        this.setSize(600, 650);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setTitle("BDE - 2019");
       this.setLocationRelativeTo(null);
       
       panel = new JPanel();
       this.getContentPane().add(panel);
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       panel.setBackground(Color.pink);
       
       panel.add(Box.createRigidArea(new Dimension(0,30)));
       
       saludo = new JLabel("Bienvenido al Módulo de Reportes");
       saludo.setAlignmentX(Component.CENTER_ALIGNMENT);
       saludo.setFont(new Font("garamond", 0, 20));
       panel.add(saludo);
       
       panel.add(Box.createRigidArea(new Dimension(0,20)));
       
       instrucciones = new JLabel("Por favor, escoge el ámbito del reporte que "
               + "desees generar");
       instrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
       instrucciones.setFont(new Font("garamond", 0, 16));
       panel.add(instrucciones);
       
       panel.add(Box.createRigidArea(new Dimension(0,20)));
       
       String[] opciones = {"Lista de Agencias", "Lista de Cajeros", "Lista de Clientes","Lista de Autobancos",
       "Clientes con más cuentas", "Clientes con más dinero", "Clientes con más deudas",
       "Agencias mas usadas", "Call center - Top Operaciones", "Efectivo Total Disponible",
       "Cliente individual", "Efectivo por Agencia","Efectivo por Autobanco", "Empleados por Agencia","Agencia con Más Empleados", "Empleados de Oficinas"};
       aquien = new JComboBox(opciones);
       aquien.setBackground(Color.white);
       aquien.setSelectedItem(null);
       aquien.setAlignmentX(Component.CENTER_ALIGNMENT);
       aquien.setPreferredSize(new Dimension(400, 40));
       aquien.setMaximumSize(new Dimension(400, 30));
       panel.add(aquien);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       magia = new JButton("Seleccionar");
       magia.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(magia);
       
       panel.add(Box.createRigidArea(new Dimension(0,20)));
       
       
       imprimearray1 = new JTextArea();
       imprimearray1.setBackground(Color.white);
       imprimearray1.setAlignmentX(Component.CENTER_ALIGNMENT);
       imprimearray1.setRows(60);
       imprimearray1.setPreferredSize(new Dimension(400, 250));
       imprimearray1.setMaximumSize(new Dimension(400, 250));
       JScrollPane sp = new JScrollPane(imprimearray1);
       sp.setPreferredSize(new Dimension(400, 250));
       sp.setMaximumSize(new Dimension(400, 250));
       
       panel.add(sp);
//       
//       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
//        dlm = new DefaultListModel();
//        JList list = new JList(dlm);
//        JScrollPane scrollPane = new JScrollPane(list);
//        scrollPane.setMaximumSize(new Dimension(400, 250));
//        panel.add(scrollPane);
        
        panel.add(Box.createRigidArea(new Dimension(0,20)));
        
        pdf = new JButton("Ver ruta");
       pdf.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(pdf);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
        ruta = new JTextField("");
       ruta.setBackground(Color.white);
       ruta.setAlignmentX(Component.CENTER_ALIGNMENT);
       ruta.setPreferredSize(new Dimension(400, 30));
       ruta.setMaximumSize(new Dimension(400, 30));
       panel.add(ruta);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       
       
       generar = new JButton("Crear PDF:");
       generar.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(generar);
       
       panel.add(Box.createRigidArea(new Dimension(0,10)));
       
       regresar = new JButton("Regresar");
       regresar.setAlignmentX(Component.CENTER_ALIGNMENT);
       panel.add(regresar);
       
       eventoMagia();
     eventoPDF();
     generarPDF();
     eventoRegresar();
     
   }

    private void eventoMagia() {
        ActionListener abracadabra = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String seleccion=(String)aquien.getSelectedItem();
                saludo.setText(seleccion);
               
                if (seleccion == "Lista de Clientes") {
                    

                    StringBuilder txt = new StringBuilder();
                    
                    txt.append("Lista De Clientes: \n\n");

                    for (int i = 0; i < BancoIPC.aclientes.length; i++) {
                    txt.append( BancoIPC.aclientes[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");

                        }

                      }
//
                      imprimearray1.setText(txt.toString());

                                                           
                } 
                else if (seleccion == "Lista de Agencias") {
                                                         
                    obtenerAgencia();
                    
                }
                else if (seleccion == "Lista de Cajeros") {
                    
                    StringBuilder txt = new StringBuilder();
                    
                    txt.append("Lista De Cajeros: \n\n");

                    for (int i = 0; i < BancoIPC.acajeros.length; i++) {
                    txt.append( BancoIPC.acajeros[i] );

                        if (i != BancoIPC.acajeros.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    imprimearray1.setText(txt.toString());
                }
                else if (seleccion == "Efectivo Total Disponible") {
                    
                    obtenerSumaEfectivo();
                }
                else if (seleccion == "Efectivo por Agencia") {
                    
                    obtenerAgenciaE();
                }
                else if (seleccion == "Efectivo por Autobanco") {
                    
                    obtenerAutobancoE();
                } 
                else if (seleccion == "Lista de Autobancos") {
                    
                    obtenerAutobanco();
                }
                else if (seleccion == "Clientes con más dinero") {
                    
                    ordenarDinero();
                    
                     StringBuilder txt = new StringBuilder();
                    
                    txt.append("Clientes con más Dinero: \n\n");

                    for (int i = 0; i < 3; i++) {
                    txt.append( BancoIPC.aclientes[i] + "  Q."+ 
                            String.valueOf(aclientes[i].sumadinero));

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    imprimearray1.setText(txt.toString());
                }
                else if (seleccion == "Lista de Autobancos") {
                    
                    obtenerAutobanco();
                }
                else if (seleccion == "Clientes con más cuentas") {
                    
                    ordenarCuentas();
                    
                     StringBuilder txt = new StringBuilder();
                    
                    txt.append("Clientes con más Cuentas: \n\n");

                    for (int i = 0; i < 3; i++) {
                    txt.append( BancoIPC.aclientes[i] + "  #-"+ 
                            String.valueOf(aclientes[i].sumacuenta));

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    imprimearray1.setText(txt.toString());
                }
                else if (seleccion == "Clientes con más deudas") {
                    
                    ordenarDeudas();
                    
                     StringBuilder txt = new StringBuilder();
                    
                    txt.append("Clientes con más Deudas: \n\n");

                    for (int i = 0; i < 3; i++) {
                    txt.append( BancoIPC.aclientes[i] + "  Q."+ 
                            String.valueOf(aclientes[i].sumadeudas));

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    imprimearray1.setText(txt.toString());
                }
                else if (seleccion == "Empleados por Agencia") {
                    
                    obtenerEmpleadosxAgencia();
                }
                else if (seleccion == "Empleados de Oficinas") {
                    
                    obtenerEmpleadosxOficinas();
                }
                else if (seleccion == "Agencia con Más Empleados") {
                    
                    StringBuilder txt = new StringBuilder();
                    
                    txt.append("Agencia con más Empleados: \n\n");

                    for (int i = 0; i <= 2; i++) {
                    txt.append( BancoIPC.aagencias[0] + "   -    "+ 
                            BancoIPC.aempleados[i]);

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append( BancoIPC.aagencias[0] + "   -    "+ 
                            BancoIPC.aempleados[52]);
                    
                    imprimearray1.setText(txt.toString());
                }
                else { 
                JOptionPane.showMessageDialog(null, "Algo malo ha ocurrido, por "
                        + "favor contacte al programador e intetelo más tarde :'c");
                }
               
            }
        };
        
        magia.addActionListener(abracadabra);
    }

    private void eventoPDF() {
        
        ActionListener abracadabra = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                JFileChooser dlg = new JFileChooser();
                int opcion = dlg.showSaveDialog(panel);
                
                if (opcion == JFileChooser.APPROVE_OPTION) {
                    
                    File f= dlg.getSelectedFile();
                    ruta.setText(f.toString());
                    
                }
               
            }
        };
        
        pdf.addActionListener(abracadabra);
//    
    }
   
     private void generarPDF() {
        
        ActionListener abracadabra = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String rutaa = ruta.getText();
                String contenido = imprimearray1.getText();
                
                try{
                    FileOutputStream archivo = new FileOutputStream(rutaa+".pdf");
                    Document doc = new Document();
                    PdfWriter.getInstance(doc, archivo);
                    doc.open();
                    doc.add(new Paragraph("BANCO DEL EXTERIOR -- REPORTES\n"));
                    doc.add(new Paragraph("  "));
                    doc.add(new Paragraph(contenido));
                    
                    doc.close();
                    
                    JOptionPane.showMessageDialog(null, "PDF correctamente creado :'D");
                   
//                                        
                    try {

		File pdfFile = new File(rutaa+".pdf");
		if (pdfFile.exists()) {

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}

		} else {
			System.out.println("File is not exists!");
		}

                        System.out.println("Done");

                  } catch (Exception ex) {
                        System.out.println(ex);
                  }

                                                                              
                } catch (Exception i){
                    System.out.println("Algo pasó :'c"+i);
                }
               
                
            }
        };
        
        generar.addActionListener(abracadabra);
//    
    }
     
     private void obtenerSumaEfectivo(){
         
         
         String efectivo[] = new String[5];
         
//         for ( int i = 0;  i < BancoIPC.acajeros.length; i++) {
//             
//             efectivo = BancoIPC.aagencias[i].getEfectivo();
//             System.out.println(efectivo);
//             int numEntero = Integer.parseInt(efectivo);
//             System.out.println(numEntero);
//         }
         
         efectivo[0] = BancoIPC.aagencias[0].getEfectivo();
         efectivo[1] = BancoIPC.aagencias[1].getEfectivo();
         efectivo[2] = BancoIPC.aagencias[2].getEfectivo();
         efectivo[3] = BancoIPC.aagencias[3].getEfectivo();
         efectivo[4] = BancoIPC.aagencias[4].getEfectivo();
         
         int numEntero1 = Integer.parseInt(efectivo[0]);
         int numEntero2 = Integer.parseInt(efectivo[1]);
         int numEntero3 = Integer.parseInt(efectivo[2]);
         int numEntero4 = Integer.parseInt(efectivo[3]);
         int numEntero5 = Integer.parseInt(efectivo[4]);
         
         System.out.println(efectivo[0]);
         System.out.println(efectivo[1]);
         System.out.println(efectivo[2]);
         System.out.println(efectivo[3]);
         System.out.println(efectivo[4]);
         
         int suma = numEntero1 + numEntero2+numEntero3+numEntero4+numEntero5;
         
         String cadena = Integer.toString(suma);
         
         imprimearray1.setText("EFECTIVO TOTAL:\n El monto de Efectivo total en las "
                 + "agencias es de: \n\nQ." + cadena+".00");
         System.out.println("fin");
      
//         int numEntero = Integer.parseInt(numCadena);
     }
     
     private void obtenerAgencia(){
         
//                 
         StringBuilder txt = new StringBuilder();
                    
                    txt.append("Lista de Agencias: \n\n");

                    for (int i = 0; i < BancoIPC.aagencias.length; i++) {
                    txt.append( BancoIPC.aagencias[i] );

                        if (i != BancoIPC.aagencias.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n");
                    
//                                       
                    imprimearray1.setText(txt.toString());
         
         
     }     
     private void obtenerAgenciaE(){
         
//                 
         StringBuilder txt = new StringBuilder();
                    
                    txt.append("Lista de Agencias: \n\n");

                    for (int i = 0; i < BancoIPC.aagencias.length; i++) {
                    txt.append( BancoIPC.aagencias[i] + " -------  Q.  "
                            +String.valueOf(aagencias[i].efectivo));

                        if (i != BancoIPC.aagencias.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n");
                    
//                                       
                    imprimearray1.setText(txt.toString());
         
         
     }
     
     
     private void obtenerAutobanco(){
         
         StringBuilder txt = new StringBuilder();
                    
                    txt.append("Lista de Autobancos: \n\n");

                    for (int i = 0; i < BancoIPC.aautobancos.length; i++) {
                    txt.append( BancoIPC.aautobancos[i]);

                        if (i != BancoIPC.aautobancos.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n");
                    
//                                       
                    imprimearray1.setText(txt.toString());
         
     }
     private void obtenerAutobancoE(){
         
         StringBuilder txt = new StringBuilder();
                    
                    txt.append("Lista de Autobancos: \n\n");

                    for (int i = 0; i < BancoIPC.aautobancos.length; i++) {
                    txt.append( BancoIPC.aautobancos[i] + " -----------   Q." 
                            + aautobancos[i].efectivo);

                        if (i != BancoIPC.aautobancos.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n");
                    
//                                       
                    imprimearray1.setText(txt.toString());
         
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
    
private void ordenarDinero(){
       
     int tamaño = BancoIPC.aclientes.length;
        
       try{
           for (int i = 0; i < tamaño -1; i++) {
               for (int j = 0; j < tamaño -1; j++) {
                
                   if(aclientes[j].sumadinero <  aclientes[j+1].sumadinero )
                   {
                       MisClientes aux = aclientes[j+1];
                        aclientes[j+1] = aclientes[j];
                        aclientes[j] = aux;
                   }
                    
               }
               
           }
           
       }catch(Exception e){
           System.out.println(e);
                 }
       
             
         
       
   }   
private void ordenarCuentas(){
    
    int tamaño = BancoIPC.aclientes.length;
        
       try{
           for (int i = 0; i < tamaño -1; i++) {
               for (int j = 0; j < tamaño -1; j++) {
                
                   if(aclientes[j].sumacuenta <  aclientes[j+1].sumacuenta )
                   {
                       MisClientes aux = aclientes[j+1];
                        aclientes[j+1] = aclientes[j];
                        aclientes[j] = aux;
                   }
                    
               }
               
           }
           
       }catch(Exception e){
           System.out.println(e);
                 }
       
   
       
}
private void ordenarDeudas(){
    int tamaño = BancoIPC.aclientes.length;
        
       try{
           for (int i = 0; i < tamaño -1; i++) {
               for (int j = 0; j < tamaño -1; j++) {
                
                   if(aclientes[j].sumadeudas <  aclientes[j+1].sumadeudas )
                   {
                       MisClientes aux = aclientes[j+1];
                        aclientes[j+1] = aclientes[j];
                        aclientes[j] = aux;
                   }
                    
               }
               
           }
           
       }catch(Exception e){
           System.out.println(e);
                 }
       
       }

private void obtenerEmpleadosxAgencia(){
     StringBuilder txt = new StringBuilder();
                    
                    txt.append("Empleados por Agencia: \n\n AGENCIAS BANCARIAS\n\n  CC Miraflores\n");

                    for (int i = 0; i <= 2; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append( BancoIPC.aempleados[52] + "\n");
                    
                    txt.append("\n \n CC Tikal Futura\n");
                    
                    for (int i = 3; i <= 5; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n CC Eskala\n");
                    
                    for (int i = 6; i <= 8; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n CC Cayalá\n");
                    
                    for (int i = 9; i <= 11; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n CC Portales\n");
                    
                    for (int i = 12; i <= 14; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n \n AGENCIAS CON AUTOBANCO\n\n Roosevelt");
                    
                    for (int i = 15; i <= 17; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n Periférico \n");
                    
                    for (int i = 18; i <= 20; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n CC San Juan\n");
                    
                    for (int i = 21; i <= 23; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n Blv. Cayalá\n");
                    
                    for (int i = 24; i <= 26; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append("\n \n CC Blv. Liberación \n");
                    
                    for (int i = 27; i <= 29; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append("\n \n\n CALL CENTER \n");
                    
                    for (int i = 30; i <= 39; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    imprimearray1.setText(txt.toString());
}
private void obtenerEmpleadosxOficinas(){
    
    StringBuilder txt = new StringBuilder();
                    
                    txt.append("Empleados en Oficinas \n\n GERENCIA:\n");

                    for (int i = 40; i <= 41; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    txt.append(" \n\n MARKEING:\n");

                    for (int i = 42; i <= 43; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append(" \n\n IT:\n");

                    for (int i = 44; i <= 45; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append(" \n\n FINANZAS:\n");

                    for (int i = 46; i <= 47; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append(" \n\n RECLAMOS:\n");

                    for (int i = 48; i <= 49; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    txt.append(" \n\n COBROS:\n");

                    for (int i = 50; i <= 51; i++) {
                    txt.append( BancoIPC.aempleados[i] );

                        if (i != BancoIPC.aclientes.length - 1) {

                          txt.append("\n");
                        }
                    }
                    
                    imprimearray1.setText(txt.toString());
}
}
