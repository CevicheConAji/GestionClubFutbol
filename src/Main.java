import models.Coach;
import models.Masseuse;
import models.Player;
import models.Selection;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Selection> staff = new LinkedList<>();
        test(staff);
        printSelection(staff);
        printAndCheck(staff);
        numerarLista(staff);
    }
    public static void test(LinkedList<Selection> staff){
        
        Selection player01 = new Player();
        Selection player02 = new Player();
        Selection player03 = new Player();

        Selection coach01 = new Coach();
        Selection coach02 = new Coach();
        
        Selection masseuse = new Masseuse();
        
        staff.add(player01);
        staff.add(player02);
        staff.add(player03);
        staff.add(coach01);
        staff.add(coach02);
        staff.add(masseuse);
    }
    public static void printSelection(LinkedList<Selection> staff){
        for (Selection s : staff){
            System.out.println(s);

        }
    }

    public static void printAndCheck(Object o){
        if (o instanceof Selection){
            Selection s = (Selection) o;
            System.out.println(s.getClass().getName() + " " + s);
        }
        if(o instanceof Player){
            Player p = (Player) o;
            System.out.println(p.getClass().getName() + " " + p);
        }
        if(o instanceof Coach){
            Coach c = (Coach) o;
            System.out.println(c.getClass().getName() + " " + c);
        }
        if(o instanceof Masseuse){
            Masseuse m = (Masseuse) o;
            System.out.println(m.getClass().getName() + " " + m);
        }
    }
    public static void numerarLista(LinkedList<Selection> staff){
        int playerCount = 0;
        int coachCount = 0;
        int masseuseCount = 0;

        for (Selection s : staff){
            if(s instanceof Player){
                playerCount++;
            }
            if (s instanceof Coach){
                coachCount++;
            }
            if (s instanceof Masseuse){
                masseuseCount++;
            }
        }
        System.out.println(playerCount + " " + coachCount + " " + masseuseCount);
    }
}