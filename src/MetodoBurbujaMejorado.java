public class MetodoBurbujaMejorado {

    public int[] ordenarAscendente(int[] arr, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;
        boolean intercambio;

        for (int i = 0; i < arr.length - 1; i++) {
            intercambio = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparaciones++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    cambios++;
                    intercambio = true;
                }
            }
            if (mostrarPasos) {
                System.out.println("Paso " + (i + 1) + ":");
                printArray(arr);
            }
            if (!intercambio) break; 
        }
        return new int[]{comparaciones, cambios};
    }

    public int[] ordenarDescendente(int[] arr, boolean mostrarPasos) {
        int comparaciones = 0;
        int cambios = 0;
        boolean intercambio;

        for (int i = 0; i < arr.length - 1; i++) {
            intercambio = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparaciones++;
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    cambios++;
                    intercambio = true;
                }
            }
            if (mostrarPasos) {
                System.out.println("Paso " + (i + 1) + ":");
                printArray(arr);
            }
            if (!intercambio) break; 
        }
        return new int[]{comparaciones, cambios};
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
