/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author ferna
 */
public class BubbleSortWithRecursivity {

    public static void main(String[] args) {
        int [] arr = {4,3,2,1,7,45,23};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr, int length){
        if(length == 1){
            
        }else{
            llevarElUltimoElemento(arr, length, 0);
            bubbleSort(arr, length - 1);
        }
    }
    
    private static void llevarElUltimoElemento(int[] arr, int limite, int i) {
        if(i == limite - 1){
            
        }else{
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            llevarElUltimoElemento(arr, limite, i+1);
        }
    }
}
