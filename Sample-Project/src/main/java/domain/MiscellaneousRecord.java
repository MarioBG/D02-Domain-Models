
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class MiscellaneousRecord extends DomainEntity {

	private String	title;
	private String	comment;
	private String	attachmentURL;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	@URL
	public String getAttachmentURL() {
		return this.attachmentURL;
	}

	public void setAttachmentURL(final String attachmentURL) {
		this.attachmentURL = attachmentURL;
	}

}
