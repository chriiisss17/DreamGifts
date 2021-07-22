
package model;

import java.sql.Date;

/**
 *
 * @author christian
 */
public class Articulo {
    
    private int art_id_articulo;
    private String art_descripcion;
    private int art_stock;
    private Date art_fecha_vencimiento;
    private boolean art_estado;
    
    public Articulo()
    {
        this.art_id_articulo=0;
        this.art_descripcion="";
        this.art_stock=0;
        this.art_fecha_vencimiento=new Date(1);
        this.art_estado=false;
    }

    public Articulo(int art_id_articulo, String art_descripcion, int art_stock, Date art_fecha_vencimiento, boolean art_estado) {
        this.art_id_articulo = art_id_articulo;
        this.art_descripcion = art_descripcion;
        this.art_stock = art_stock;
        this.art_fecha_vencimiento = art_fecha_vencimiento;
        this.art_estado = art_estado;
    }

    public int getArt_id_articulo() {
        return art_id_articulo;
    }

    public void setArt_id_articulo(int art_id_articulo) {
        this.art_id_articulo = art_id_articulo;
    }

    public String getArt_descripcion() {
        return art_descripcion;
    }

    public void setArt_descripcion(String art_descripcion) {
        this.art_descripcion = art_descripcion;
    }

    public int getArt_stock() {
        return art_stock;
    }

    public void setArt_stock(int art_stock) {
        this.art_stock = art_stock;
    }

    public Date getArt_fecha_vencimiento() {
        return art_fecha_vencimiento;
    }

    public void setArt_fecha_vencimiento(Date art_fecha_vencimiento) {
        this.art_fecha_vencimiento = art_fecha_vencimiento;
    }

    public boolean isArt_estado() {
        return art_estado;
    }

    public void setArt_estado(boolean art_estado) {
        this.art_estado = art_estado;
    }

    @Override
    public String toString() {
        return "Articulo{" + "art_id_articulo=" + art_id_articulo + ", art_descripcion=" + art_descripcion + ", art_stock=" + art_stock + ", art_fecha_vencimiento=" + art_fecha_vencimiento + ", art_estado=" + art_estado + '}';
    }
    
    
}
