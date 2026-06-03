public class truncatingc {
    public static void main(String[] args){
        // Truncating type conversion
        double d = 10.99;
        int i = (int) d; //truncating the decimal part
        System.out.println("Double value: " + d);
        System.out.println("Integer value after truncation: " + i);

        // Float to int truncation
        float f = 5.75f;
        int j = (int) f; //truncating the decimal part
        System.out.println("Float value: " + f);
        System.out.println("Integer value after truncation: " + j);
    }
}
