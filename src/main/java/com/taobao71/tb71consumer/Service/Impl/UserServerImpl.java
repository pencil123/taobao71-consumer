package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.model.domain.User;
import com.taobao71.tb71consumer.Service.UserServer;
import com.taobao71.tb71consumer.mapper.UserMapper;
;

public class UserServerImpl extends ServiceImpl<UserMapper, User> implements UserServer {

  public User getByOpenId(String openID){
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.eq("openid", openID);
    return baseMapper.selectOne(wrapper);
  }
}