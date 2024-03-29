
package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EndorserRecord extends DomainEntity {

	private String				fullName;
	private String				email;
	private String				forNumber;
	private String				linkedInProfileURL;
	private Collection<String>	comments;


	@NotBlank
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	public String getForNumber() {
		return this.forNumber;
	}

	public void setForNumber(final String forNumber) {
		this.forNumber = forNumber;
	}

	@URL
	public String getLinkedInProfileURL() {
		return this.linkedInProfileURL;
	}

	public void setLinkedInProfileURL(final String linkedInProfileURL) {
		this.linkedInProfileURL = linkedInProfileURL;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

}
