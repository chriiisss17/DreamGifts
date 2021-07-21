package model;


public class Comuna {
    
    public int id;
    private int cod;
        private String name;
    private boolean action;

    public Comuna() {
        this.id=0;
        this.cod=0;
        this.name="";
        this.action=true;
    }
    
    public Comuna(int id, int cod, String name, boolean action) {
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
        return "Comuna{" + "id=" + id + ", cod=" + cod + ", name=" + name + ", action=" + action + '}';
    }
    
}
