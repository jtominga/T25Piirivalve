package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: SEADUS
 *
 */
@Entity
@RooToString
@RooEntity

public class SEADUS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seadus_ID;
	private Date kehtiv_alates;
	private Date kehtiv_kuni;
	private static final long serialVersionUID = 1L;

	public SEADUS() {
		super();
	}   
	public Long getSeadus_ID() {
		return this.seadus_ID;
	}

	public void setSeadus_ID(Long seadus_ID) {
		this.seadus_ID = seadus_ID;
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
   
}
