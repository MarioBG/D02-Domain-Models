
package domain;

import java.util.Date;

import javax.validation.constraints.Past;

import org.apache.log4j.Priority;
import org.hibernate.validator.constraints.NotBlank;

public class Message extends DomainEntity {

	private Date		moment;
	private String		subject;
	private String		body;
	private Priority	priority;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@NotBlank
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	public Priority getPriority() {
		return this.priority;
	}

	public void setPriority(final Priority priority) {
		this.priority = priority;
	}

}
