public class Main
{
	public static void main(String[] args) {
	    String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello";
        boolean a = str1.equals(str2);
        boolean b = (str2.compareTo(str1) >= 0);
        boolean c = (str3 == str1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
