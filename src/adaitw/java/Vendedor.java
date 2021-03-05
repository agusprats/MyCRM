package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    List<Oportunidad> oportunidades;
    private String codigo;

    public Vendedor() {
        this.codigo = codigo;
        this.oportunidades = new ArrayList<>();
    }

    public List<Oportunidad> getOportunidades() {
        return oportunidades;
    }

    public void agregarOportunidad(Oportunidad oportunidad) {
        this.oportunidades.add(oportunidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                //"oportunidades=" + oportunidades +
                "Codigo='" + codigo + '\'' +
                '}';
    }
}

