/* 
CADA VEZ QUE SE SUBA EL COMMIT SE DEBE DE COMENTAR ESTA PARTE DE LA CONEXION PARA NO CAUSAR CONFLICTOS CON LAS BASES DE DATOS
*/
package com.pry.jodibraze.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionBD 
{
    /*
    String URL = "jdbc:mysql://localhost:3306/sistema_acceso"; //Solo cambiar el final (sistema_acceso) si es que el nombre de tu base de datos es otro.
    String USUARIO = "root";
    String CONTRASEÑA = "";
    Connection conectar=null;
    public Connection conexion()
    {
     try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         conectar=DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        /*
         if (conectar !=null)
         {
             JOptionPane.showMessageDialog(null, "CONEXION");
         }
         */
    /*
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,"Error en base de datos: "+ e);
     }
     return conectar;
    }*/
}
