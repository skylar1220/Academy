package lesson7;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = new String("Hi,");
		String s2 = new String(" Java");
		
		System.out.println("s1: " + s1.length());
		System.out.println(s1.charAt(1));
		
		s1 = s1.concat(s2);
		
		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!");
		System.out.println(s1.substring(4,8) + "!");
		
		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		
		String s5 = "*-*";
		System.out.println(s5.repeat(10));
		
		System.out.println(s2.trim().indexOf(2));
		String str = 
				"a" +
				"b" +
				"c" ;
		System.out.println(str);
						
		
		String str2 = """
				abc
				def
				""" ;
		System.out.println(str2);
	}

}
