
package recur2;

public class ContarCerosDeUnNumero {

    public static void main(String[] args) {
        System.out.println(countZeros(1000034));
    }
    public static int countZeros(int n){
        if(n > 0){
            if(n % 10 == 0){
                return 1 + countZeros(n/10);
            }
            return countZeros(n/10);
        }else{
            return 0;
        }
                    
    }
    
}
