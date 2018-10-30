
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Past;

public class Endorsement extends DomainEntity {

	private Date	moment;
	private String	comment;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Customer>	customers;
	private Collection<HandyWorker>	handyWorkers;


	@Valid
	public Collection<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(final Collection<Customer> customers) {
		this.customers = customers;
	}

	@Valid
	public Collection<HandyWorker> getHandyWorkers() {
		return this.handyWorkers;
	}

	public void setHandyWorkers(final Collection<HandyWorker> handyWorkers) {
		this.handyWorkers = handyWorkers;
	}

}
