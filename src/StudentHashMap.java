import java.util.HashMap;

public class StudentHashMap {
    private HashMap<String,Integer> students;

    StudentHashMap(){
        students = new HashMap<String, Integer>();
    }

    public void addStudent(String studentName, int grade){
        students.put(studentName,grade);
    }

    public void removeStudent(String studentName){
        students.remove(studentName);
    }

    public void displayStudentGrade(String studentName){
        Integer grade =students.get(studentName);
        System.out.println(studentName + " scored : " +grade);
    }
}
