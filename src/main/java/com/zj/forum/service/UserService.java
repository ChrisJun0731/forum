package com.zj.forum.service;

import com.zj.forum.dao.LoginLogDao;
import com.zj.forum.dao.UserDao;
import com.zj.forum.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhujun on 2016/11/27.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginLogDao loginLogDao;

    public void register(User user){
        userDao.save(user);
    }

//    public User getUserByUserName(String userName){
//        return userDao.getUserByUserName(userName);
//    }

//    public User getUserById(int userId){
//        return userDao.get(userId);
//    }

//    public void lockUser(String userName){
//        User user = userDao.getUserByUserName(userName);
//        user.setLocked(User.USER_LOCK);
//        userDao.update(user);
//    }

//    public void unlockUser(String userName){
//        User user = userDao.getUserByUserName(userName);
//        user.setLocked(User.USER_UNLOCK);
//        userDao.update(user);
//    }

//    public List<User> queryUserByUserName(String userName){
//        return userDao.queryUserByUserName(userName);
//    }

//    public void loginSuccess(User user){
//        user.setCredit(5+user.getCredit());
//        LoginLog loginLog = new LoginLog();
//        loginLog.seetUser(user);
//        loginLog.setIp(user.getLastIp());
//        loginLog.setLoginDate(new Date());
//        userDao.update(user);
//        loginLLogDao.save(loginLog);
//    }
    // add by zj 16/12/17
    public Boolean existsUser(User user){
        List list = userDao.queryUser(user);
        if((Long)list.get(0) > 0)
            return true;
        else
            return false;
    }
}
