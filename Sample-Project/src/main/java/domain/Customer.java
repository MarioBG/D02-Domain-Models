
package domain;

import java.util.Collection;

import javax.validation.Valid;

public class Customer extends Actor {

	// Relationships ----------------------------------------------------------

	private Collection<FixUpTask>	fixUpTask;
	private Collection<Endorsement>	endorsements;


	@Valid
	public Collection<FixUpTask> getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final Collection<FixUpTask> fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	@Valid
	public Collection<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Collection<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
