package com.glass.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.glass.pojo.Brand;
import com.glass.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    /**
     * 引用服务接口代理对象
     * timeout: 调用服务接口方法超时时间毫秒数
     */
    @Reference(timeout = 10000)

    @Autowired(required=false)

    private BrandService brandService;
    /** 查询全部品牌 */
    @GetMapping("/brand/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }
}
