
package bancoipc;

import clasesss.MAAgencias;
import clasesss.MAClientes;
import clasesss.MisAgencias;
import clasesss.MisAutobancos;
import clasesss.MisCajeros;
import clasesss.MisClientes;
import clasesss.MisEmpleados;
import clasesss.transaccionando.CuentaAhorro;
import clasesss.transaccionando.CuentaMonetaria;


public class BancoIPC {

    
    // COSAS DEL BANCO
    public static MisClientes[] aclientes = new MisClientes[30];
    public static MisAgencias[] aagencias = new MisAgencias[15];
    public static MisAutobancos[] aautobancos = new MisAutobancos[15];
    public static MisCajeros[] acajeros = new MisCajeros[30];
    public static MisEmpleados[] aempleados = new MisEmpleados[60];
    
    public static String[] aefectivoagencia = new String[15];
    public static String[] aefectivoautobanco = new String[15];
    public static int[] topdclientes = new int[30];
             
    // dimea un array de clientes
    
    // CUENTAS Y ESO
    
    public static CuentaAhorro[] acuentasa = new CuentaAhorro[30];
    public static CuentaMonetaria[] acuentasm =  new CuentaMonetaria[30];

    public static void main(String[] args) {
        
        
        LogInn l1 = new LogInn();
        l1.setVisible(true);
      
         
        
        
        
         
        // VALORES INICIALES DE LOS COSOS
        
        for (int i = 0; i < aclientes.length ; i++) {
            
                       
            MisClientes nadie1 = new MisClientes((i+1),0,0,0,0,"","","",0,0,0);
            
            aclientes[i] = nadie1;
        }
        
        for (int i = 0; i < aagencias.length ; i++) {
            
                       
            MisAgencias nadie1 = new MisAgencias((i+1),"","","","","","");
            
            aagencias[i] = nadie1;
        }
        for (int i = 0; i < aautobancos.length ; i++) {
            
                       
            MisAutobancos nadie1 = new MisAutobancos((i+1),"","","","","","","");
            
            aautobancos[i] = nadie1;
        }
        for (int i = 0; i < acajeros.length ; i++) {
            
                       
            MisCajeros nadie1 = new MisCajeros((i+1),"","","","");
            
            acajeros[i] = nadie1;
        }
        for (int i = 0; i < aempleados.length ; i++) {
            
                       
            MisEmpleados nadie1 = new MisEmpleados((i+1),"","","");
            
            aempleados[i] = nadie1;
        }
        
        
        
        // COSAS DE CUENTAS 
        
        for (int i = 0; i < acuentasa.length ; i++) {
            
                       
            CuentaAhorro nada1 = new CuentaAhorro((i+1),(0), (0),"","");
            
            acuentasa[i] = nada1;
        }
        
        for (int i = 0; i < acuentasm.length ; i++) {
            
                       
            CuentaMonetaria nada1 = new CuentaMonetaria((i+1),(0), (0),"","");
            
            acuentasm[i] = nada1;
        }
        
        // VARIABLES DEFAULT QUE NECESITO SI O SI MAS TARDE
          
        // CUENTAS DE AHORRO
        
        CuentaAhorro ca1 = new CuentaAhorro(2, 1,231,"Juana de Castilla",  "29/03/2019");
        CuentaAhorro ca2 = new CuentaAhorro(4, 1,432,"Mariana de Braganza",  "29/03/2019");
        CuentaAhorro ca3 = new CuentaAhorro(5, 1,122,"Jane Austen", "29/03/2019");
        CuentaAhorro ca4 = new CuentaAhorro(7, 1,141,"Julio Verne",  "29/03/2019");
        CuentaAhorro ca5 = new CuentaAhorro(9, 1,124, "Julio César",  "29/03/2019");
        
        acuentasa[1] = ca1;
        acuentasa[3] = ca2;
        acuentasa[4] = ca3;
        acuentasa[6] = ca4;
        acuentasa[8] = ca5;
        
        CuentaMonetaria cm1 = new CuentaMonetaria(1, 1,213,"Ana Bolena",  "29/03/2019");
        CuentaMonetaria cm2 = new CuentaMonetaria(3, 1,432,"Gustavo Béquer",  "29/03/2019");
        CuentaMonetaria cm3 = new CuentaMonetaria(5, 1,243,"Jane Austen", "29/03/2019");
        CuentaMonetaria cm4 = new CuentaMonetaria(6, 1,456,"Mario Benedetti",  "29/03/2019");
        CuentaMonetaria cm5 = new CuentaMonetaria(8, 1,677, "Víctor Hugo",  "29/03/2019");
        CuentaMonetaria cm6 = new CuentaMonetaria(9, 1,678, "Miguel Asturias",  "29/03/2019");
        
        acuentasm[0] = cm1;
        acuentasm[2] = cm2;
        acuentasm[4] = cm3;
        acuentasm[5] = cm4;
        acuentasm[7] = cm5;
        acuentasm[8] = cm6;
        
        //CLIENTES
                      
        
        MisClientes persona1 = new MisClientes(1,0,1,1,10, "Ana Bolena", "Londres, Inglaterra","21324567",1244,0,1244);
        MisClientes persona2 = new MisClientes(2,1,0,1,20, "Juana de Castilla", "Castilla, España","13242435",0, 124,124);
        MisClientes persona3 = new MisClientes(3,0,1,1,34, "Gustavo Béquer", "Aragón, España","10293847", 0,1254,1254);
        MisClientes persona4 = new MisClientes(4,1,0,1,43, "Mariana de Braganza",  "Lisboa, Portugal","12093498", 324,0,324);
        MisClientes persona5 = new MisClientes(5,1,1,2,56, "Jane Austen",  "Londres, Inglaterra","1230982", 0, 234,234);
        MisClientes persona6 = new MisClientes(6,0,1,1,34, "Mario Benedetti",  "Montevideo, Uruguay","12903489",4325,0,4325);
        MisClientes persona7 = new MisClientes(7,1,0,1,76, "Julio Verne", "Paris, Francia","13452676",100,0,100);
        MisClientes persona8 = new MisClientes(8,0,1,1,190, "Víctor Hugo",  "Paris, Francia","12345678", 234,0,234);
        MisClientes persona9 = new MisClientes(9,1,0,1,65, "Julio César",  "Roma, Italia","87654321",0,101,101);
        MisClientes persona10 = new MisClientes(10, 0,1,1,98,"Miguel Asturias",  "Guatemala, Guatemala","19898787",2402,0,2402);
        
        // este es un arreglo formado por personas, que tienen muchos atributos!
        // los cositos que estan en paréntesis no son arreglos. Son los atributos de mi persona
               
        // FALTA NUMERO DE TRANSACCIONES!!!
        
        
        aclientes[0] = persona1;
        aclientes[1] = persona2;
        aclientes[2] = persona3;
        aclientes[3] = persona4;
        aclientes[4] = persona5;
        aclientes[5] = persona6;
        aclientes[6] = persona7;
        aclientes[7] = persona8;
        aclientes[8] = persona9;
        aclientes[9] = persona10;
        
             
        // AGENCIAS BANCARIAS
        
        MisAgencias agencia1 = new MisAgencias(1, "Miraflores", "CC Miraflores", "12332112", "5","5","1231");
        MisAgencias agencia2 = new MisAgencias(2, "Tikal Futura", "CC Tikal Futura", "89009889", "4","4","1234");
        MisAgencias agencia3 = new MisAgencias(3, "Eskala", "CC Eskala", "67887667", "6","6","124");
        MisAgencias agencia4 = new MisAgencias(4, "Cayalá", "CC Cayalá", "76556776", "10","10","21531");
        MisAgencias agencia5 = new MisAgencias(5, "Portales", "CC Portales", "19283746", "7","4","122");
        
        aagencias[0] = agencia1;
        aagencias[1] = agencia2;
        aagencias[2] = agencia3;
        aagencias[3] = agencia4;
        aagencias[4] = agencia5;
        
        //FALTA EFECTIVO
        
        // AGENCIA CON AUTOBANCO
        
        MisAutobancos autobanco1 = new MisAutobancos(1, "Roosevelt", "Calzada Roosevelt", "12332112", "5","5", "5", "12412");
        MisAutobancos autobanco2 = new MisAutobancos(2, "Periférico", "Anillo Periférico", "89009889", "4","4","4", "32413");
        MisAutobancos autobanco3 = new MisAutobancos(3, "San Juan", "Calzada San Juan", "67887667", "6","6","6", "3412");
        MisAutobancos autobanco4 = new MisAutobancos(4, "Cayalá", "Boulevard Cayalá", "76556776", "10","10","10","2134");
        MisAutobancos autobanco5 = new MisAutobancos(5, "Liberación", "Boulevard Liberación", "19283746", "7","4","6","31413");
        
        aautobancos[0] = autobanco1;
        aautobancos[1] = autobanco2;
        aautobancos[2] = autobanco3;
        aautobancos[3] = autobanco4;
        aautobancos[4] = autobanco5;
        
        // CAJEROS AUTOMÁTICOS
        
        
        MisCajeros cajero1 = new MisCajeros(1, "CC Miraflores", "2314", "Activo", "213");
        MisCajeros cajero2 = new MisCajeros(2, "CC Pradera", "321", "Activo", "23");
        MisCajeros cajero3 = new MisCajeros(3, "Paseo Cayalá", "234", "Activo", "3");
        MisCajeros cajero4 = new MisCajeros(4, "CC Eskala", "5134", "Activo", "23");
        MisCajeros cajero5 = new MisCajeros(5, "CC Tikal Futura", "145", "Activo", "123");
        MisCajeros cajero6 = new MisCajeros(6, "CC Portales", "45", "Inactivo", "321");
        MisCajeros cajero7 = new MisCajeros(7, "CC Molino", "362", "Inactivo", "212");
        MisCajeros cajero8 = new MisCajeros(8, "CC Pradera Concepción", "262", "Inactivo", "213");
        MisCajeros cajero9 = new MisCajeros(9, "CC Asia Mall", "2464", "Inactivo", "331");
        MisCajeros cajero10 = new MisCajeros(10, "CC Galerías Prima", "6547", "Inactivo", "222");
        
        acajeros[0] = cajero1;
        acajeros[1] = cajero2;
        acajeros[2] = cajero3;
        acajeros[3] = cajero4;
        acajeros[4] = cajero5;
        acajeros[5] = cajero6;
        acajeros[6] = cajero7;
        acajeros[7] = cajero8;
        acajeros[8] = cajero9;
        acajeros[9] = cajero10;
        
        // EMPLEADOS 
        
        int num ;
        
        // AGENCIA
              
                
        MisEmpleados empleado1 = new MisEmpleados(1, "Jimin", "Agencia", "Miraflores");
        MisEmpleados empleado2 = new MisEmpleados(2, "Taehyng", "Agencia", "Miraflores");
        MisEmpleados empleado3 = new MisEmpleados(3, "Namjoon ", "Agencia", "Miraflores");
        MisEmpleados empleado53 = new MisEmpleados(53, "GDragon ", "Agencia", "Miraflores");
        
        MisEmpleados empleado4 = new MisEmpleados(4, "SeokJin ", "Agencia", "Tikal Futura");
        MisEmpleados empleado5 = new MisEmpleados(5, "Jungkook ", "Agencia", "Tikal Futura");
        MisEmpleados empleado6 = new MisEmpleados(6, "Hoseok ", "Agencia", "Tikal Futura");
        
       MisEmpleados empleado7 = new MisEmpleados(7, "Yoongi ", "Agencia", "Eskala");
       MisEmpleados empleado8 = new MisEmpleados(8, "Hyuna ", "Agencia", "Eskala");
       MisEmpleados empleado9 = new MisEmpleados(9, "Edawn ", "Agencia", "Eskala");
       
       MisEmpleados empleado10 = new MisEmpleados(10, "Sinb ", "Agencia", "Cayalá");
       MisEmpleados empleado11 = new MisEmpleados(11, "Eunha ", "Agencia", "Cayalá");
       MisEmpleados empleado12 = new MisEmpleados(12, "Sowon ", "Agencia", "Cayalá");
       
       MisEmpleados empleado13 = new MisEmpleados(13, "Yerin ", "Agencia", "Portales");
       MisEmpleados empleado14 = new MisEmpleados(14, "Yuju ", "Agencia", "Portales");
       MisEmpleados empleado15 = new MisEmpleados(15, "Umji ", "Agencia", "Portales");
       
       // AUTOBANCO 
       
     
        MisEmpleados empleado16 = new MisEmpleados(16, "Jimin", "Autobanco", "Roosevelt");
        MisEmpleados empleado17 = new MisEmpleados(17, "Taehyng", "Autobanco", "Roosevelt");
        MisEmpleados empleado18 = new MisEmpleados(18, "Namjoon ", "Autobanco", "Roosevelt");
        
        MisEmpleados empleado19 = new MisEmpleados(19, "SeokJin ", "Autobanco", "Periférico");
        MisEmpleados empleado20 = new MisEmpleados(20, "Jungkook ", "Autobanco", "Periférico");
        MisEmpleados empleado21 = new MisEmpleados(21, "Hoseok ", "Autobanco", "Periférico");
        
       MisEmpleados empleado22 = new MisEmpleados(22, "Yoongi ", "Autobanco", "San Juan");
       MisEmpleados empleado23 = new MisEmpleados(23, "Hyuna ", "Autobanco", "San Juan");
       MisEmpleados empleado24 = new MisEmpleados(24, "Edawn ", "Autobanco", "San Juan");
       
       MisEmpleados empleado25 = new MisEmpleados(25, "Sinb ", "Autobanco", "Cayalá");
       MisEmpleados empleado26 = new MisEmpleados(26, "Eunha ", "Autobanco", "Cayalá");
       MisEmpleados empleado27 = new MisEmpleados(27, "Sowon ", "Autobanco", "Cayalá");
       
       MisEmpleados empleado28 = new MisEmpleados(28, "Yerin ", "Autobanco", "Liberación");
       MisEmpleados empleado29 = new MisEmpleados(29, "Yuju ", "Autobanco", "Liberación");
       MisEmpleados empleado30 = new MisEmpleados(30, "Umji ", "Autobanco", "Liberación");
       
       // CALL CENTER
       
        MisEmpleados empleado31 = new MisEmpleados(31, "Jimin", "Call Center", "Call Center");
        MisEmpleados empleado32 = new MisEmpleados(32, "Taehyng", "Call Center", "Call Center");
        MisEmpleados empleado33 = new MisEmpleados(33, "Namjoon ", "Call Center", "Call Center");        
        MisEmpleados empleado34 = new MisEmpleados(34, "SeokJin ", "Call Center", "Call Center");
        MisEmpleados empleado35 = new MisEmpleados(35, "Jungkook ", "Call Center", "Call Center");
        MisEmpleados empleado36 = new MisEmpleados(36, "Hoseok ", "Call Center", "Call Center");        
       MisEmpleados empleado37 = new MisEmpleados(37, "Yoongi ", "Call Center", "Call Center");
       MisEmpleados empleado38 = new MisEmpleados(38, "Hyuna ", "Call Center", "Call Center");
       MisEmpleados empleado39 = new MisEmpleados(39, "Edawn ", "Call Center", "Call Center");      
       MisEmpleados empleado40 = new MisEmpleados(40, "Sinb ", "Call Center", "Call Center");
       
       // OFICINAS
       
       MisEmpleados empleado41 = new MisEmpleados(41, "Jimin", "Oficinas", "Gerencia");
        MisEmpleados empleado42 = new MisEmpleados(42, "Taehyng", "Oficinas", "Gerencia");
        MisEmpleados empleado43 = new MisEmpleados(43, "Namjoon ", "Oficinas", "Marketing");        
        MisEmpleados empleado44 = new MisEmpleados(44, "SeokJin ", "Oficinas", "Marketing");
        MisEmpleados empleado45 = new MisEmpleados(45, "Jungkook ", "Oficinas", "IT");
        MisEmpleados empleado46 = new MisEmpleados(46, "Hoseok ", "Oficinas", "IT");        
       MisEmpleados empleado47 = new MisEmpleados(47, "Yoongi ", "Oficinas", "Financiero");
       MisEmpleados empleado48 = new MisEmpleados(48, "Hyuna ", "Oficinas", "Financiero");
       MisEmpleados empleado49 = new MisEmpleados(49, "Edawn ", "Oficinas", "Reclamos");      
       MisEmpleados empleado50 = new MisEmpleados(50, "Sinb ", "Oficinas", "Reclamos");
       MisEmpleados empleado51 = new MisEmpleados(51, "Lisa ", "Oficinas", "Cobros");      
       MisEmpleados empleado52 = new MisEmpleados(52, "Rose ", "Oficinas", "Cobros");
       
        aempleados[0] = empleado1;
        aempleados[1] = empleado2;
        aempleados[2] = empleado3;
        aempleados[3] = empleado4;
        aempleados[4] = empleado5;
        aempleados[5] = empleado6;
        aempleados[6] = empleado7;
        aempleados[7] = empleado8;
        aempleados[8] = empleado9;
        aempleados[9] = empleado10;
        aempleados[10] = empleado11;
        aempleados[11] = empleado12;
        aempleados[12] = empleado13;
        aempleados[13] = empleado14;
        aempleados[14] = empleado15;
        aempleados[15] = empleado16;
        aempleados[16] = empleado17;
        aempleados[17] = empleado18;
        aempleados[18] = empleado19;
        aempleados[19] = empleado20;
        aempleados[20] = empleado21;
        aempleados[21] = empleado22;
        aempleados[22] = empleado23;
        aempleados[23] = empleado24;
        aempleados[24] = empleado25;
        aempleados[25] = empleado26;
        aempleados[26] = empleado27;
        aempleados[27] = empleado28;
        aempleados[28] = empleado29;
        aempleados[29] = empleado30;
        aempleados[30] = empleado31;
        aempleados[31] = empleado32;
        aempleados[32] = empleado33;
        aempleados[33] = empleado34;
        aempleados[34] = empleado35;
        aempleados[35] = empleado36;
        aempleados[36] = empleado37;
        aempleados[37] = empleado38;
        aempleados[38] = empleado39;
        aempleados[39] = empleado40;
        aempleados[0] = empleado41;
        aempleados[41] = empleado42;
        aempleados[42] = empleado43;
        aempleados[43] = empleado44;
        aempleados[44] = empleado45;
        aempleados[45] = empleado46;
        aempleados[46] = empleado47;
        aempleados[47] = empleado48;
        aempleados[48] = empleado49;
        aempleados[49] = empleado50;
        aempleados[50] = empleado51;
        aempleados[51] = empleado52;
        aempleados[52] = empleado53;
  
        
        
        for (int i = 0; i < aagencias.length ; i++) {
            
           aefectivoagencia[i] = String.valueOf(aagencias[i].id) + " " + aagencias[i].nombre + "  Q." +aagencias[i].efectivo;
              
            
        }
        
        for (int i = 0; i < aautobancos.length ; i++) {
            
           aefectivoautobanco[i] = String.valueOf(aautobancos[i].id) + " " + aautobancos[i].nombre + "  Q." +aautobancos[i].efectivo;
              
            
        }
        
        
     
             
    }
    
 
}
