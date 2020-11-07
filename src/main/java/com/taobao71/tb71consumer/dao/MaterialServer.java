package com.taobao71.tb71consumer.dao;

import com.taobao71.tb71consumer.domain.Material;
import org.springframework.stereotype.Component;

@Component
public interface MaterialServer {
    public void addMaterial(Material material);
}
