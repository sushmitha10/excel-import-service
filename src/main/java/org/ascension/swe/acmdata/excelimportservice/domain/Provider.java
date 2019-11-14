//package org.ascension.swe.acmdata.excelimportservice.domain;
//
//        import java.io.Serializable;
//        import java.util.Date;
//
//        import javax.persistence.Column;
//        import javax.persistence.Entity;
//        import javax.persistence.Table;
//
//@Entity
//@Table(name = "provider")
//public class Provider implements Serializable {
//
//    @Column
//    private String lastName;
//    @Column
//    private String firstName;
//    @Column
//    private String middleName;
//    @Column
//    private String title;
//    @Column
//    private Date startDate;
//    @Column
//    private String midlevelInd;
//    @Column
//    private String stateMedLicenceNum;
//    @Column
//    private String medSchool;
//    @Column
//    private Date gradDate;
//    @Column
//    private String deaNum;
//    @Column
//    private Long npiNum;
//    @Column
//    private String taxonomyNum;
//    @Column
//    private Integer caqhNum;
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
//    private static final char MALE_GENDER = 'M';
//    private static final char FEMALE_GENDER = 'F';
//    @Column
//    private String email;
//    @Column
//    private String firslanguage;
//    @Column
//    private String secondLanguage;
//    @Column
//    private String acceptingNewPatients;
//    private static final String IS_ACCEPTING_NEW_PATIENTS = "YES";
//    private static final String NOT_ACCEPTING_NEW_PATIENTS = "NO";
//    @Column
//    private String practiceName;
//    @Column
//    private String address;
//    @Column
//    private String suite;
//    @Column
//    private String city;
//    @Column
//    private String state;
//    @Column
//    private Integer zip;
//    @Column
//    private Long phoneNum;
//    @Column
//    private String hoursOfOperation;
//    @Column
//    private String adaCompliant;
//    private static final String IS_ADA_COMPLIANT = "YES";
//    private static final String NOT_ADA_COMPLIANT = "NO";
//    @Column
//    private String facilityType;
//    @Column
//    private Integer taxId;
//    @Column
//    private Long groupNpi;
//    @Column
//    private String remitName;
//    @Column
//    private String remitAddr;
//    @Column
//    private String remitCity;
//    @Column
//    private String remitState;
//    @Column
//    private Integer remitZip;
//    @Column
//    private String location;
//
//    public String getLast() {
//        return lastName;
//    }
//    public void setLast(String last) {
//        this.lastName = last;
//    }
//    public String getFirst() {
//        return firstName;
//    }
//    public void setFirst(String first) {
//        this.firstName = first;
//    }
//    public String getMiddle() {
//        return middleName;
//    }
//    public void setMiddle(String middle) {
//        this.middleName = middle;
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
//    public void setStartDate(Date string) {
//        this.startDate = string;
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
//    public Long getNpiNum() {
//        return npiNum;
//    }
//    public void setNpiNum(Long npiNum) {
//        this.npiNum = npiNum;
//    }
//    public String getTaxonomyNum() {
//        return taxonomyNum;
//    }
//    public void setTaxonomyNum(String taxonomyNum) {
//        this.taxonomyNum = taxonomyNum;
//    }
//    public Integer getCaqhNum() {
//        return caqhNum;
//    }
//    public void setCaqhNum(Integer caqhNum) {
//        this.caqhNum = caqhNum;
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
//    public String getFirslanguage() {
//        return firslanguage;
//    }
//    public void setFirslanguage(String firslanguage) {
//        this.firslanguage = firslanguage;
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
//    public String getAddress() {
//        return address;
//    }
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    public String getSuite() {
//        return suite;
//    }
//    public void setSuite(String suite) {
//        this.suite = suite;
//    }
//    public String getCity() {
//        return city;
//    }
//    public void setCity(String city) {
//        this.city = city;
//    }
//    public String getState() {
//        return state;
//    }
//    public void setState(String state) {
//        this.state = state;
//    }
//    public Integer getZip() {
//        return zip;
//    }
//    public void setZip(Integer zip) {
//        this.zip = zip;
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
//    public String getFacilityType() {
//        return facilityType;
//    }
//    public void setFacilityType(String facilityType) {
//        this.facilityType = facilityType;
//    }
//    public Integer getTaxId() {
//        return taxId;
//    }
//    public void setTaxId(Integer taxId) {
//        this.taxId = taxId;
//    }
//    public Long getGroupNpi() {
//        return groupNpi;
//    }
//    public void setGroupNpi(Long groupNpi) {
//        this.groupNpi = groupNpi;
//    }
//    public String getRemitName() {
//        return remitName;
//    }
//    public void setRemitName(String remitName) {
//        this.remitName = remitName;
//    }
//    public String getRemitAddr() {
//        return remitAddr;
//    }
//    public void setRemitAddr(String remitAddr) {
//        this.remitAddr = remitAddr;
//    }
//    public String getRemitCity() {
//        return remitCity;
//    }
//    public void setRemitCity(String remitCity) {
//        this.remitCity = remitCity;
//    }
//    public String getRemitState() {
//        return remitState;
//    }
//    public void setRemitState(String remitState) {
//        this.remitState = remitState;
//    }
//    public Integer getRemitZip() {
//        return remitZip;
//    }
//    public void setRemitZip(Integer remitZip) {
//        this.remitZip = remitZip;
//    }
//    public String getLocation() {
//        return location;
//    }
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//}