public class StringStudy {
    public static void main(String[] args) {
        String name = "Chitranshu";    // string literal stored int the method area - string pool
        String name1 = "Chitranshu";
        String name2 = new String("Chitranshu");  // string using constructor - stored as separate obj
        String name3 = new String("Chitranshu");

        System.out.println(name == name1);
        System.out.println(name2 == name3);


        // strings are immutable
        // every time we perform any operation new object is created

        System.out.println("================================");
        System.out.println("1.Concatenation");

        String s1 = "hello";
        s1 = s1+" peeps";
        System.out.println(s1);
        System.out.println(s1+" How are you doing");
        System.out.println(s1);           //s1 remains same

        // another way of concatenation

        String s3 = new String("Hello");
        String s4 = new String("people");
        String s2 = s3.concat(s4);
        System.out.println(s2);
        System.out.println(s4);         // s4 remains same

        System.out.println("=========================");

        System.out.println("2.checking if string are equal in values");

        System.out.println(name.equals(name1));
        //equals function -> object class
        // this generally compares the references of the objects


        

    }
}
