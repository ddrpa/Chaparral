package cc.ddrpa.chaparral.howto;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;
import cc.ddrpa.chaparral.howto.entity.Address;

public class CustomAddressHandler implements IDesensitizer<Address> {
    /**
     * It should replace all numbers in address detail with *
     *
     * @param valueObject the address object
     * @return desensitized address object
     */
    public Address desensitize(Address valueObject) {
        String desensitizedAddressDetail = valueObject.getDetail().replaceAll("[0-9]+", "*");
        return new Address(valueObject.getProvince(),
                valueObject.getCity(),
                desensitizedAddressDetail,
                valueObject.getZipCode());
    }
}