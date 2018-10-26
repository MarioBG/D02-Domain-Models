
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Box extends DomainEntity {

	private String	name;
	private Boolean	predefined;


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

}
