import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// Configure the class to be a BeanPostProcessor
public class DisplayBeanPostProcessor implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("Before Initialization bean name = " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("After Initialization bean name = " + beanName);
        return bean;
    }
}
