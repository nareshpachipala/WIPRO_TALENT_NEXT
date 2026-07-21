package abst.excep;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() { return "First Class"; }
}

class Ladies extends Compartment {
    public String notice() { return "Ladies"; }
}

class General extends Compartment {
    public String notice() { return "General"; }
}

class Luggage extends Compartment {
    public String notice() { return "Luggage"; }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < c.length; i++) {
            int x = r.nextInt(4) + 1;
            c[i] = x == 1 ? new FirstClass() : x == 2 ? new Ladies() : x == 3 ? new General() : new Luggage();
            System.out.println(c[i].notice());
        }
    }
}
