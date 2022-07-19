package module2;
public class callByValue {

		int val=150;

		int operation(int val) {
			val =val*10;
			return(val);
		}
		
		public static void main(String args[]) {
			callByValue d = new callByValue();
			System.out.println("Before operation value of data is "+d.val);
			int ans = d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			//the value of val is never changed
			System.out.println("Result = "+ans);
			}

}
