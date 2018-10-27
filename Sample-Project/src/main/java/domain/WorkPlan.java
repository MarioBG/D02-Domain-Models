
package domain;

import java.util.Collection;

public class WorkPlan extends DomainEntity {

	private Collection<Phase>	phases;


	public Collection<Phase> getPhases() {
		return this.phases;
	}

	public void setPhases(final Collection<Phase> phases) {
		this.phases = phases;
	}

}
