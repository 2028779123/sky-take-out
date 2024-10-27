package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

public interface DishService {


    /**
     * 新增菜品
     * @param dishDTO
     */
    public void savaWithFlavor(DishDTO dishDTO);

    /**
     *  菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}



















