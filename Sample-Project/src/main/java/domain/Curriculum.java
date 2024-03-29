
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Curriculum extends DomainEntity {

	private String	ticker;


	@Pattern(regexp = "^d{6}-[A-Z0-9]{6}$")
	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}


	// Relationships ----------------------------------------------------------

	private PersonalRecord					personalRecord;
	private Collection<MiscellaneousRecord>	miscellaneousRecord;
	private Collection<EndorserRecord>		endorserRecord;
	private Collection<EducationRecord>		educationRecord;
	private Collection<ProfessionalRecord>	professionalRecord;


	@NotNull
	@Valid
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	};

	@Valid
	public Collection<MiscellaneousRecord> getMiscellaneousRecord() {
		return this.miscellaneousRecord;
	}

	public void setMiscellaneousRecord(final Collection<MiscellaneousRecord> miscellaneousRecord) {
		this.miscellaneousRecord = miscellaneousRecord;
	}

	@Valid
	public Collection<EndorserRecord> getEndorserRecord() {
		return this.endorserRecord;
	}

	public void setEndorserRecord(final Collection<EndorserRecord> endorserRecord) {
		this.endorserRecord = endorserRecord;
	}

	@Valid
	public Collection<EducationRecord> getEducationRecord() {
		return this.educationRecord;
	}

	public void setEducationRecord(final Collection<EducationRecord> educationRecord) {
		this.educationRecord = educationRecord;
	}

	@Valid
	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return this.professionalRecord;
	}

	public void setProfessionalRecord(final Collection<ProfessionalRecord> professionalRecord) {
		this.professionalRecord = professionalRecord;
	}

}
