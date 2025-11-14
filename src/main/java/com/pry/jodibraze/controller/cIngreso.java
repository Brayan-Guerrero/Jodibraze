package com.pry.jodibraze.controller;

import com.pry.jodibraze.repository.conexionBD;
import com.pry.jodibraze.util.foto;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class cIngreso 
{
    
    conexionBD con = new conexionBD();
    Connection conectar = con.conexion();
    String validarMatricula = "";
    
   public boolean validar(Integer matricula)
   {
       try {
           foto foto = new foto();
           
           validarMatricula = "SELECT * FROM usuario WHERE matricula = ' "+matricula+" ' ";
           Statement st = conectar.createStatement();
           ResultSet rs = st.executeQuery(validarMatricula);
           
           if (rs != null)
           {
               foto.ruta(matricula);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA MATRICULA");
       }
       return false;
   }
   
   public boolean mostrarFoto(String ruta)
   {
       try {
           BufferedImage contenedor = ImageIO.read(new File(ruta));
                   JLabel foto = new JLabel(new ImageIcon(contenedor));
       } catch (Exception e) {
       }
       return false;
   }
}
