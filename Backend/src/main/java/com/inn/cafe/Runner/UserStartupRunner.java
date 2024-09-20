package com.inn.cafe.Runner;


import com.inn.cafe.POJO.User;
import com.inn.cafe.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserStartupRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserStartupRunner.class);


    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        log.info("Checking if admin user exists...");

        User user = userDao.findByName("admin");
        if (user == null) {
            log.info("Admin user not found. Creating admin user...");
            User adminUser = new User();
            adminUser.setName("admin");
            adminUser.setEmail("admin@gmail.com");
            adminUser.setContactNumber("1111111111");
            adminUser.setPassword(passwordEncoder.encode("123"));
            adminUser.setStatus("true");
            adminUser.setRole("admin");

            userDao.save(adminUser);
            log.info("Admin user created successfully.");
        }
        else {
            log.info("Admin user already exists.");
        }
    }
}
