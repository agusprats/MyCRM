package adaitw.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empresa e = new Empresa();

        List<Oportunidad> oportunidades = new ArrayList<>();
        List<Prospecto> prospectos = new ArrayList<>();
        Oportunidad oportunidad = new Oportunidad();

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String usuario = "";
        do{
            System.out.println("\n ***MENU PRINCIPAL*** \n");
            System.out.println("1.Crear nueva Oportunidad");
            System.out.println("2.Crear nuevo Prospecto");
            System.out.println("3.Ver Ficha");
            System.out.println("4.Ver Prospectos");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    crearOportunidad(oportunidad);
                    break;
                case 2:
                    agregarProspecto(oportunidad);
                    break;
                case 3:
                    oportunidad.OportunitySheet();
                    break;
                case 4:
                    oportunidad.getProspectos();
                    System.out.println(prospectos.size());
                    System.out.println(prospectos.toString());
                    break;
                case 5:
                    System.exit(0);

            }
        }while(choice!=0);

    }

    public static void crearOportunidad(Oportunidad oportunidad) {
        List<Prospecto> prospectos = oportunidad.getProspectos();


    }

    public static void agregarProspecto(Oportunidad oportunidad) {
        List<Prospecto> prospectos = new ArrayList<>();
        //List<Oportunidad> oportunidades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Prospecto UnProspecto = new Prospecto();
        System.out.println("Ingrese ID: ");
        int id = scanner.nextInt();
        UnProspecto.setId(id);
        System.out.println("Empresa (Solo caracteres alfabéticos): ");
        String empresa = scanner.next();
        UnProspecto.setEmpresa(empresa);
        System.out.println("Ingrese Contacto: ");
        String contacto = scanner.next();
        UnProspecto.setContacto(contacto);
        System.out.println("Ingrese email: ");
        String email = scanner.next();
        UnProspecto.setEmail(email);
        oportunidad.agregarProspecto(UnProspecto);
        prospectos.add(UnProspecto);
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