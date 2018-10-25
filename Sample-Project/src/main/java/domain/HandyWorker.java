
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class HandyWorker extends Actor {

	private String	make;


	@NotBlank
	public String getMake() {
		return this.make;
	}

	public void setMake(final String make) {
		this.make = make;
	}

}
