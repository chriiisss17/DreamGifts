/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author paudi
 */

public class Usuario {
    private int id;
    private String name;
    private String password;
    private boolean action;

    public Usuario(){
        this.id = 0;
        this.name = "";
        this.password = "";
        this.action = true;
    }
    public Usuario(int id, String name, String password, boolean action) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", name=" + name + ", password=" + password + ", action=" + action + '}';
    }
    
    

}