package adaitw.java;

public class Cliente {
    private int id;
    private String empresa;
    private String contacto;
    private String cargo;
    private Boolean avanzar;

    public Cliente() {
        this.id = id;
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;
        this.avanzar = avanzar;
    }

    public Boolean getAvanzar() {
        return avanzar;
    }

    public void setAvanzar(Boolean avanzar) {
        this.avanzar = avanzar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Id='" + id + '\'' +
                " - Empresa='" + empresa + '\'' +
                " - Contacto='" + contacto + '\'' +
                " - Cargo='" + cargo + '\'' +
                '}';
    }


}
