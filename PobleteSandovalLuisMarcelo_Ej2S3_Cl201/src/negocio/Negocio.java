/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Scanner;

public class Negocio{
    public static void sleep(int time) { //Metodo sleep que retrasa el hilo(thread) de ejecucion en la cantidad de milisegundos que se indique como parámetro de tipo int(time).
        try {// Se implementa una estructura de seguridad( try & catch), en caso que el usuario ingrese un tipo de dato que no corresponda,para evitar la caída del método.
            Thread.sleep(time); // Para este caso  basa en la clase Thread y toma el parametro de milisegundos configurados(time).
        } catch (Exception e) { }//En caso de error, este se "captura con la excepción, para este caso la genérica "e").
        
    }
    public static boolean validaInt(String num) { //Este metodo valida que el valor que ingrese el usuario sea un entero.
        try {// Se implementa una estructura de seguridad( try & catch), en caso que el usuario ingrese un tipo de dato que no corresponda,para evitar la caída del método.
            Integer.parseInt(num);// El proceso se hace numero través de un "parseo" o conversion de datos en este caso desde texto(String) numero entero (Int).
        } catch (Exception e) {//En caso de error, este se "captura con la excepción, para este caso la genérica "e").
            return false;}// Valor booleano que retorna en caso de error.
        return true;//Valor booleano que retorna en caso que la validación sea exitosa.
    }
    public static String solicitaEntero(){
            System.out.println("Introduce un número: ");//solicitud al usuario que ingrese un valor numerico.
            String Numero; //definine variable tipo String para el primerNumero numero ingresado por el usuario.
            Scanner entrada = new Scanner(System.in);// se llama la clase Scanner para tomar los datos ingresados por el usuario.
            boolean boolIterador = false; // se define variable boolIterador  con valor "false" para controlar la salida del ciclo Do-while que contendrá el menú de opciones en una estructura Switch.
            do {//ciclo Do-While que contiene el desarrollo del programa.
                do {//ciclo Do-While que contiene el procesamiento del primerNumero numero.
                    //System.out.println("Introduce un número; ");//solicitud al usuario que ingrese un valor numerico.
                   // Numero = entrada.nextLine();//asignación de valor ingresado por el usuario numero la variable "primerNumero".
                    if (validaInt(Numero = entrada.nextLine()) == true) {//validación del dato ingresado por usuario si es o no numerico (tipo int).
                        boolIterador = false;}// se mantiene el valor false para boolIterador si el valor ingresado es numerico y continua el flujo del progarama.
                    else {// si el valor no es numerico se imprime por pantalla el mensaje :"El dato ingresado NO es un numero" y se define boolIterador con valor true para volver al inicio del ciclo Do-While.
                        System.out.println("\n============================================================================");
                        System.out.println("        El dato ingresado NO es un numero válido.");
                        System.out.println("============================================================================\n");
                        System.out.println("Ingrese un número: ");
                        boolIterador = true;}
                } while (boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
            } while (boolIterador);
            return Numero;
    }
    public static int seguirIntentando(int menu) { //Este método toma la respuesta del usuario si quiere volver al programa para probar otros valores o ir al menú principal.
    boolean seguir = false;// Se define valor booleano para condicionar la salida del ciclo Do-While.
        Scanner entrada = new Scanner(System.in);
        do {//Ciclo Do-While que solicitará valores al usuario mientras se cumpla que el valor booleano establecido (!seguir).
            System.out.println("\n* Presione 1 para realizar otra prueba.");// se le solicita al usuario que ingrese un valor entero sea 1 o 2.       
            System.out.println("* Presione 2 para ir al menú.\n");
            String salida = entrada.nextLine();// Se almacena el valor ingresado por el usuario.
            if (validaInt(salida)==true) {//se valida que el valor ingresado sea entero.
                menu = Integer.parseInt(salida);//Una vez validado se asigna el valor numero la variable menu.
                if (menu == 1 || menu == 2) {//Se reducen las opciones para continuar numero 2 y 1
                    seguir = true;// Sólo continúa si el valor ingresado es 1 o 2.
                } else {//si el valor está fuera de las opciones posibles se imprime pro pantalla el mensaje: "Favor ingrese sólo 1 o 2.".
                    System.out.println("Favor ingrese sólo 1 o 2. ");
                    System.out.println("\nVolvamos a intentar!\n"); //Si el valor ingresado no es un enterose imprime pro pantalla el mensaje :"Volvamos numero intentar!".
                    seguir = false;}//si el valor ingresado por el usuario está fuera de las opciones posibles 1 ó 2 se vuelve al comienzo del ciclo.
            } else {
                seguir = false;}//si el valor ingresado por el usuario no es un entero, se vuelve al comienzo del ciclo.
        } while (!seguir); //condición establecida para el ciclo Ciclo Do-While.
        return menu;//se retorna al main el valor ingresado por el usuario luego de atravesar  las validaciones.
    }
        //segundo modo
        public static int[] numerosDelUnoAlCien(){//Método que retorna los numeros del 1 al 100 a través de una estructura de arreglo.
        int aux=1;
        int num[]=new int [100];
        for(int i=0;i<100;i++){
            num[i]=aux;
            aux++;
        }
        return num;
    }
        public static void divideNumeros (int[] arreglo, int num){//Método que recibe como parámetros los numeros de un arreglo y un divisor.
            for(int i=0;i<arreglo.length;i++){
                int saltoLinea = i % 25;// se implementa salto de línea para dar una visibilidad amigable
                if (saltoLinea == 0) {
                    System.out.println("");
                }
                if(arreglo[i]%num==0){
                    System.out.printf(arreglo[i]+" "); //Se imprime resultado por pantalla.
            }
        }
    }
        
        public static void numeroMayorCero(){//Método que valida ingreso de numero mayor a cero.
            boolean boolIterador = false;
        do {//ciclo Do-While que contiene el procesamiento del primerNumero numero.
            do{
               int numeroNatural= Integer.parseInt(solicitaEntero());//se llama a otro método para validar le ingreso de un numero entero
                if (numeroNatural>=0) {//se valida que sea mayor a cero
                    boolIterador = false;
                    System.out.println("============================================================================");
                    System.out.println("El numero ingresado es: " + numeroNatural + ".");// se imprime resultado por pantalla con el número.
                    System.out.println("============================================================================");    
                } else {
                    System.out.println("============================================================================");
                    System.out.println("El numero ingresado no es un número igual o mayor a cero.\n\nPor favor, intente nuevamente.");// se imprime mensaje de error por pantalla
                    System.out.println("============================================================================\n");
                    boolIterador = true;
                }
            }while(boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
        } while (boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
       }
        public static void lengthNumero(){
           Scanner entrada = new Scanner(System.in);
           boolean boolIterador = false;
        do {//ciclo Do-While que contiene el procesamiento del primerNumero numero.
            do{
               int numeroNatural= Integer.parseInt(solicitaEntero());
               if (numeroNatural>=1) {
                    boolIterador = false;
                    int largo =  (int)(Math.log10(numeroNatural)+1);
                    System.out.println("============================================================================");
                    System.out.println("    El número ingresado es  el " + numeroNatural + " y contiene "+largo+" cifra(s).");// se imprime resultado por pantalla con el número.
                    System.out.println("============================================================================");
               } else {
                    System.out.println("============================================================================");
                    System.out.println("                    El numero ingresado no es un número positivo.\n"
                                     + "                    Por favor, intente nuevamente.");// se imprime resultado por pantalla con el numero mayor.
                    System.out.println("============================================================================");
                    boolIterador = true;
                }
            }while(boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
        } while (boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
        
       }
       public static void diaDeLaSemana(){//Método que valida si el dia ingresado es un dia laboral
           Scanner entrada = new Scanner(System.in, "Windows-1252");// se llama la clase Scanner para tomar los datos ingresados por el usuario.
           boolean boolIterador = false;
           System.out.println("Elija un día de la semana para saber si es un día laboral.\n");//Se muestra menu al usuario
           System.out.println("1.- Lunes.\n2.- Martes.\n3.- Miércoles.\n4.- Jueves.\n5.- Viernes.\n6.- Sábado.\n7.- Domingo.\n\nPor favor, ingrese el nombre del día que desea elegir.");
          do{
              String dia = (entrada.next());//Se valida que el ingreso es un String llamando al método solicitaTexto
              int opciones=0;
              String lunes = "Lunes", martes= "Martes", miercoles ="Miércoles", //se asignan los dias de la semana
                      jueves= "Jueves", viernes="Viernes", sabado="Sábado", domingo="Domingo";
              if(lunes.equalsIgnoreCase(dia)==true){//se valida el dia ingresado y se asigna a una opcion de la estructura  switch
                  opciones=1;
              }else if(martes.equalsIgnoreCase(dia)==true){
                  opciones=2;
              }else if(miercoles.equalsIgnoreCase(dia)==true){
                  opciones=3;
              }else if(jueves.equalsIgnoreCase(dia)==true){
                  opciones=4;
              }else if(viernes.equalsIgnoreCase(dia)==true){
                  opciones=5;
              }else if(sabado.equalsIgnoreCase(dia)==true){
                  opciones=6;
              }else if(domingo.equalsIgnoreCase(dia)==true){
                  opciones=7;
              }else{
                  boolIterador = true;
              }
              switch(opciones){
                  case 1:
                      System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+lunes+" y es un dia laboral.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                   boolIterador = false;//se da continuidad al programa
                   break;
               case 2:
                   System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+martes+" y es un dia laboral.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                   boolIterador = false;
                   break;
               case 3:
                   System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+miercoles+" y es un dia laboral.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                   boolIterador = false;
                   break;
               case 4:
                   System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+jueves+" y es un dia laboral.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                   boolIterador = false;
                   break;
               case 5:
                   System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+viernes+" y es un dia laboral.");//Se imprime resultado por pantalla.
                  System.out.println("============================================================================");
                  boolIterador = false;
                   break;
               case 6:
                   System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+sabado+" y no es un dia laboral.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                   boolIterador = false;
                   break;
               case 7:
                   System.out.println("============================================================================");
                   System.out.println("         El dia elegido es el "+domingo+" y no es un dia laboral.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                   boolIterador = false;
                   break;
               default:
                   System.out.println("============================================================================");
                   System.out.println("       El valor ingresado no es un día de la semana o está mal escrito.");//Se imprime resultado por pantalla.
                   System.out.println("============================================================================");
                    System.out.println("\nEscriba un nombre válido, revise los tildes: ");
                   boolIterador=true;
                   break;
           }
           }while(boolIterador);//condición establecida en false para continuar el programa si los datos ingresados pasan las validaciones. 
       }
        public static void cuentaVocales(){//metodo que cuanta las vocales a traves de CharAt
            String frase ="La lluvia en Valdivia es una maravilla.";
            int contador = 0;
            for(int i=0;i<frase.length();i++) {
                if((String.valueOf(frase.charAt(i)).matches("[AEIOU]"))||
                        (String.valueOf(frase.charAt(i)).matches("[aeiou]"))){
                    contador++;
                }
            }
            System.out.println("La frase :' " + frase + "' contiene " +contador + " vocales.");//Se imprime resultado por pantalla.
            System.out.println("============================================================================");
        }
        public static void cambiaVocales(){//metodo que cambia las vocales a por la e con la funcion replace de java
            String frase ="La lluvia en Valdivia es una maravilla.";
            String frase2 = frase.replace("a", "e");
            
            System.out.println("Frase original : '" + frase + "'\n\nFrase alterada: '" +frase2+ "'");//Se imprime resultado por pantalla.
            System.out.println("============================================================================");
        }
        public static void pedirPassword(){//metodo que valida el ingreso de una contraseña correcta en 3 intentos
            Scanner entrada = new Scanner(System.in);
            String passwordOriginal;
            String passwordIngresada;
            System.out.println("Introduzca la contraseña que quiere crear: \n");//Se solicita la creacion de la contraseña
            passwordOriginal= entrada.nextLine();//se asigna a la variable passwordOriginal
            boolean correcto = false;
            for(int i=0; i<3 && !correcto;i++) {//se asigna el numero de intentos
                if (i==0){
                    System.out.println("Introduzca la contraseña: \n");
                }else if(i==1){
                    System.out.println("Restan dos intentos: \n");
                }else if(i==2){
                    System.out.println("Último intento: \n");
                }
                passwordIngresada = entrada.nextLine();
            if (passwordIngresada.equals(passwordOriginal)){//Se valida que el ingreso sea igual al establecido
                correcto=true;
            }
            }
            if (correcto){
                System.out.println("============================================================================");
                System.out.println("                            Enhorabuena.");//Se imprime resultado por pantalla.
                System.out.println("============================================================================");
            }else{
                System.out.println("============================================================================");
                System.out.println("                        Ha agotado los tres intentos.");//Se imprime resultado por pantalla en caso de falla.
                System.out.println("============================================================================");
            }
        }
        public static void sumaVentas(){//Programa que suma las ventas ingresadas
            int cantVentas,id=1,sumaTotal=0, totalVenta;//variables a ocupar
            boolean boolIterador = false;
        do {//ciclo Do-While que contiene el proceso de datos
            do{//ciclo Do-While que evita salir del metodo
                do{//ciclo do-while que evita la caida si el ingreso no es un entero
                    System.out.print("¿Cuántas ventas quiere ingresar? \n");//solicitud de cantidad de ventas por pantalla
                    cantVentas= Integer.parseInt(solicitaEntero()); //metodo que valida que es un entero
                    if (cantVentas>=1) {//condicion que valida el ingreso de numero mayor a cero
                    boolIterador = false;
                    } else {
                        System.out.println("\nEl numero ingresado no es un número positivo.\nPor favor, intente nuevamente.\n");// se imprime resultado por pantalla con el error.
                        boolIterador = true;
                    }
                }while(cantVentas<=0);//condicion para continuar preestablecida al comienza usando cantidad de ventas en cero como base
                while(id<=cantVentas){//condicion para asignar el valor al id de la venta
                    do{
                        System.out.print("Ingrese el total de la venta N°"+id+": \n");//solicitud del total de cada  venta por pantalla
                        totalVenta= Integer.parseInt(solicitaEntero());//se valida el ingreso de un entero
                        if (totalVenta>=1) {//condicion que elimina los ingresos menores a 1
                            boolIterador = false;
                        } else {
                            System.out.println("\nEl numero ingresado no es un número positivo.\nPor favor, intente nuevamente.\n");// se imprime resultado por pantalla con el error.
                            boolIterador = true;
                        }
                    }while(boolIterador);
                    sumaTotal= sumaTotal+totalVenta;
                    id=id+1;
                }
                System.out.println("============================================================================");
                System.out.println("        La suma total de las ventas ingresadas es: $"+sumaTotal);//Se imprime resultado por pantalla.
                System.out.println("============================================================================");
            }while(boolIterador);
        } while (boolIterador);
        }
}