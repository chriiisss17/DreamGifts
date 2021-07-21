/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class RRSS {
    
    public int id;
    private int cod;
    private String name; 
    private boolean action;

    public RRSS()
    {
        this.id=0;
        this.cod=0;
        this.name="";
        this.action=true;
    }

    public RRSS(int id, int cod, String name, boolean action) {
        this.id = id;
        this.cod = cod;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "RRSS{" + "id=" + id + ", cod=" + cod + ", name=" + name + ", action=" + action + '}';
    }
           
}
