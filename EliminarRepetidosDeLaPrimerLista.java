/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recurr;

import java.util.ArrayList;

/**
 *
 * @author DELL I7 13va
 */
public class EliminarRepetidosDeLaPrimerLista {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(12);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(9);
        
        System.out.println(mod(a, b, 0, 0));
    }
    
    public static ArrayList<Integer> mod(ArrayList<Integer> a, ArrayList<Integer> b, int indexA, int indexB){
        if(indexA == a.size() || indexB == b.size()){
            return a;
        }else{
            if(a.get(indexA) >= b.get(indexB)){
                //seguir bucando
                if(a.get(indexA) == b.get(indexB)){
                    a.remove(indexA);
                    return mod(a, b, indexA, indexB);
                }else{
                    return mod(a, b, indexA, indexB + 1);
                }
            }else{
                return mod(a, b, indexA + 1, indexB);
            }
        }
    }
}
