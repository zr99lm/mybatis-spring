import com.zr.controller.AccountController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testfindAll(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String s:beanDefinitionNames){
            System.out.println(s);
        }
        AccountController accountController = (AccountController) ac.getBean("accountController");
        accountController.findAllAccounts();
    }
}
