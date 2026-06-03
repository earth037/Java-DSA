public class implicitc {
    public static void main(String[] args){
        // Implicit type conversion (widening conversion)
        // int to long
        int i = 100;
        long l = i; //implicit type casting from int to long
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        
        // float to double
        float f = 10.5f;
        double d = f; //implicit type casting from float to double
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);

        // char to int
        char c = 'A';
        int value = c; //implicit type casting from char to int
        System.out.println("Character value: " + c);
        System.out.println("Integer value of character: " + value);
    }
}
