import java.util.ArrayList;


public class Combinatoria
{
   public ArrayList<ArrayList<Integer>> combinatoria(int [] arr){
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       ArrayList<Integer> sublist = new ArrayList<>();
       combinar(list,0, arr, sublist);
       return list;
   }
   
   private void combinar(ArrayList<ArrayList<Integer>> list, int puntero, int[] arr, ArrayList<Integer> sublist){
          
       if(puntero >= arr.length){
           ArrayList<Integer> xd = new ArrayList<Integer>(sublist);
           list.add(xd);
       }else{
           sublist.add(arr[puntero]);
           combinar(list,puntero+1, arr, sublist);
           sublist.remove(sublist.size()-1);
           combinar(list, puntero+1, arr, sublist);
       }
   }
}
