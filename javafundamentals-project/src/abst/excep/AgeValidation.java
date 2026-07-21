class AgeException extends Exception {
    AgeException(String m) { super(m); }
}

public class AgeValidation {
    public static void main(String[] args) {
        try {
            if (args.length < 2) throw new AgeException("Please enter name and age");
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) throw new AgeException("Invalid age");
            System.out.println(name + " is eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
