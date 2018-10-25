
package domain;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Configuration extends DomainEntity {

	private String					bannerURL;
	private List<String>			spamWords;
	private double					VATTax;
	private String					countryCode;
	private Double					finderCached;
	private Integer					finderReturn;
	private String					systemName;
	private List<String>			defaultCreditCards;
	private List<WelcomeMessage>	welcomeMessage;


	@URL
	public String getBannerURL() {
		return this.bannerURL;
	}

	public void setBannerURL(final String bannerURL) {
		this.bannerURL = bannerURL;
	}

	public List<String> getSpamWords() {
		return this.spamWords;
	}

	public void setSpamWords(final List<String> spamWords) {
		this.spamWords = spamWords;
	}

	public double getVATTax() {
		return this.VATTax;
	}

	public void setVATTax(final double vATTax) {
		this.VATTax = vATTax;
	}

	@NotBlank
	public String getCountryCode() {
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
		return this.defaultCreditCards;
	}

	public void setDefaultCreditCards(final List<String> defaultCreditCards) {
		this.defaultCreditCards = defaultCreditCards;
	}

	public List<WelcomeMessage> getWelcomeMessage() {
		return this.welcomeMessage;
	}

	public void setWelcomeMessage(final List<WelcomeMessage> welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

}
