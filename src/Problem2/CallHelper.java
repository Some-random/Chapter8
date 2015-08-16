package Problem2;

import java.util.ArrayList;

/**
 * Created by Bob_JIANG on 8/16/2015.
 */
public class CallHelper {
    ArrayList<respondent> ALr;
    ArrayList<Problem2.manager> ALm;

    CallHelper() {
        ALr = new ArrayList<>();
        ALm = new ArrayList<>();
        int i;
        for(i = 0; i < 5; i++) {
            ALr.add(new respondent(i));
        }
        for(i = 0; i < 2; i++) {
            ALm.add(new manager(i + 5));
        }
    }

    public void printAnswer(Employee e) {
        if(e instanceof respondent) {
            System.out.println("Respondent " + ((respondent) e).respondentID + " answered the phone");
        }
        else if(e instanceof manager) {
            System.out.println("Manger " + ((manager) e).managerID + " answered the phone");
        }
    }

    public void disPatchCall(int capability) {
        for(respondent r : ALr) {
            if (r.answer(capability)) {
                printAnswer(r);
                return;
            }
        }
        for(manager m : ALm) {
            if(m.answer(capability)) {
                printAnswer(m);
                return;
            }
        }
    }
}
