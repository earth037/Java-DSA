public class arithmetic {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // += operator
        a += 2; // equivalent to a = a + b
        System.out.println("After a += b, a: " + a);    

        // -= operator
        a -= 2; // equivalent to a = a - b
        System.out.println("After a -= b, a: " + a);

        // *= operator
        a *= 2; // equivalent to a = a * b
        System.out.println("After a *= b, a: " + a);

        // /= operator
        a /= 2; // equivalent to a = a / b
        System.out.println("After a /= b, a: " + a);

        // %= operator
        a %= 2; // equivalent to a = a % b
        System.out.println("After a %= b, a: " + a);

        // prefix increment operator
        int i = 2;
        int j = ++i;
        System.out.println(i + " , " + j);
        // postfix increment operator
        int k = i++;
        System.out.println(i + " , " + k);
        // prefix decrement operator
        int l = --i;
        System.out.println(i + " , " + l);
        // postfix decrement operator
        int m = i--;
        System.out.println(i + " , " + m);
    }
    
}
