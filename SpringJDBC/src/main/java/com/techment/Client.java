package com.techment;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
public static void main(String[] args) {
	Resource resource= new ClassPathResource("object.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	MySqlDemo sql=(MySqlDemo) factory.getBean("mysql");
	sql.insertData();
}
}
