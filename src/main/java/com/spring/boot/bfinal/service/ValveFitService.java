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
package com.spring.boot.bfinal.service;

import com.spring.boot.bfinal.domain.ValveFit;

import java.util.List;
import java.util.Set;

/**
 * class function depict
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
public interface ValveFitService {

    /**
     * insert object
     * @param entity new object
     * @return insert and return primary key
     */
    public abstract int insert(ValveFit entity);

    /**
     * update object by object hold primary key
     * @param entity entity dependence original primary key fulled with new data
     * @return effect row numbers
     */
    public abstract int update(ValveFit entity);

    /**
     * delete object by primary key
     * @param primaryKey primary key of object
     * @return effect row numbers
     */
    public abstract int delete(Long primaryKey);

    /**
     * delete object by collection of primary key
     * @param primaryKeys primary key collection of multi object
     * @return effect row numbers
     */
    public abstract int deleteMulti(Set<Long> primaryKeys);

    /**
     * delete object by condition
     * @param entity condition of object
     * @return effect row numbers
     */
    public abstract int deleteObjects(ValveFit entity);

    /**
     * select object by primaryKey
     * @param primaryKey primary key of object
     * @return result object match query condition
     */
    public abstract ValveFit select(Long primaryKey);

    /**
     * select object by collection of primaryKey
     * @param primaryKeys primary key collection of multi object
     * @return object collection result
     */
    public abstract List<ValveFit> selectMulti(Set<Long> primaryKeys);

    /**
     * select object by condition
     * @param entity condition of object
     * @return object collection result
     */
    public abstract List<ValveFit> selectObjects(ValveFit entity);
}
