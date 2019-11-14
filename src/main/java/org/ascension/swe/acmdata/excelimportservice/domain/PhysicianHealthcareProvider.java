//package org.ascension.swe.acmdata.excelimportservice.domain;
//
//        import java.io.Serializable;
//        import javax.persistence.Column;
//        import javax.persistence.Entity;
//        import javax.persistence.Id;
//        import javax.persistence.Table;
//
//@Entity
//@Table(name="physicianhealthcareprovider")
//public class PhysicianHealthcareProvider implements Serializable {
//
//    @Column
//    private String stateMedLicenceNum;
//    @Column
//    private Long npiNum;
//    @Column
//    private String taxonomyNum;
//    @Column
//    private Integer caqhNum;
//    @Column
//    private String email;
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
//    @Column
//    private Integer taxId;
//
//    @Id
//    @Column
//    private Long groupNpi;
//    @Column
//    private String location;
//
//    public String getStateMedLicenceNum() {
//        return stateMedLicenceNum;
//    }
//    public void setStateMedLicenceNum(String stateMedLicenceNum) {
//        this.stateMedLicenceNum = stateMedLicenceNum;
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
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
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
//    public Long getGroupNpi() {
//        return groupNpi;
//    }
//    public void setGroupNpi(Long groupNpi) {
//        this.groupNpi = groupNpi;
//    }
//    public String getLocation() {
//        return location;
//    }
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//
//}