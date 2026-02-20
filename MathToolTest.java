public class MathToolTest{
    public static void main(String[] args){
        MathTool tool = new MathTool();
        StopWatch watch = new StopWatch();
        int iterations = 1000000;
        int targetNumber = 20;

        watch.start();
        for (int i = 0; i < iterations; i++) {
            tool.factorialRecursive(targetNumber);
        }
        watch.stop();
        System.out.println("Recursion (1 million times): " + watch.getElapsedTime() + " ms");

        watch.start();
        for (int i = 0; i < iterations; i++) {
            tool.factorialIterative(targetNumber);
        }
        watch.stop();
        System.out.println("Iteration (1 million times): " + watch.getElapsedTime() + " ms");




    }
}