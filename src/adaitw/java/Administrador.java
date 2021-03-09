package adaitw.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrador implements Controller{
    List<Vendedor> vendedores;
    List<Cliente> listaClientes;


    public Administrador() {
        this.vendedores = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }


    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void crearVendedor(){
        Scanner scanner = new Scanner(System.in);
        Vendedor v = new Vendedor();
        System.out.println("Ingrese CODIGO vendedor: ");
        String id = scanner.next();
        v.setId(id);
        System.out.println("Ingrese NOMBRE vendedor: ");
        String nombre = scanner.next();
        v.setNombre(nombre);
        vendedores.add(v);
    }


    public void crearCliente(){
        Scanner scanner = new Scanner(System.in);
        Cliente unCliente = new Cliente();
        Oportunidad op = new Oportunidad();
        System.out.println("ID (Sólo números): ");
        int id = scanner.nextInt();
        unCliente.setId(id);
        System.out.println("Empresa: ");
        String empresa = scanner.next();
        unCliente.setEmpresa(empresa);
        System.out.println("Contacto: ");
        String contacto = scanner.next();
        unCliente.setContacto(contacto);
        System.out.println("Cargo: ");
        String cargo = scanner.next();
        unCliente.setCargo(cargo);

        listaClientes.add(unCliente);
        System.out.println(getListaClientes());
    }

}





