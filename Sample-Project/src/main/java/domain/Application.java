
package domain;

import java.util.Date;

import javax.validation.constraints.Pattern;

public class Application extends DomainEntity {

	private Date	applicationMoment;
	private String	status;
	private float	offeredPrice;


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

}
