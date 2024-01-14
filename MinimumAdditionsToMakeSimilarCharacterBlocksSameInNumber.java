import java.util.*;

public class MinimumAdditionsToMakeSimilarCharacterBlocksSameInNumber {

    public static void main(String args[]){

        //abbabbaaa
        String str = "bbbaaabbb";
        Map<Integer,Integer> map = new HashMap<>();
        int i=0,start=0,n=str.length(),max=Integer.MIN_VALUE;

        while(i<n){
            while(i<n && str.charAt(i)==str.charAt(start)){
                 i++;
            }
            int size = i-start;
            map.put(size,map.getOrDefault(size,0)+1);
            max = Math.max(max,size);
            start =i;
        }

        int total=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
                int diff = max- e.getKey();
                total +=diff*e.getValue();
        }

       System.out.println(" elements needed are : " + total);
       // map.entrySet().stream().forEach(System.out::println);


    }
}
