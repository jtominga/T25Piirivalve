package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: AMET
 *
 */
@Entity
@RooToString
@RooEntity

public class AMET extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long amet_ID;
	@Size(min = 1, max = 10)
	@NotNull
	private String ISCO_kood;
	@Size(min = 1, max = 60)
	@NotNull
	private String nimetus;
	private static final long serialVersionUID = 1L;

	public AMET() {
		super();
	}   
	@Id    
	public Long getAmet_ID() {
		return this.amet_ID;
	}

	public void setAmet_ID(Long amet_ID) {
		this.amet_ID = amet_ID;
	}   
	public String getISCO_kood() {
		return this.ISCO_kood;
	}

	public void setISCO_kood(String ISCO_kood) {
		this.ISCO_kood = ISCO_kood;
	}
	public String getNimetus() {
		return nimetus;
	}
	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}
   
}
