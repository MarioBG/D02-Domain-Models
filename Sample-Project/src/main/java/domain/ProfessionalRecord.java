
package domain;

import java.sql.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class ProfessionalRecord extends DomainEntity {

	private String	companyName;
	private Date	startDate;
	private Date	endDate;
	private String	playedRole;
	private String	comments;
	private String	attachmentURL;


	@NotBlank
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	@Past
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@NotBlank
	public String getPlayedRole() {
		return this.playedRole;
	}

	public void setPlayedRole(final String playedRole) {
		this.playedRole = playedRole;
	}

	public String getComment() {
		return this.comments;
	}

	public void setComment(final String comment) {
		this.comments = comment;
	}

	@URL
	public String getAttachmentURL() {
		return this.attachmentURL;
	}

	public void setAttachmentURL(final String attachmentURL) {
		this.attachmentURL = attachmentURL;
	}

}
