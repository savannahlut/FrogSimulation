import java.util.Scanner;
public class FrogSimulation{
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
    * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
    * Precondition: dist > 0; numHops > 0
    */
    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
    */
    private int hopDistance(){
        Scanner s = new Scanner(System.in);
        System.out.println("How far?");
        return s.nextInt();
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
    * Returns true if the frog successfully reached or passed the goal during the simulation;
    * false otherwise.
    */
    public boolean simulate(){
        int h =0;
        int d =0;
        while(h < maxHops){
            d += hopDistance();
            if (d >= goalDistance) return true;
            if (d < 0) return false;
            h++;
        }
        return false;
    }

    /** Runs num simulations and returns the proportion of simulations in which the frog
    * successfully reached or passed the goal.
    * Precondition: num > 0
    */
    public double runSimulations(int num){
        if(num == 0){
            return 0;
        }
        if
        
    }
}