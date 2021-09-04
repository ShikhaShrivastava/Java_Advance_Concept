package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Question;

public class Test {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("object.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question ques=(Question)factory.getBean("ques");  
	    ques.displayInfo();
	}

}
