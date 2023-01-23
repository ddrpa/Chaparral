package cc.ddrpa.chaparral.howto.entity;

public class Address {
    private final String province;
    private final String city;
    private final String detail;
    private final String zipCode;

    public Address(String province, String city, String detail, String zipCode) {
        this.province = province;
        this.city = city;
        this.detail = detail;
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getDetail() {
        return detail;
    }

    public String getZipCode() {
        return zipCode;
    }
}