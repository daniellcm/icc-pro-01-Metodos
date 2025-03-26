public class MetodoBurbuja {

    public void ordenarAsendente(int[] arreglo, boolean isDes) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                // System.out.println("i = " + i + ", j = " + j);

                if (isDes) {

                    if (arreglo[i] < arreglo[j]) { // Condicion de cambio
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                } else {
                    if (arreglo[i] > arreglo[j]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        /// PYTHON
        /// for i in range(len(arreglo)):
        /// print(arreglo[i])
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println(); 
    }
}
