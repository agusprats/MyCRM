package adaitw.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Oportunidad {
    private List<Prospecto> prospectos = new ArrayList<>();
    private LocalDate contactDate;
    private Boolean newCall;
    private Potencial potencial;
    private List<Item> items;// productos y servicios ofrecidos

    public Oportunidad(){
        this.prospectos = prospectos;
        this.contactDate = contactDate;
        this.newCall = newCall;
        this.potencial= potencial;
    }

    public  List<Prospecto> getProspecto() {
        return prospectos;
    }

    public void agregarProspecto(Prospecto prospecto){
        prospectos.add(prospecto);
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

    public Potencial getPotencial() {
        return this.potencial;
    }

    public void setPotential(int choice) {
        switch(choice) {
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


    public String OportunitySheet() {
        return " " + getProspecto() + " - Contactar? : " + getnewCall() + " - Ultimo Contacto: " + ultimoContacto()+ getPotencial();
    }

}

