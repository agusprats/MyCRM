package adaitw.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor {
    private String codigo;
    List <Cliente> listaClientes;
    List<Oportunidad> listaOportunidades;

    public Vendedor() {
        this.codigo = codigo;
        this.listaClientes = new ArrayList<>();
        this.listaOportunidades = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Oportunidad> getOportunidades() {
        return listaOportunidades;
    }

    public void agregarOportunidad(Oportunidad oportunidad) {
        this.listaOportunidades.add(oportunidad);
    }

    public void crearProspecto(){
        Scanner scanner = new Scanner(System.in);
        Cliente unCliente = new Cliente();
        Oportunidad op = new Oportunidad();
        System.out.println("Codigo: ");
        int codigo = scanner.nextInt();
        unCliente.setCodigo(codigo);
        System.out.println("Empresa: ");
        String empresa = scanner.next();
        unCliente.setEmpresa(empresa);
        System.out.println("Contacto: ");
        String contacto = scanner.next();
        unCliente.setContacto(contacto);
        System.out.println("Cargo: ");
        String cargo = scanner.next();
        unCliente.setCargo(cargo);
        System.out.println("Ingrese Numero Oportunidad (Solo números):  ");
        int numeroOp = scanner.nextInt();
        op.setNumeroOp(numeroOp);
        System.out.println("Contactar nuevamente? (true/false) ");
        Boolean newCall = scanner.hasNext();
        op.setNewCall(newCall);
        listaClientes.add(unCliente);
        listaOportunidades.add(op);
        System.out.println(getListaClientes()+""+ getOportunidades());
}


    public void crearOportunidad() {
        Scanner scanner = new Scanner(System.in);
        Oportunidad op = new Oportunidad();
        System.out.println("Ingrese Numero Oportunidad (Solo números):  ");
        int numeroOp = scanner.nextInt();
        op.setNumeroOp(numeroOp);
        System.out.println("Contactar nuevamente? (true/false) ");
        Boolean newCall = scanner.hasNext();
        op.setNewCall(newCall);
        /*
        System.out.println("Fecha de contacto ");
        LocalDate contactDate = LocalDate.parse(scanner.next());
        op.setContactDate(contactDate);*/

        listaOportunidades.add(op);

        //System.out.println(oportunidades);

        //List<Prospecto> prospectos = op.getProspecto();
        //Prospecto unProspecto = prospectos.get(0);
        //Prospecto p = (Prospecto) unProspecto;

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                //"oportunidades=" + oportunidades +
                "Codigo='" + getCodigo() + '\'' +
                '}';
    }


}

   /*
    public static void agregarProspecto(Oportunidad oportunidad) {
        Scanner scanner = new Scanner(System.in);
        List<Prospecto> prospectos = new ArrayList<>();
        Prospecto unProspecto = new Prospecto();
        System.out.println("Ingrese ID: ");
        int id = scanner.nextInt();
        unProspecto.setId(id);
        System.out.println("Empresa (Solo caracteres alfabéticos): ");
        String empresa = scanner.next();
        unProspecto.setEmpresa(empresa);
        System.out.println("Ingrese Contacto: ");
        String contacto = scanner.next();
        unProspecto.setContacto(contacto);
        System.out.println("Ingrese email: ");
        String email = scanner.next();
        unProspecto.setEmail(email);
        oportunidad.agregarProspecto(unProspecto);
        prospectos.add(unProspecto);
    }
*/