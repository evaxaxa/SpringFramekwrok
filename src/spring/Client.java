package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] a){
//
//        ApplicationContext context= new ClassPathXmlApplicationContext("file.xml");
//
//        Employee e= (Employee) context.getBean("emp1");
//        Employee e2= (Employee) context.getBean("emp2");

//        Resource resource=new ClassPathResource("file.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);

        Resource resource=new ClassPathResource("file.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Employee e=(Employee) factory.getBean("emp1");
        //student.displayInfo();
        Employee e2=(Employee) factory.getBean("emp2");



        System.out.println("Employee details : "+e.getId()+"   "+e.getName()+"  "+e.getAddress());
        System.out.println("Employee details : "+e2.getId()+"   "+e2.getName()+"  "+e2.getAddress());




    }
}
