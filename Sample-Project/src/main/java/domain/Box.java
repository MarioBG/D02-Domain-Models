
package domain;

import java.util.Collection;

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

}
