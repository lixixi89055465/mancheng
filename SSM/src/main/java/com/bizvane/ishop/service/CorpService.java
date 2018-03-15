package com.bizvane.ishop.service;

import com.bizvane.ishop.entity.Corp;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by maoweidong on 2016/2/15.
 */

public interface CorpService {

    Corp selectByCorpId(int corp_id, String corp_code,String isactive) throws Exception;

    String insert(String message) throws Exception;

    String update(String message) throws Exception;

    int deleteByCorpId(int id) throws Exception;

    PageInfo<Corp> selectAllCorp(int page_number, int page_size, String search_value) throws Exception;

}
