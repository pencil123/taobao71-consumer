package com.taobao71.tb71consumer.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.stereotype.Component;

/**
 * keyword 关键词
 * search_id 搜索ID
 */

@Component

public class ItemSearch {
    @TableId(type= IdType.AUTO)
    private String keyword;
    private Long searchId;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long searchId) {
        this.searchId = searchId;
    }
}
