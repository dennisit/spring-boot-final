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
package com.spring.boot.bfinal.service.impl;

import com.spring.boot.bfinal.domain.ValveFit;
import com.spring.boot.bfinal.repository.ValveFitDao;
import com.spring.boot.bfinal.service.ValveFitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * service component
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
@Service(value = "valveFitService")
public class ValveFitServiceImpl implements ValveFitService {

    @Autowired
    private ValveFitDao valveFitDao;

    @Override
    public int insert(ValveFit entity) {
        return valveFitDao.insert(entity);
    }

    @Override
    public int update(ValveFit entity) {
        return valveFitDao.update(entity);
    }

    @Override
    public int delete(Long primaryKey) {
        return valveFitDao.delete(primaryKey);
    }

    @Override
    public int deleteMulti(Set<Long> primaryKeys) {
        return valveFitDao.deleteMulti(primaryKeys);
    }

    @Override
    public int deleteObjects(ValveFit entity) {
        return valveFitDao.deleteObjects(entity);
    }

    @Override
    public ValveFit select(Long primaryKey) {
        return valveFitDao.select(primaryKey);
    }

    @Override
    public List<ValveFit> selectMulti(Set<Long> primaryKeys) {
        return valveFitDao.selectMulti(primaryKeys);
    }

    @Override
    public List<ValveFit> selectObjects(ValveFit entity) {
        return valveFitDao.selectObjects(entity);
    }
}
