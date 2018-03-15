package com.bizvane.ishop.service.imp;

import com.bizvane.ishop.constant.Common;
import com.bizvane.ishop.dao.CorpMapper;
import com.bizvane.ishop.entity.Corp;
import com.bizvane.ishop.service.CorpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/23.
 */
@Service
public class CorpServiceImpl implements CorpService {
    @Autowired
    private CorpMapper corpMapper;

    public Corp selectByCorpId(int corp_id, String corp_code, String isactive) throws Exception {
        return corpMapper.selectByCorpId(corp_id, corp_code, isactive);
    }

    @Transactional
    public String insert(String message) throws Exception {

        String result = "";
        JSONObject jsonObject = new JSONObject(message);
        Corp corp = new Corp();
        corp.setCorp_code(jsonObject.get("corp_code").toString());
        corp.setCorp_name(jsonObject.get("corp_name").toString());
        corp.setAddress(jsonObject.get("address").toString());
        corp.setContact(jsonObject.get("contact").toString());
        corp.setContact_phone(jsonObject.get("phone").toString());
        corpMapper.insertCorp(corp);
        result = Common.DATABEAN_CODE_SUCCESS;

        return result;
    }

    @Transactional
    public String update(String message) throws Exception {
        String result = Common.DATABEAN_CODE_ERROR;
        JSONObject jsonObject = new JSONObject(message);
        Corp old_corp = new Corp();
        old_corp.setId(Integer.parseInt(jsonObject.get("id").toString()));
        old_corp.setCorp_code(jsonObject.get("corp_code").toString());
        old_corp.setCorp_name(jsonObject.get("corp_name").toString());
        old_corp.setAddress(jsonObject.get("address").toString());
        old_corp.setContact(jsonObject.get("contact").toString());
        old_corp.setContact_phone(jsonObject.get("phone").toString());

        corpMapper.updateByCorpId(old_corp);
        result = Common.DATABEAN_CODE_SUCCESS;
        return result;
    }


    @Transactional
    public int deleteByCorpId(int id) throws Exception {
        return corpMapper.deleteByCorpId(id);
    }

    /**
     * 分页显示所有企业
     */
    public PageInfo<Corp> selectAllCorp(int page_number, int page_size, String search_value) throws Exception {
        //startpage方法只对紧跟其后的第一个sql语句进行分页
        PageHelper.startPage(page_number, page_size);
        List<Corp> corps = corpMapper.selectAllCorp(search_value);
        PageInfo<Corp> page = new PageInfo<Corp>(corps);
        return page;
    }

}
