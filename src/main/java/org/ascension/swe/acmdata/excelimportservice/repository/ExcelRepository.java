package org.ascension.swe.acmdata.excelimportservice.repository;

import org.ascension.swe.acmdata.excelimportservice.domain.RequestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcelRepository extends CrudRepository<RequestModel, Integer> {
}
