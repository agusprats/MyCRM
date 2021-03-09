package adaitw.java;

public class Cliente extends Oportunidad {
    private String empresa;
    private String contacto;
    private String cargo;
    private String email;
    private String phoneNumber;

    public Cliente() {
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getContacto() {
        return contacto;
    }

    @Override
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "  Empresa='" + empresa + '\'' +
                " Contacto='" + contacto + '\'' +
                " Cargo='" + cargo + '\'' +
                " Email='" + email + '\'' +
                " Tel='" + phoneNumber + '\'' +
                '}';
    }
}
