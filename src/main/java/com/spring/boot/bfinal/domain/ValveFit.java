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
package com.spring.boot.bfinal.domain;


import java.io.Serializable;

/**
 * domain
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
public class ValveFit implements Serializable {

    private Long id;

    // 1 means cpu , 2 means jvm, 3 mean ram
    private Integer valveType;

    // title of valve
    private String valveTitle;

    // type mapped valve value(default all value is 95)
    private Integer valveValue;

    // type=1(cpu), type=2()
    private String depict;

    public enum ValveType{

        cpu(1,"cpu"), jvm(2,"jvm"), ram(3, "ram");

        ValveType(int type, String title) {
            this.type = type;
            this.title = title;
        }

        private int type;
        private String title;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValveType() {
        return valveType;
    }

    public void setValveType(Integer valveType) {
        this.valveType = valveType;
    }

    public String getValveTitle() {
        return valveTitle;
    }

    public void setValveTitle(String valveTitle) {
        this.valveTitle = valveTitle;
    }

    public Integer getValveValue() {
        return valveValue;
    }

    public void setValveValue(Integer valveValue) {
        this.valveValue = valveValue;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

}
