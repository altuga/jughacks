/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author altuga
 */
@Stateless
@Interceptors(CallTracer.class)
public class PingBean {
    
    static long counter = 0 ;
    
    @PersistenceContext
    EntityManager entityManager;
    
    public String getHello() {
        return "Hello from PingBean " ;
    }
    
    public Ping save(Ping ping) {
       ping.name = ping.name + " " + counter++ ;
       return entityManager.merge(ping) ;
    }
}
