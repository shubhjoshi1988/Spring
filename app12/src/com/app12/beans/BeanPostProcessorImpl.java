package com.app12.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessorImpl implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("postProceessAfterInitialization1"+"---"+beanname+"---"+bean);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("postProceessBeforeInitialization1"+"---"+beanname+"---"+bean);
		return bean;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
