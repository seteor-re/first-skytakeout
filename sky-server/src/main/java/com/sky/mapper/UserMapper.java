package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {

    /**
     * 根据openid获取用户对象
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 新增用户
     * @param user
     */
    void insert(User user);

    /**
     * 根据主键查找
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{id}")
    User getById(Long userId);

    /**
     * 动态条件统计用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
