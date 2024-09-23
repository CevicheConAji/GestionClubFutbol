import models.*;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Selection> staff = new LinkedList<>();

        ManageSelection mS = new ManageSelection();

        mS.test(staff);

        mS.printSelection(staff);

        mS.printAndCheckObject(staff);

        mS.selectionCount(staff);

        Collections.sort(staff);

        mS.printSelection(staff);
    }

}