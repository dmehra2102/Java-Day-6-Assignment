public class Main {
    public static void main(String[] args) {
        try{
            Student newStudent = new Student(1,"Deepanshu",21,"Java Development");
            StudentHashMap students = new StudentHashMap();
            students.addStudent(newStudent.name, 27);

            // Stack
            Stack newStack = new Stack();
            newStack.addElement(10);
            newStack.addElement(32);
            newStack.addElement(11);

            newStack.removeElement();
            newStack.removeElement();
            newStack.removeElement();

            System.out.println(newStack.isStackEmpty());
            newStack.removeElement();

            // Weekdays
            Weekdays myDays = new Weekdays();
            myDays.printDay(1);
        }catch(Weekdays.DayOutsideRangeException | Student.AgeNotWithinRangeException | Student.NameNotValidException e){
            System.out.println(e.getMessage());
        }
    }
}