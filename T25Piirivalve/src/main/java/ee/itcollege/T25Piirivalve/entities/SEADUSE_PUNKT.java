package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * Entity implementation class for Entity: SEADUSE_PUNKT
 *
 */
@Entity
@RooToString
@RooEntity

public class SEADUSE_PUNKT extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seaduse_punkt_ID;
	private String paragrahv;
	private String pais;
	private String tekst;
	private Date kehtiv_alates;
	private Date kehtiv_kuni;
	private static final long serialVersionUID = 1L;

	public SEADUSE_PUNKT() {
		super();
	}   
	public Long getSeaduse_punkt_ID() {
		return this.seaduse_punkt_ID;
	}

	public void setSeaduse_punkt_ID(Long seaduse_punkt_ID) {
		this.seaduse_punkt_ID = seaduse_punkt_ID;
	}   
	public String getParagrahv() {
		return this.paragrahv;
	}

	public void setParagrahv(String paragrahv) {
		this.paragrahv = paragrahv;
	}   
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
   
}
