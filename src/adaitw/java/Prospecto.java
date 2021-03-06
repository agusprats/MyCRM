package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Prospecto {
    private String empresa;
    private String contacto;
    private String cargo;



    public Prospecto( String empresa) {
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;

    }

    public Prospecto() {

    }

    public String getEmpresa() {
        return this.empresa;
    }

    public String getContacto() {
        return contacto;
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



    public List<String> prospectoToString() {
        List<String> data = new ArrayList();
        data.add(this.empresa);
        data.add(this.contacto);
        data.add(this.cargo);

        return data;
    }

    public void remove(Prospecto prospecto) {

    }

    @Override
    public String toString() {
        return "Prospecto{" +
                ", empresa='" + empresa + '\'' +
                ", contacto='" + contacto + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
