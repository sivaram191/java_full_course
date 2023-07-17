import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        boolean a = str.contains("Hello");
        Pattern p = Pattern.compile("Hello");
        Matcher m = p.matcher(str);
        boolean found = m.find();
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(a);
        System.out.println(found);
    }
}
