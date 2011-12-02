package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.OBJEKTI_SEADUS_INTSIDENDIS;

/**
 * Entity implementation class for Entity: SEADUS
 *
 */
@Entity
@RooToString
@RooEntity

public class SEADUS extends BaseEntity implements Serializable {

	@Size(min = 1, max = 20)
	@NotNull
	private String kood;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kehtiv_alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kehtiv_kuni;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "sEADUS")
	private Collection<PIIRIVALVURI_SEADUS_INTSIDENDIS> pIIRIVALVURI_SEADUS_INTSIDENDIS;
	@OneToMany(mappedBy = "sEADUS")
	private Collection<SEADUSE_PUNKT> sEADUSE_PUNKT;
	@OneToMany(mappedBy = "sEADUS")
	private Collection<ISIKU_SEADUS_INTSIDENDIS> iSIKU_SEADUS_INTSIDENDIS;
	@OneToMany(mappedBy = "sEADUS")
	private Collection<OBJEKTI_SEADUS_INTSIDENDIS> oBJEKTI_SEADUS_INTSIDENDIS;

	public SEADUS() {
		super();
	} 
	public String getKood() {
		return kood;
	}
	public void setKood(String kood) {
		this.kood = kood;
	}
	public Date getKehtiv_alates() {
		return this.kehtiv_alates;
	}

	public void setKehtiv_alates(Date kehtiv_alates) {
		this.kehtiv_alates = kehtiv_alates;
	}   
	public Date getKehtiv_kuni() {
		return this.kehtiv_kuni;
	}

	public void setKehtiv_kuni(Date kehtiv_kuni) {
		this.kehtiv_kuni = kehtiv_kuni;
	}
	public Collection<PIIRIVALVURI_SEADUS_INTSIDENDIS> getPIIRIVALVURI_SEADUS_INTSIDENDIS() {
	    return pIIRIVALVURI_SEADUS_INTSIDENDIS;
	}
	public void setPIIRIVALVURI_SEADUS_INTSIDENDIS(Collection<PIIRIVALVURI_SEADUS_INTSIDENDIS> param) {
	    this.pIIRIVALVURI_SEADUS_INTSIDENDIS = param;
	}
	public Collection<SEADUSE_PUNKT> getSEADUSE_PUNKT() {
	    return sEADUSE_PUNKT;
	}
	public void setSEADUSE_PUNKT(Collection<SEADUSE_PUNKT> param) {
	    this.sEADUSE_PUNKT = param;
	}
	public Collection<ISIKU_SEADUS_INTSIDENDIS> getISIKU_SEADUS_INTSIDENDIS() {
	    return iSIKU_SEADUS_INTSIDENDIS;
	}
	public void setISIKU_SEADUS_INTSIDENDIS(Collection<ISIKU_SEADUS_INTSIDENDIS> param) {
	    this.iSIKU_SEADUS_INTSIDENDIS = param;
	}
	public Collection<OBJEKTI_SEADUS_INTSIDENDIS> getOBJEKTI_SEADUS_INTSIDENDIS() {
	    return oBJEKTI_SEADUS_INTSIDENDIS;
	}
	public void setOBJEKTI_SEADUS_INTSIDENDIS(Collection<OBJEKTI_SEADUS_INTSIDENDIS> param) {
	    this.oBJEKTI_SEADUS_INTSIDENDIS = param;
	}
   
}
