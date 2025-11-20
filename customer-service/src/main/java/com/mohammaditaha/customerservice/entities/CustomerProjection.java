package com.mohammaditaha.customerservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all" , types = Customer.class)
public interface CustomerProjection {
    String getname();
    String getemail();
}
