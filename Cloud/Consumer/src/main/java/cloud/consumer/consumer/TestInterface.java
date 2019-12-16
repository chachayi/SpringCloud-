package cloud.consumer.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "provider",fallback = TestInterfaceFallback.class)
public interface TestInterface {
    @RequestMapping(value = "/test")
    String test();

    @RequestMapping(value = "/test2")
    String test2();
}