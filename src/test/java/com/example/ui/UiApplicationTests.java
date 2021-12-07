package com.example.ui;

import com.example.ui.dao.DaoUser;
import com.example.ui.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@Slf4j
class UiApplicationTests {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;
    @Test
    void contextLoads() {
//        DaoUser daoUser = new DaoUser(restTemplate);
//        User user = new User();
//        user.setName("Nhi");
//        user.setPhone("0000000000012");
//        user.setPassword("0123456");
//        daoUser.saveUser(user);

    }
    @Test
    void test1(){
//        DaoUser daoUser = new DaoUser(restTemplate);
//        User user = new User();
//        user.setName("Nhi");
//        user.setPhone("0000000000012");
//        user.setPassword("0123456");
//        String rs = daoUser.login(user);
//        log.info(rs);
    }


}
