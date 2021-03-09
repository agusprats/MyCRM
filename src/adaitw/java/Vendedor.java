package adaitw.java;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Vendedor implements Controller {
    private String id;
    private String nombre;
    List <Cliente> listaClientes;
    List<Oportunidad> listaOportunidades;

    public Vendedor() {
        this.id = id;
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaOportunidades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    public void crearOportunidad() {
        Scanner scanner = new Scanner(System.in);
        Oportunidad op = new Oportunidad();
        System.out.println("Ingrese Numero Oportunidad (Solo números):  ");
        int numeroOp = scanner.nextInt();
        op.setNumeroOp(numeroOp);
        System.out.println("Empresa: ");
        String empresa = scanner.next();
        op.setEmpresa(empresa);
        System.out.println("Contacto: ");
        String contacto = scanner.next();
        op.setContacto(contacto);
        System.out.println("Cargo: ");
        String cargo = scanner.next();
        op.setCargo(cargo);
        System.out.println("Primer contacto (YYYY-MM-DD):");
        LocalDate contactDate = LocalDate.parse(scanner.next());
        op.setContactDate(contactDate);
        op.setNewCall(Boolean.parseBoolean(Consola.validarNewCall("¿Contactar nuevamente? (true/false): ")));
        System.out.println("Escribe el potencial: Negativo, Neutral, Positivo ");
        String entry=scanner.next();
        Potencial potencial = Enum.valueOf(Potencial.class, entry);
        op.setPotencial(potencial);
        System.out.println("Comentarios Adicionales: ");
        String comentario = scanner.next();
        op.setComentario(comentario);
        listaOportunidades.add(op);
        System.out.println(getOportunidades());

    }
    public void crearCliente(){
        Scanner scanner = new Scanner(System.in);
        Cliente unCliente = new Cliente();
        System.out.println("Empresa: ");
        String empresa = scanner.next();
        unCliente.setEmpresa(empresa);
        System.out.println("Contacto: ");
        String contacto = scanner.next();
        unCliente.setContacto(contacto);
        System.out.println("Cargo: ");
        String cargo = scanner.next();
        unCliente.setCargo(cargo);
        unCliente.setPhoneNumber(Consola.validarTel("Número Telefónico (10 dígitos): "));
        unCliente.setEmail(Consola.validarEmail("Email (ejemplo@ejemplo.com): "));

        listaClientes.add(unCliente);
        System.out.println(getListaClientes());
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Codigo='" + getId() + '\'' +
                "Nombre='" + getNombre() + '\'' +
                '}';
    }


}



        /*
        op.setPotencial();
        //List<Prospecto> prospectos = op.getProspecto();
        //Prospecto unProspecto = prospectos.get(0);
        //Prospecto p = (Prospecto) unProspecto; */

   /*

   public List<String> prospectoToString() {
        List<String> data = new ArrayList();
        data.add(this.empresa);
        data.add(this.contacto);
        data.add(this.cargo);

        return data;
    }
    public static void agregarProspecto(Oportunidad oportunidad) {
        Scanner scanner = new Scanner(System.in);
        List<Prospecto> prospectos = new ArrayList<>();
        Prospecto unProspecto = new Prospecto();
        System.out.println("Ingrese ID: ");
        int id = scanner.nextInt();
        unProspecto.setId(id);


        oportunidad.agregarProspecto(unProspecto);
        prospectos.add(unProspecto);
    }
*/