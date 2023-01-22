package cc.ddrpa.chaparral.entity;

public class Address {
    private String province;
    private String city;
    private String detail;
    private String zipCode;

    public Address(String province, String city, String detail, String zipCode) {
        this.province = province;
        this.city = city;
        this.detail = detail;
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public Address setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public Address setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}