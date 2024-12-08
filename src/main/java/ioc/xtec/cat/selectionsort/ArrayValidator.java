/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ioc.xtec.cat.selectionsort;

/**
 *Classe que implementa un mètode que verifica si l'array és null o és troba buit.
 * 
 * @author alex
 * @version 1.0
 * @since 1.0
 */
public class ArrayValidator {
    /** 
     *Mètode que verifica que l'array no sigui buit o nul
     * en cas de ser buit o nul , llançara una excepció amb un missatge individualitzat.
     *
     * @param arr Array de sencers 
     * @throws IllegalArgumentException excepció amb missatge individual.
     */
    public void validateArray(int []arr){
      if(arr == null){
          throw new IllegalArgumentException("L'array no pot ser nul");
      }
      if(arr.length == 0){
          throw new IllegalArgumentException("L'array no pot estar buit");
      }
    }
    
}
