
package domain;

import java.util.Collection;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class Box extends DomainEntity {

	private String				name;
	private Boolean				predefined;
	private Collection<Message>	messages;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Boolean getPredefined() {
		return this.predefined;
	}

	public void setPredefined(final Boolean predefined) {
		this.predefined = predefined;
	}

	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Message>	message;
	private Collection<Box>		children;


	@Valid
	public Collection<Message> getMessage() {
		return this.message;
	}

	public void setMessage(final Collection<Message> message) {
		this.message = message;
	}

	@Valid
	public Collection<Box> getChildren() {
		return this.children;
	}

	public void setChildren(final Collection<Box> children) {
		this.children = children;
	}

}
