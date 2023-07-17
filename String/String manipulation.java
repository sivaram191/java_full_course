public class Main
{
	public static void main(String[] args) {
	    String str1 = "Hello,world ";
        String str2 = str1.toUpperCase();
        String str3 = str1.toLowerCase();
        String str4 = str1.substring(5);
        String str5 = str1.substring(2,6);
        String str6 = str1.replace("l","m");
        String str7 = str1.trim();
        String[] str8 = str1.split(",");
        String str9 = str1.join("-",str8);
 		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str9);
	}
}
