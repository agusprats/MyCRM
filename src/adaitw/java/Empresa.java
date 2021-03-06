package adaitw.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    List<Vendedor> vendedores;

    public Empresa() {
        this.vendedores = new ArrayList<>();
    }

    public List<Vendedor> getVendedores() {
        Iterator<Vendedor> ve = vendedores.iterator();
        while (ve.hasNext()) {
            System.out.println(ve.next());
        }
        return vendedores;
    }

    public void cargarVendedor(){
        Scanner scanner = new Scanner(System.in);
        Vendedor v = new Vendedor();
        System.out.println("Ingrese CODIGO vendedor: ");
        String codigo = scanner.next();
        v.setCodigo(codigo);
        vendedores.add(v);

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "vendedores=" + vendedores +
                '}';
    }
}
