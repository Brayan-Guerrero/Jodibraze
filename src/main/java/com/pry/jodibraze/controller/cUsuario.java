package com.pry.jodibraze.controller;

import com.pry.jodibraze.repository.conexionBD;
import java.sql.*;

public class cUsuario 
{
    conexionBD conectar1 = new conexionBD();
    Connection conectar = conectar1.conexion();
    String sql = "", ruta="";
    public String buscar (int matricula)
    {
        try {
            sql = "SELECT foto FROM usuario WHERE id = ' " +matricula+" ' ";
            if (!sql.isEmpty())
            {
            try (PreparedStatement prepara = conectar.prepareStatement(sql)) {
            prepara.setString(1,ruta);
            ResultSet rs = prepara.executeQuery();
            
            if (rs.next()) {
                String rutaImagen = rs.getString("ruta_imagen");
                mostrarImagen(rutaImagen);
            } else {
                labelImagen.setIcon(null);
                labelImagen.setText("Registro no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error BD: " + e.getMessage());
        }
                return ruta;
            }
            else{
                
            }
        } catch (Exception e) {
        }
        return ruta;
    }
}
