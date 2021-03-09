package adaitw.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Oportunidad {
    private String codigoOp;
    private String empresa;
    private String contacto;
    private String cargo;
    private LocalDate contactDate;
    private Boolean newCall;
    private Potencial potencial;
    private List<Item> items;// productos y servicios ofrecidos
    private Boolean precioReferencia;
    private String comentario;

    public Oportunidad(){
        this.codigoOp = codigoOp;
        this.empresa = empresa;
        this.contacto = contacto;
        this.cargo = cargo;
        this.contactDate = contactDate;
        this.newCall = newCall;
        this.precioReferencia = precioReferencia;
        this.potencial= potencial;
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

    public void setNewCall(Boolean newCall) {
        this.newCall = newCall;
    }

    public String getnewCall() {
        if (newCall) {
            return "Llamar nuevamente";
        } else {
            return "No llamar";
        }
    }

    public void setPrecioReferencia(Boolean precioReferencia) {
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

        //Alerta para futuros llamados si pasa un mes:
        if(diff.getMonths() >= 1 ){
            return "Ya transcurrió un mes : \n"+diff.getYears()+" Año - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
        }else{
            return "Tiempo desde primer contacto: \n"+diff.getYears()+" Año/s - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
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

    public String OportunitySheet() {
        return "Nº OPO: " + codigoOp +", Empresa: '" + empresa +
                '\'' +"\n ¿Seguimiento? : " + newCall + "\n - Primer Contacto: " + contactDate+ "\n - Potencial: "+ getPotencial();
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
                ", items: " + items +
                ", Comentarios Adicionales: " + comentario +
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
 */
 /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el potencial: Negativo, Neutral, Positivo ");
        String entry=sc.next();
        Potencial pot = Enum.valueOf(Potencial.class, entry);
        System.out.println("Potencial: "+ pot.getSigno());*/

/*
    public void setPrecioReferencia(String precioReferencia) {
        if (precioReferencia.equalsIgnoreCase("si")) {
            this.precioReferencia = true;
        } else {
            this.precioReferencia  = false;
        }
    }
*/