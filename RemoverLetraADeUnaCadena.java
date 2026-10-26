/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recur2;

/**
 *
 * @author DELL I7 13va
 */
public class RemoverLetraADeUnaCadena {
    
    public static void main(String[] args) {
        System.out.println(removeA("fernandoaaa"));
    }
    public static String removeA (String c){
        if(c.length() == 0){
            return "";
        }else{
            if(c.charAt(0) == 'a'){
                return removeA(c.substring(1));
            }else{
                return c.charAt(0) + removeA(c.substring(1));
            }
        }
    }
}
