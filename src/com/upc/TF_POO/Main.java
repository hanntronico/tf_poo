package com.upc.TF_POO;

import java.io.Console;
import java.util.Scanner;


public class Main {

    public static boolean verificaLogueo(String usuario, String password) {
        if (usuario.equals("admin") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }

    public static void limpiaPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
    }


    public static void main(String[] args) {

        VecinoFactory factory = new VecinoFactory();
        Vecino adultoMayorA = factory.crear("AdultoMayor", "16598774", "Miguel Trauco", "945126321", "CASADO", "1940-10-10");
        Vecino adultoMayorB = factory.crear("AdultoMayor", "12154545", "Pedro Gallese", "963852741", "SOLTERO", "1945-03-07");
        Vecino adultoMayorC = factory.crear("AdultoMayor", "10665654", "Cristian Cueva","956123744", "SOLTERO", "1952-08 -09");

        Vecino miembroA = factory.crear("MiembroClub", "11223344", "Alexander Callens","945126321", "CASADO", "1950-10-10");
        Vecino miembroB = factory.crear("MiembroClub", "12369988", "Cristian Ramos","951753666", "SOLTERO", "1950-01-06");
        Vecino miembroC = factory.crear("MiembroClub", "16569681", "Gianluca Lapadula","963852222", "SOLTERO", "1942-08-25");
        Vecino miembroD = factory.crear("MiembroClub", "16598774", "Gianluca Lapadula","945126321", "CASADO", "1950-08-25");

        Asiento a1 = new Asiento(11, "PASILLO");
        Asiento a2 = new Asiento(22, "VENTANA");
        Asiento a3 = new Asiento(33, "PASILLO");
        Asiento a4 = new Asiento(44, "VENTANA");
        Asiento a5 = new Asiento(55, "PASILLO");

        Bus primerBus = new Bus(121212, a1);

//        primerBus.registrarVecino(adultoMayorA);
//        primerBus.registrarVecino(adultoMayorB);
//        primerBus.registrarVecino(adultoMayorC);
//        primerBus.registrarVecino(miembroA);
//        primerBus.registrarVecino(miembroB);
//        primerBus.registrarVecino(miembroC);

        Reserva nuevaReserva = new Reserva("2021-11-07", primerBus, primerBus.obtenerVecino("16598774"), a1);

//        System.out.println( nuevaReserva.buscarVecino("11223344") );
//        System.out.println( nuevaReserva.listarPasajerosPorBus("2021-11-07", 121212) );
//        System.out.println( primerBus.toString() );
//
//        System.out.printf( "Promedio de edad: %.2f", primerBus.promedioEdades() );

//        System.out.println( primerBus.vecinosConObsequio() );
//        System.out.printf( "Promedio de edades de los vecinos al Club sin Obsequio: %.2f", primerBus.vecinosMiembrosSinObsequio() );




        Scanner sc = new Scanner(System.in);
        int opcion = 0, opcionPro = 0, opcionCli = 0, opcionRepo=0;
        String opcionRepo1 = "";
        String menu = "";
        String enter = "";

        limpiaPantalla();
        System.out.print("");
        menu = "";
        menu += " ******************************************\n";
        menu += " |                                        |\n";
        menu += " |       MUNICIPALIDAD DE SAN BORJA       |\n";
        menu += " |     SISTEMA DE RESERVA DE ASIENTO      |\n";
        menu += " |                                        |\n";
        menu += " ******************************************\n";
        menu += "\n";
        menu += "\n";


        menu+="Ingrese usuario: ";
        System.out.printf(menu);
        String usuario = sc.nextLine();
        Console cnsl = null;
        String alpha = null;
        String password = "";
        try {
            cnsl = System.console();
            if (cnsl != null) {
                char[] pwd = cnsl.readPassword("Password: ");
                password = String.valueOf(pwd);
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }

        if (verificaLogueo(usuario, password)) {


            do {
                limpiaPantalla();
                System.out.print("");
                menu = "\n";
                menu += "  ******************************************\n";
                menu += "  |                                        |\n";
                menu += "  |            MENU DE OPCIONES            |\n";
                menu += "  |                                        |\n";
                menu += "  ******************************************\n";
                menu += "\n";
                menu += "  1- REGISTRO O CARGA DE DATOS DE LOS BUSES \n";
                menu += "  2- REGISTRO DE VECINOS \n";
                menu += "  3- RESERVA DE ASIENTO \n";
                menu += "  4- Reportes \n";
                menu += "  5- Finalizar \n";
                menu += "     Seleccione una opcion:";
                System.out.println(menu);
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:


                        do {
                            limpiaPantalla();
                            System.out.print("");
                            menu = "\n";
                            menu += "  ******************************************\n";
                            menu += "  |                                        |\n";
                            menu += "  |              CARGA DE DATOS            |\n";
                            menu += "  |                                        |\n";
                            menu += "  ******************************************\n";
                            menu += "\n";
                            menu += "  1- Registrar Adultos Mayores \n";
                            menu += "  2- Registrar MiembroClub \n";
                            menu += "  3- ---------------------- \n";
                            menu += "  4- Listar Vecinos Registrados \n";
                            menu += "  5- Volver al menu principal \n";
                            menu += "\n";
                            menu += "     Seleccione una opcion:";
                            System.out.println(menu);

                            opcionPro = sc.nextInt();


                            switch (opcionPro) {
                                case 1:
                                    limpiaPantalla();
                                    System.out.println("");
                                    System.out.println("********* Registrando Adultos Mayores *********\n");
//                                    String bus1 = sc.nextLine();
//                                    System.out.printf("Ingrese c\u00f3digo del Producto: ");
//                                    String codProductoBus1 = sc.nextLine();

                                    primerBus.registrarVecino(adultoMayorA);
                                    primerBus.registrarVecino(adultoMayorB);
                                    primerBus.registrarVecino(adultoMayorC);

                                    System.out.println();
                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    enter = sc.nextLine();
                                    break;
                                case 2:
                                    limpiaPantalla();
                                    System.out.println(" ");
                                    System.out.println("********* Registrando MiembroClub *********\n");

                                    primerBus.registrarVecino(miembroA);
                                    primerBus.registrarVecino(miembroB);
                                    primerBus.registrarVecino(miembroC);


                                    System.out.println();
                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    enter = sc.nextLine();

//                                    if (registrarProducto(nombreProducto, descripcioProducto, colorProducto, tallaProducto, precioProducto)) {
//                                        System.out.println( listarProductos() );
//                                        System.out.println("Presionar enter para continuar ...");
//                                        enter = sc.nextLine();
//                                    }
                                    break;
                                case 3:
                                    limpiaPantalla();
                                    System.out.println(" ");
                                    System.out.println("*********** VER ***********\n");
//                                    String esp = sc.nextLine();
//                                    System.out.printf("Ingrese c\u00f3digo del Producto: ");
//                                    String codProductoBus2 = sc.nextLine();

                                    System.out.println();
                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    enter = sc.nextLine();

                                    break;
                                case 4:
                                    limpiaPantalla();
                                    System.out.println(" ");
                                    System.out.println("********* LISTAR USUARIOS *********");
                                    System.out.println();
                                    String ffff = sc.nextLine();
                                    System.out.println( primerBus.toString() );
                                    System.out.printf("\nPresionar enter para continuar ...");
                                    String enter2 = sc.nextLine();
                                    break;
                            }
                        } while (opcionPro != 5);


                        break;
                    case 2:
                        do {
                            limpiaPantalla();
                            System.out.print("");
                            menu = "\n";
                            menu += "  ******************************************\n";
                            menu += "  |                                        |\n";
                            menu += "  |           REGISTRO DE VECINOS          |\n";
                            menu += "  |                                        |\n";
                            menu += "  ******************************************\n";
                            menu += "\n";
                            menu += "  1- Registrar Adultos Mayores \n";
                            menu += "  2- Registrar MiembroClub \n";
                            menu += "  3- --------------------- \n";
                            menu += "  4- Listar Vecinos \n";
                            menu += "  5- Volver al menu principal \n";
                            menu += "\n";
                            menu += "     Seleccione una opcion:";
                            System.out.println(menu);

//                            String fffff = sc.nextLine();
//                            System.out.println( listarProductos() );
//                            System.out.println("Seleccione una opcion: ");
                            opcionCli = sc.nextInt();


                            switch (opcionCli) {
                                case 1:
                                    limpiaPantalla();
                                    System.out.println("");
                                    System.out.println("********* B\u00fasqueda de Cliente *********\n");
                                    String bus1 = sc.nextLine();
                                    System.out.printf("Ingrese c\u00f3digo del Cliente: ");
//                                    String codClienteBus1 = sc.nextLine();
//                                    System.out.println(verCliente(codClienteBus1));
                                    System.out.println();
                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case 2:
                                    limpiaPantalla();
                                    System.out.println(" ");
                                    System.out.println("********* REGISTRAR CLIENTE *********\n");
                                    String fff = sc.nextLine();
                                    System.out.printf("Ingrese nombre del cliente: ");
                                    String nombreCliente = sc.nextLine();
                                    System.out.printf("Ingrese documento de indentidad del cliente: ");
                                    String documentoCliente = sc.nextLine();
                                    System.out.printf("Ingrese RUC del cliente: ");
                                    String rucCliente = sc.nextLine();
                                    System.out.printf("Ingrese direcci\u00f3n del cliente: ");
                                    String direccionCliente = sc.nextLine();
                                    System.out.printf("Ingrese telefono del cliente: ");
                                    String telefonoCliente = sc.nextLine();
                                    System.out.printf("Ingrese email del cliente: ");
                                    String emailCliente = sc.nextLine();

//                                    if (registrarCliente(nombreCliente, documentoCliente, rucCliente, direccionCliente, telefonoCliente, emailCliente)) {
//                                        System.out.println( listarClientes() );
                                        System.out.println("Presionar enter para continuar ...");
                                        enter = sc.nextLine();
//                                    }
                                    break;
                                case 3:
                                    limpiaPantalla();
                                    System.out.println(" ");
//                                    System.out.println("********* LISTAR  *********");
//                                    String ffff = sc.nextLine();
//                                    System.out.println( listarClientes() );
                                    System.out.println("Presionar enter para continuar ...");
                                    String enter2 = sc.nextLine();
                                    break;
                                case 4:
                                    limpiaPantalla();
                                    System.out.println(" ");
                                    System.out.println("********* LISTAR CLIENTES *********");
                                    String ffff = sc.nextLine();
//                                    System.out.println( listarClientes() );
                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                            }
                        } while (opcionCli != 5);

                        break;
                    case 3:
                        limpiaPantalla();
                        System.out.print("");
                        menu = "\n";
                        menu += "  ******************************************\n";
                        menu += "  |                                        |\n";
                        menu += "  |           RESERVA DE ASIENTOS          |\n";
                        menu += "  |                                        |\n";
                        menu += "  ******************************************\n";
                        menu += "\n";

                        System.out.print("");
                        System.out.println("********* LISTAR PEDIDOS *********");
                        String ffff = sc.nextLine();
//                        System.out.println( listarPedidos() );
                        System.out.println("Presionar enter para continuar ...");
                        String enter2 = sc.nextLine();
                        break;
                    case 4:
                        do {
                            limpiaPantalla();
                            System.out.print("");
                            menu = "\n";
                            menu += "  ******************************************\n";
                            menu += "  |                                        |\n";
                            menu += "  |                REPORTES                |\n";
                            menu += "  |                                        |\n";
                            menu += "  ******************************************\n";
                            menu += "\n";
                            menu += "  1- REPORTES DE LOS DATOS DEL VECINO SEGUN DNI \n";
                            menu += "  2- REPORTE DE PASAJEROS SEGUN FECHA Y NÚMERO DE BUS (INCLUYA REGALO A OTORGAR) \n";
                            menu += "  3- REPORTE DEL PROMEDIO DE EDADES DE LOS ADULTOS MAYORES REGISTRADOS \n";
                            menu += "  4- REPORTE DE LOS VECINOS QUE SOLO OBTUVIERON UN OBSEQUIO Y CUAL FUE \n";
                            menu += "  5- REPORTE DEL PROMEDIO DE EDADES DE LOS VECINOS MIEMBROS DEL CLUB DE ECOLOGIA SIN OBSEQUIO \n";
                            menu += "  6- REPORTE DE ASIENTOS POR BUSES \n";
                            menu += "  7- REPORTE DE PASAJEROS REGISTRADOS POR BUSES CON SUS RESPECTIVOS REGALOS \n";
//                            menu += "  8- Mes con menor cantidad de ventas de Persona Natural \n";
//                            menu += "  9- Ventas totales por mes \n";
//                            menu += "  A- Total de ventas \n";
                            menu += " (R) Retornar al menu principal \n";
                            menu += "\n";
                            menu += "     Seleccione una opcion:  ";
                            System.out.printf(menu);
                            opcionRepo1 = sc.nextLine();
                            switch (opcionRepo1) {
                                case "1":
                                    limpiaPantalla();
                                    System.out.println(" ");
                                    System.out.println("********* REPORTES DE LOS DATOS DEL VECINO SEGUN DNI *********");

                                    String fff1 = sc.nextLine();
                                    System.out.printf("Ingrese DNI VECINO: ");
                                    String nroDNIVecino = sc.nextLine();

                                    try {
                                        System.out.println( nuevaReserva.buscarVecino(nroDNIVecino) );
                                    }catch (Exception e){
                                        System.out.println(e.getMessage());
                                    }



                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case "2":
                                    limpiaPantalla();
                                    System.out.println();
                                    System.out.println(" *********  REPORTE DE PASAJEROS SEGUN FECHA Y NÚMERO DE BUS (INCLUYA REGALO A OTORGAR)  *******\n");

                                    String fff = sc.nextLine();
                                    System.out.printf("Ingrese NRO BUS: ");
                                    String nroBus = sc.nextLine();

//                                    String fff2 = sc.nextLine();
                                    System.out.printf("Ingrese FECHA: ");
                                    String fecha = sc.nextLine();

                                    if ( nuevaReserva.listarPasajerosPorBus(fecha, Integer.parseInt(nroBus) ) != null ){
//                                        System.out.println( nuevaReserva.listarPasajerosPorBus("2021-11-07", Integer.parseInt(nroBus)) );
                                        System.out.println( nuevaReserva.listarPasajerosPorBus(fecha, Integer.parseInt(nroBus)) );
                                    }else{
                                        System.out.println("DNI no se encuentra asignado para esa fecha");
                                    }
//                                    System.out.println( nuevaReserva.listarPasajerosPorBus("2021-11-07", 121212) );


                                    System.out.println();
                                    System.out.println(" Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case "3":
                                    String tipoPedido = "";
                                    limpiaPantalla();
                                    System.out.println();
                                    System.out.println(" *********  REPORTE DEL PROMEDIO DE EDADES DE LOS ADULTOS MAYORES REGISTRADOS  *******\n");

                                    System.out.printf( "Promedio de edad: %.2f\n", primerBus.promedioEdades() );

                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case "4":
                                    String texto = "", tipo = "";
                                    limpiaPantalla();
                                    System.out.println(" ********* REPORTE DE LOS VECINOS QUE SOLO OBTUVIERON UN OBSEQUIO Y CUAL FUE   *******\n");

                                    System.out.println( primerBus.vecinosConObsequio() );

                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case "5":
                                    limpiaPantalla();
                                    System.out.println(" *********  REPORTE DEL PROMEDIO DE EDADES DE LOS VECINOS MIEMBROS DEL CLUB DE ECOLOGIA SIN OBSEQUIO  *******\n");

                                    System.out.printf( "Promedio de edades de los vecinos al Club sin Obsequio: %.2f\n", primerBus.vecinosMiembrosSinObsequio() );

                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case "6":
                                    limpiaPantalla();
                                    System.out.println(" *********  REPORTE DE ASIENTOS POR BUSES *******\n");

                                    System.out.printf( "Promedio de edades de los vecinos al Club sin Obsequio: %.2f\n", primerBus.vecinosMiembrosSinObsequio() );

                                    System.out.println();
                                    System.out.println("Presionar enter para continuar ...");
                                    enter = sc.nextLine();
                                    break;
                                case "7":


                                    break;
//                                case "8":
//                                    break;
//                                case "9":
//                                    break;
//                                case "A":
//                                    limpiaPantalla();
//                                    System.out.println("Reporte A");
//                                    System.out.println("Presionar enter para continuar ...");
//                                    enter = sc.nextLine();
//                                    break;

                            }

                        } while ( !opcionRepo1.equalsIgnoreCase("R") );




                        break;
                }
            } while (opcion != 5);


//            System.out.println( nuevaReserva.buscarVecino("11223344") );
//            System.out.println( primerBus.toString() );

        }else{
            System.out.println("Usuario o Password incorrecto!!");

        }
























    }


}
