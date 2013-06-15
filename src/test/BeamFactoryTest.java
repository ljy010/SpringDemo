package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import test.ioc.ClassB;

public class BeamFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource r = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(r);
		ClassB cb = (ClassB)beanFactory.getBean("b");
		cb.print();
		
	}

}
