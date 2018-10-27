
package domain;

import java.util.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class FixUpTask extends DomainEntity {

	private String		ticker;
	private Date		publicationMoment;
	private String		description;
	private String		address;
	private float		maxPrice;
	private Double		maxTimeToCarryOut;
	private Category	category;
	private Warranty	warranty;


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

	public float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final float maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Double getMaxTimeToCarryOut() {
		return this.maxTimeToCarryOut;
	}

	public void setMaxTimeToCarryOut(final Double maxTimeToCarryOut) {
		this.maxTimeToCarryOut = maxTimeToCarryOut;
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
