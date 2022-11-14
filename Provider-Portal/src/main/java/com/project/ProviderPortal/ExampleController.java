package com.project.ProviderPortal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @RequestMapping(value="/findName",method = RequestMethod.GET)
    public String getName(){
        return  "Kousik";
    }

}
