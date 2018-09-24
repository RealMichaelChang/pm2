
public class numberfour {

	public static void main(String[] args) {

		String x = ProblemFourA("Billy");
		 System.out.print(x);

	}
	 public static String ProblemFourA(String x) {
		
		// int length = in.length();
		// char[] original = new char[length];
		    char[] in = x.toCharArray();
		   int length= in.length;
			 char[] flip = new char[length];
			// System.out.print(in.length + " " + flip.length);
		 //fill it up!
		 for(int i = 0; i < length; i++) {
			// System.out.print(in[(length-1) -i]);
			// System.out.print("\n");
			 flip[i] = in[(length-1) -i];
		 }
		 String finished = new String(flip);
		 return finished;
	 }
	 
	 public static String ProblemFourB(int[][]x, int y) {

		 int length = x.length;
		int size= x.size;
		 
		 return x;
		 
	 }
}

