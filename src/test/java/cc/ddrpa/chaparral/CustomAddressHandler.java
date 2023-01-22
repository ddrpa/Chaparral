package cc.ddrpa.chaparral;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;
import cc.ddrpa.chaparral.entity.Address;
import org.junit.jupiter.api.Test;

public class CustomAddressHandler implements IDesensitizer<Address> {
    /**
     * this handler should replace all numbers in address detail with *
     *
     * @param valueObject
     * @return
     */
    public Address desensitize(Address valueObject) {
        String desensitizedAddressDetail = valueObject.getDetail().replaceAll("[^0-9]+", "*");
        return new Address(valueObject.getProvince(),
                valueObject.getCity(),
                desensitizedAddressDetail,
                valueObject.getZipCode());
    }
}