public class MetodoInsercion {

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void ordenarInsercion(int[] array, boolean isDes) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            if (array[j] > key) {
                System.out.println("i = " + i + ", j = " + j + " aux = " + key);
                System.out.println("Compara aux: " + key + " con arreglo " + j + " "+ array[j]);
                System.out.println("Cambia " + key + " con " + array[j]);
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}