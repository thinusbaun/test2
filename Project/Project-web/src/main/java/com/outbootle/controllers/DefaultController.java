/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.controllers;
 
import com.outbootle.dao.CustomerFacadeRemote;
import com.outbootle.model.Customer;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/**
*
* @author john
*/
@Controller
public class DefaultController {
    
   @Autowired
   private CustomerFacadeRemote customerFacade;
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView index(HttpServletRequest request) {
        // Handle a new guest (if any):
       Customer customer = null;
        String name = request.getParameter("name");
        if (name != null)
            customer= new Customer();
            customer.setName(name);
            customerFacade.create(customer);
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("index.jsp", "customerFacade", customerFacade);
   }
    
}