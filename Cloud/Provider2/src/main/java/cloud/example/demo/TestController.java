package cloud.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() throws InterruptedException {
        //Thread.sleep(2000);
        System.out.println("sleep完成");
        return System.currentTimeMillis() + ":provider2号";
    }

    @RequestMapping("/test2")
    public String test2() throws InterruptedException {
        //Thread.sleep(2000);
        System.out.println("sleep完成");
        return System.currentTimeMillis() + ":provider2号";
    }
}