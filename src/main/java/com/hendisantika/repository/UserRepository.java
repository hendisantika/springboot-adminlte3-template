package com.hendisantika.repository;

import com.hendisantika.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-adminlte3-template
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/22
 * Time: 14:06
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
