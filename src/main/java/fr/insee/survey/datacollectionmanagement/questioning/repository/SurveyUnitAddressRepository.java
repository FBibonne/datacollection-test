package fr.insee.survey.datacollectionmanagement.questioning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.insee.survey.datacollectionmanagement.questioning.domain.SurveyUnitAddress;

public interface SurveyUnitAddressRepository extends JpaRepository<SurveyUnitAddress, Long> {

}
