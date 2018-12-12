package soccertournament;
import java.util.*;
import java.io.*;
/**
 *
 * @author Mascaro
 */
public class Finals {
    private int numOfGroups = 0;
    private String[] semiWinners;
    private TeamData[] teams = new TeamData[100];
    private int[] scores = new int[100];
    private Scanner input = new Scanner(System.in);
    private  final int win = 1;
    private  final int winPoints = 3;
    private  final int loss = 1;
    private  final int draw = 1;
    private  final int drawPoints = 1;
    private String[] finalWinner = new String[2];
    
    public void setNumOfGroups(int x)
    {
        numOfGroups = x;
        semiWinners = new String[numOfGroups];
    }
    
   
    
    public void setWinner(String x, int i)
    {
        semiWinners[i] = x;
        teams[i] = new TeamData();
    }
    
    public void finalMatch()
    {
        System.out.println("*********************");
        System.out.println("*****FINAL ROUND*****");
        System.out.println("*********************");
        
        for (int x = 1; x <numOfGroups; x++) 
        {
            for (int y = x - 1; y >= 0; y--) 
            {
                System.out.println("\n" + semiWinners[x] + " will be playing against " + semiWinners[y]);
                System.out.println("Enter the scores for this game.");
                
                System.out.print(semiWinners[x] + " Score: ");
                scores[x] = input.nextInt();
                System.out.print(semiWinners[y] + " Score: ");
                scores[y] = input.nextInt();
                if(scores[x]>scores[y])
                {
                    System.out.println(semiWinners[x] + " won the match.");
                    teams[x].setWins(win);
                    teams[x].setPoints(winPoints);            
                    teams[y].setLosses(loss);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    finalWinner[0] = semiWinners[x];
                }
                else if(scores[x]==scores[y])
                {
                    System.out.println("The match was a draw!");
                    teams[x].setDraws(draw);
                    teams[x].setPoints(drawPoints);               
                    teams[y].setDraws(draw);
                    teams[y].setPoints(drawPoints);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    if(teams[x].getGoalsDifference()>teams[y].getGoalsDifference())
                    {
                        finalWinner[0] = semiWinners[x];
                    }
                    else
                    {
                        finalWinner[0] = semiWinners[y];
                    }
                }
                else 
               {
                    System.out.println(semiWinners[y] + " won the match.");
                    teams[y].setWins(win);
                    teams[y].setPoints(winPoints);               
                    teams[x].setLosses(loss);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    finalWinner[0] = semiWinners[y];
                }
            }
        }
    }
    
    public void finalMatchData()
    {
        for(int i = 0; i<numOfGroups; i++)
        {
            System.out.println("\n" + semiWinners[i] + " match results");
            System.out.print("Wins: " + teams[i].getWins() + ".");
            System.out.print("Losses: " + teams[i].getLosses() + ".");
            System.out.print("Draws: " + teams[i].getDraws() + ".");
            System.out.println("Points: " + teams[i].getPoints() + ".");
        }
    }
    
    public void writeFinalMatch() throws IOException
    {
        PrintWriter pw = new PrintWriter("FinalMatchData.txt");
        for(int i = 0; i<numOfGroups; i++)
        {
          pw.println(semiWinners[i] + " match results");
          pw.println("Wins: " + teams[i].getWins() + "."); 
          pw.println("Losses: " + teams[i].getLosses() + "."); 
          pw.println("Draws: " + teams[i].getDraws() + "."); 
          pw.println("Points: " + teams[i].getPoints() + ".");
          pw.print("\n");
        }
        pw.close();   
    }
    
    
    public void getFinalWinner()
    {
        System.out.println("\nThe winner of the Soccer Tournament is: " + finalWinner[0]);
        System.out.println("Congratulations!");
    }
}