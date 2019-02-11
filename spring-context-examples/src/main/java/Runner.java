import com.kravchenko.beans.java.MainConfiguration;
import com.kravchenko.beans.java.BlogService;
import com.kravchenko.beans.annotation.WebService;
import com.kravchenko.beans.xml.MindService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        javaConfigBeansWithDb(context);
        annotationConfigAndReadProperties(context);
        xmlConfigTest(context);
    }

    private static void xmlConfigTest(ApplicationContext context) {
        MindService bean = context.getBean(MindService.class);
        bean.goMindWork();
    }

    private static void annotationConfigAndReadProperties(ApplicationContext context) {
        WebService bean = context.getBean(WebService.class);
        bean.printWebSettings();
    }

    private static void javaConfigBeansWithDb(ApplicationContext context) {
        BlogService bean = context.getBean(BlogService.class);
        bean.createBlogs();
        bean.printAllBlogs();
    }

    private static void printAllBeans(ApplicationContext context) {
        for (String str : context.getBeanDefinitionNames()) {
            System.out.println(str);
        }
    }
}
