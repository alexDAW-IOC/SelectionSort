/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioc.xtec.cat.selectionsort;
import java.util.Scanner;
/**
 *Classe principal que s'encarrega de implementar el mètode Main per un correcte funcionamentt del 
 * programa.
 * 
 * @author alex
 * @version 1.0
 * @since 1.0
 * 
 */
public class Main {
    
    /** 
     * Mètode principal de la classe on és realitzen les incialitzacions de les diferents classes 
     * i es capturen les possibles excepcions llancades en algun punt de l'execució del programa.
     * 
     * @param args Array de String 
     */
    
    public static void main(String[] args){
        
        System.out.println("Alex Robles:");
        System.out.println("He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdueix la mida de l'array");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array");
        
        for(int i = 0; i<size;i++){
            System.out.println("Element" +(i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        /*Instancia dels objectes de les classes*/
        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();
        /**
         *Estrucutra de control d'excepcions try-catch
         */
        try{
            validator.validateArray(array);
            
            System.out.println("Array original:");
            printArray(array);
            
            System.out.println("Introdueix un valor a buscar a l'array");
            int valueToSearch = scanner.nextInt();
            
            boolean contains = sorter.contains(array,valueToSearch);
            if(contains){
                System.out.println("El valor " + valueToSearch + " existeix a l'array");
            }else{
                System.out.println("El valor " +valueToSearch + " no existeix a l'array");
            }
            
            sorter.sort(array);
            
            System.out.println("Array ordenat");
            printArray(array);
            
            
        }catch(IllegalArgumentException e) {
            System.out.println("Error: " +e.getMessage());
        }
        scanner.close();
    }
    /**
     * Mètode que mostra per pantalla el contingut de l'array passat per paràmetres.
     * 
     * @param arr Array de sencers
     */
    public static void printArray(int[]arr){
        for (int num: arr){
            System.out.print(num +" ");
        }
        System.out.println();
    }
    
}
