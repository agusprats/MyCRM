package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Prospecto {
    protected int id;
    private String nombre;
    private String contacto;
    private String telefono;
    private String email;
    private String domicilio;


    public Prospecto(int id, String nombre, String contacto, String telefono, String email, String domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.email = email;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getContacto() {
        return contacto;
    }
    public String getTelefono() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDomicilio() {
        return this.domicilio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> prospectoToString() {
        List<String> data = new ArrayList();
        data.add(this.nombre);
        data.add(this.contacto);
        data.add(this.telefono);
        data.add(this.email);
        data.add(this.domicilio);
        return data;
    }
}
