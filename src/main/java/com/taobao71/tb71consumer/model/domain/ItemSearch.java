package com.taobao71.tb71consumer.model.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.stereotype.Component;

/**
 * keyword 关键词
 * search_id 搜索ID
 */

@Component

public class ItemSearch {
    @TableId
    private String keyword;
    private Long search_id;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getSearch_id() {
        return search_id;
    }

    public void setSearch_id(Long search_id) {
        this.search_id = search_id;
    }
}
