import java.util.Optional;

public class OptionalEmployee {
    static class InvalidEmployeeException extends Exception {
        InvalidEmployeeException() {
            super("Invalid Employee");
        }
    }

    public static void main(String[] args) {
        Employee employee = null;

        try {
            Optional.ofNullable(employee).orElseThrow(InvalidEmployeeException::new);
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
