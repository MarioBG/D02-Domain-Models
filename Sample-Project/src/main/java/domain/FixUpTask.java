
package domain;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class FixUpTask extends DomainEntity {

	private String	ticker;
	private Date	publicationMoment;
	private String	description;
	private String	address;
	private float	maxPrice;
	private Date	startDate;
	private Date	endDate;


	@NotBlank
	@Pattern(regexp = "^d{6}-[A-Z0-9]{6}")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	public Date getPublicationMoment() {
		return this.publicationMoment;
	}

	public void setPublicationMoment(final Date publicationMoment) {
		this.publicationMoment = publicationMoment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@Digits(fraction = 2, integer = 6)
	public float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final float maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}


	// Relationships ----------------------------------------------------------

	private Customer	customer;
	private Category	category;
	private Warranty	warranty;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}

	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

}
