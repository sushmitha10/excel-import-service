package org.ascension.swe.acmdata.excelimportservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class Contact1 {


    @Column
       private String physicianLastName ;

    @Column
    private String     physicianFirstName ;

    @Column
    private String physicianMiddleName ;

    @Column
    private String physicianTitle ;

    @Column
    private String startDate ;

    @Column
    private String stateMedicalLicenceNum ;

    @Column
    private String medSchool ;

    @Column
    private String graduationDate ;

    @Column
    private String deaNum ;

    @Column
    private Long npiNum ;

    @Column
    private String taxonomyNum ;

    @Column
    private Long caqhNum ;

    @Column
    private String primarySpecialty ;

    @Column
    private Boolean boardCerified ;

    @Column
    private String primarySpecialtyBoardName ;

    @Column
    private String secondarySpecialty ;

    @Column
    private String dateOfBirth ;

    @Column
    private String gender ;

    @Column
    private String email ;

    @Column
    private String secondLanguage ;

    @Column
    private Boolean acceptingNewPatients ;


}
