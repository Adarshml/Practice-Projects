package module2;

public class string {
	public static void main(String[] args) {
		// String Methods
		System.out.println("String Methods");
		String s1 = new String("Hello World");
		System.out.println("Length = "+ s1.length());
		// substring
		System.out.println("Sub String = "+ s1.substring(6));
		// is empty
		System.out.println("Is empty = "+ s1.isEmpty());
		// replace
		String s2 = s1.replace("Hello","Hai");
		System.out.println("Replace Hello with Hai : "+s2);
		// to uppercae
		System.out.println(s1.toUpperCase());
		// equals
		System.out.println(" is s1 equals to s2 :"+(s1.equals(s2)));
		
		// conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(s1); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(s1); 
        sbl.append(" is the first java program"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);       
			
	}
}
