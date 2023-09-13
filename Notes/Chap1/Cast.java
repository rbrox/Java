public class Cast {
    static void find_type(Object variable){
        if (variable instanceof Integer) {
            System.out.println("Type: int");
        } else if (variable instanceof Byte) {
            System.out.println("Type: byte");
        } else if (variable instanceof Short) {
            System.out.println("Type: short");
        } else if (variable instanceof Long) {
            System.out.println("Type: long");
        } else if (variable instanceof Float) {
            System.out.println("Type: float");
        } else if (variable instanceof Double) {
            System.out.println("Type: double");
        } else if (variable instanceof Character) {
            System.out.println("Type: char");
        } else if (variable instanceof Boolean) {
            System.out.println("Type: boolean");
        } else {
            System.out.println("Unknown type");
        }
    }
    
    public static void main(String args[]){
        // implicit type promotion
        byte a = 100, b = 100;
        find_type(a);
        float c = a * b;
        find_type(c);
        System.out.println(c);
    }
}
