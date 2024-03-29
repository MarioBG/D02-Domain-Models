
package domain;

import java.sql.Date;
import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Report extends DomainEntity {

	private Date				moment;
	private String				description;
	private Collection<String>	attachments;


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

	@URL
	public Collection<String> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(final Collection<String> attachment) {
		this.attachments = attachment;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Complaint>	complaints;
	private Collection<Note>		notes;


	@Valid
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Collection<Complaint> complaint) {
		this.complaints = complaint;
	}

	@Valid
	public Collection<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(final Collection<Note> note) {
		this.notes = note;
	}

}
