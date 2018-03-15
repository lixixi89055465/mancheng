package com.bizvane.ishop.dao;

import com.bizvane.ishop.entity.Corp;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CorpMapper {

    //所有企业
    List<Corp> selectAllCorp(@Param("search_value") String search_value) throws SQLException;

    // 李祥测试
    Corp selectByCorpId(@Param("corp_id") int corp_id, @Param("corp_code") String corp_code, @Param("isactive") String isactive) throws SQLException;

    int insertCorp(Corp record) throws SQLException;

    int updateByCorpId(Corp record) throws SQLException;

    int deleteByCorpId(Integer id) throws SQLException;

}