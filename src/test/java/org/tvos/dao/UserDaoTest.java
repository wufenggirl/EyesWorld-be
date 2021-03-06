package org.tvos.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/8/2.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml","classpath:spring/mybatis-config.xml"})
public class UserDaoTest {
    @Test
    public void getUsername() throws Exception {
        System.out.println(userDao.getUsername(Long.valueOf(String.valueOf(3))));

    }

    @Test
    public void getPassword() throws Exception {
        System.out.println(userDao.getPassword("Mike"));
    }


    @Autowired
    UserDao userDao;

    /**
     * done
     * @throws Exception
     */
    @Test
    public void uniqueUsername() throws Exception {
        System.out.println(userDao.uniqueUsername("Lily"));

    }

    @Test
    public void insert() throws Exception {
        System.out.println(userDao.insert("Lily","123456"));
    }

    @Test
    public void updatePassword() throws Exception {
        System.out.println(userDao.insert("Lily","123457"));
    }
}