package adaitw.java;

import java.io.*;
import java.util.*;

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
        return "Administrador{" +
                "vendedores=" + vendedores +
                ", listaClientes=" + listaClientes +
                '}';
    }
}





