//package org.ascension.swe.acmdata.excelimportservice.domain;
//
//
//        import java.io.Serializable;
//        import javax.persistence.Column;
//        import javax.persistence.Entity;
//        import javax.persistence.Id;
//        import javax.persistence.Table;
//
//@Entity
//@Table(name = "Location")
//public class Location implements Serializable {
//
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
//    private String hoursOfOperation;
//    @Column
//    private String facilityType;
//
//    @Id
//    @Column
//    private Integer taxId;
//    @Column
//    private  Long groupNpi;
//    @Column
//    private String location;
//
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
//    public String getHoursOfOperation() {
//        return hoursOfOperation;
//    }
//    public void setHoursOfOperation(String hoursOfOperation) {
//        this.hoursOfOperation = hoursOfOperation;
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
//    public String getLocation() {
//        return location;
//    }
//    public void setLocation(String location) {
//        this.location = location;
//    }
//}