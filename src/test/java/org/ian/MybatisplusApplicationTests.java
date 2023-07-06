package org.ian;

import org.ian.dao.UserDao;
import org.ian.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetAll(){
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }
}
