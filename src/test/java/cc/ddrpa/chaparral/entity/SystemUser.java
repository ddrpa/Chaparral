package cc.ddrpa.chaparral.entity;


import cc.ddrpa.chaparral.CustomAddressHandler;
import cc.ddrpa.chaparral.annotation.Sensitive;

import static cc.ddrpa.chaparral.enums.DesensitizeStrategy.*;

public class SystemUser {
    @Sensitive(strategy = NAME)
    private String realName;
    @Sensitive(strategy = ID_CARD)
    private String idCard;
    @Sensitive(strategy = BANK_ACCOUNT)
    private String bankAccount;
    @Sensitive(strategy = EMAIL)
    private String email;
    @Sensitive(strategy = CELL)
    private String mobile;
    @Sensitive(strategy = CUSTOM, using = CustomAddressHandler.class)
    private Address address;
    @Sensitive
    private Integer fieldShouldBeNullingOut;

    public SystemUser() {
    }

    public String getRealName() {
        return realName;
    }

    public SystemUser setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public SystemUser setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public SystemUser setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SystemUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public SystemUser setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public SystemUser setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Integer getFieldShouldBeNullingOut() {
        return fieldShouldBeNullingOut;
    }

    public SystemUser setFieldShouldBeNullingOut(Integer fieldShouldBeNullingOut) {
        this.fieldShouldBeNullingOut = fieldShouldBeNullingOut;
        return this;
    }
}