
public class TestGitEclipse {

	public static void main(String[] args) {
		
		String a = "Hello world!";
		
		System.out.println(a);
		
		
		System.out.println(testiFunktio(a));
		
	}
	
	public static int testiFunktio(String a) {
			
		if (a.equals("Hello world!"))
			return 1;
		return 0;
		
	}

}
