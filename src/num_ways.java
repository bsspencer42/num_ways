import java.util.ArrayList;

public class num_ways {
    public static void main(String[] args) {
        int[] steps = {1,2,3,4};
        System.out.println("Num Ways = " + getNumWays(steps,5));
    }
    public static int getNumWays(int[] steps, int n){
        ArrayList<String> myResults = new ArrayList<>();
        ArrayList<String> allResults = innerNumWays(steps,n,myResults,"");
        for (String result : myResults){
            System.out.println(result);
        }
        return myResults.size();
    }

    public static ArrayList<String> innerNumWays(int[] steps, int n,ArrayList<String> myResults, String myString){
        if (n==0){
            myResults.add(myString);
            return myResults;
        }
        for (int i = 0; i < steps.length; i++){
            if (steps[i] <= n){
                myResults = innerNumWays(steps,n-steps[i],myResults,myString+String.valueOf(steps[i]));
            }
        }
        return myResults;
    }
}
