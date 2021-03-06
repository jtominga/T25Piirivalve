package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.OBJEKT;
import java.util.Collection;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: OBJEKTI_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKTI_LIIK extends BaseEntity implements Serializable {

	@Size(min = 1, max = 20)
	@NotNull
	private String kood;
	@Size(min = 1, max = 100)
	@NotNull
	private String nimetus;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "oBJEKTI_LIIK")
	private Collection<OBJEKT> oBJEKT;
	
	public OBJEKTI_LIIK() {
		super();
	}   
	
	public String getKood() {
		return kood;
	}
	public void setKood(String kood) {
		this.kood = kood;
	}
	public String getNimetus() {
		return nimetus;
	}
	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}
	public Collection<OBJEKT> getOBJEKT() {
	    return oBJEKT;
	}
	public void setOBJEKT(Collection<OBJEKT> param) {
	    this.oBJEKT = param;
	}
   
}
