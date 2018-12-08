/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccertournament;
import java.util.*;
import java.io.*;
/**
 *
 * @author Mascaro
 */
public class SemiFinals {
    private int numOfGroups = 0;
    private String[] groupWinners;
    private TeamData[] teams = new TeamData[100];
    private int[] scores = new int[100];
    private Scanner input = new Scanner(System.in);
    private  final int win = 1;
    private  final int winPoints = 3;
    private  final int loss = 1;
    private  final int draw = 1;
    private  final int drawPoints = 1;
    private String[] semiWinner = new String[2];
    
    public void setNumOfGroups(int x)
    {
        numOfGroups = x;
        groupWinners = new String[numOfGroups];
    }
    
   
    
    public void setWinners(String x, int i)
    {
        groupWinners[i] = x;
        teams[i] = new TeamData();
    }
    
    public void semiMatches()
    {
        System.out.println("********************");
        System.out.println("**SEMIFINALS ROUND**");
        System.out.println("********************");
        
        for (int x = 1; x < (numOfGroups - (numOfGroups/2)); x++) 
        {
            for (int y = x - 1; y >= 0; y--) 
            {
                System.out.println("\n" + groupWinners[x] + " will be playing against " + groupWinners[y]);
                System.out.println("Enter the scores for this game.");
                
                System.out.print(groupWinners[x] + " Score: ");
                scores[x] = input.nextInt();
                System.out.print(groupWinners[y] + " Score: ");
                scores[y] = input.nextInt();
                if(scores[x]>scores[y])
                {
                    System.out.println(groupWinners[x] + " won the match.");
                    teams[x].setWins(win);
                    teams[x].setPoints(winPoints);            
                    teams[y].setLosses(loss);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    semiWinner[0] = groupWinners[x];
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
                        semiWinner[0] = groupWinners[x];
                    }
                    else
                    {
                        semiWinner[0] = groupWinners[y];
                    }
                }
                else 
               {
                    System.out.println(groupWinners[y] + " won the match.");
                    teams[y].setWins(win);
                    teams[y].setPoints(winPoints);               
                    teams[x].setLosses(loss);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    semiWinner[0] = groupWinners[y];
                }
            }
        }
        for (int x = 3; x < (numOfGroups); x++) 
        {
            for (int y = x - 1; y != x; y++) 
            {
                System.out.println("\n" + groupWinners[x] + " will be playing against " + groupWinners[y]);
                System.out.println("Enter the scores for this game.");
                
                System.out.print(groupWinners[x] + " Score: ");
                scores[x] = input.nextInt();
                System.out.print(groupWinners[y] + " Score: ");
                scores[y] = input.nextInt();
                if(scores[x]>scores[y])
                {
                    System.out.println(groupWinners[x] + " won the match.");
                    teams[x].setWins(win);
                    teams[x].setPoints(winPoints);            
                    teams[y].setLosses(loss);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    semiWinner[1] = groupWinners[x];
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
                        semiWinner[1] = groupWinners[x];
                    }
                    else
                    {
                        semiWinner[1] = groupWinners[y];
                    }
                }
                else 
               {
                    System.out.println(groupWinners[y] + " won the match.");
                    teams[y].setWins(win);
                    teams[y].setPoints(winPoints);               
                    teams[x].setLosses(loss);
                    teams[x].setGoalsFor(scores[x]);
                    teams[y].setGoalsFor(scores[y]);
                    teams[x].setGoalsAgainst(scores[y]);
                    teams[y].setGoalsAgainst(scores[x]);
                    semiWinner[1] = groupWinners[y];
                }
            }
        }
    }
    
    public void semiMatchesData()
    {
        for(int i = 0; i<numOfGroups; i++)
        {
            System.out.println("\n" + groupWinners[i] + " match results");
            System.out.print("Wins: " + teams[i].getWins() + ".");
            System.out.print("Losses: " + teams[i].getLosses() + ".");
            System.out.print("Draws: " + teams[i].getDraws() + ".");
            System.out.println("Points: " + teams[i].getPoints() + ".");
        }
    }
    
    public void writeSemiMatch() throws IOException
    {
        PrintWriter pw = new PrintWriter("SemiMatchData.txt");
        for(int i = 0; i<numOfGroups; i++)
        {
          pw.println(groupWinners[i] + " match results");
          pw.println("Wins: " + teams[i].getWins() + "."); 
          pw.println("Losses: " + teams[i].getLosses() + "."); 
          pw.println("Draws: " + teams[i].getDraws() + "."); 
          pw.println("Points: " + teams[i].getPoints() + ".");
          pw.print("\n");
        }
        pw.close();   
    }
    
    
    public void getSemiWinners()
    {
        System.out.println("\nThe winners of the Semi-Finals are: " + semiWinner[0] + " & " + semiWinner[1]);
        System.out.println("They will be facing each other in the Finals for the championship");
    }
}