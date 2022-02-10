import models.Student;
import services.EntityConnector;
import services.StudentService;

import java.util.List;

public class AppStart {
    public static void main(String[] args) {

        StudentService service = new StudentService(EntityConnector.getEmFactory());

        System.out.println(service.getOneStudent(55L));

        List<Student> listOut = service.getAllStudents();

        service.removeStudent(service.getOneStudent(55L));


    }
}