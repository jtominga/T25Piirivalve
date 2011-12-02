package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.OBJEKTI_LIIK;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: OBJEKT
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKT extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long objekt_ID;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "oBJEKT")
	private Set<PIIRIRIKKUJA> pIIRIRIKKUJA;
	@OneToMany(mappedBy = "oBJEKT")
	private Set<OBJEKT_INTSIDENDIS> oBJEKT_INTSIDENDIS;
	@ManyToOne
	private OBJEKTI_LIIK oBJEKTI_LIIK;

	public OBJEKT() {
		super();
	}   
	public Long getObjekt_ID() {
		return this.objekt_ID;
	}

	public void setObjekt_ID(Long objekt_ID) {
		this.objekt_ID = objekt_ID;
	}
	public Set<PIIRIRIKKUJA> getPIIRIRIKKUJA() {
	    return pIIRIRIKKUJA;
	}
	public void setPIIRIRIKKUJA(Set<PIIRIRIKKUJA> param) {
	    this.pIIRIRIKKUJA = param;
	}
	public Set<OBJEKT_INTSIDENDIS> getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}
	public void setOBJEKT_INTSIDENDIS(Set<OBJEKT_INTSIDENDIS> param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}
	public OBJEKTI_LIIK getOBJEKTI_LIIK() {
	    return oBJEKTI_LIIK;
	}
	public void setOBJEKTI_LIIK(OBJEKTI_LIIK param) {
	    this.oBJEKTI_LIIK = param;
	}
   
}
