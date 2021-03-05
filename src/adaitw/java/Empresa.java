package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Vendedor> vendedores;

    public Empresa() {
        this.vendedores = new ArrayList<>();
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void cargarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }




}
