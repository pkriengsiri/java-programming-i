
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        
        String team = scan.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            int gamesPlayed = 0;
            int wins = 0;
            int losses = 0;
            
            while(fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                
                String[] data = row.split(",");
                
                String homeTeam = data[0];
                String awayTeam = data[1];
                int homeTeamPoints = Integer.valueOf(data[2]);
                int awayTeamPoints = Integer.valueOf(data[3]);
                
                if(homeTeam.equals(team) || awayTeam.equals(team)) {
                    gamesPlayed++;
                    
                    if(homeTeam.equals(team)) {
                        if(homeTeamPoints > awayTeamPoints) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else {
                        if(homeTeamPoints > awayTeamPoints) {
                            losses++;
                        } else {
                            wins++;
                        }
                    }
                    
                }
                
            }
            
            System.out.println("Games: "+gamesPlayed);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
            
        } catch (Exception e) {
            System.out.println("Failed to read file "+file);
        }
        

    }

}
