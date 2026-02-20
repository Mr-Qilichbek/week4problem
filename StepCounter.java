public class StepCounter {

    public static int totalStepsAllUsers=0;
    private int individualSteps;

    public StepCounter() {
        this.individualSteps = 0;
    }
    public void walk(int steps) {
        this.individualSteps += steps;
        totalStepsAllUsers += steps;
    }
    public static void resetGlobalSteps() {
        totalStepsAllUsers = 0;
    }

    public int getIndividualSteps() {
        return individualSteps;
    }
}
