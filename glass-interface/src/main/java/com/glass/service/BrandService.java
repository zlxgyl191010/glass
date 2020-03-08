package com.glass.service;

import com.glass.pojo.Brand;

import java.util.List;

public interface BrandService {

    /** 查询所有品牌 */
    List<Brand> findAll();
}
