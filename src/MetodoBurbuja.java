public class MetodoBurbuja {

    public void ordenarAscendente(int[] arreglo, boolean mostrarPasos) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    if (mostrarPasos) {
                        imprimirArreglo(arreglo);
                    }
                }
            }
        }
    }

    public void ordenarDescendente(int[] arreglo, boolean mostrarPasos) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    if (mostrarPasos) {
                        imprimirArreglo(arreglo);
                    }
                }
            }
        }
    }
    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
