import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] listado = { 10, 9, 21, 5, 15, 2, -1, 0 };

        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoBurbujaMejorado mBN = new MetodoBurbujaMejorado();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Metodos Ordenamiento");
            System.out.println("1 ->  Burbuja");
            System.out.println("2 ->  Seleccion");
            System.out.println("3 ->  Insercion");
            System.out.println("4 ->  Burbuja Mejorada");
            System.out.println("5 ->  Salir");

            int metodo = getPositive(scanner, "Ingrese un número de método");
            
            if (metodo == 5) {
                System.out.println("Adios");
                continuar = false;
                break;
            }

            System.out.println("¿Desea ver los pasos?  (true/false): ");
            boolean conPasos = scanner.nextBoolean();

            String message = "¿Desea ordenar ascendentemente {A} o descendentemente {D}?: ";
            String orden = getValidString(scanner, new String[] {"A", "D"}, message);
            boolean ascendente = orden.equalsIgnoreCase("A");

            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    System.out.println("-- Metodo Burbuja --");
                    int[] copia1 = listado.clone();
            
                    System.out.println("Arreglo Original");
                    mB.imprimirArreglo(copia1);  
            
                    if (ascendente) {
                        if (conPasos) {
                            System.out.println("Ordenar Ascendente con pasos");
                            mB.ordenarAscendente(copia1, true); 
                        } else {
                            System.out.println("Ordenar Ascendente sin pasos");
                            mB.ordenarAscendente(copia1, false);
                        }
                    } else {
                        if (conPasos) {
                            System.out.println("Ordenar Descendente con pasos");
                            mB.ordenarDescendente(copia1, true);
                        } else {
                            System.out.println("Ordenar Descendente sin pasos");
                            mB.ordenarDescendente(copia1, false);
                        }
                    }
            
                    mB.imprimirArreglo(copia1);
                    break;
                case 2:

                    System.out.println("-- Metodo Seleccion --");
                    int[] copia2 = listado.clone();
                    System.out.print("Arreglo normal: ");
                    mS.printArray(copia2);
                    
                    if (ascendente) {
                        mS.ordenarAscendente(copia2);
                        System.out.print("Arreglo ascendente: ");
                    } else {
                        mS.ordenarDescendente(copia2);
                        System.out.print("Arreglo descendente: ");
                    }
                    mS.printArray(copia2);
                    break;
                case 3:
                    System.out.println("-- Metodo Insercion --");
                    System.out.println("Arreglo Original:");
                    mI.imprimirArray(listado);
                    
                    int[] copia3 = new int[listado.length];
                    for (int i = 0; i < listado.length; i++) {
                        copia3[i] = listado[i];
                    }
                    boolean isDescendente = !ascendente;
                
                    if (conPasos) {
                        System.out.println("Ordenar " + (ascendente ? "Ascendente" : "Descendente") + " con pasos");
                        mI.ordenarInsercion(copia3, true, isDescendente);
                    } else {
                        System.out.println("Ordenar " + (ascendente ? "Ascendente" : "Descendente") + " sin pasos");
                        mI.ordenarInsercion(copia3, false, isDescendente);
                    }
                    System.out.println("Arreglo ordenado:");
                    mI.imprimirArray(copia3);

                    break;
                
                case 4:
                    System.out.println("-- Metodo Burbuja Mejorado --");
                    
                    int[] listadoCopiaBN = new int[listado.length];
                    for (int i = 0; i < listado.length; i++) {
                        listadoCopiaBN[i] = listado[i];
                    }
                
                    System.out.println("Arreglo Original:");
                    mBN.printArray(listadoCopiaBN);
                
                    int[] resultados2;
                    
                    if (ascendente) {
                        resultados2 = mBN.ordenarAscendente(listadoCopiaBN, conPasos);
                    } else {
                        resultados2 = mBN.ordenarDescendente(listadoCopiaBN, conPasos);
                    }
                
                    System.out.println("Arreglo Ordenado:");
                    mBN.printArray(listadoCopiaBN);
                
                    System.out.println("Comparaciones --> " + resultados2[0]);
                    System.out.println("Cambios --> " + resultados2[1]);
                    
                    break;
            }
            
            
        }
    }

    public static int getPositive(Scanner scanner, String message) {
        int input;
        do {
            System.out.println(message + " : ");
            input = scanner.nextInt();
            if (input < 1) {
                System.out.println("El número es demasiado pequeño, intente nuevamente.");
            } else if (input > 5) {
                System.out.println("El número es demasiado grande, intente nuevamente.");
            }
        } while (input < 1 || input > 5);
        return input;
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input; 
        boolean valido;
        do {
            System.out.println(message + " : ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            } 
        } while (!valido);
        return input;
    }
}
