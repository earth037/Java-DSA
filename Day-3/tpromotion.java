public class tpromotion {
    public static void main(String[] args){
        // Type promotion in expressions
        byte b = 10;
        short s = 20;
        int i = 30;

        // When we perform arithmetic operations, smaller types are promoted to int
        int result = b + s + i; // byte and short are promoted to int
        System.out.println("Result of byte + short + int: " + result);

        // If we want to store the result back in a byte, we need explicit casting
        byte bResult = (byte) (b + s); // explicit casting from int to byte
        System.out.println("Result of byte + short stored in byte: " + bResult);
    }
}
