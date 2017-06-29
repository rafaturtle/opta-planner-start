package au.com.nukon.planner;

import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;

@PlanningSolution
public class PlannerSolution {
	
	private HardMediumSoftScore score;
	
	
	@PlanningScore
	public HardMediumSoftScore getScore() {

		return score;
	}

	public void setScore(HardMediumSoftScore newScore) {
		
		score = newScore;
	}
}
