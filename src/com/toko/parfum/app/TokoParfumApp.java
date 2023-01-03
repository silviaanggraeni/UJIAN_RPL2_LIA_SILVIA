/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.parfum.app;

import com.toko.parfum.service.TokoParfumService;
import com.toko.parfum.view.TokoParfumView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author salis
 */
public class TokoParfumApp {
    private static  ApplicationContext appContext;

    public static void main(String[] args) {
        appContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        new TokoParfumView().setVisible(true);
    }
    
    public static TokoParfumService getTokoParfumService(){
        return (TokoParfumService) appContext.getBean("TokoParfumService");
    }
}
