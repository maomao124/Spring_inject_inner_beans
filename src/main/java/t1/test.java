package t1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring注入内部Bean
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private static final Log LOGGER = LogFactory.getLog(test.class);

    public static void main(String[] args)
    {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取名为 employee 的 Bean
        Employee employee = context.getBean("employee", Employee.class);
        //通过日志打印员工信息
        LOGGER.info(employee.toString());
    }
}
