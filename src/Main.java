// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuEjercicios();
    }

    static void menuEjercicios() {
        Scanner scanner0 = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Qué opción eliges?");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("11. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("0. Salir");
            System.out.print("Ingresa el número de la opción: ");
            opcion = scanner0.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1.");
                    ejercicios1();
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2.");
                    ejercicios2();
                    break;
                case 3:
                    System.out.println("Seleccionaste la opción 3.");
                    ejercicios3();
                    break;
                case 4:
                    System.out.println("Seleccionaste la opción 4.");
                    ejercicios4();
                    break;
                case 5:
                    System.out.println("Seleccionaste la opción 5.");
                    ejercicios5();
                    break;
                case 6:
                    System.out.println("Seleccionaste la opción 6.");
                    ejercicios6();
                    break;
                case 7:
                    System.out.println("Seleccionaste la opción 7.");
                    ejercicios7();
                    break;
                case 8:
                    System.out.println("Seleccionaste la opción 8.");
                    ejercicios8();
                    break;
                case 9:
                    System.out.println("Seleccionaste la opción 9.");
                    ejercicios9();
                    break;
                case 10:
                    System.out.println("Seleccionaste la opción 10.");
                    ejercicios10();
                    break;
                case 11:
                    System.out.println("Seleccionaste la opción 11.");
                    ejercicios11();
                    break;
                case 12:
                    System.out.println("Seleccionaste la opción 12.");
                    ejercicios12();
                    break;
                case 13:
                    System.out.println("Seleccionaste la opción 13.");
                    ejercicios13();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
        scanner0.close();
    }

    static void ejercicios1() {
        //1. Crear las variables correspondientes para leer tu nombre,
        //apellido y edad e imprimirlos por consola en una oración.
        String[] date = {"nombre", "Apellido", "edad"};
        Scanner scanner = new Scanner(System.in);
        for (int a = 0; a < date.length; a++) {
            System.out.println("Ingresa su " + date[a]);
            date[a] = scanner.nextLine();
        }
        //scanner.close();
        System.out.println("hola " + date[0] + " " + date[1] + " tu edad es " + date[2]);
    }

    static void ejercicios2() {
        //2. Realizar un pequeño programa que permita ingresar 3 números
        // e imprimir por consola cuál es el mayor.
        float[] numeros = {0, 0, 0};
        float max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int b = 0; b < numeros.length; b++) {
            System.out.println("Ingresa numero");
            numeros[b] = scanner.nextFloat();
            if (numeros[b] > max) {
                max = numeros[b];
            }
        }
        for (float elemento : numeros) {
            System.out.print(" " + elemento);
        }
        System.out.println();
        System.out.println(max);
//        scanner.close();
    }

    static void ejercicios3() {
//        3. Realizar un pequeño programa que permita el ingreso de un
//         número e imprimir por consola su paridad
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero");
        if (scanner.nextFloat() % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
//        scanner.close();
    }

    static void ejercicios4() {
//        4. Crear el código correspondiente que permita ingresar 2 cadenas
//        de caracteres e imprima por consola si son iguales o no.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la primer cadena");
        String cadena1 = scanner.next();
        System.out.println("Ingresa la segunda cadena");
        String cadena2 = scanner.next();
        if (cadena1.equals(cadena2)) {
            System.out.println("Es la misma cadena");
        } else {
            System.out.println("NO Es la misma cadena");
        }
    }

    static void ejercicios5() {
//        5. Realizar un pequeño programa que permita el ingreso de
//        números, almacenarlos en una colección hasta ingresar un 0.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> coleccion = new ArrayList<>();
        int num = -1;
        while (num != 0) {
            System.out.println("Ingresa un numero");
            num = scanner.nextInt();
            if (num != 0)
                coleccion.add(num);
        }
        System.out.println("Los números ingresados fueron: ");
        for (int numero : coleccion) {
            System.out.println(numero);
        }
    }

    static void ejercicios6() {
//        Crear una función que imprima un mensaje de bienvenida en la
//        consola.
        saludo();
    }

    static void saludo() {
        System.out.println("bienvenidos!!");
    }

    static void ejercicios7() {
//        Crear una función que reciba un número entero y devuelva si es
//        par o impar en forma de texto.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int num = scanner.nextInt();
        System.out.println(num + " Par: " + esPar(num));
//        scanner.close();
    }

    static boolean esPar(int num) {
        return num % 2 == 0;
    }

    static void ejercicios8() {
//        Crear una función que reciba un número y devuelva si el mismo
//        es primo o no.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int num = scanner.nextInt();
        System.out.println(num + " Primo: " + esPrimo(num));
//        scanner.close();
    }

    static boolean esPrimo(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int a = 2; a < num; a++) {
            if (num % a == 0)
                return false;
        }
        return true;
    }

    static void ejercicios9() {
//        Crear una función que reciba una colección de números y
        List<Integer> listaEnteros = new ArrayList<>();

        listaEnteros.add(4);
        listaEnteros.add(6);
        listaEnteros.add(7);
        listaEnteros.add(10);
        listaEnteros.add(75);
        System.out.println(sumaImpares(listaEnteros));
    }

    static int sumaImpares(List<Integer> coleccion) {
        int suma = 0;
        for (int elemento : coleccion) {
            if (!esPar(elemento)) {
                suma += elemento;
            }
        }
        return suma;
    }

    static void ejercicios10() {
//        10. Crear una función que reciba una colección de números e
//        imprima los números pares y la suma de los números primos.
        int[] numeros = {2, 5, 3, 76, 13, 12};
        paresYPrimos(numeros);

    }

    static void paresYPrimos(int[] coleccion) {
        int suma = 0;
        System.out.println("Pares");
        for (int elemento : coleccion) {
            if (esPrimo(elemento)) {
                suma += elemento;
            }
            if (esPar(elemento)) {
                System.out.println(elemento);
            }
        }
        System.out.println("la suma de los numeros primos es: " + suma);
    }

    static void ejercicios11() {
//        Crear una función que imprima por consola un pequeño
//        menú con las opciones básicas de una calculadora agregando
//        la opción 0 para salir del mismo.
        menuCalculadora();
    }

    static void menuCalculadora() {
        System.out.println("¿Qué opción eliges?");
        System.out.println("1. Multiplicacion");
        System.out.println("2. Division");
        System.out.println("3. Suma");
        System.out.println("4. Resta");
        System.out.println("0. Salir");
        System.out.print("Ingresa el número de la opción: ");
    }

    static void suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa primer sumando");
        float sumando1 = scanner.nextFloat();
        System.out.println("Ingresa Segundo sumando");
        float sumando2 = scanner.nextFloat();
        float resultado = sumando1 + sumando2;
        System.out.println(sumando1 + " + " + sumando2 + " = " + resultado);
    }

    static void resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa minuendo");
        float minuendo = scanner.nextFloat();
        System.out.println("Ingresa Sustraendo");
        float sustraendo = scanner.nextFloat();
        float resultado = minuendo - sustraendo;
        System.out.println(minuendo + " - " + sustraendo + " = " + resultado);
    }

    static void multi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa Primer Factor");
        float factor1 = scanner.nextFloat();
        System.out.println("Ingresa Segundo Factor");
        float factor2 = scanner.nextFloat();
        float resultado = factor1 * factor2;
        System.out.println(factor1 + " * " + factor2 + " = " + resultado);
    }

    static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dividendo");
        float dividendo = scanner.nextFloat();
        System.out.println("Ingresa Divisor");
        float divisor = scanner.nextFloat();
        if (divisor == 0) {
            System.out.println("no se puede dividir por 0");
            return;
        }
        float resultado = dividendo / divisor;
        System.out.println(dividendo + " / " + divisor + " = " + resultado);
        System.out.println("division");
    }

    static void ejercicios12() {
//        12. Crear otra función que ocupe la del punto anterior para poder
//        crear una pequeña calculadora usando switch. Tener en cuenta
//        el caso de la división por 0.
        Scanner scanner0 = new Scanner(System.in);
        int opcion;
        do {
            menuCalculadora();
            opcion = scanner0.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1; MULTIPLICACION");
                    multi();
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2; Division");
                    division();
                    break;
                case 3:
                    System.out.println("Seleccionaste la opción 3; SUMA");
                    suma();
                    break;
                case 4:
                    System.out.println("Seleccionaste la opción 4; RESTA");
                    resta();
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    static void ejercicios13() {
//        Crear el algoritmo necesario para poder gestionar el ingreso
//        a un boliche. El mismo deberá contar con un pequeño menú con
//        las siguientes opciones:
//            ● Ingreso de datos.
//            ● Capacidad disponible.
//            ● Dinero recaudado.
//            ● Salir del sistema.
//        Crear las variables correspondientes para controlar la capacidad
//        y el dinero recaudado. Siendo la capacidad máxima de 500
//        personas y la entrada costar 1500 por persona y 2000 la
//        entrada vip. La primera opción del menú deberá tomar los datos
//        personales del ingresante (nombre, edad, DNI y pase). El
//        algoritmo deberá detectar si la persona está apta para el
//        ingreso, ya que solo se dejará pasar a los mayores de 21 años.
//                Verificar antes de cobrar la entrada si posee pase vip con el cual
//        ingresará gratis o si posee pase con descuento el cual le
//        permitirá solo abonar la mitad del valor de la entrada. Al
//        momento de hacer el cobro se deberá preguntar si quiere
//        comprar la entrada normal o vip y finalmente darle la bienvenida
//        en caso de que todo haya salido bien, volviendo al menú
//        principal. Las variables correspondientes tendrán que reflejar el
//        ingreso tanto de personas como de dinero.
        menuBoliche();


    }

    static void menuBoliche() {
        Boliche boli = new Boliche(500);
        Scanner scanner0 = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" ");
            System.out.println("___________________________");
            System.out.println("1 Ingreso de datos.");
            System.out.println("2 Capacidad disponible.");
            System.out.println("3 Dinero recaudado");
            System.out.println("0 Salir del sistema");
            System.out.println("___________________________");

            opcion = scanner0.nextInt();
            switch (opcion) {
                case 1:
                    boli.ingresoPersona();

                    break;
                case 2:
                    System.out.println("##################################################");
                    System.out.println("  #     La Capacidad disponible es de: " + boli.getAsistencia() + "     #");
                    System.out.println("##################################################");
                    break;
                case 3:
                    System.out.println("#################################################");
                    System.out.println("   #     El Dinero Recaudad es de: " + boli.getRecaudacion() + "     #");
                    System.out.println("#################################################");

                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }


    static class Boliche {
        int capacidadMax;
        int asistencia;
        double recaudacion;

        public Boliche(int capacidadMax) {
            this.capacidadMax = capacidadMax;
            this.asistencia = 0;
            this.recaudacion = 0;
        }

        public int getAsistencia() {
            return capacidadMax - asistencia;
        }

        public double getRecaudacion() {
            return recaudacion;
        }

        public void setAsistencia(int ingreos) {
            this.asistencia = this.asistencia + ingreos;
        }

        public void setRecaudacion(double ingreso) {
            this.recaudacion = this.recaudacion + ingreso;
        }

        public void ingresoPersona() {
//              nombre, edad, DNI y pase
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa Su nombre");
            String nombre = scanner.next();
            System.out.println("Ingresa Su Edad");
            int edad = scanner.nextInt();
            System.out.println("Ingresa Dni");
            int dni = scanner.nextInt();
            System.out.println("Tiene Pase? SI / NO");
            String pase = scanner.next();
            if (edad < 21) {
                System.out.println("##################################################");
                System.out.println("Usted no es apto para el ingreso, regrese dentro de " + (21 - edad) + "años");
                System.out.println("##################################################");
                return;
            }
            if (pase.equals("si")) {
                System.out.println("##################################################");
                System.out.println("Usted tiene un pase, se le hara un descuneto del 50%");
                System.out.println("Desea un pase VIP SI / NO");
                String vip = scanner.next();
                if (vip.equals("si")) {
                    System.out.println("El costo es de 1000, Ingresara? ");
                    String ingreso = scanner.next();
                    if (ingreso.equals("si")) {
                        System.out.println("BIENVENIDO AL  SARASA CLUB");
                        capacidadMax = capacidadMax - 1;
                        asistencia = asistencia + 1;
                        recaudacion = recaudacion + 1000;
                    }


                } else {
                    System.out.println("El costo es de 750, Ingresara? ");
                    String ingreso = scanner.next();
                    if (ingreso.equals("si")) {
                        System.out.println("BIENVENIDO AL  SARASA CLUB");
                        capacidadMax = capacidadMax - 1;
                        asistencia = asistencia + 1;
                        recaudacion = recaudacion + 750;
                    }
                }
            } else { //no tiene pase
                System.out.println("Desea un pase VIP SI / NO");
                String vip = scanner.next();
                if (vip.equals("si")) {
                    System.out.println("El costo es de 2000, Ingresara? ");
                    String ingreso = scanner.next();
                    if (ingreso.equals("si")) {
                        System.out.println("BIENVENIDO AL  SARASA CLUB");
                        capacidadMax = capacidadMax - 1;
                        asistencia = asistencia + 1;
                        recaudacion = recaudacion + 2000;
                    }
                } else {
                    System.out.println("El costo es de 1500, Ingresara? ");
                    String ingreso = scanner.next();
                    if (ingreso.equals("si")) {
                        System.out.println("BIENVENIDO AL  SARASA CLUB");
                        capacidadMax = capacidadMax - 1;
                        asistencia = asistencia + 1;
                        recaudacion = recaudacion + 1500;
                    }

                }

            }
        }


    }
}
