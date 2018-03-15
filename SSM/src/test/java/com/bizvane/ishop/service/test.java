package com.bizvane.ishop.service;

import com.bizvane.ishop.dao.*;
import com.bizvane.ishop.entity.Corp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.System;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml",
        "classpath:spring-mybatis.xml"})
public class test {
    @Autowired
    private CorpService corpService;
    @Autowired
    private CorpMapper corpMapper;

    @Test
    public void insertCorp() {

        try {
            Corp corp = new Corp();
            corp.setCorp_code("12");
            corp.setCorp_name("zhou");
            corp.setContact("hahah");
            corp.setAddress("jiangsu");
            corp.setId(1);
            corpMapper.insertCorp(corp);
            System.out.println();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void updateByCorpId() {
        try {
            Corp corp = new Corp();
            corp.setCorp_code("12");
            corp.setCorp_name("zhou");
            corp.setContact("zezeez");
            corp.setAddress("jiangsu");
            corp.setId(1);
            corpMapper.updateByCorpId(corp);
            System.out.println();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
