package com.example.banque1.repositories;

import com.example.banque1.entities.Compte;
import com.example.banque1.entities.Transaction;
import com.example.banque1.entities.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByCompte(Compte compte);

	@Query("SELECT SUM(t.montant) FROM Transaction t WHERE t.type = :type")
	Double sumByType(@Param("type") TypeTransaction type);

}
