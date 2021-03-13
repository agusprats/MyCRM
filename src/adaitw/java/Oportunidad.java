package adaitw.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Oportunidad {
    private String codigoOp;
    private String empresa;
    private String contacto;
    private String cargo;
    private String email;
    private String phoneNumber;
    private LocalDate contactDate;
    private boolean newCall;
    private Potencial potencial;
    private List<Item> items;// productos y servicios ofrecidos
    private boolean precioReferencia;
    private String comentario;

    public Oportunidad(){
    }

    public Oportunidad(String codigoOp, String empresa, String contacto, String cargo, LocalDate contactDate, boolean newCall, boolean precioReferencia, String comentario) {
        this.codigoOp = codigoOp;
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.contactDate = contactDate;
        this.newCall = newCall;
        this.potencial = potencial;
        this.precioReferencia = precioReferencia;
        this.comentario = comentario;
    }



    public String getCodigoOp() {
        return codigoOp;
    }

    public void setCodigoOp(String codigoOp) {
        this.codigoOp = codigoOp;
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

    public void setNewCall(boolean newCall) {
        this.newCall = newCall;
    }

    public String getnewCall() {
        if (newCall) {
            return "Llamar nuevamente";
        } else {
            return "No llamar";
        }
    }

    public void setPrecioReferencia(boolean precioReferencia) {
        this.precioReferencia = precioReferencia;
    }

    public String getPrecioReferencia(){
        if(precioReferencia){
            return "Se indicó precio";
        }else {
           return "Sin precio";
        }
    }
    public LocalDate getContactDate() {
        return contactDate;
    }
    public void setContactDate(LocalDate contactDate) {
        this.contactDate = contactDate;
    }

    public String ultimoContacto() {
        LocalDate start_date = contactDate;
        LocalDate today_date = LocalDate.now();
        Period diff = Period.between(start_date, today_date);

        //Alerta para futuros llamados si pasa un mes o un año:
        if (diff.getMonths() >= 1 || diff.getYears() < 1) {
            return "Transcurrió más de un MES !!!: \n" + diff.getYears() + " Año - " + diff.getMonths() + " Mes/es - " + diff.getDays() + " Dia/s ";
        } else if (diff.getYears() > 1) {
            return "Transcurrió más de un AÑO: \n" + diff.getYears() + " Año/s - " + diff.getMonths() + " Mes/es - " + diff.getDays() + " Dia/s ";
        } else {
            return "Transcurrió: \n" + diff.getYears() + " Año/s - " + diff.getMonths() + " Mes/es - " + diff.getDays() + " Dia/s ";
        }
    }

    public void setPotencial(Potencial potencial) {
        this.potencial = potencial;
    }

    public Potencial getPotencial() {
        return potencial;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    @Override
    public String toString() {
        return "Oportunidad{" +
                "  Códigoº: " + codigoOp +
                ", Empresa: '" + empresa + '\'' +
                ", Contacto: '" + contacto + '\'' +
                ", Cargo: '" + cargo + '\'' +
                ", Primer Contacto: " + contactDate +
                ", Precio Referencia: " + getPrecioReferencia() +
                ", ¿Acepta Seguimiento? " + getnewCall() +
                ", Potencial: " + potencial.getSigno()+
                ", Comentarios Adicionales: " + getComentario() +
                ", Alerta Seguimiento: " + ultimoContacto() +
                ", items: " + items +
                '}';
    }
}


/*public void setPotential(int choicePotencial) {
        switch(choicePotencial) {
            case 1:
                this.potencial = Potencial.negativo;
                break;
            case 3:
                this.potencial = Potencial.positivo;
                break;
            default:
                this.potencial = Potencial.neutral;
        }
        }


    public void setPrecioReferencia(String precioReferencia) {
        if (precioReferencia.equalsIgnoreCase("si")) {
            this.precioReferencia = true;
        } else {
            this.precioReferencia  = false;
        }
    }
*/