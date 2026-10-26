/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recurr;

/**
 *
 * @author DELL I7 13va
 */
public class InvertirNumero {
    public static void main(String[] args) {
        System.out.println(inver(1233));
    }
    public static int inver(int n){
        if(n < 10 ){
            return n;
        }else{
            return n%10 * (int)Math.pow(10, (int) Math.log10(n)) + inver(n/10);
        }
    }
}
