package clique_algo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitCliqueAlgo {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void optimized1() {
		String s[] = {"test1.csv" , "0.73" , "20" , "24"};
		Clique_Tester ct = new Clique_Tester(s);
		long time = 0;
		for (int i = 0; i < 10 ; i++) {
			 time = ct.start();
		}
		time = time / 10;
		System.out.println(time);
	}
}
