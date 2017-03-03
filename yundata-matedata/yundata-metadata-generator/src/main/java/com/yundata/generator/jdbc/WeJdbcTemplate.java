
package com.yundata.generator.jdbc;

import com.yundata.generator.util.PropertiesUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;


public class WeJdbcTemplate {

    private static DataSource dataSource;
    private static JdbcTemplate jdbcTemplate;

    static {
        Map<String, String> cfgMap = PropertiesUtil.readProperties("cfg.properties");
        dataSource = getDataSource(cfgMap);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static DriverManagerDataSource getDataSource(Map<String, String> map) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(map.get("jdbc.driverClassName"));
        dataSource.setUrl(map.get("jdbc.url"));
        dataSource.setUsername(map.get("jdbc.username"));
        dataSource.setPassword(map.get("jdbc.password"));
        return dataSource;
    }

    public static List<Map<String, Object>> getAllTableFromDb(String table_schema) {
        String sql = "SELECT table_name FROM information_schema.tables WHERE table_schema = '" + table_schema + "'";
        List<Map<String, Object>> tableNameList = jdbcTemplate.queryForList(sql);
        return tableNameList;
    }
}
