package cloud.provider.demo;

import cloud.provider.demo.MQ.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Sender sender;

    @RequestMapping("/test")
    public String test() throws InterruptedException {
       // Thread.sleep(2000);
        //System.out.println("sleep完成");
        System.out.println(this.sender.send());
        //System.out.println(this.sender.send2());
        return System.currentTimeMillis() + ":provider一号";
    }
//
//    @RequestMapping("/test2")
//    public String test2() throws InterruptedException {
//       // Thread.sleep(2000);
//        //System.out.println("sleep完成");
//        System.out.println(this.sender.send2());
//        return System.currentTimeMillis() + ":provider一号";
//    }
}