package adaitw.java;

public class Cliente {
    private int codigo;
    private String empresa;
    private String contacto;
    private String cargo;

    public Cliente() {
        this.codigo = codigo;
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
                "Codigo='" + codigo + '\'' +
                " - Empresa='" + empresa + '\'' +
                " - Contacto='" + contacto + '\'' +
                " - Cargo='" + cargo + '\'' +
                '}';
    }
}
