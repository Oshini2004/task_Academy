public class stringBuildDemo {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");
        sb.ensureCapacity(1000);
        System.out.println(sb.capacity());
        sb.insert(1, "iii");
        sb.append("wold");

        System.out.println(sb.toString());
    }
    
}
