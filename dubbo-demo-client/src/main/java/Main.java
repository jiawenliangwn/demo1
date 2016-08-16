import com.winning.dubbo.demo.api.DemoService;
import com.winning.dubbo.demo.api.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/4/27.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-context.xml");
        context.start();

        DemoService demoServiece = (DemoService) context.getBean("demoService");
        IDemoService demoServieceR = (IDemoService) context.getBean("demoServiceRemote");
        System.out.println(demoServiece.hello("asd"));

        while (true){
            System.out.println(demoServieceR.hello("asd"));
            Thread.sleep(1000);
        }*/


    }
}
