package clique_algo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitCliqueAlgo {

	@Test
	public void optimized1() 
	{
		int expectedVertex = 4153;
		int expectedEdge = 1728;

		int ans[] = (Clique_Tester.start (0.75,600,10000)); 
		assertEquals(ans[0] ,  expectedVertex);
		assertEquals(ans[1] ,  expectedEdge);
	}
	
	public void optimized2() 
	{
		int expectedVertex = 4153;
		int expectedEdge = 1728;

		int ans[] = (Clique_Tester.start (0.75,6,10)); 
		assertEquals(ans[0] ,  expectedVertex);
		assertEquals(ans[1] ,  expectedEdge);
	}

	public void optimized3() 
	{
		int expectedVertex = 2407;
		int expectedEdge = 1728;

		int ans[] = (Clique_Tester.start (0.8,7,15)); 
		assertEquals(ans[0] ,  expectedVertex);
		assertEquals(ans[1] ,  expectedEdge);
	}

	public void optimized4() 
	{
		int expectedVertex = 1728;
		int expectedEdge = 6872;

		int ans[] = (Clique_Tester.start (0.7,6,10)); 
		assertEquals(ans[0] ,  expectedVertex);
		assertEquals(ans[1] ,  expectedEdge);
	}
}
