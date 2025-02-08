package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer 
{

    int totalRejected = 0;

    public int reportRejected() 
    {
        return totalRejected;
    }

<<<<<<< HEAD
    public void countIn(int in) 
    {
=======
    public void countIn(int in) {
>>>>>>> 6206e705129c99db0bd2e12199ff91c5e918f075
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
