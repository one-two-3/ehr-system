package com.ehr.pojo;

import java.io.Serializable;

public class EhrSalaryAccounts implements Serializable{
    private Integer id;
    //开户银行
    private String bankofaccount;
    //账户号码
    private String account;
    //工号
    private String enumber;
    //基本薪资
    private Integer basicwage;

    private Integer gwgz;

    private Integer jxgz;

    private Integer glgz;

    private Integer gwjt;

    private Integer hfbt;

    private Integer cfbt;

    private Integer jtbt;

    private Integer qqjj;

    private Integer qtjj;

    private Integer bxdk;

    private Integer cfdk;

    private Integer qtdk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankofaccount() {
        return bankofaccount;
    }

    public void setBankofaccount(String bankofaccount) {
        this.bankofaccount = bankofaccount == null ? null : bankofaccount.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber == null ? null : enumber.trim();
    }

    public Integer getBasicwage() {
        return basicwage;
    }

    public void setBasicwage(Integer basicwage) {
        this.basicwage = basicwage;
    }

    public Integer getGwgz() {
        return gwgz;
    }

    public void setGwgz(Integer gwgz) {
        this.gwgz = gwgz;
    }

    public Integer getJxgz() {
        return jxgz;
    }

    public void setJxgz(Integer jxgz) {
        this.jxgz = jxgz;
    }

    public Integer getGlgz() {
        return glgz;
    }

    public void setGlgz(Integer glgz) {
        this.glgz = glgz;
    }

    public Integer getGwjt() {
        return gwjt;
    }

    public void setGwjt(Integer gwjt) {
        this.gwjt = gwjt;
    }

    public Integer getHfbt() {
        return hfbt;
    }

    public void setHfbt(Integer hfbt) {
        this.hfbt = hfbt;
    }

    public Integer getCfbt() {
        return cfbt;
    }

    public void setCfbt(Integer cfbt) {
        this.cfbt = cfbt;
    }

    public Integer getJtbt() {
        return jtbt;
    }

    public void setJtbt(Integer jtbt) {
        this.jtbt = jtbt;
    }

    public Integer getQqjj() {
        return qqjj;
    }

    public void setQqjj(Integer qqjj) {
        this.qqjj = qqjj;
    }

    public Integer getQtjj() {
        return qtjj;
    }

    public void setQtjj(Integer qtjj) {
        this.qtjj = qtjj;
    }

    public Integer getBxdk() {
        return bxdk;
    }

    public void setBxdk(Integer bxdk) {
        this.bxdk = bxdk;
    }

    public Integer getCfdk() {
        return cfdk;
    }

    public void setCfdk(Integer cfdk) {
        this.cfdk = cfdk;
    }

    public Integer getQtdk() {
        return qtdk;
    }

    public void setQtdk(Integer qtdk) {
        this.qtdk = qtdk;
    }
}