package biz.lcompras.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.util.*;

@Entity
@Table(name="CLL_SOLICITADOPOR"
 , uniqueConstraints={
		 @UniqueConstraint(name="CLL_QUIEN_DUPLICADO", columnNames={"CLL_NOMBRE"})        
 }
)
public class SolicitadoPor extends SuperClaseFeliz {
	@Required
	@Column(length=40,nullable=false,name="CLL_NOMBRE")
	private String nombre ;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase().trim();
	}

	@PreUpdate
	private void ultimoPaso() {
			Date mifechora = new java.util.Date() ;
			super.setModificadoPor(Users.getCurrent()) ;
			super.setFchUltMod(mifechora)  ;
	}		
}