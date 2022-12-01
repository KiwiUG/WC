import model.Players;
import model.Teams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Players player1 = new Players("Messi",35,10.0);
        Players player2 = new Players("Emi Martinez",35,6.9);
        Players player3 = new Players("Di Maria",36,8.9);
        Players player4 = new Players("L Martinez",30,7.5);
        Players player5 = new Players("Dybala",28,7);

        ArrayList<Players> Argentina = new ArrayList<>();
        Argentina.add(player1);
        Argentina.add(player2);
        Argentina.add(player3);
        Argentina.add(player4);
        Argentina.add(player5);

        System.out.println(Argentina);

        Teams Argentinaa = new Teams("Argentina",3,"C","Purple",Argentina);

        System.out.println();

    }}
