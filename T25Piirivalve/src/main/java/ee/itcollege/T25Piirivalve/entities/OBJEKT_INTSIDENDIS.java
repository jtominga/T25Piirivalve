package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
/**
 * Entity implementation class for Entity: OBJEKT_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKT_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long objekt_intsidendis_ID;
	private Date alates;
	private Date kuni;
	private static final long serialVersionUID = 1L;

	public OBJEKT_INTSIDENDIS() {
		super();
	}   
	public Long getObjekt_intsidendis_ID() {
		return this.objekt_intsidendis_ID;
	}

	public void setObjekt_intsidendis_ID(Long objekt_intsidendis_ID) {
		this.objekt_intsidendis_ID = objekt_intsidendis_ID;
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
   
}
