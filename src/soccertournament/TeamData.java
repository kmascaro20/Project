/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccertournament;
/**
 *
 * @author Kevin.Mascaro001
 */

public class TeamData {
    
    private int gamesPlayed = 0;
    private int wins = 0;
    private int losses = 0;
    private int draws = 0;
    private int goalsFor = 0;
    private int goalsAgainst = 0;
    private int goalsDifference = 0;
    private int points = 0;

    public static void main(String[] args) 
    {
       
    }
    
    
    public void setGamesPlayed (int x)
    {
        gamesPlayed += x;
    }
    
    public void setWins (int x)
    {
        wins += x;
    }
    
    public void setLosses(int x)
    {
        losses += x;
    }
    
    public void setDraws(int x)
    {
        draws += x;
    }
    
    public void setGoalsFor(int x)
    {
        goalsFor += x;
    }
    
    public void setGoalsAgainst (int x)
    {
        goalsAgainst += x;
    }
    
    public void setGoalsDifference ()
    {
        goalsDifference = goalsFor - goalsAgainst;
    }
    
    public void setPoints(int x)
    {
        points += x;
    }
    
    public int getGamesPlayed()
    {
        return gamesPlayed;
    }
    
    public int getWins()
    {
        return wins;
    }
    
    public int getLosses()
    {
        return losses;
    }
    
    public int getDraws()
    {
        return draws;
    }
    
    public int getGoalsFor()
    {
        return goalsFor;
    }
    
    public int getGoalsAgainst()
    {
        return goalsAgainst;
    }
    
    public int getGoalsDifference()
    {
        return goalsDifference;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    
}