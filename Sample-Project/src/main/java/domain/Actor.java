
package domain;

import java.util.List;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Actor extends DomainEntity {

	private String					name;
	private String					middleName;
	private String					surname;
	private String					email;
	private String					photo;
	private String					phoneNumber;
	private String					address;
	private List<SocialIdentity>	socialIdentity;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@Pattern(regexp = "[a-A-Z0-9]+@[a-zA-Z09.]*|[a-zA-Z0-9]+<[a-zA-Z0-9]+@[a-zA-Z0-9.]*>")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public List<SocialIdentity> getSocialIdentity() {
		return this.socialIdentity;
	}

	public void setSocialIdentity(final List<SocialIdentity> socialIdentity) {
		this.socialIdentity = socialIdentity;
	}

}
