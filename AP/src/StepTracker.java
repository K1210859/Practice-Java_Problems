public class StepTracker {
    private int minimumSteps;
    private int days;
    private int activeDays;
    private int totalSteps;
    public StepTracker(int minimum)
    {
        minimumSteps = minimum;
        days=0;
        activeDays=0;
        totalSteps=0;
    }
    public void addDailySteps(int steps)
    {
        totalSteps+=steps;
        days++;
        if(steps>=minimumSteps)
            activeDays++;
    }
    public int activeDays()
    {
        return activeDays;
    }
    public double averageSteps()
    {
        if(days==0)
            return 0.0;
        return (double) totalSteps/days;
    }
}
