import Models.*;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * Testing para probar el funcionamiento de la gestión de móviles
 * @author Piero Zavala
 * @version 1.0
 */
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