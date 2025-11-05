package com.pry.jodibraze.model;

public class usuario {
    
    private String id_usuario;
    
    private byte foto;
    private String nombre_s;
    private String primer_apellido;
    private int id_tipo;
    private String unidad_academica;
    private int id_carrera;
    private String status;
    private int semestre;
    private String periodo_ingreso;
    private String curp;
    private String curp_imss;

    public usuario(String id_usuario, byte foto, String nombre_s, String primer_apellido, int id_tipo, String unidad_academica, int id_carrera, String status, int semestre, String periodo_ingreso, String curp, String curp_imss) {
        this.id_usuario = id_usuario;
        this.foto = foto;
        this.nombre_s = nombre_s;
        this.primer_apellido = primer_apellido;
        this.id_tipo = id_tipo;
        this.unidad_academica = unidad_academica;
        this.id_carrera = id_carrera;
        this.status = status;
        this.semestre = semestre;
        this.periodo_ingreso = periodo_ingreso;
        this.curp = curp;
        this.curp_imss = curp_imss;
    }

    
    
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }

    public String getNombre_s() {
        return nombre_s;
    }

    public void setNombre_s(String nombre_s) {
        this.nombre_s = nombre_s;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getUnidad_academica() {
        return unidad_academica;
    }

    public void setUnidad_academica(String unidad_academica) {
        this.unidad_academica = unidad_academica;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo_ingreso() {
        return periodo_ingreso;
    }

    public void setPeriodo_ingreso(String periodo_ingreso) {
        this.periodo_ingreso = periodo_ingreso;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp_imss() {
        return curp_imss;
    }

    public void setCurp_imss(String curp_imss) {
        this.curp_imss = curp_imss;
    }
    
    

}
