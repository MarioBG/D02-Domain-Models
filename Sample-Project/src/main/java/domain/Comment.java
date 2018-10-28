
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Comment extends DomainEntity {

	private String		content;

	//Relationships
	private FixUpTask	fixUpTask;


	@NotBlank
	public String getContent() {
		return this.content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	//Relationships

	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}
}
