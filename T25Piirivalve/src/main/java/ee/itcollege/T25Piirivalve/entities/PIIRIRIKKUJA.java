package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.ISIK_INTSIDENDIS;
import java.util.Collection;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: PIIRIRIKKUJA
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIRIKKUJA extends BaseEntity implements Serializable {

	@Size(min = 1, max = 20)
	@NotNull
	private String isikukood;
	@Size(min = 1, max = 25)
	@NotNull
	private String eesnimi;
	@Size(min = 1, max = 35)
	@NotNull
	private String perenimi;
	@NotNull
	private char sugu;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date synniaeg;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private OBJEKT oBJEKT;
	@OneToMany(mappedBy = "pIIRIRIKKUJA")
	private Collection<ISIK_INTSIDENDIS> iSIK_INTSIDENDIS;
	public PIIRIRIKKUJA() {
		super();
	}   
	
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}   
	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}   
	public String getPerenimi() {
		return this.perenimi;
	}

	public void setPerenimi(String perenimi) {
		this.perenimi = perenimi;
	}   
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}   
	public Date getSynniaeg() {
		return this.synniaeg;
	}

	public void setSynniaeg(Date synniaeg) {
		this.synniaeg = synniaeg;
	}
	public OBJEKT getOBJEKT() {
	    return oBJEKT;
	}
	public void setOBJEKT(OBJEKT param) {
	    this.oBJEKT = param;
	}
	public Collection<ISIK_INTSIDENDIS> getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}
	public void setISIK_INTSIDENDIS(Collection<ISIK_INTSIDENDIS> param) {
	    this.iSIK_INTSIDENDIS = param;
	}
   
}
