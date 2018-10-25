
package domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Pattern;

public class Application extends DomainEntity {

	private Date			applicationMoment;
	private String			status;
	private float			offeredPrice;
	private List<Comment>	comment;


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

	public List<Comment> getComment() {
		return this.comment;
	}

	public void setComment(final List<Comment> comment) {
		this.comment = comment;
	}

}
