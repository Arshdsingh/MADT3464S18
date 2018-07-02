public class StringExamples {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = new String("Hp");
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        for (int i = s2.length() - 1; i >= 0; i--) {
            System.out.print(s2.charAt(i));
        }
        System.out.println("");
        String s4 = "Java";
        String s5 = "Java";
        if (s4.equalsIgnoreCase(s5))
            System.out.println("equal");
        else
            System.out.println("Not Equals");
        System.out.println(s4.compareTo(s5));

        System.out.println(s2.indexOf("d"));
        System.out.println(s4.lastIndexOf("a"));
        System.out.println(s4.replace("a", "@"));

        String s6 = "This is test String";
        int word = 0;
        for (int i = 0; i < s6.length(); i++) {
            if (Character.isWhitespace(s6.charAt(i))) {
                word++;
            }


        }
        System.out.println(word);
        StringBuffer buffer = new StringBuffer("Hello There");
        buffer.append("Java");

        System.out.println(buffer.charAt(2));
        System.out.println(buffer.insert(4, '@'));



        System.out.println(buffer.reverse());

    }
}
