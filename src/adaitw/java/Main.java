package adaitw.java;

import java.util.Scanner;

public class Main {

    //VISTA
    public static void ingresoAdministrador(){
        Administrador administrador = new Administrador();
        Scanner sc = new Scanner(System.in);

        boolean cont = true;
        while(cont){
            System.out.println("\n ***  PANEL ADMINISTRADOR  *** \n");
            System.out.println("1.CREAR VENDEDOR");
            System.out.println("2.CREAR CLIENTE");
            System.out.println("3.LISTAR VENDEDORES");
            System.out.println("4.LISTAR CLIENTES");
            System.out.println("5.VOLVER MENU PRINCIPAL");
            System.out.print("Ingrese la opción deseada: ");
            int choice2 = sc.nextInt();
            switch (choice2){
                case 1:
                    administrador.crearVendedor();
                    break;
                case 2:
                    administrador.crearCliente();
                    break;
                case 3:
                    System.out.println(administrador.getVendedores());
                    break;
                case 4:
                    System.out.println(administrador.getClientes());
                    break;
                case 5:
                   cont= false;
            }
        }
    }

    public static void ingresoVendedor() {
        Vendedor v = new Vendedor();
        Oportunidad oportunidad = new Oportunidad();
        Scanner sc = new Scanner(System.in);

        boolean isRun = true;
        while(isRun){
            System.out.println("\n ***  PANEL VENDEDOR  *** \n");
            System.out.println("1.CREAR OPORTUNIDAD");
            System.out.println("2.CREAR CLIENTE");
            System.out.println("3.LISTAR OPORTUNIDADES");
            System.out.println("4.LISTAR CLIENTES");
            System.out.println("5.VOLVER MENU PRINCIPAL");
            System.out.print("Ingrese la opción deseada: ");
            int choice3 = sc.nextInt();
            switch (choice3) {
                case 1:
                    v.crearOportunidad();
                    break;
                case 2:
                    v.crearCliente();
                    break;
                case 3:
                    v.getOportunidades();
                    break;
                case 4:
                    System.out.println(v.getClientes());
                    break;
                case 5:
                   isRun = false;
            }
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println();
            System.out.println("--- * MENU PRINCIPAL * ----");
            System.out.println("1.INGRESO ADMINISTRADOR");
            System.out.println("2.INGRESO VENDEDOR");
            System.out.println("3.EXIT");
            System.out.println("----------------------------");
            int choice1 = Consola.validateInt("Seleccionar (número): ", 1, 3);
            switch(choice1) {
                case 1:
                    ingresoAdministrador();
                    break;
                case 2:
                    Consola.verificarVendedor("Ingrese Clave de Acceso: ");
                    ingresoVendedor();
                    break;
                case 3:
                    System.exit(0);

            }

        }

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




/*

Vendedor v = new Vendedor();
Oportunidad oportunidad = new Oportunidad();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("\n ***  MENU PRINCIPAL  *** \n");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    administrador.cargarVendedor();
                    break;
                case 2:
                    v.crearOportunidad();
                    break;

                case 9:
                    System.exit(0);

            }
        }while(choice!=0);

    */








