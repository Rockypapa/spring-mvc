package com.rocky.mall.mapper;

import com.rocky.mall.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT * FROM t_user WHERE id = #{userId}")
    User getUser(@Param("userId") Integer userId);
   // @Select("select t.*  from t_user t where t.uname like '#{uname}%' ")
    List<User> getLoginUser(@Param("uname") String uname);
}