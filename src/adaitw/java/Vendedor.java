package adaitw.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Vendedor implements ControlCentral {
    private String id;
    private String nombre;
    private Vendedor gerente;
    private boolean manager;
    List <Cliente> clientes;
    List<Oportunidad> oportunidades;

    public Vendedor() {
        this.clientes = new ArrayList<>();
        this.oportunidades = new ArrayList<>();
    }

    public Vendedor(String id, String nombre, Vendedor gerente, boolean esManager){
        this.id = id;
        this.nombre = nombre;
        this.gerente = gerente;
        this.manager= esManager;
        this.clientes = new ArrayList<>();
        this.oportunidades = new ArrayList<>();
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

    public Vendedor getGerente() {
        return gerente;
    }

    public void setGerente(Vendedor gerente) {
        this.gerente = gerente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void getOportunidades() {
        Iterator<Oportunidad> oportunidadIterator = oportunidades.iterator();
        while (oportunidadIterator.hasNext()) {
            System.out.println(oportunidadIterator.next());
        }
    }

    public void agregarOportunidad(Oportunidad oportunidad) {
        this.oportunidades.add(oportunidad);
    }

    public void eliminarOportunidad(Oportunidad oportunidad) {
        this.oportunidades.remove(oportunidad);
    }


    public void crearOportunidad() {
        boolean isRun = true;
        while (isRun) {
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
            op.setContactDate(LocalDate.parse(Consola.validarFecha("Primer llamado: (YYYY-MM-DD):")));
            op.setPrecioReferencia(Boolean.parseBoolean(Consola.validarPrecioReferencia("¿Se indicó precio de referencia? (true/false): ")));
            op.setNewCall(Boolean.parseBoolean(Consola.validarNewCall("¿Acepta Seguimiento? (true/false): ")));
            System.out.println("Potencial: Negativo - Neutral - Positivo ");
            String entry = scanner.next();
            Potencial potencial = Enum.valueOf(Potencial.class, entry);
            op.setPotencial(potencial);
            op.setComentario(Consola.validarComentario("Comentarios Adicionales: "));
            op.ultimoContacto();
            oportunidades.add(op);
            System.out.println("");
            System.out.println("********************************");
            System.out.println(" ==> CREAR FICHA CLIENTE = 1 \n ==> VER OPORTUNIDAD CREADA = 2 \n ==> ASIGNAR A GERENTE = 3 \n ==> SALIR = 4");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    crearCliente();
                    isRun = false;
                    break;
                case 2:
                    getOportunidades();
                    //System.out.println(getOportunidades());
                    isRun = false;
                    break;
                //case 3: Asignar Oportunidad a Gerente
                case 4:
                    isRun = false;
            }
        }
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
            clientes.add(unCliente);

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
            System.out.println("Primer llamado: (YYYY-MM-DD):");
            LocalDate contactDate = LocalDate.parse(scanner.next());
            op.setContactDate(contactDate);
            */

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