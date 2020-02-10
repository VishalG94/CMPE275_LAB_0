package first;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EjbProjectSpringBootApplication {
    public static void main(String args[]){
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj = (HelloWorld) factory.getBean("firstBean");
        System.out.println(obj.getGreeting());
    }
}
