public class explicitc {
    public static void main(String[] args){
        // Explicit type conversion (narrowing conversion)
        // int to byte
        int i = 300;
        byte b = (byte) i; //explicit type casting from int to byte
        System.out.println("Integer value: " + i);
        System.out.println("Byte value after explicit casting: " + b);

        // double to float
        double d = 10.557673758;
        float f = (float) d; //explicit type casting from double to float
        System.out.println("Double value: " + d);
        System.out.println("Float value after explicit casting: " + f);
}
}