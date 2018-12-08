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
    
}
