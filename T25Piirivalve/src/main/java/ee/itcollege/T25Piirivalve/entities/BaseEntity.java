package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.format.annotation.*;

/**
 * Entity implementation class for Entity: BaseEntity
 *
 */
@MappedSuperclass
@RooToString
@RooEntity(mappedSuperclass = true)

public abstract class BaseEntity implements Serializable {

	@Size(min = 1, max = 32)
	@NotNull
	private String avaja;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date avatud;
	
	@Size(min = 1, max = 32)
	@NotNull
	private String muutja;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date muudetud;
	
	@Size(min = 1, max = 32)
	@NotNull
	private String sulgeja;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date suletud;
	
	private String kommentaar;
	private static final long serialVersionUID = 1L;	
	
	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}   
	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}   
	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}   
	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}   
	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}   
	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	
	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}
   
}
