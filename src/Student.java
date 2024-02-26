public class Student {
    int rollNo;
    String name;
    int age;
    String course;

    class AgeNotWithinRangeException extends Exception {
        public AgeNotWithinRangeException(String message) {
            super(message);
        }
    }

    class NameNotValidException extends Exception {
        public NameNotValidException(String message) {
            super(message);
        }
    }

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if (!name.matches("^[a-zA-Z ]+$")) {
            throw new NameNotValidException("Name should not contain numbers or special characters");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
