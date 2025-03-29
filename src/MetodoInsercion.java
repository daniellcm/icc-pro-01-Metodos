public class MetodoInsercion {

    public void ordenarInsercion(int[] arr, boolean mostrarPasos, boolean isDescendente) {
        System.out.println("Arreglo original:");
        imprimirArray(arr);

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            if (isDescendente) {
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            } else {
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }
            arr[j + 1] = key;
            if (mostrarPasos) {
                System.out.println("Paso " + i + ":");
                imprimirArray(arr);
            }
        }

        System.out.println("Arreglo ordenado (" + (isDescendente ? "Descendente" : "Ascendente") + "):");
        imprimirArray(arr);
    }

    public void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
