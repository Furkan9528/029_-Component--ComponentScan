package com.furkankara.matematik;

import org.springframework.stereotype.Component;

@Component("IslemBeanComponent")
public class Islem {

	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int cikar(int sayi1, int sayi2) {
		return sayi1-sayi2;
	}
	
	public double bol(int sayi1, int sayi2) {
		return sayi1/sayi2;
	}
	
	public int carp(int sayi1, int sayi2) {
		return sayi1*sayi2;
	}
	
	
}
