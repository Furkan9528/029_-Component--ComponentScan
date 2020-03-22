package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkankara.matematik.HesapMakinesi;
import com.furkankara.matematik.Islem;

public class Merkez {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		 
		 //AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		 //appCtx.register(SpringBeanConfig.class);
		
	
		 HesapMakinesi hesapmakinesi = context.getBean("hesapMakinesiBeanComponent",HesapMakinesi.class);
		 hesapmakinesi.sonuclariGetirYaz(15, 3);
		 
	
	
	}
}
