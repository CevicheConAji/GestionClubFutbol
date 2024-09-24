package Models;

import java.util.LinkedList;

public class ManageSelection {

    public void test(LinkedList<Selection> staff) {

        Selection player01 = new Player(94, "Leonel",
                "Messi", 40, 10, "RW");
        Selection player02 = new Player(90, "Marc-Andre",
                "ter Stegen", 32, 1, "GK");
        Selection player03 = new Player(87, "Jordi",
                "Alba", 46, 18, "LB");

        Selection coach01 = new Coach(13, "Pau",
                "Marti", 34, "AA34");
        Selection coach02 = new Coach(24, "Paco",
                "Perez", 45, "AB12");

        Selection masseuse = new Masseuse(10, "Luffy",
                "DiMoonkey", 25, "Doctor", 7);

        staff.add(player01);
        staff.add(player02);
        staff.add(player03);
        staff.add(coach01);
        staff.add(coach02);
        staff.add(masseuse);
    }

    /**
     * Imprime la LinkedList de
     *
     * @param staff LinkedList
     */
    public void printSelection(LinkedList<Selection> staff) {
        for (Selection s : staff) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void printAndCheckObject(Object o) {
        if (o instanceof Selection s) {
            System.out.println(s.getClass().getName() + " " + s);
        }
        if (o instanceof Player p) {
            System.out.println(p.getClass().getName() + " " + p);
        }
        if (o instanceof Coach c) {
            System.out.println(c.getClass().getName() + " " + c);
        }
        if (o instanceof Masseuse m) {
            System.out.println(m.getClass().getName() + " " + m);
        }
    }

    /**
     * Metodo que cuenta cuántos Player, Coach y Masseuse hay en la LinkedList
     *
     * @param staff LinkedList
     */
    public void selectionCount(LinkedList<Selection> staff) {
        int playerCount = 0;
        int coachCount = 0;
        int masseuseCount = 0;

        for (Selection s : staff) {
            if (s instanceof Player) {
                playerCount++;
            }
            if (s instanceof Coach) {
                coachCount++;
            }
            if (s instanceof Masseuse) {
                masseuseCount++;
            }
        }
        System.out.println("***Selection Count***" +
                "\n-Player Count: (" + playerCount + ")"
                + "\n-Coach Count: (" + coachCount + ")"
                + "\n-Masseuse Count: (" + masseuseCount + ")\n");
    }
}
