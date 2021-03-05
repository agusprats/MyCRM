package adaitw.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        Vendedor v = new Vendedor();

       // List<Oportunidad> oportunidades = new ArrayList<>();
        List<Prospecto> prospectos = new ArrayList<>();
        Oportunidad oportunidad = new Oportunidad();

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String usuario = "";
        do{
            System.out.println("\n ***  MENU PRINCIPAL  *** \n");
            System.out.println("1.Crear nueva Oportunidad");
            System.out.println("2.Crear Prospecto");
            System.out.println("3.Ver Ficha");
            System.out.println("4.Ver Prospectos");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    crearOportunidad();
                    break;
                case 2:
                    agregarProspecto(oportunidad);
                    break;
                case 3:
                    oportunidad.OportunitySheet();
                    break;
                case 4:
                    System.out.println(oportunidad.getProspecto());

                    break;
                case 5:
                    System.exit(0);

            }
        }while(choice!=0);

    }

    public static void agregarProspecto(Oportunidad oportunidad) {
        Scanner scanner = new Scanner(System.in);
        Prospecto unProspecto = new Prospecto();
        System.out.println("Ingrese ID: ");
        int id = scanner.nextInt();
        unProspecto.setId(id);
        System.out.println("Empresa (Solo caracteres alfabéticos): ");
        String empresa = scanner.next();
        unProspecto.setEmpresa(empresa);
        System.out.println("Ingrese Contacto: ");
        String contacto = scanner.next();
        unProspecto.setContacto(contacto);
        System.out.println("Ingrese email: ");
        String email = scanner.next();
        unProspecto.setEmail(email);
        oportunidad.agregarProspecto(unProspecto);

    }
    public static void crearOportunidad() {
        Oportunidad oportunidad = new Oportunidad();
        List<Prospecto> prospectos = oportunidad.getProspecto();
        Prospecto unProspecto = prospectos.get(0);
        Prospecto p = (Prospecto) unProspecto;


    }



}







/*CRM para la gestión de ventas en una empresa
Se requiere un sistema que permita registrar una oportunidad de negocio.
En cada oportunidad se debe anotar el nombre de la empresa, el nombre del contacto, su cargo,
el producto o servicio ofrecido y si acepta una llamada de seguimiento.
Además, registrar fecha de contacto inicial
y si se le brindó un precio de referencia
y en ese caso, indicar monto.
Notas: El sistema va a tener muchos vendedores.
Cada vendedor debería tener muchas oportunidades de negocio.
Las oportunidades pertenecen al vendedor.
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