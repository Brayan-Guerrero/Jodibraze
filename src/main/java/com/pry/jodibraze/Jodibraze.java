package com.pry.jodibraze;

import com.pry.jodibraze.repository.conexionBD;
import com.pry.jodibraze.view.pantallaAlumno;
import java.sql.Connection;


public class Jodibraze 
{
    public static void main(String[] args)
    {
        pantallaAlumno panelPrincipal = new pantallaAlumno();
       panelPrincipal.setVisible(true);

    }
}
