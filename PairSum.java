import java.util.* ;

public class PairSum{
    public static List<int[]> pairSum(int[] arr, int s) {
       
       List<int[]> result = new ArrayList<>();
       for(int i=0;i<arr.length-1;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]+arr[j]==s)
               {
                   int[] pair = {Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])};
                   result.add(pair);
               }
           }
       }
        result.sort((a, b) -> Integer.compare(a[0], b[0]));
        return result;
    }
}
