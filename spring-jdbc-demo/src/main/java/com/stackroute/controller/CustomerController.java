package com.stackroute.controller;

import com.stackroute.domain.Customer;
import com.stackroute.service.CrudOperationService;
import com.stackroute.service.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    private Customer customer = (Customer) context.getBean("customer");

    //private CrudOperationService crudOperationService;
    private CustomerDao customerDao;

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    /*public void setCrudOperationService(CrudOperationService crudOperationService) {
        this.crudOperationService = crudOperationService;
    }*/

    @GetMapping ("/")
    public String getAllCustomerCount()
    {
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("myObj",customerDao.getCustomerCount());
        return "index";
    }

}
