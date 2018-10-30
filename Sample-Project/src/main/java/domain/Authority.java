
package domain;


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

}
