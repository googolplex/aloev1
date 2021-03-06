package biz.lcompras.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;
import org.openxava.util.*;

@Entity
@Table(name="CLL_PERIODOCORTE")
@Tab(editors="List", properties= "fechaCorte,quiensolicita.nombre", defaultOrder="${fechaCorte} desc")
public class PeriodoCorte extends SuperClaseFeliz {

	@Column(name="FECHACORTE")
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fechaCorte = new java.util.Date() ;

	@Required
	@DescriptionsList(descriptionProperties="nombre")
	@ManyToOne(fetch=FetchType.LAZY,optional=false)	
	@JoinColumn(name="SOLICITADOPOR_ID", referencedColumnName="ID")	
	private SolicitadoPor quiensolicita;	
	
	@Stereotype("MEMO")
	@Column(length=500,nullable=false,name="CLL_COMENTARIO")
	private String comentario ;
		
	public Date getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public SolicitadoPor getQuiensolicita() {
		return quiensolicita;
	}

	public void setQuiensolicita(SolicitadoPor quiensolicita) {
		this.quiensolicita = quiensolicita;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario.toUpperCase().trim();
	}
		
	@PreUpdate
	private void ultimoPaso() {
			Date mifechora = new java.util.Date() ;
			super.setModificadoPor(Users.getCurrent()) ;
			super.setFchUltMod(mifechora)  ;
	}	
}
