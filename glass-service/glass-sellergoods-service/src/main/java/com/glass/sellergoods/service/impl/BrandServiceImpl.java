package com.glass.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.glass.mapper.BrandMapper;
import com.glass.pojo.Brand;
import com.glass.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(interfaceName="com.pinyougou.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService {

    /** 注入数据访问接口代理对象 */
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 查询所有品牌
     */
    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
