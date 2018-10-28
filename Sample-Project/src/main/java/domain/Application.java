
package domain;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

public class Application extends DomainEntity {

	private Date	applicationMoment;
	private String	status;
	private float	offeredPrice;
	private String	comment;


	@Past
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

	@Digits(fraction = 2, integer = 6)
	public float getOfferedPrice() {
		return this.offeredPrice;
	}

	public void setOfferedPrice(final float offeredPrice) {
		this.offeredPrice = offeredPrice;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}


	// Relationships ----------------------------------------------------------

	private HandyWorker	handyWorker;
	private FixUpTask	fixUpTask;
	private CreditCard	creditCard;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
