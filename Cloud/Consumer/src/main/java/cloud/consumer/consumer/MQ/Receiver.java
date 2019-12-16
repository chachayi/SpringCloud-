package cloud.consumer.consumer.MQ;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(value="myOrder",type=ExchangeTypes.TOPIC),
            key = "Queue.myQueue1",
            value = @Queue("MyQueue1")
    ))
    public void process(String msg){
        System.out.println("Receiver... 接收并处理"+msg);
    }

    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue3"),
            key = "Queue.*",
            exchange = @Exchange(value="myOrder",type=ExchangeTypes.TOPIC)
    ))
    public void receive(String msg){
        System.out.println("Re..."+msg);
    }


//    @RabbitListener(bindings = @QueueBinding(
//            exchange =@Exchange(value="myOrder"),
//            key = "Queue.myQueue3",
//            value = @Queue("MyQueue3")
//    ))
//    public void receive2(String msg){
//        System.out.println("Receiver2 接收并处理"+msg);
//    }


}
