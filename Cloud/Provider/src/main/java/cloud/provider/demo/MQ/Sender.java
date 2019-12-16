package cloud.provider.demo.MQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;

    public String send(){
        /**
         * convertAndSend - 转换并发送消息的template方法。
         * 是将传入的普通java对象，转换为rabbitmq中需要的message类型对象，并发送消息到rabbitmq中。
         * 参数一：交换器名称。 类型是String
         * 参数二：路由键。 类型是String
         * 参数三：消息，是要发送的消息内容对象。类型是Object
         */
        this.rabbitAmqpTemplate.convertAndSend("myOrder","Queue.myQueue1", new Date());
        this.rabbitAmqpTemplate.convertAndSend("myOrder","Queue.myQueue3", new Date());
        return "发送成功";
    }
//    public String send2(){
//
//        this.rabbitAmqpTemplate.convertAndSend("myOrder","Queue.myQueue3", new Date());
//
//        return "发送2成功";
//    }
}