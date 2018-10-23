
package domain;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Configuration extends DomainEntity {

	private String			bannerURL;
	private List<String>	spamWords;
	private double			VATTax;
	private String			countryCode;
	private Double			finderCached;
	private Integer			finderReturn;
	private String			systemName;
	private List<String>	defaultCreditCards;


	@URL
	public String getBannerURL() {
		return this.bannerURL;
	}

	public void setBannerURL(final String bannerURL) {
		this.bannerURL = bannerURL;
	}

	public List<String> getSpamWords() {
		this.spamWords.add("sex");
		this.spamWords.add("viagra");
		this.spamWords.add("cialis");
		this.spamWords.add("one million");
		this.spamWords.add("you’ve been selected");
		this.spamWords.add("Nigeria");
		this.spamWords.add("sexo");
		this.spamWords.add("un millón");
		this.spamWords.add("ha sido seleccionado");
		return this.spamWords;
	}

	public void setSpamWords(final List<String> spamWords) {
		this.spamWords = spamWords;
	}

	public double getVATTax() {
		this.VATTax = 21;
		return this.VATTax;
	}

	public void setVATTax(final double vATTax) {
		this.VATTax = vATTax;
	}

	@NotBlank
	public String getCountryCode() {
		this.countryCode = "+34";
		return this.countryCode;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	@Min(1)
	@Max(24)
	public Double getFinderCached() {
		return this.finderCached;
	}

	public void setFinderCached(final Double finderCached) {
		this.finderCached = finderCached;
	}

	@Max(100)
	public Integer getFinderReturn() {
		return this.finderReturn;
	}

	public void setFinderReturn(final Integer finderReturn) {
		this.finderReturn = finderReturn;
	}

	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(final String systemName) {
		this.systemName = systemName;
	}

	public List<String> getDefaultCreditCards() {
		this.defaultCreditCards.add("VISA");
		this.defaultCreditCards.add("MASTER");
		this.defaultCreditCards.add("DINNERS");
		this.defaultCreditCards.add("AMEX");
		return this.defaultCreditCards;
	}

	public void setDefaultCreditCards(final List<String> defaultCreditCards) {
		this.defaultCreditCards = defaultCreditCards;
	}

}
