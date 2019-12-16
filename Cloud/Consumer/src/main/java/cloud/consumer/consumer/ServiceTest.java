package cloud.consumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    @Autowired
    private TestInterface testInterface;

   public String testAsy(){
        String s1 = testInterface.test();
        String s2 = testInterface.test2();
        return s1+s2;
    }
}
