public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist,int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {
        return 2;
    }
    public boolean simulate()
    {
        int total = 0;
        for(int i=0;i<maxHops;i++)
        {
            total+=hopDistance();
            if(total<0)
                return false;
        }
        if(total>=goalDistance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double runSimulations(int num)
    {
        int trueCounter = 0;
        for(int i=0;i<num;i++)
        {
            boolean condition = simulate();
            if(condition==true)
                trueCounter++;

        }
        double answer = (double) trueCounter/num;
        return answer;
    }
}
