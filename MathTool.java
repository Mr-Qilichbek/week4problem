public class MathTool{

    public long factorialRecursive (int n){
        if(n<=1)  return 1;
        return n* factorialRecursive(n-1);
    }

    public long factorialIterative(int n){
        long factorial=1;
        for(int i=1; i>=n; i++){
            factorial*=i;
        }
        return factorial;
    }


}