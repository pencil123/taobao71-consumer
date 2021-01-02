package com.taobao71.tb71consumer.dao.Impl;

import com.taobao71.tb71consumer.dao.ItemSearchServer;
import com.taobao71.tb71consumer.domain.ItemSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Objects;

@Service
public class ItemSearchServerImpl implements ItemSearchServer {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    static Logger logger = LoggerFactory.getLogger(ItemSearchServerImpl.class);
    public Integer itemExistRetrunId(Long item_id) {
        try {
            String sqlString = "select id from item_search where item_id = ?";
            Integer id = jdbcTemplate.queryForObject(sqlString, Integer.class, item_id);
            return id;
        }catch (Exception e){
            return 0;
        }
    }

    public Integer addItemSearch(ItemSearch itemSearch){
        // 判断数据库中是否已经存在；如果已经存储
        Integer id = itemExistRetrunId(itemSearch.getItem_id());
        if(id > 0) {return id;}

        logger.info("ItemImpl info:{}",itemSearch.toString());
        //如果数据库中没有存储；
        try {
            String sqlString = "insert into item_search (item_id,title,provcity,seller_id,category_name," +
                "level_one_category_name,free_shipment,superior_brand,user_type," +
                "zk_final_price) values(?,?,?,?,?,?,?,?,?,?)";
            KeyHolder holder = new GeneratedKeyHolder();
            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(sqlString, Statement.RETURN_GENERATED_KEYS);
                ps.setLong(1,itemSearch.getItem_id());
                ps.setString(2, itemSearch.getTitle());
                ps.setString(3,itemSearch.getProvcity());
                ps.setLong(4, itemSearch.getSeller_id());
                ps.setString(5, itemSearch.getCategory_name());
                ps.setString(6, itemSearch.getLevel_one_category_name());
                ps.setBoolean(7,itemSearch.getFree_shipment());
                ps.setString(8, itemSearch.getSuperior_brand());
                ps.setInt(9,itemSearch.getUser_type());
                ps.setString(10, itemSearch.getZk_final_price());
                return ps;
            }, holder);
            id = Objects.requireNonNull(holder.getKey()).intValue();
        } catch (InvalidResultSetAccessException e) {
            logger.warn("Dao#数据写入失败:InvalidResultSetAccessException: {}",e.toString());
        } catch (DataAccessException e) {
            logger.warn("Dao#数据写入失败:DataAccessException; {}",e.toString());
        }
        return Integer.valueOf(id);
    }
}
