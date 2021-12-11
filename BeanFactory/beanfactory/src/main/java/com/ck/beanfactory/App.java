package com.ck.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

class App 
{
    public static void main( String[] args )
    {
      // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
       // BeanFactory is less used and it's implementation class XmlBeanFactory is now deprecated
       
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml") ;
    	
    	Alien obj = (Alien)factory.getBean("alien") ;
    	// obj.age = 23 ;  -- using setter and getter injection , age is private 
    	obj.code() ;
    	
    	//we can set set the age by using setAge() method , or we can give default value also
    	// by using <property> tag in spring.xml
    	System.out.println(obj.getAge());
    	
//    	Alien obj2 = (Alien)factory.getBean("alien") ;
//    	obj2.code() ;
//    	System.out.println(obj2.age);
    	
    	// By default spring will give one object even thought we create multiple instances
    	// that is called "singleton" scope, it is default scope of a bean
    	// In case we want different object objects for each instance we can choose 
    	// "prototype" scope
    	
    	// prototype scope will not create an object unless we instantiate an object 
    	// where as singleton creates an object whether you instantiate or not
    	
    }
}
