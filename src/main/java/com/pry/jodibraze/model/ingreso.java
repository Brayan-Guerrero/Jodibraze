package com.pry.jodibraze.model;

import java.sql.Date;
import java.sql.Time;

public class ingreso 
{
    private int id;
    private int usuario_id;
    private Date fecha;
    private Time hora;

    public ingreso(int id, int usuario_id, Date fecha, Time hora) 
    {
        this.id = id;
        this.usuario_id = usuario_id;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    
}
