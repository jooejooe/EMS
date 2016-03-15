package nju.software.ems.data.daoobject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.IdClass;

/**
 * Don't use this file!
 * DsrXpJgDOId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class DsrXpJgDOId implements java.io.Serializable {

	// Fields

	private Integer ajxh;
	private Integer dsrbh;

	// Constructors

	/** default constructor */
	public DsrXpJgDOId() {
	}

	/** full constructor */
	public DsrXpJgDOId(Integer ajxh, Integer dsrbh) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
	}

	// Property accessors

	@Column(name = "AJXH", nullable = false)
	public Integer getAjxh() {
		return this.ajxh;
	}

	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}

	@Column(name = "DSRBH", nullable = false)
	public Integer getDsrbh() {
		return this.dsrbh;
	}

	public void setDsrbh(Integer dsrbh) {
		this.dsrbh = dsrbh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DsrXpJgDOId))
			return false;
		DsrXpJgDOId castOther = (DsrXpJgDOId) other;

		return ((this.getAjxh() == castOther.getAjxh()) || (this.getAjxh() != null
				&& castOther.getAjxh() != null && this.getAjxh().equals(
				castOther.getAjxh())))
				&& ((this.getDsrbh() == castOther.getDsrbh()) || (this
						.getDsrbh() != null && castOther.getDsrbh() != null && this
						.getDsrbh().equals(castOther.getDsrbh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAjxh() == null ? 0 : this.getAjxh().hashCode());
		result = 37 * result
				+ (getDsrbh() == null ? 0 : this.getDsrbh().hashCode());
		return result;
	}

}