package com.example.banque1.dto;

import com.example.banque1.entities.TypeTransaction;
import lombok.Data;

import java.util.Date;

@Data
public class TransactionRequest {

	private Long compteId;
	private double montant;
	private TypeTransaction type;
	private Date dateTransaction;
}
