
package domain;

import java.util.Date;

public class Phase {

	private String	title;
	private String	description;
	private Date	startMoment;
	private Date	endMoment;


	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Date getStartMoment() {
		return this.startMoment;
	}

	public void setStartMoment(final Date startMoment) {
		this.startMoment = startMoment;
	}

	public Date getEndMoment() {
		return this.endMoment;
	}

	public void setEndMoment(final Date endMoment) {
		this.endMoment = endMoment;
	}

}
