import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.HistoryStudent;


public class AppMain {

    public static void main(String[] args) {

        HistoryStudent student = new HistoryStudent();
        ComputerScienceStudent otherStudent = new ComputerScienceStudent();

        System.out.println(student.getNumberOfModules());

        /**
         * Aufruf nicht möglich, da ComputerScience Student die Methode getNumberOfModules nicht kennt
        System.out.println(otherStudent.getNumberOfModules());
        **/

    }


}
