/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Pack_has_articulo {
    
    private int PCK_ID_PACK;
    private int ART_ID_ARTICULO;
    private int cant;
    
    public Pack_has_articulo(){
        this.PCK_ID_PACK=0;
        this.ART_ID_ARTICULO=0;
        this.cant=0;
    }

    public Pack_has_articulo(int PCK_ID_PACK, int ART_ID_ARTICULO, int cant) {
        this.PCK_ID_PACK = PCK_ID_PACK;
        this.ART_ID_ARTICULO = ART_ID_ARTICULO;
        this.cant = cant;
    }

    public int getPCK_ID_PACK() {
        return PCK_ID_PACK;
    }

    public void setPCK_ID_PACK(int PCK_ID_PACK) {
        this.PCK_ID_PACK = PCK_ID_PACK;
    }

    public int getART_ID_ARTICULO() {
        return ART_ID_ARTICULO;
    }

    public void setART_ID_ARTICULO(int ART_ID_ARTICULO) {
        this.ART_ID_ARTICULO = ART_ID_ARTICULO;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Pack_has_articulo{" + "PCK_ID_PACK=" + PCK_ID_PACK + ", ART_ID_ARTICULO=" + ART_ID_ARTICULO + ", cant=" + cant + '}';
    }
    
}
