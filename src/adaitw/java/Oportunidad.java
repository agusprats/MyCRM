package adaitw.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oportunidad {
    private List<Prospecto> prospectos = new ArrayList<>();
    private LocalDate contactDate;
    private Boolean newCall;
    private Potencial potencial;
    private List<Item> items;// productos y servicios ofrecidos
    private Boolean precioReferencia;

    public Oportunidad(){
        this.prospectos = prospectos;
        this.contactDate = contactDate;
        this.newCall = newCall;
        this.potencial= potencial;
        this.precioReferencia = precioReferencia;
    }

    public  List<Prospecto> getProspectos() {
        return prospectos;
    }

    public void agregarProspecto(Prospecto prospecto){
        prospectos.add(prospecto);
    }

    public void eliminarProspecto(Prospecto prospecto){
        prospectos.remove(prospecto);
    }

    public LocalDate getContactDate() {
        return contactDate;
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

    public String getnewCall() {
        if (newCall) {
            return " Acepta llamados";
        } else {
            return " No llamar";
        }
    }

    public void setPrecioReferencia(String precioReferencia) {
        if (precioReferencia.equalsIgnoreCase("si")) {
            this.precioReferencia = true;
        } else {
            this.precioReferencia  = false;
        }
    }

    public String getPrecioReferencia(){
        if(precioReferencia){
           return "Se indicó precio";
        }else {
            return "Sin precio";
        }
    }

    public void setPotencial(Potencial potencial) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el potencial: Negativo, Neutral, Positivo ");
        String entry=sc.next();
        Potencial pot = Enum.valueOf(Potencial.class, entry);
        System.out.println("Potencial = "+ pot.getSigno());
    }

    public Potencial getPotencial() {
        return potencial;
    }

    public String OportunitySheet() {
        return " " + getProspectos() + " - Contactar? : " + getnewCall() + " - Ultimo Contacto: " + ultimoContacto()+ getPotencial();
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