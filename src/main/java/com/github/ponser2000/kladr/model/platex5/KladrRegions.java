package com.github.ponser2000.kladr.model.platex5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KLADR_REGIONS_BACKUP")
public class KladrRegions {
    @Id
    @Column(name = "CODE", nullable = false, length = 6)
    private String id;

    @Column(name = "NAME", length = 256)
    private String name;

    @Column(name = "SOCR", length = 20)
    private String socr;

    @Column(name = "IND", length = 12)
    private String ind;

    @Column(name = "OCATD", length = 22)
    private String ocatd;

    @Column(name = "FULL_CODE", length = 26)
    private String fullCode;

    @Column(name = "RGN_CODE", length = 6)
    private String rgnCode;

    @Column(name = "RES", length = 1)
    private String res;

    @Column(name = "ERROR", length = 512)
    private String error;

    @Column(name = "ALL_RECS")
    private Long allRecs;

    @Column(name = "SUCCESS_RECS")
    private Long successRecs;

    @Column(name = "ERROR_RECS")
    private Long errorRecs;

    public Long getErrorRecs() {
        return errorRecs;
    }

    public void setErrorRecs(Long errorRecs) {
        this.errorRecs = errorRecs;
    }

    public Long getSuccessRecs() {
        return successRecs;
    }

    public void setSuccessRecs(Long successRecs) {
        this.successRecs = successRecs;
    }

    public Long getAllRecs() {
        return allRecs;
    }

    public void setAllRecs(Long allRecs) {
        this.allRecs = allRecs;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getRgnCode() {
        return rgnCode;
    }

    public void setRgnCode(String rgnCode) {
        this.rgnCode = rgnCode;
    }

    public String getFullCode() {
        return fullCode;
    }

    public void setFullCode(String fullCode) {
        this.fullCode = fullCode;
    }

    public String getOcatd() {
        return ocatd;
    }

    public void setOcatd(String ocatd) {
        this.ocatd = ocatd;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public String getSocr() {
        return socr;
    }

    public void setSocr(String socr) {
        this.socr = socr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "KladrRegions{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", socr='" + socr + '\'' +
                ", ind='" + ind + '\'' +
                ", ocatd='" + ocatd + '\'' +
                ", fullCode='" + fullCode + '\'' +
                ", rgnCode='" + rgnCode + '\'' +
                '}';
    }
}