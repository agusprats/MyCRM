package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Prospecto {
    protected int id;
    private String empresa;
    private String contacto;
    private String cargo;
    private String telefono;
    private String email;
    private String domicilio;


    public Prospecto( String empresa, String contacto, String cargo,  String telefono, String email, String domicilio) {
        this.id = id;
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;
        this.domicilio = domicilio;
    }

    public Prospecto() {

    }

    public String getEmpresa() {
        return this.empresa;
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


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void reemplazarContacto(String contacto){
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
        data.add(this.empresa);
        data.add(this.contacto);
        data.add(this.cargo);
        data.add(this.telefono);
        data.add(this.email);
        data.add(this.domicilio);
        return data;
    }

    public void remove(Prospecto prospecto) {

    }

    @Override
    public String toString() {
        return "Prospecto{" +
                "id=" + id +
                ", empresa='" + empresa + '\'' +
                ", contacto='" + contacto + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
