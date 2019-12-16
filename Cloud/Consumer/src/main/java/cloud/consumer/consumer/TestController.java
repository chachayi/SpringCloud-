package cloud.consumer.consumer;

import cloud.consumer.consumer.TestInterface;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class TestController {

    @Autowired
    private TestInterface testInterface;

    @Autowired
    private ServiceTest serviceTest;

    //    @Autowired
//    RestTemplate restTemplate;
//
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//     public String add() {
//                 return restTemplate.getForEntity("http://PROVIDER/test", String.class).getBody();
//             }
    @GetMapping("/test")
    public String test() throws ExecutionException, InterruptedException {

//        Future<String> future = new AsyncResult<String>() {
//            @Override
//            public String invoke() {
//                return serviceTest.testAsy();
//            }
//        @Override
//        public String get() {
//            return invoke();
//        }
//    };
       // Thread.sleep(2000);
        //String result = future.get();
        //System.out.println(result);
        //睡眠2+2秒
        //return testInterface.test();
        return serviceTest.testAsy();
    }
}
