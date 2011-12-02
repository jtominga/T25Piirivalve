package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.PIIRIRIKKUJA;

/**
 * Entity implementation class for Entity: OBJEKT
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKT extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private OBJEKTI_LIIK oBJEKTI_LIIK;
	@OneToMany(mappedBy = "oBJEKT")
	private Collection<OBJEKT_INTSIDENDIS> oBJEKT_INTSIDENDIS;
	@OneToMany(mappedBy = "oBJEKT")
	private Collection<PIIRIRIKKUJA> pIIRIRIKKUJA;
	public OBJEKT() {
		super();
	}   
	
	public OBJEKTI_LIIK getOBJEKTI_LIIK() {
	    return oBJEKTI_LIIK;
	}
	public void setOBJEKTI_LIIK(OBJEKTI_LIIK param) {
	    this.oBJEKTI_LIIK = param;
	}
	public Collection<OBJEKT_INTSIDENDIS> getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}
	public void setOBJEKT_INTSIDENDIS(Collection<OBJEKT_INTSIDENDIS> param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}
	public Collection<PIIRIRIKKUJA> getPIIRIRIKKUJA() {
	    return pIIRIRIKKUJA;
	}
	public void setPIIRIRIKKUJA(Collection<PIIRIRIKKUJA> param) {
	    this.pIIRIRIKKUJA = param;
	}
   
}
