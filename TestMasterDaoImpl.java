package com.web.demo.jta.dao.impl;

import com.web.demo.jta.dao.TestMasterDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestMasterDaoImpl implements TestMasterDao {

    @Resource(name="masterJdbcTemplate")
    JdbcTemplate masterJdbcTemplate;

    public String master() {
        masterJdbcTemplate.execute("update TEST_TM_WMS_PART set name='master' where PART_ID='9044680'");
        return "success";
    }

    public String update() {
        masterJdbcTemplate.execute("update teacher set name='8' where id=1");
        System.out.println("update");
        masterJdbcTemplate.execute("fff teacher set name=''6' where id=1");
        return null;
    }
}
