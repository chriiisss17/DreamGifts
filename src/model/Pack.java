/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author christian
 */
public class Pack {
    
    //PCK_ID_PACK,PCK_NOMBRE,PCK_COSTO,PCK_STOCK,PCK_ESTADO
    private int pck_id_pack;
    private String pck_nombre;
    private String pck_costo;
    private int pck_stock;
    private boolean pck_estado;
    
    public Pack()
    {
        this.pck_id_pack=0;
        this.pck_nombre="";
        this.pck_costo="";
        this.pck_stock=0;
        this.pck_estado=true;
    }

    public Pack(int pck_id_pack, String pck_nombre, String pck_costo, int pck_stock, boolean pck_estado) {
        this.pck_id_pack = pck_id_pack;
        this.pck_nombre = pck_nombre;
        this.pck_costo = pck_costo;
        this.pck_stock = pck_stock;
        this.pck_estado = pck_estado;
    }

    public int getPck_id_pack() {
        return pck_id_pack;
    }

    public void setPck_id_pack(int pck_id_pack) {
        this.pck_id_pack = pck_id_pack;
    }

    public String getPck_nombre() {
        return pck_nombre;
    }

    public void setPck_nombre(String pck_nombre) {
        this.pck_nombre = pck_nombre;
    }

    public String getPck_costo() {
        return pck_costo;
    }

    public void setPck_costo(String pck_costo) {
        this.pck_costo = pck_costo;
    }

    public int getPck_stock() {
        return pck_stock;
    }

    public void setPck_stock(int pck_stock) {
        this.pck_stock = pck_stock;
    }

    public boolean isPck_estado() {
        return pck_estado;
    }

    public void setPck_estado(boolean pck_estado) {
        this.pck_estado = pck_estado;
    }

    @Override
    public String toString() {
        return "Pack{" + "pck_id_pack=" + pck_id_pack + ", pck_nombre=" + pck_nombre + ", pck_costo=" + pck_costo + ", pck_stock=" + pck_stock + ", pck_estado=" + pck_estado + '}';
    }
    
}
