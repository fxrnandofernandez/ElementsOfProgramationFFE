/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backtracking;

import java.util.Arrays;

/**
 * @author ferna
 */
public class NReinas {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new NReinas().resolverNReinas(8)));
    }

    public int[][] resolverNReinas(int n){
        int[][] tablero = new int[n][n]; 
        if (resolverNReinas(tablero, 0, 0, 0, n)) {
            return tablero;
        }
        System.out.println("Sin solucion");
        return new int[n][n];
    }

   
    private boolean resolverNReinas(int[][] tablero, int contadorDeReinas, int x, int y, int n) {
        if(contadorDeReinas == n){
            return true; 
        }
        
        if(x < n){
            if(y < n){
                if(esValida(x, y, tablero, n)){
                    tablero[x][y] = 1; 
                    
                   
                    if (resolverNReinas(tablero, contadorDeReinas + 1, x, y + 1, n)) {
                        return true; 
                    }
                    
                    tablero[x][y] = 0; 
                }
                
                return resolverNReinas(tablero, contadorDeReinas, x, y + 1, n);
            } else {
                
                return resolverNReinas(tablero, contadorDeReinas, x + 1, 0, n);
            }
        }
        return false; 
    }

    private boolean esValida(int x, int y, int[][] tablero, int n) {
        
        for(int i = 0; i < n; i++){
            if(tablero[x][i] == 1 || tablero[i][y] == 1){
                return false;
            }
        }
        return verificarIzquierdaSup(x - 1, y - 1, tablero) && 
               verificarIzquierdaInf(x + 1, y - 1, tablero, n) && 
               verificarDerechaSup(x - 1, y + 1, tablero, n) && 
               verificarDerechaInf(x + 1, y + 1, tablero, n);
    }

    
    private boolean verificarIzquierdaSup(int x, int y, int[][] tablero) {
        while(x >= 0 && y >= 0){
            if(tablero[x][y] == 1){
                return false;
            }
            x--; y--;
        }
        return true;
    }

    private boolean verificarIzquierdaInf(int x, int y, int[][] tablero, int n) {
        while(x < n && y >= 0){
            if(tablero[x][y] == 1){
                return false;
            }
            x++; y--;
        }
        return true;
    }

    private boolean verificarDerechaInf(int x, int y, int[][] tablero, int n) {
        while(x < n && y < n){
            if(tablero[x][y] == 1){
                return false;
            }
            x++; y++;
        }
        return true;
    }

    private boolean verificarDerechaSup(int x, int y, int[][] tablero, int n) {
        while(x >= 0 && y < n){
            if(tablero[x][y] == 1){
                return false;
            }
            x--; y++;
        }
        return true;
    }
}
