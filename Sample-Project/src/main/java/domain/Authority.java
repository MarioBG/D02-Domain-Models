
package domain;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Authority extends DomainEntity {

	private String	governmentAgent;
	private String	bankAgent;
	private String	citizen;
	private String	authority;


	public String getGovernmentAgent() {
		return this.governmentAgent;
	}

	public void setGovernmentAgent(final String governmentAgent) {
		this.governmentAgent = governmentAgent;
	}

	public String getBankAgent() {
		return this.bankAgent;
	}

	public void setBankAgent(final String bankAgent) {
		this.bankAgent = bankAgent;
	}

	public String getCitizen() {
		return this.citizen;
	}

	public void setCitizen(final String citizen) {
		this.citizen = citizen;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(final String authority) {
		this.authority = authority;
	}


	// Relationships ----------------------------------------------------------

	private UserAccount	userAccount;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(final UserAccount userAccount) {
		this.userAccount = userAccount;
	}
}
