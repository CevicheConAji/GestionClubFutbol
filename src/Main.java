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
        if (o instanceof Player){
            Player p = (Player) o;
            System.out.println(o);
        }
    }
}