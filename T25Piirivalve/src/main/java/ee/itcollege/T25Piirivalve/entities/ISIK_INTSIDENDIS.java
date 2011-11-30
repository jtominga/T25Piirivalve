package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

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
	private Date alates;
	private Date kuni;
	private static final long serialVersionUID = 1L;

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
   
}
