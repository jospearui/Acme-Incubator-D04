
package acme.features.investor.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.applications.Application;
import acme.entities.investmentRounds.InvestmentRound;
import acme.entities.roles.Investor;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface InvestorApplicationRepository extends AbstractRepository {

	@Query("select a from Application a Where a.id = ?1")
	Application findOneApplicationById(int id);

	@Query("select a from Application a where a.investor.id= ?1")
	Collection<Application> findManyByinvestorId(int investorId);

	@Query("select ir from InvestmentRound ir where ir.id= ?1")
	InvestmentRound findInvestmentRoundPublished(int iRoundId);

	@Query("select i from Investor i where i.id= ?1")
	Investor findInvestorById(int investorId);

}
