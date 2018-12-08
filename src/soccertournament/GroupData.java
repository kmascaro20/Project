/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccertournament;
import java.io.*;
import java.util.*;
/**
 *
 * @author Kevin.Mascaro001
 */
public class GroupData 
{
    private  Scanner input = new Scanner(System.in);
    private  final int win = 1;
    private  final int winPoints = 3;
    private  final int loss = 1;
    private  final int draw = 1;
    private  final int drawPoints = 1;
    private  TeamData team1 = new TeamData();
    private  TeamData team2 = new TeamData();
    private  TeamData team3 = new TeamData();
    private  String[] teams = new String[3];
    private  int score1 = 0;
    private  int score2 = 0;
    private  int score3 = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    }
    
    public void matches()
{
    for (int x = 1; x < teams.length; x++) 
    {
        for (int y = x - 1; y >= 0; y--) 
        {
         System.out.println("\n" + teams[x] + " plays " + teams[y]);
         System.out.println("Enter the scores For this game.");
            if(teams[x] == teams[1] & teams[y] == teams[0])
            {
                System.out.print(teams[x] + " Score: ");
                score1 = input.nextInt();
                System.out.print(teams[y] + " Score: ");
                score2 = input.nextInt();
                if(score1>score2)
                {
                    System.out.println(teams[x] + " won the match.");
                    team1.setWins(win);
                    team1.setPoints(winPoints);            
                    team2.setLosses(loss);
                    team1.setGoalsFor(score1);
                    team2.setGoalsFor(score2);
                    team1.setGoalsAgainst(score2);
                    team2.setGoalsAgainst(score1);
                }
                else if(score1==score2)
                {
                    System.out.println("The match was a draw!");
                    team1.setDraws(draw);
                    team1.setPoints(drawPoints);               
                    team2.setDraws(draw);
                    team2.setPoints(drawPoints);
                    team1.setGoalsFor(score1);
                    team2.setGoalsFor(score2);
                    team1.setGoalsAgainst(score2);
                    team2.setGoalsAgainst(score1);
                }
                else 
               {
                    System.out.println(teams[y] + " won the match.");
                    team2.setWins(win);
                    team2.setPoints(winPoints);               
                    team1.setLosses(loss);
                    team1.setGoalsFor(score1);
                    team2.setGoalsFor(score2);
                    team1.setGoalsAgainst(score2);
                    team2.setGoalsAgainst(score1);
                }
            }
            if(teams[x] == teams[2] & teams[y] == teams[1])
            {
                System.out.print(teams[x] + " Score: ");
                score3 = input.nextInt();
                System.out.print(teams[y] + " Score: ");
                score2 = input.nextInt();
                if(score3>score2)
                {
                    System.out.println(teams[x] + " won the match.");
                    team3.setWins(win);
                    team3.setPoints(winPoints);               
                    team2.setLosses(loss);
                    team3.setGoalsFor(score3);
                    team2.setGoalsFor(score2);
                    team3.setGoalsAgainst(score2);
                    team2.setGoalsAgainst(score3);
                }
                else if(score3==score2)
                {
                    System.out.println("The match was a draw!");
                    team3.setDraws(draw);
                    team3.setPoints(drawPoints);               
                    team2.setDraws(draw);
                    team2.setPoints(drawPoints);
                    team3.setGoalsFor(score3);
                    team2.setGoalsFor(score2);
                    team3.setGoalsAgainst(score2);
                    team2.setGoalsAgainst(score3);
                }
                else 
                {
                    System.out.println(teams[y] + " won the match.");
                    team2.setWins(win);
                    team2.setPoints(winPoints);               
                    team3.setLosses(loss);
                    team3.setGoalsFor(score3);
                    team2.setGoalsFor(score2);
                    team3.setGoalsAgainst(score2);
                    team2.setGoalsAgainst(score3);
                }
            }
            if(teams[x] == teams[2] & teams[y] == teams[0])
            {
                System.out.print(teams[x] + " Score: ");
                score3 = input.nextInt();
                System.out.print(teams[y] + " Score: ");
                score1 = input.nextInt();
                if(score3>score1)
                {
                    System.out.println(teams[x] + " won the match.");
                    team3.setWins(win);
                    team3.setPoints(winPoints);               
                    team1.setLosses(loss);
                    team3.setGoalsFor(score3);
                    team1.setGoalsFor(score1);
                    team3.setGoalsAgainst(score1);
                    team1.setGoalsAgainst(score3);
                }
                else if(score3==score1)
                {
                    System.out.println("The match was a draw!");
                    team3.setDraws(draw);
                    team3.setPoints(drawPoints);               
                    team1.setDraws(draw);
                    team1.setPoints(drawPoints);
                    team3.setGoalsFor(score3);
                    team1.setGoalsFor(score1);
                    team3.setGoalsAgainst(score1);
                    team1.setGoalsAgainst(score3);
                }
                else 
                {
                    System.out.println(teams[y] + " won the match.");
                    team1.setWins(win);
                    team1.setPoints(winPoints);               
                    team3.setLosses(loss);
                    team3.setGoalsFor(score3);
                    team1.setGoalsFor(score1);
                    team3.setGoalsAgainst(score1);
                    team1.setGoalsAgainst(score3);
                }
            }
        }
    }
}
    
    public void getNames()
    {
        for(int i=0; i<teams.length; i++)
        {
            System.out.print("Enter the name for team "+(i+1)+":");
            teams[i] = input.nextLine();
        }
    }
    
    public void matchData()
    {
        System.out.println("\n" + teams[0] + " match results");
        System.out.print("Wins: " + team1.getWins() + ".");
        System.out.print("Losses: " + team1.getLosses() + ".");
        System.out.print("Draws: " + team1.getDraws() + ".");
        System.out.println("Points: " + team1.getPoints() + ".");
        
        System.out.println("\n" + teams[1] + " match results");
        System.out.print("Wins: " + team2.getWins() + ".");
        System.out.print("Losses: " + team2.getLosses() + ".");
        System.out.print("Draws: " + team2.getDraws() + ".");
        System.out.println("Points: " + team2.getPoints() + ".");
        
        System.out.println("\n" + teams[2] + " match results");
        System.out.print("Wins: " + team3.getWins() + ".");
        System.out.print("Losses: " + team3.getLosses() + ".");
        System.out.print("Draws: " + team3.getDraws() + ".");
        System.out.println("Points: " + team3.getPoints() + ".");
        input.nextLine();
    }
    
    public void writeData(String x) throws IOException
    {
        FileWriter fw = new FileWriter(x + ".txt", true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(teams[0] + " match results");
        pw.println("Wins: " + team1.getWins() + ".");
        pw.println("Losses: " + team1.getLosses() + ".");
        pw.println("Draws: " + team1.getDraws() + ".");
        pw.println("Points: " + team1.getPoints() + ".");
        
        pw.println(teams[1] + " match results");
        pw.println("Wins: " + team2.getWins() + ".");
        pw.println("Losses: " + team2.getLosses() + ".");
        pw.println("Draws: " + team2.getDraws() + ".");
        pw.println("Points: " + team2.getPoints() + ".");
        
        pw.println(teams[2] + " match results");
        pw.println("Wins: " + team3.getWins() + ".");
        pw.println("Losses: " + team3.getLosses() + ".");
        pw.println("Draws: " + team3.getDraws() + ".");
        pw.println("Points: " + team3.getPoints() + ".");
        
        pw.close();
    }
    
    public void writeWinner(String groupName) throws IOException
    {
        FileWriter fw = new FileWriter(groupName + " Group Winner.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        
        if(team1.getPoints()>team2.getPoints())
        {
            if(team1.getPoints()>team3.getPoints())
            {
                pw.println("Group Winner: " + teams[0]);
                pw.println("Points: " + team1.getPoints());
            }
            else
            {
                pw.println("Group Winner: " + teams[2]);
                pw.println("Points: " + team3.getPoints());
            }
        }
        else if(team3.getPoints()>team2.getPoints())
        {
            if(team3.getPoints()>team1.getPoints())
            {
                pw.println("Group Winner: " + teams[2]);
                pw.println("Points: " + team3.getPoints());
            }
            else
            {
                pw.println("Group Winner: " + teams[0]);
                pw.println("Points: " + team1.getPoints());
            }
        }
        else
        {
            if(team2.getPoints()>team3.getPoints())
            {
                pw.println("Group Winner: " + teams[1]);
                pw.println("Points: " + team2.getPoints());
            }
            else
            {
                pw.println("Group Winner: " + teams[2]);
                pw.println("Points: " + team3.getPoints());
            }
        }
        pw.close();
    }
    
    public String getWinner()
    {
        if(team1.getPoints()>team2.getPoints())
        {
            if(team1.getPoints()>team3.getPoints())
            {
                return teams[0];
            }
            else
            {
                return teams[2];
            }
        }
        else if(team3.getPoints()>team2.getPoints())
        {
            if(team3.getPoints()>team1.getPoints())
            {
                return teams[2];
            }
            else
            {
                return teams[0];
            }
        }
        else
        {
            if(team2.getPoints()>team3.getPoints())
            {
                return teams[1];
            }
            else
            {
                return teams[2];
            }
        }
    }
}