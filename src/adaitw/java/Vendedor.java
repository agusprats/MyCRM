package adaitw.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor implements ControlCentral {
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

    public void eliminarOportunidad(Oportunidad oportunidad) {
        this.listaOportunidades.remove(oportunidad);
    }


    public void crearOportunidad() {
        Scanner scanner = new Scanner(System.in);
        Oportunidad op = new Oportunidad();
        op.setCodigoOp(Consola.validarOp("Ingrese Código Oportunidad ( OP + número/s sin espacios): "));
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
        op.setPrecioReferencia(Boolean.parseBoolean(Consola.validarPrecioReferencia("¿Se indicó precio de referencia? (true/false): ")));
        op.setNewCall(Boolean.parseBoolean(Consola.validarNewCall("¿Acepta Seguimiento? (true/false): ")));
        System.out.println("Indicar potencial: Negativo, Neutral, Positivo ");
        String entry=scanner.next();
        Potencial potencial = Enum.valueOf(Potencial.class, entry);
        op.setPotencial(potencial);
        op.setComentario(Consola.validarComentario("Comentarios Adicionales: "));
        op.ultimoContacto();
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