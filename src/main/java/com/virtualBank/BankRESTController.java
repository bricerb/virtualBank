package com.virtualBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brice on 2/17/17.
 */

@RestController
public class BankRESTController {

    @Autowired
    BankRepo banks;

    @RequestMapping(path = "/test.json", method = RequestMethod.POST)
    public String registerInfluencer(@RequestBody String test) {
        return "works";
    }
}
