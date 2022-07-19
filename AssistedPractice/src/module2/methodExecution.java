package module2;

class addition {
	public int sum(int a, int b) {
		return (a + b);
	}
}

public class methodExecution {
	int mul(int x,int y) {
		return (x*y);
		
	}
	public static void main(String[] args) {
		addition s = new addition();
		int ans = s.sum(4, 5);
		System.out.println("Sum = "+ans);
		
		methodExecution obj = new methodExecution();
		int pro = obj.mul(5, 4);
		System.out.println("Product = "+pro);
		
	}

}
