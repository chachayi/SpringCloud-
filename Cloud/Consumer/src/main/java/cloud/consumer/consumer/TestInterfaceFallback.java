package cloud.consumer.consumer;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
public class TestInterfaceFallback implements TestInterface {

    @Override
    public String test() {
        //"服务降级逻辑/默认数据"

        return "error-tes1";
    }
    @Override
    public String test2() {
        //"服务降级逻辑/默认数据"
        return "error-test2";
    }
}
