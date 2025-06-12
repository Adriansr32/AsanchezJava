package metodos2;

import java.util.Iterator;

public class Numbers {

	public static int sum(int a, int b) {
		return a + b;
	}
	
	
	public static int sumUntil(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total+=1;
		}
		return total;
	}
	
}
