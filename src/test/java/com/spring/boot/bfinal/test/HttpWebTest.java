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
package com.spring.boot.bfinal.test;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

/**
 * test for http web
 * created on 2016/1/19
 * @author dennisit.pu
 * @version 1.0
 */
public class HttpWebTest extends BootTestrap{

    /**
     * 参考链接：Spring MVC测试框架详解——服务端测试
     * <URL>http://jinnianshilongnian.iteye.com/blog/2004660</URL>
     */
    @Test
    public void index() throws Exception {
        MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders
                .get("/index.html")
                .accept(MediaType.TEXT_HTML))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /**

         MockHttpServletResponse:
         Status = 200
         Error message = null
         Headers = {Content-Type=[text/html;charset=UTF-8]}
         Content type = text/html;charset=UTF-8
         Body = "Have fun with spring boot !"
         Forwarded URL = null
         Redirected URL = null
         Cookies = []

     * @throws Exception
     */
    @Test
    public void helloword() throws Exception{
        MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get("/bfinal/helloword")
                        .accept(MediaType.TEXT_HTML)
        ).andDo(MockMvcResultHandlers.print()).andReturn();
    }

    /**
         Status = 200
         Error message = null
         Headers = {Content-Type=[text/html;charset=UTF-8]}
         Content type = text/html;charset=UTF-8
         Body = {"id":1,"valveType":1,"valveTitle":"cpu","valveValue":23,"depict":"cpu使用率报警阀值"}
         Forwarded URL = null
         Redirected URL = null
         Cookies = []

     * @throws Exception
     */
    @Test
    public void valveFit() throws Exception{
        MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get("/bfinal/get").param("id","1")
                        .accept(MediaType.TEXT_HTML)
        ).andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
