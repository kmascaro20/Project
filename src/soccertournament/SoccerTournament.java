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
public class SoccerTournament {
    private static  Scanner input = new Scanner(System.in);
    private static  int numOfGroups = 0;
    private static  String[] groups;
    private static  GroupData[] MAINGROUP = new GroupData[100];
    private static String[] groupWinners = new String[100];
    private static SemiFinals SEMIS = new SemiFinals();

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        getGroupNames();
        groupInfo();
        groupResults();
        writeGroupWinners();
        getGroupWinners();
        semiFinalMatches();
    }
    
    private static void getGroupNames ()
    {
        System.out.println("Enter the amount of groups.");
        numOfGroups = input.nextInt();
        while(numOfGroups<4)
        {
            System.out.println("ERROR, Less than 4 groups");
            System.out.println("Enter 4 or more groups.");
            numOfGroups = input.nextInt();
        }
        groups = new String[numOfGroups];
        input.nextLine();
        for(int i = 0; i<groups.length; i++)
        {
            System.out.println("Enter the name for group " + (i+1) + ".");
            groups[i] = input.nextLine();
        }  
    }
    
    private static void groupInfo() throws IOException
    {
        for(int i = 0; i<groups.length; i++)
        {
          System.out.println("\nEnter the data for " + groups[i]);
          MAINGROUP[i] = new GroupData();
          MAINGROUP[i].getNames();
          MAINGROUP[i].matches();
          MAINGROUP[i].matchData();
          PrintWriter outputfile = new PrintWriter(groups[i] + ".txt");
          outputfile.println(groups[i]);
          outputfile.close();
          MAINGROUP[i].writeData(groups[i]);
        }
    }
    
    private static void groupResults() throws IOException 
    {
        for(int i = 0; i<groups.length; i++)
        {
            File newFile = new File(groups[i] + ".txt");
            Scanner inputFile = new Scanner(newFile);
            
            while(inputFile.hasNext())
            {
                String s = inputFile.nextLine();
                System.out.println(s);
            }
            inputFile.close();
        }
        
    }
    
    private static void writeGroupWinners() throws IOException
    {
        for(int i = 0; i<groups.length; i++)
        {
        PrintWriter outputfile = new PrintWriter(groups[i] + " Group Winner.txt");
          outputfile.println(groups[i]);
          outputfile.close();
          MAINGROUP[i].writeWinner(groups[i]);
        }
    }
    
    private static void getGroupWinners()
    {
        for(int i = 0; i<groups.length; i++)
        {
            groupWinners[i] = MAINGROUP[i].getWinner();
            System.out.println("Group " + groups[i] + " Winners: " + groupWinners[i]);
        }
    }
    
    private static void semiFinalMatches() throws IOException
    {
        SEMIS.setNumOfGroups(numOfGroups);
            for(int i = 0; i<groups.length; i++)
            {
                SEMIS.setWinners(groupWinners[i], i);
            }
            
        SEMIS.semiMatches();
        SEMIS.semiMatchesData();
        SEMIS.writeSemiMatch();
        SEMIS.getSemiWinners();
    }
    
    
}