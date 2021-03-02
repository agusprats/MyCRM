package adaitw.java;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        List<Oportunidad> oportunidades = new ArrayList<>();
        List<Prospecto> prospectos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String usuario = "";
        do{
            System.out.println("\n Menú: \n");
            System.out.println("1.Crear nueva Oportunidad");
            System.out.println("2.Crear nuevo Prospecto");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    crearOportunidad((Oportunidad) oportunidades);
                    break;
                case 2:
                    agregarProspecto((Prospecto) prospectos);
                    break;
                case 3:
                    System.exit(0);

            }
        }while(choice!=0);
    }

    public static void agregarProspecto(Prospecto prospectos) {

    }

    public static void crearOportunidad(Oportunidad oportunidades) {

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