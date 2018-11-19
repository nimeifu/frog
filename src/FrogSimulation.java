
public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int goalDistance, int maxHops)
    {
        this.goalDistance=goalDistance;
        this.maxHops=maxHops;


    }

    private int hopDistance()
    {
        int min=-1*maxHops;
        int max=goalDistance;


        int hopDistance=(int)(Math.random()*max+min);
        System.out.println(hopDistance);

        return hopDistance;
    }

    public boolean simulate()
    {
        int position=0;

        for (int count =0;count<maxHops; count++)
        {
            position+= hopDistance();
            if(position >= goalDistance)
            {
                return true;
            }
            else if (position <0)
            {
                return false;
            }

        }
        return false;
    }

    public double runSimulations(int num)
    {
        int countSuccess=0;
        for (int count=0; count<num; count++)
        {
            if(simulate())
            {
                countSuccess++;
            }

        }
        return(double) countSuccess/num;
    }
}

