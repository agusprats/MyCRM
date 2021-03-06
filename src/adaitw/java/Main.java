package adaitw.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        Vendedor v = new Vendedor();
        List<Vendedor> vendedores = new ArrayList<>();
        List<Oportunidad> oportunidades = new ArrayList<>();
        List <Cliente> listaClientes = new ArrayList<>();
        List<Prospecto> prospectos = new ArrayList<>();
        Oportunidad oportunidad = new Oportunidad();


        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("\n ***  MENU PRINCIPAL  *** \n");
            System.out.println("1.Cargar Nuevo Vendedor");
            System.out.println("2.Cargar Nuevo Cliente");
            System.out.println("3.Cargar Nueva Oportunidad");
            System.out.println("4.Ver Ficha");
            System.out.println("5.Ver .....");
            System.out.println("6.Listar Vendedores");
            System.out.println("7.Listar Clientes");
            System.out.println("8.Listar Oportunidades");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    e.cargarVendedor();
                    break;
                case 2:
                    v.crearProspecto();
                    break;
                case 3:
                    v.crearOportunidad();
                    break;
                case 4:
                    oportunidad.OportunitySheet();
                    break;
                case 5:
                    //System.out.println(oportunidad.getProspecto());
                    break;
                case 6:
                    System.out.println(e.getVendedores());
                    break;
                case 7:
                    System.out.println(v.getListaClientes());
                    break;
                case 8:
                    System.out.println(v.getOportunidades());
                    break;
                case 9:
                    System.exit(0);

            }
        }while(choice!=0);

    }


}







/*CRM para la gestión de ventas en una empresa
Se requiere un sistema que permita registrar una oportunidad de negocio.

En cada oportunidad se debe anotar el nombre de la empresa, el nombre del contacto, su cargo,
el producto o servicio ofrecido y si acepta una llamada de seguimiento.
Además, registrar fecha de contacto inicial y si se le brindó un precio de referencia y en ese caso, indicar monto.

Notas: El sistema va a tener muchos vendedores.

Cada vendedor debería tener muchas oportunidades de negocio. Las oportunidades pertenecen al vendedor.
Si un vendedor deja la empresa, las oportunidades se asignan a otro vendedor.

Un vendedor tiene muchos clientes y muchas oportunidades.
Pueden existir más de una oportunidad en el mismo cliente.
Por ej., al gte. de sistemas de EmpresaX le interesó un producto y al gte. de seguridad de la misma empresa le interesó un producto o servicio distinto.
Pueden reutilizar el sistema de presupuestos para las listas de productos y servicios.
Sales funnel / embudo de ventas:
* */






    /*private static void agregarProspecto(Oportunidad oportunidades) {
        Scanner sc = new Scanner(System.in);
        Prospecto unProspecto = new Prospecto( "RENFE", "Julio", "Jefe", "000111", "julio@mail.com", "Málaga");
        System.out.print("Indique id: ");
        int id = sc.nextInt();
        unProspecto.setId(id);
        oportunidades.agregarProspecto(unProspecto);
        unProspecto.prospectoToString();

    }*/