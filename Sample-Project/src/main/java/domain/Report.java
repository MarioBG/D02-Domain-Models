
package domain;

import java.sql.Date;
import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Report extends DomainEntity {

	private Date				moment;
	private String				description;
	private Collection<String>	attachment;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Collection<String> getAttachment() {
		return this.attachment;
	}

	public void setAttachment(final Collection<String> attachment) {
		this.attachment = attachment;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Complaint>	complaint;
	private Collection<Note>		note;


	@Valid
	public Collection<Complaint> getComplaint() {
		return this.complaint;
	}

	public void setComplaint(final Collection<Complaint> complaint) {
		this.complaint = complaint;
	}

	@Valid
	public Collection<Note> getNote() {
		return this.note;
	}

	public void setNote(final Collection<Note> note) {
		this.note = note;
	}

}
