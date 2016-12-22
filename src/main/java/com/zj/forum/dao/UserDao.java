package com.zj.forum.dao;

import com.zj.forum.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhujun on 2016/11/27.
 */
@Repository
public class UserDao extends BaseDao<User>{
    public List queryUser(User user){
        String queryString= "select count(*) from User user where user.userName=:username and " +
                "user.password =:password";
        String[] params = new String[]{"username","password"};
        String[] values = new String[]{user.getUserName(),user.getPassword()};
        List list = getHibernateTemplate().findByNamedParam(queryString, params, values);
        return list;
    }
}
