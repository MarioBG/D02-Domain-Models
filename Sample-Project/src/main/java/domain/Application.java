
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Pattern;

public class Application extends DomainEntity {

	private Date				applicationMoment;
	private String				status;
	private float				offeredPrice;
	private Collection<Comment>	comment;
	private WorkPlan			workPlan;
	private CreditCard			creditCard;


	public Date getApplicationMoment() {
		return this.applicationMoment;
	}

	public void setApplicationMoment(final Date applicationMoment) {
		this.applicationMoment = applicationMoment;
	}

	@Pattern(regexp = "^PENDING|ACCEPTED|REJECTED$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public float getOfferedPrice() {
		return this.offeredPrice;
	}

	public void setOfferedPrice(final float offeredPrice) {
		this.offeredPrice = offeredPrice;
	}

	public Collection<Comment> getComment() {
		return this.comment;
	}

	public void setComment(final Collection<Comment> comment) {
		this.comment = comment;
	}

	public WorkPlan getWorkPlan() {
		return this.workPlan;
	}

	public void setWorkPlan(final WorkPlan workPlan) {
		this.workPlan = workPlan;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
