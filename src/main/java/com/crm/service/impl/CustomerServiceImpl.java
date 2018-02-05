package com.crm.service.impl;

import com.crm.mapper.CustomerMapper;
import com.crm.service.CustomerService;
import com.crm.vo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Integer addCustomer(Customer customer) {
        return customerMapper.insert(customer);
    }
}
