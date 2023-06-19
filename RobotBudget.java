package array;

public class RobotBudget {

	public static void main(String[] args) {
		int[] chargeTimes = {3,6,1,3,4};
		int[] runningCosts = {2,1,3,4,5};
		int budget = 25;
		int max=0;
		for(int i=0;i<chargeTimes.length;i++) {
			if(max<chargeTimes[i])
				max=chargeTimes[i];
		}
		int maxRobots=0;
        if(max<budget){
            int sum=0;
            for(int i=0;i<runningCosts.length;i++){
                 sum=sum+runningCosts[i];
                 if(budget<(max+(i+1)*sum))
                 break;
                 else
                  maxRobots++;
            }
	}
System.out.println("maximum robots can be run are :"+maxRobots);
}
}
