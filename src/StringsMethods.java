
public class StringsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Word is going to be Riptide.
		
		String str1 = "Riptide";
		System.out.println("RipTide!");
		System.out.println(str1.replaceAll("3", "t"));
		System.out.println("");
			
		// 2. Waldo.
		String str2 = "Where's Waldo?";
		System.out.println("Where's Waldo?");
		System.out.println(str2.indexOf("Waldo"));
		System.out.println("");
		
		// 3. Cat and Mouse
		String str3 = "Cat";
		String str4 = "Mouse";
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 + str4);
		System.out.println("");

		// 4. Reverse Flabbergasted.
		String str5 = "Flabbergasted";
		String rev = new StringBuffer(str5).reverse().toString();
		System.out.println(str5);
		System.out.println(rev);
		System.out.println("");
		
		// 5. Bandaid and cut. ??????????????
		String str6 = ("Bandaid");
		String str7 = ("cut");
		System.out.println(str6);
		System.out.println("");
				
		// 6. Another lesson learned today.
		String str8 = "Another lesson learned today";
		if(str8.equalsIgnoreCase("learn"));
		else {
			System.out.println("Dud");
		}
		System.out.println("");
		
		// 7. Classmates
	String str9 = "Classmates";
	for (int i = 0; i < str9.length(); i++) {
        System.out.println(str9.charAt(i));
	
	}	
	}
}
		
