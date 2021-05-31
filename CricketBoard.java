package cricketboard.org;

import java.util.Scanner;

public class CricketBoard {

	public int inputScore(int totalBalls)
	{
		Scanner scan=new Scanner(System.in);
		int totalRuns=0,totalWickets=0;
		final int validBalls=totalBalls;
		int overs=validBalls/6;
		
		for(int i=1;i<=totalBalls;i++)
		{
			System.out.println("Enter score for next ball:");
			if(scan.hasNextInt())
			{
				int runs=scan.nextInt();
				totalRuns +=runs;
			}
			else if(scan.hasNext())
			{
				String str=scan.next();
				
				if(str.equalsIgnoreCase("wd") || str.equalsIgnoreCase("nb")) {
					totalBalls++;
					totalRuns++;
				}
				else if(str.equalsIgnoreCase("w")) {
					totalWickets++;
					if(totalWickets == 10)
						break;
				}
			}
		}
		
		System.out.println("Total Runs: "+totalRuns);
		System.out.println("Total Wickets: "+totalWickets);
		System.out.println("Runrate per over: "+(totalRuns/(overs)));	
		
		return totalRuns;
	}
		
	public static void main(String[] args) {
		
		CricketBoard cb = new CricketBoard();
		int noOfOvers = 5;
		
		System.out.println("Score for Team1 ->");
		int scoreT1 = cb.inputScore(noOfOvers*6);
		
		System.out.println("**********************************************************");
		
		System.out.println("Score for Team2 ->");
		int scoreT2 = cb.inputScore(noOfOvers*6);
		
		System.out.println("**********************************************************");
		
		System.out.print("Final Result : ");
		
		if(scoreT1 > scoreT2)
			System.out.println("Winner Team is => Team1");
		else if(scoreT1 < scoreT2)
			System.out.println("Winner Team is => Team2");
		else 
			System.out.println("Match Draw");
	
	}

}

			
		
	
	

