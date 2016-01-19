/*--------------------------------------------------------------------------
 *  Copyright (c) 2009-2020, dennisit.pu All rights reserved. 
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the yinyuetai developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: dennisit.pu (dennisit@163.com)
 *--------------------------------------------------------------------------
*/
package com.spring.boot.bfinal.web;

import com.spring.boot.bfinal.service.ValveFitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * web http controller
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/bfinal")
public class BFinalController {

    @Autowired
    private ValveFitService valveFitService;

    @ResponseBody
    @RequestMapping(value = {"/helloword"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Object hellowrd(){
        return "Have fun with spring boot !";
    }

    @ResponseBody
    @RequestMapping(value = {"/get"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Object listValve(@RequestParam(value = "id", required = false, defaultValue = "0") long id){
        return valveFitService.select(id);
    }
}
