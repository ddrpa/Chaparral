package cc.ddrpa.chaparral;

import cc.ddrpa.chaparral.entity.Address;
import cc.ddrpa.chaparral.entity.SystemUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class HowToUseShowcase {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final SystemUser user = new SystemUser()
            .setRealName("张三")
            .setIdCard("33080119900101111X")
            .setBankAccount("6800012345678901")
            .setEmail("ddrpa@ddrpa.cc")
            .setMobile("18400001113")
            .setAddress(new Address("浙江省", "杭州市", "西湖区11号", "310000"))
            .setFieldShouldBeNullingOut(42);


    @Test
    public void test() throws JsonProcessingException {
        System.out.println(mapper.writeValueAsString(user));
    }
}