public class MetodoSeleccion {
    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) { 
            int iM = i;  
            for (int j = i + 1; j < arreglo.length; j++) {  
                if (arreglo[j] < arreglo[iM]) { 
                    iM = j; 
                }
            }

            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    public void ordenarDescendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iM = i;  
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[iM]) {
                    iM = j;  
                }
            }

            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ordenarDescendente(arreglo);
        } else {
            ordenarAscendente(arreglo);
        }
    }

    public void printArray(int[] arreglo) {
        System.out.println(" ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
