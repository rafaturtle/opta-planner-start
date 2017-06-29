package au.com.nukon;

import java.io.IOException;

import au.com.nukon.planner.RunSolver;

public class Application {
	
	public static void main(String[] args){
		//To run the app execute java -jar opta-planner-start.jar c:\path\to\inputfiles
		RunSolver rs;
		try {
			rs = new RunSolver(args[0]);
			rs.solve();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getStackTrace());
		}
		
		
	}

	
}
