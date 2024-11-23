package com.example.banque1.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double montant;

	@Temporal(TemporalType.DATE)
	private Date dateTransaction;

	@Enumerated(EnumType.STRING)
	private TypeTransaction type;

	@ManyToOne
	@JoinColumn(name = "compte_id")
	private Compte compte;

}
