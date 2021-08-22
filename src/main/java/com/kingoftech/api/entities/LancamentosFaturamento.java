package com.kingoftech.api.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kingoftech.api.audity.Auditable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "app_lancamentosFaturamento")
@ToString
@Getter
@Setter
public class LancamentosFaturamento extends Auditable<String> implements Serializable {

	private static final long serialVersionUID = -7489913413559319566L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Parcela", nullable = true)
	private int parcela;

	@Column(name = "Data", nullable = true)
	private Calendar data;

	@Column(name = "HorasConsultoria", nullable = true)
	private int horasConsultoria;

	@Column(name = "HorasAnalise", nullable = true)
	private int horasAnalise;

	@Column(name = "HorasDesenvolvimento", nullable = true)
	private int horasDesenvolvimento;

	@Column(name = "NotaFiscal", nullable = true)
	private String notaFiscal;

	@JsonBackReference(value = "lancamentosFaturamento")
	@ManyToOne
	// @JsonIgnore
	@JoinColumn(name = "faturamentoId", referencedColumnName = "id")
	private Faturamentos faturamentos;

}
