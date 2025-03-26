public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] listado = {64,  25, 12 , 22, 11};

        // 0.- Arreglo de 10000 elementos

        //int[] array = new int[10000];
        //for (int i = 0; i < array.length; i++) {
        //   array[i] = (int) (Math.random() * 10000) + 1;   
        //    
        //    System.out.print(array[i]);
        //}
        //System.out.println(" Se acabo...");



        MetodoBurbuja mB = new MetodoBurbuja(); 
        System.out.println("--Metodo Burbuja--");
        System.out.println("Arreglo Original");
        mB.imprimirArreglo(listado);
        System.out.println("Ordenar Ascendente");
        mB.ordenarAsendente(listado, false);
        mB.imprimirArreglo(listado);


        System.out.println(" ");

        MetodoSeleccion mS = new MetodoSeleccion();
        
        System.out.println("--Metodo Seleccion--");
        System.out.print("Arreglo normal: ");
        mS.printArray(listado);
        mS.ordenarAscendente(listado);
        System.out.print("Arreglo ascendente: ");
        mS.printArray(listado);
        mS.ordenarDescendente(listado);
        System.out.print("Arreglo descendente: ");
        mS.printArray(listado);

        System.out.println(" ");

        MetodoInsercion mI = new MetodoInsercion();
        System.out.println("--Metodo Insercion--");
        System.out.print("Arreglo normal: ");
        mI.printArray(listado);
        mI.ordenarInsercion(listado, false);
        System.out.print("Salida Final: ");
        mI.printArray(listado);
    }

    
    }
