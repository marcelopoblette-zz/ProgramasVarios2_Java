package presentacion;

import java.util.Scanner;
import negocio.Negocio;
public class Presentacion {

    public static void main(String[] args) { //comienzo del main(programa principal)
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");// se llama la clase Scanner para tomar los datos ingresados por el usuario.
        int opciones;// se declara la variable ociones para crear el menú que contenga las opciones que se ofrecerán al usuario.
        int eleccionUsuario = 0; // se inicializa la variable eleccionUsuario con valor cero, esta variable recogerá el valor retornado por la función seguirIntentando.
        boolean boolIterador = false; // se define variable boolIterador  con valor "false" para controlar la salida del ciclo Do-while que contendrá el menú de opciones en una estructura Switch.
        boolean menu;//variable booleana que toma la elección del usuario de volver o no al menu de opciones.
        String numero;
        int salida_ = 0;
        do {//Ciclo do While que contiene el menú de opciones y le da continuidad al flujo del usuario por el menú de opciones, evitando que el programa se caiga.
            System.out.println("============================================================================");
            System.out.println("                Elija un programa para evaluar.");//Título de introducción al manú de opciones. Se imprime
            System.out.println("============================================================================");
            System.out.println("1.- Números sin dividir y divisibles por 2 y por 3 del 1 al 100.");//listo
            System.out.println("2.- Total Ventas.");
            System.out.println("3.- Número Natural.");//listo
            System.out.println("4.- Contraseña y 3 intentos.");
            System.out.println("5.- Día Laboral.");//listo
            System.out.println("6.- Largo de número positivo.");//listo
            System.out.println("7.- Cuenta Vocales.");//listo
            System.out.println("8.- Reemplazo de las a por e.");//listo
            System.out.println("9.- Salir.");
            System.out.println("============================================================================");
            opciones = Integer.parseInt(Negocio.solicitaEntero());
            switch (opciones) {//Se crea estructura switch que desarrollará cada programa solicitado en la evaluación.
                case 1:
                    do{
                        //1.-  Número del 1 al 100 divisibles por 2 y por 3.
                    System.out.println("Numeros sin dividir y divisibles por 2 y por 3 del 1 al 100.");//título que explica función del programa.
                    System.out.println("============================================================================");
                    System.out.println("\nLos numeros del 1 al 100 sin dividir son: ");// se imprime por pantalla titulo explicativo
                    Negocio.divideNumeros(Negocio.numerosDelUnoAlCien(),1);
                    System.out.println("\n\nLos numeros del 1 al 100 divisibles por 2 son: ");// se imprime por pantalla titulo explicativo
                    Negocio.divideNumeros(Negocio.numerosDelUnoAlCien(),2);
                    System.out.println("\n\nLos numeros del 1 al 100 divisibles por 3 son: ");// se imprime por pantalla titulo explicativo
                    Negocio.divideNumeros(Negocio.numerosDelUnoAlCien(),3);
                    System.out.println("\n============================================================================");
                    eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                    if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                        menu = true;
                    } else{ //sino sale al menú principal
                        menu = false;
                    }
                     } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                     break;
                case 2:
                    //2.- Total Ventas.
                    System.out.println("Programa que muestra la suma de todas las ventas ingresadas.");
                    System.out.println("============================================================================\n");
                    do {
                    Negocio.sumaVentas();
                    eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                    if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                        menu = true;
                    } else{ //sino sale al menú principal
                        menu = false;
                    }
                     } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    break;
                case 3:
                    //3.- Número Natural
                    System.out.println("Programa que muestra el número en caso de ser mayor o igual a cero.");//título que explica función del programa.
                    System.out.println("============================================================================\n");
                    Negocio.sleep(1000);
                    do {
                    Negocio.numeroMayorCero();
                    eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                    if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                        menu = true;
                    } else{ //sino sale al menú principal
                        menu = false;
                    }
                     } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                     break;
                case 4:
                    //4.- Contraseña y 3 intentos.
                    System.out.println("Programa que pide una contraseña y da 3 intentos para encontrarla.");//título que explica función del programa.
                    System.out.println("============================================================================\n");
                    Negocio.sleep(1000);
                    do {
                    Negocio.pedirPassword();
                    eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                    if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                        menu = true;
                    } else{ //sino sale al menú principal
                        menu = false;
                    }
                     } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    break;
                case 5:
                    //5.- Día Laboral. String?
                    System.out.println("Programa que muestra si el día de la semana elgido es un dia laboral.");//título que explica función del programa.
                    System.out.println("============================================================================\n");
                    do{
                    Negocio.diaDeLaSemana();
                    eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                    if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                        menu = true;
                    } else{ //sino sale al menú principal
                        menu = false;
                    }
                     } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    break;
                case 6:
                    //6.- Largo de numero Natural.
                    System.out.println("Programa que muestra el largo de número positivo.");//título que explica función del programa.
                    System.out.println("============================================================================\n");
                    Negocio.sleep(1000);
                    do{
                        Negocio.lengthNumero();
                        eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                        if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                            menu = true;
                        } else{ //sino sale al menú principal
                            menu = false;
                        }
                    } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    break;
                case 7:
                    //7.- Cuenta Vocales..
                    System.out.println("Programa que cuenta las vocales de una cadena de texto.");//título que explica función del programa.
                    System.out.println("============================================================================\n");
                    Negocio.sleep(1000);
                    do {
                            Negocio.cuentaVocales();//asignación de valor ingresado por el usuario.
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }

                        } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    break;
                case 8:
                    //8.- Cambia vocales
                    System.out.println("Programa que cambia las vocales de una cadena de texto.");//título que explica función del programa.
                    System.out.println("============================================================================\n");
                    Negocio.sleep(1000);
                    do {
                            Negocio.cambiaVocales();//asignación de valor ingresado por el usuario.
                            Negocio.sleep(2000);
                            eleccionUsuario = Negocio.seguirIntentando(salida_); // hago la llamada al procedimiento seguirIntentando
                            if (eleccionUsuario == 1) { //aca consulto si es igual a 1 para seguir consultando otros tercerMododeImprimirLosNumeros
                                menu = true;
                            } else { //sino sale al menú principal
                                menu = false;
                            }
                    } while (menu != false);//condición establecida en false para continuar el programa o detenerlo.
                    break;
                case 9:
                    //9.- Salir. 
                    System.out.println("Gracias por su evaluación! ");// mensaje de despedida al elegir salir del programa en el menú de opciones.
                    System.out.println("============================================================================\n\n");
                    Negocio.sleep(2000);
                    break;
                default:
                    System.out.println("\nLa opción ingresada no es correcta.\nVolvamos al menu! \n\n");// se imprime mensaje por pantalla en caso de que la opción ingresada este fuera de las ofrecidas en el menú.
                    Negocio.sleep(2000);
                    break;}
        } while (opciones != 9);}}//condición establecida para continuar el programa o salir de el.