package com.dobrenok.config.controller;


import com.dobrenok.config.ent.EvengerEntity;
import com.dobrenok.config.repository.EvengerEntityR;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/evenger")
public class Сontroller {

    @Inject
    EvengerEntityR evengerEntityR;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public EvengerEntity getEvent(){
      //  evengerEntityR.findAll();
        return createMockEvenger();
    }



    private EvengerEntity createMockEvenger() {
        EvengerEntity evenger = new EvengerEntity();
        evenger.setId(1);
        evenger.setTitle("MY FIRST EVENT");
        evenger.setDateCreate(java.util.Calendar.getInstance().getTime());
        return evenger;
    }
}
