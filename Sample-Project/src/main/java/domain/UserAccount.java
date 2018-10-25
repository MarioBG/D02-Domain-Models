
package domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class UserAccount extends DomainEntity {

	private String	username;
	private String	password;


	@NotBlank
	@Size(min = 5, max = 32)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	@NotBlank
	@Size(min = 5, max = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

}
