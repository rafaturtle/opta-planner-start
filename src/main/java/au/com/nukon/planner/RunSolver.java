package au.com.nukon.planner;

import java.io.IOException;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunSolver {

	private static final Logger LOGGER = LoggerFactory.getLogger(RunSolver.class);

	PlannerSolution unsolvedSchedule;
	PlannerSolution solvedSchedule;
	Solver<PlannerSolution> solver;
	SolverFactory<PlannerSolution> solverFactory;

	public RunSolver(String path) throws IOException {

		// Build the Solver
		solverFactory = SolverFactory.createFromXmlResource("planner/ScheduleSolverConfig.xml");
		solverFactory.getSolverConfig().getTerminationConfig()
				.setMinutesSpentLimit(0L);
		solverFactory.getSolverConfig().getTerminationConfig()
				.setSecondsSpentLimit(20L);
		solverFactory.getSolverConfig().getTerminationConfig()
				.setUnimprovedSecondsSpentLimit(5L);

		this.unsolvedSchedule = new PlannerSolution();

	}

	public void solve() {
		solver = solverFactory.buildSolver();
		solvedSchedule = solver.solve(unsolvedSchedule);
	}
}
