package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: INTSIDENDI_LIIK
 *
 */
@Entity
@RooToString
@RooEntity

public class INTSIDENDI_LIIK extends BaseEntity implements Serializable  {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long intsidendi_liik_id;
	private static final long serialVersionUID = 1L;

	public INTSIDENDI_LIIK() {
		super();
	}   
	public Long getIntsidendi_liik_id() {
		return this.intsidendi_liik_id;
	}

	public void setIntsidendi_liik_id(Long intsidendi_liik_id) {
		this.intsidendi_liik_id = intsidendi_liik_id;
	}
   
}
