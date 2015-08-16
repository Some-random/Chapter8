package Problem2;

/**
 * Created by Bob_JIANG on 8/16/2015.
 */
public class Employee {
    boolean available = true;
    int capability;

    boolean answer(int requirment) {
        if(!available) {
            return false;
        }
        if(capability >= requirment) {
            //printAnswer(this);
            available = false;
            return true;
        }
        else {
            return false;
        }
    }
}
