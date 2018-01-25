package com.web.demo.jta.dao.impl;

import com.web.demo.jta.dao.TestSlaveDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestSlaveDaoImpl implements TestSlaveDao {

    @Resource(name="slaveJdbcTemplate")
    JdbcTemplate slaveJdbcTemplate;

    public String slave() {
        slaveJdbcTemplate.execute("update student set name='slave' where id=1");
        return "success";
    }
}
