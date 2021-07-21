    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Banco {
     
    public int id;
    private int cod;
    private String descripcion;
    private boolean action;

    public Banco()
    {
        this.id=0;
        this.cod=0;
        this.descripcion="";
        this.action=true;
    }

    public Banco(int id, int cod, String descripcion, boolean action) {
        this.id = id;
        this.cod = cod;
        this.descripcion = descripcion;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Banco{" + "id=" + id + ", cod=" + cod + ", descripcion=" + descripcion + ", action=" + action + '}';
    }
    
}
