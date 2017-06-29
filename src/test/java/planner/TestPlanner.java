package planner;

import java.io.IOException;

import org.junit.Test;

import au.com.nukon.planner.RunSolver;

public class TestPlanner {

	@Test
	public void testPlanner() throws IOException{
		
		RunSolver rs = new RunSolver("/path/to/input/data");
		rs.solve();
		System.out.println("Hi");
	}
}
