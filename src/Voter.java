public class Voter {
    int voterId;
    String name;
    int age;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}
