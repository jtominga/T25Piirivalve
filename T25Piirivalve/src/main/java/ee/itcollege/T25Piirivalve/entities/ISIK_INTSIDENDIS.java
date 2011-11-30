package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.INTSIDENT;
import ee.itcollege.T25Piirivalve.entities.PIIRIRIKKUJA;

/**
 * Entity implementation class for Entity: ISIK_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class ISIK_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long isik_intsidendis_ID;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;
	@NotNull
	private String kirjeldus;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private INTSIDENT iNTSIDENT;
	@ManyToOne
	private PIIRIRIKKUJA pIIRIRIKKUJA;

	public ISIK_INTSIDENDIS() {
		super();
	}   
	public Long getIsik_intsidendis_ID() {
		return this.isik_intsidendis_ID;
	}

	public void setIsik_intsidendis_ID(Long isik_intsidendis_ID) {
		this.isik_intsidendis_ID = isik_intsidendis_ID;
	}   
	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}   
	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}
	public String getKirjeldus() {
		return kirjeldus;
	}
	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}
	public INTSIDENT getINTSIDENT() {
	    return iNTSIDENT;
	}
	public void setINTSIDENT(INTSIDENT param) {
	    this.iNTSIDENT = param;
	}
	public PIIRIRIKKUJA getPIIRIRIKKUJA() {
	    return pIIRIRIKKUJA;
	}
	public void setPIIRIRIKKUJA(PIIRIRIKKUJA param) {
	    this.pIIRIRIKKUJA = param;
	}
   
}
