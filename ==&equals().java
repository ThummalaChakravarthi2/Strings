public class CompareExample {
    public static void main(String[] args) {
        String s1 = "Hello"; //StringConstantPool       
        String s2 = "Hello"; //StringConstantPool 
        String s3 = new String("Hello"); // heap

      //check whether the merory reference is same or not
        System.out.println(s1 == s2);  // true (same reference)
        System.out.println(s1 == s3);  // false (different objects)

      //checks the content is same or not
        System.out.println(s1.equals(s2)); // true (same content)
        System.out.println(s1.equals(s3)); // true (same content)
    }
}
