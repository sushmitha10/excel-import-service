package org.ascension.swe.acmdata.excelimportservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "contact")
@Entity
public class Contact {


    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    @JsonProperty("LastName")
       private String physicianLastName ;

    @Column
    @JsonProperty("FirstName")
    private String     physicianFirstName ;

    @Column
    @JsonProperty("PR_Middle_Name__c")
    private String physicianMiddleName ;

    @Column
    @JsonProperty("Title__c")
    private String physicianTitle ;

    @Column
    @JsonProperty("Effective_From_Date__c")
    private String startDate ;

    @Column
    @JsonProperty("PR_State_Medical_License_Number__c")
    private String stateMedicalLicenceNum ;

    @Column
    @JsonProperty("PR_Medical_School__c")
    private String medSchool ;

    @Column
    @JsonProperty("Medical_School_Completion_Date__c")
    private String graduationDate ;

    @Column
    @JsonProperty("PR_DEA_Number__c")
    private String deaNum ;

    @Column
    @JsonProperty("PR_NPI_Number__c")
    private Long npiNum ;

    @Column
    @JsonProperty("Taxonomy__c")
    private String taxonomyNum ;

    @Column
    @JsonProperty("CAQH__c")
    private Long caqhNum ;

    @Column
    @JsonProperty("PR_Primary_Specialty__c")
    private String primarySpecialty ;

    @Column
    @JsonProperty("PR_Board_Certified_in_Practicing_Special__c")
    private Boolean boardCerified ;

    @Column
    @JsonProperty("PR_Name_of_Board_Practicing_Specialty__c")
    private String primarySpecialtyBoardName ;

    @Column
    @JsonProperty("PR_Secondary_Specialty__c")
    private String secondarySpecialty ;

    @Column
    @JsonProperty("Birthdate")
    private String dateOfBirth ;

    @Column
    @JsonProperty("PR_Gender__c")
    private String gender ;

    @Column
    @JsonProperty("Email")
    private String email ;

    @Column
    @JsonProperty("Languages_Other_Than_English__c")
    private String secondLanguage ;

    @Column
    @JsonProperty("Accepting_New_Patients__c")
    private Boolean acceptingNewPatients ;


}
