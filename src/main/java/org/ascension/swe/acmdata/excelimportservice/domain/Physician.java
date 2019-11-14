//package org.ascension.swe.acmdata.excelimportservice.domain;
//
//        import java.io.Serializable;
//        import java.util.Date;
//        import javax.persistence.Column;
//        import javax.persistence.Entity;
//        import javax.persistence.Id;
//        import javax.persistence.Table;
//
//@Entity
//@Table(name = "physician")
//public class Physician implements Serializable{
//
//    @Column
//    private String lastName;
//    @Column
//    private String firstName;
//    @Column
//    private String middle;
//    @Column
//    private String title;
//    @Column
//    private Date startDate;
//    @Column
//    private String midlevelInd;
//    @Column
//    private String stateMedLicenceNum;
//    @Column
//    private Long npiNum;
//    @Column
//    private Long groupNpi;
//    @Column
//    private Integer caqhNum;
//    @Column
//    private String medSchool;
//    @Column
//    private Date gradDate;
//    @Column
//    private String deaNum;
//    @Column
//    private String primarySpecialty;
//    @Column
//    private String cerified;
//    @Column
//    private String specialtyBoard;
//    @Column
//    private String secondarySpecialty;
//    @Column
//    private Date dob;
//    @Column
//    private Character gender;
//    @Column
//    private String email;
//    @Column
//    private String firstLanguage;
//    @Column
//    private String secondLanguage;
//    @Column
//    private String acceptingNewPatients;
//    @Column
//    private String practiceName;
//    @Column
//    private Long phoneNum;
//    @Column
//    private String hoursOfOperation;
//    @Column
//    private String adaCompliant;
//
//    @Id
//    @Column
//    private Integer taxId;
//    @Column
//    private String taxonomyNum;
//
//    public String getLast() {
//        return lastName;
//    }
//    public void setLast(String last) {
//        this.lastName = last;
//    }
//
//    public Long getGroupNpi() {
//        return groupNpi;
//    }
//    public void setGroupNpi(Long groupNpi) {
//        this.groupNpi = groupNpi;
//    }
//    public Integer getCaqhNum() {
//        return caqhNum;
//    }
//    public void setCaqhNum(Integer caqhNum) {
//        this.caqhNum = caqhNum;
//    }
//    public String getTaxonomyNum() {
//        return taxonomyNum;
//    }
//    public void setTaxonomyNum(String taxonomyNum) {
//        this.taxonomyNum = taxonomyNum;
//    }
//    public String getFirst() {
//        return firstName;
//    }
//    public void setFirst(String first) {
//        this.firstName = first;
//    }
//    public Long getNpiNum() {
//        return npiNum;
//    }
//    public void setNpiNum(Long npiNum) {
//        this.npiNum = npiNum;
//    }
//    public Long getGroupNpiNum() {
//        return groupNpi;
//    }
//    public void setGroupNpiNum(Long groupNpiNum) {
//        this.groupNpi = groupNpiNum;
//    }
//    public String getMiddle() {
//        return middle;
//    }
//    public void setMiddle(String middle) {
//        this.middle = middle;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public Date getStartDate() {
//        return startDate;
//    }
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//    public String getMidlevelInd() {
//        return midlevelInd;
//    }
//    public void setMidlevelInd(String midlevelInd) {
//        this.midlevelInd = midlevelInd;
//    }
//    public String getStateMedLicenceNum() {
//        return stateMedLicenceNum;
//    }
//    public void setStateMedLicenceNum(String stateMedLicenceNum) {
//        this.stateMedLicenceNum = stateMedLicenceNum;
//    }
//    public String getMedSchool() {
//        return medSchool;
//    }
//    public void setMedSchool(String medSchool) {
//        this.medSchool = medSchool;
//    }
//    public Date getGradDate() {
//        return gradDate;
//    }
//    public void setGradDate(Date gradDate) {
//        this.gradDate = gradDate;
//    }
//    public String getDeaNum() {
//        return deaNum;
//    }
//    public void setDeaNum(String deaNum) {
//        this.deaNum = deaNum;
//    }
//    public String getPrimarySpecialty() {
//        return primarySpecialty;
//    }
//    public void setPrimarySpecialty(String primarySpecialty) {
//        this.primarySpecialty = primarySpecialty;
//    }
//    public String getCerified() {
//        return cerified;
//    }
//    public void setCerified(String cerified) {
//        this.cerified = cerified;
//    }
//    public String getSpecialtyBoard() {
//        return specialtyBoard;
//    }
//    public void setSpecialtyBoard(String specialtyBoard) {
//        this.specialtyBoard = specialtyBoard;
//    }
//    public String getSecondarySpecialty() {
//        return secondarySpecialty;
//    }
//    public void setSecondarySpecialty(String secondarySpecialty) {
//        this.secondarySpecialty = secondarySpecialty;
//    }
//    public Date getDob() {
//        return dob;
//    }
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//    public Character getGender() {
//        return gender;
//    }
//    public void setGender(Character gender) {
//        this.gender = gender;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getFirstLanguage() {
//        return firstLanguage;
//    }
//    public void setFirstLanguage(String firstlanguage) {
//        this.firstLanguage = firstlanguage;
//    }
//    public String getSecondLanguage() {
//        return secondLanguage;
//    }
//    public void setSecondLanguage(String secondLanguage) {
//        this.secondLanguage = secondLanguage;
//    }
//    public String getAcceptingNewPatients() {
//        return acceptingNewPatients;
//    }
//    public void setAcceptingNewPatients(String acceptingNewPatients) {
//        this.acceptingNewPatients = acceptingNewPatients;
//    }
//    public String getPracticeName() {
//        return practiceName;
//    }
//    public void setPracticeName(String practiceName) {
//        this.practiceName = practiceName;
//    }
//    public Long getPhoneNum() {
//        return phoneNum;
//    }
//    public void setPhoneNum(Long phoneNum) {
//        this.phoneNum = phoneNum;
//    }
//    public String getHoursOfOperation() {
//        return hoursOfOperation;
//    }
//    public void setHoursOfOperation(String hoursOfOperation) {
//        this.hoursOfOperation = hoursOfOperation;
//    }
//    public String getAdaCompliant() {
//        return adaCompliant;
//    }
//    public void setAdaCompliant(String adaCompliant) {
//        this.adaCompliant = adaCompliant;
//    }
//    public Integer getTaxId() {
//        return taxId;
//    }
//    public void setTaxId(Integer taxId) {
//        this.taxId = taxId;
//    }
//}