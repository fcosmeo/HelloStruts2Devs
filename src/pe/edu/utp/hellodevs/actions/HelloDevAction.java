package pe.edu.utp.hellodevs.actions;

/**
 * Created by GrupoUTP on 01/07/2016.
 */
public class HelloDevAction {
    private String name;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute(){
        return "success";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
