import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.HistoryStudent;


public class AppMain {

    public static void main(String[] args) {

        HistoryStudent student = new HistoryStudent();
        ComputerScienceStudent otherStudent = new ComputerScienceStudent();

        System.out.println(student.getNumberOfModules());
        System.out.println(otherStudent.getNumberOfModules());

    }


}
