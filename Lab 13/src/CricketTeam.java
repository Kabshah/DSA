import java.util.Hashtable;
public class CricketTeam {
    public static void main(String[] args) {
        Hashtable<String, Integer> team = new Hashtable<>();
        team.put("Player1", 30);
        team.put("Player2", 40);
        team.put("Player3", 55);
        team.put("Player4", 60);
        team.put("Player5", 25);
        team.put("Player6", 15);
        team.put("Player7", 50);
        team.put("Player8", 70);
        team.put("Player9", 35);
        team.put("Player10", 45);
        team.put("Player11", 20);
        System.out.println("Player Ranks based on runs (Index = Runs % 11):");
        for (String player : team.keySet()) {
            int runs = team.get(player);
            int rank = runs % 11;
            System.out.println("Player Details: " + player + " | Runs: " + runs + " | Rank#: " + rank);}}}
/*1. Enter data of a cricket team 11 players which is supposed to be a hash table value and insert runs of each player as a data,
find out key treat’s Rank# of a player. For example: Runs are 30 mod by 11 which is index no 8; rank#8 is a rank of a team member.
        (Use HashTable ADT class)*/