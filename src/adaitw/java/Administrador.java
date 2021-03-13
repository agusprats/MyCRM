package adaitw.java;

import java.util.*;

public class Administrador implements ControlCentral {
    List<Vendedor> vendedores;
    List<Cliente> clientes;


    public Administrador() {
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }


    public List<Vendedor> getVendedores() {
        return vendedores;
    }


    public void crearVendedor(){
        Scanner scanner = new Scanner(System.in);
        Vendedor v = new Vendedor();
        v.setId(Consola.validarId("Ingrese CODIGO: ( V + número/s sin espacios): "));
        v.setNombre(Consola.validarNombreVendedor("Ingrese NOMBRE: (Solo caracteres alfabéticos): "));
        vendedores.add(v);
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
        System.out.println(getClientes());
    }


    @Override
    public String toString() {
        return "Administrador{" +
                "vendedores=" + vendedores +
                ", listaClientes=" + clientes +
                '}';
    }
}


  /*private static void agregarProspecto(Oportunidad oportunidades) {
        Scanner sc = new Scanner(System.in);
        Prospecto unProspecto = new Prospecto( "RENFE", "Julio", "Jefe", "000111", "julio@mail.com", "Málaga");
        System.out.print("Indique id: ");
        int id = sc.nextInt();
        unProspecto.setId(id);
        oportunidades.agregarProspecto(unProspecto);
        unProspecto.prospectoToString();

    }*/


