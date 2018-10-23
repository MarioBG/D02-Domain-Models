
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class WelcomeMessage extends DomainEntity {

	private String	languageCode;
	private String	content;


	@NotBlank
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(final String languageCode) {
		this.languageCode = languageCode;
	}

	@NotBlank
	public String getContent() {
		if (this.languageCode.equals("English"))
			this.content = "Welcome to Acme Handy Worker! Price, quality, and trust in a single place";
		else
			this.content = "¡Bienvenidos a Acme Handy Worker! Precio, calidad y confianza en el mismo sitio";
		return this.content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

}
