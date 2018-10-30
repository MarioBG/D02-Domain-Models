
package domain;

import java.util.Collection;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	private String	name;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Category>	childCategory;


	@Valid
	public Collection<Category> getChildCategory() {
		return this.childCategory;
	}

	public void setChildCategory(final Collection<Category> childCategory) {
		this.childCategory = childCategory;
	}

}
