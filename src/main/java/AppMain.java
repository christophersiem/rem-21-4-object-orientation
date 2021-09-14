import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.HistoryStudent;
import de.neuefische.model.Student;

public class AppMain {

    public static void main(String[] args) {

        Student student = new HistoryStudent();
        Student otherStudent = new ComputerScienceStudent();

        System.out.println(student.getSubject());
        System.out.println(otherStudent.getSubject());
    }


}
