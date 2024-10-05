class Calculator {
    // Overloaded add methods
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating an instance of Calculator
        Calculator obj = new Calculator();
        
        // Calling the method with 3 integers
        int r1 = obj.add(3, 4, 5);
        
        // Printing the result
        System.out.println(r1);  // Output: 12
    }
}
