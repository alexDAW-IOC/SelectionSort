/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ioc.xtec.cat.selectionsort;

/**
 * Classe que implementa l'algorisme de Selection Sort per ordenar un array d'enters.
 * Proporciona també un mètode per verificar si  un valor é
 * 
 * @author alex
 * @version 1.0
 * @since 1.0
 */
public class SelectionSort {

    
    /** 
     *Ordena un array d'enters en ordre ascendent utilitzannt l'algorisme de Selection Sort
     *
     *@param arr l'array d'enters a ordenar 
     */
    public void sort(int[] arr) {
        //Obtenim la quantiat de valors de l'array passat per paràmetre
        int n = arr.length;
        // Itera sobre l'array per trobar l'element mínim en cada iteracició 
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; //Index de l'element mínim
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; //Actualitza l'index mínim si es troba un valor menor
                }
            }
            //Intercanvia l'element mínim trobat amb l'element actual
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    /**
     * Comprova si un valor passat per paràmetre està present en l'array.
     * 
     * @param arr l'array d'enters on és realitzara la cerca
     * @param value el valor a cercar dins de l'array
     * @return {@code true} si el valor es troba a l'array,{@code false} en cas contrari
     * @throws IllegalArgumentException si l'array passat per paràmetre és nul.é
     */
    
    public boolean contains(int[] arr, int value){
        //Verifica que l'array passat per paràmetre no sigui null en cas de ser-ho llana una excepció
        if(arr == null){
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        //Itera sobre l'array per comprovar si el valor existeix
        for(int num : arr){
            if(num == value){
                return true;
            }
        }
        return false; // Retorna false en cas de no trobar-se el valor dins de l'array
    }

}
