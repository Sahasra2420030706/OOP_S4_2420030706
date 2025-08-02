package strings;

public class multiplestringmethod {

	public static void main(String[] args) {
		// program to work with multiple string methods.
		String str = "Hello";
		String str1 = "hello";
		
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.contains("ll"));
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("H"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.trim());
		System.out.println(str.replace("H","B"));
		System.out.println(str.replaceAll("l","r"));
		System.out.println(str.replaceFirst("l","r"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.toCharArray());
		System.out.println(str.isEmpty());
		System.out.println(String.valueOf(str));
		

	}

}
