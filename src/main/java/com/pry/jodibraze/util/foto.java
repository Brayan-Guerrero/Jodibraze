package com.pry.jodibraze.util;

import com.pry.jodibraze.controller.cIngreso;
import com.pry.jodibraze.repository.conexionBD;
import java.sql.*;
import javax.swing.JOptionPane;

public class foto 
{
    
    conexionBD con = new conexionBD();
    Connection conectar = con.conexion();
    String rutaFoto = "", ruta = "";
    
    public boolean ruta (Integer matricula)
    {
        try {          
            cIngreso c = new cIngreso();
            
           rutaFoto = "SELECT foto FROM usuario WHERE matricula = ' "+matricula+" ' ";
           Statement st = conectar.createStatement();
           ResultSet rs = st.executeQuery(rutaFoto);
           
           while (rs.next())
           {
               ruta = rs.getString(rutaFoto);
               JOptionPane.showMessageDialog(null, "FOTO ENCOTRADA");
           }
           try{
           if (!ruta.isEmpty() && ruta != null)
            {
               return c.mostrarFoto(ruta);
             }
           }
           catch (Exception ruta){
                              JOptionPane.showMessageDialog(null, "FOTO NO ENCOTRADA");

           }
       } catch (Exception e) {
           
       }
        finally 
        {
            
        }
        return false;
    }
}
