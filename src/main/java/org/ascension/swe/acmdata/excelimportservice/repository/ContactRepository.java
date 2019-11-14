package org.ascension.swe.acmdata.excelimportservice.repository;

import org.ascension.swe.acmdata.excelimportservice.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository <Contact, Integer> {
}
