package comparatorwarmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerRankingComparator implements Comparator<Player>{


    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getAge() == o2.getAge())
        return 0;
        else if(o1.getAge() > o2.getAge())
            return 1;
        return -1;
    }

    public static void main(String[] args) {

        Player playerOne = new Player(21,"Sachin",31);
        Player playerTwo = new Player(7,"Sadan",25);
        Player playerThree = new Player(15,"Rohit",28);

        List<Player> arList = new ArrayList<>();
        arList.add(playerOne);
        arList.add(playerTwo);
        arList.add(playerThree);

        Comparator<Player> byRanking = (Player p1, Player p2)-> {return p1.getRanking() - p2.getRanking();};

        Collections.sort(arList,byRanking);

        for (Player player: arList) {
            System.out.println(player.getName());
        }
    }
}
