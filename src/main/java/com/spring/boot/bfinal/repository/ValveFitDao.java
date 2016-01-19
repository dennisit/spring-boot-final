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
package com.spring.boot.bfinal.repository;

import com.spring.boot.bfinal.domain.ValveFit;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * description: dao operate
 * created on 2015/10/19
 * @author dennisit.pu | dennisit@163.com
 * @version 1.0
 */
public interface ValveFitDao {


    //===============================================================================
    // Write database operate
    //===============================================================================

    /**
     * insert and return primary key bound with entity
     * @param entity entity fulled with new data
     * @return insert and full entity with primary key, return effect row number
     */
    public Integer insert(@Param("object") ValveFit entity);

    /**
     * update object by object hold primary key
     * @param entity entity dependence original primary key fulled with new data
     * @return effect row numbers
     * @throws RuntimeException
     */
    public int update(@Param("object") ValveFit entity);

    /**
     * delete object by condition
     * @param primaryKey condition of object
     * @return effect row numbers
     * @throws RuntimeException
     */
    public int delete(@Param("pKey") Long primaryKey);

    /**
     * delete object by collection of primary key
     * @param primaryKeys collection of primary key
     * @return effect row numners
     * @throws RuntimeException
     */
    public int deleteMulti(@Param("pKeys") Set<Long> primaryKeys);

    /**
     * delete object with condition
     * @param entity query condition
     * @return effect row numbers
     * @throws RuntimeException
     */
    public int deleteObjects(@Param("object") ValveFit entity);


    //===============================================================================
    // Read database operate
    //===============================================================================

    /**
     * query entity by primary key
     * @param primaryKey collection of primary key
     * @return object result
     * @throws RuntimeException
     */
    public ValveFit select(@Param("pKey") Long primaryKey);


    /**
     * query entity by primary key collection
     * @param primaryKeys collection of primary key
     * @return collection of object result
     * @throws RuntimeException
     */
    public List<ValveFit> selectMulti(@Param("pKeys") Set<Long> primaryKeys);

    /**
     * query object collection with condition
     * @param entity query cndition
     * @return collection of object result
     * @throws RuntimeException
     */
    public List<ValveFit> selectObjects(@Param("object") ValveFit entity);

    /**
     * query entity with condition
     * @param entity query cndition
     * @param offset page.offset
     * @param size page.size
     * @return collection of object result
     * @throws RuntimeException
     */
    public List<ValveFit> selectPagination(@Param("object") ValveFit entity,
                                           @Param("offset") int offset,
                                           @Param("size") int size);

    /**
     * query object collection size by condition
     * @param entity query cndition
     * @return total for row number
     * @throws RuntimeException
     */
    public int selectTotal(@Param("object") ValveFit entity);

}
