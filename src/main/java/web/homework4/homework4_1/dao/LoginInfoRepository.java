package web.homework4.homework4_1.dao;


import org.springframework.data.repository.CrudRepository;
import web.homework4.homework4_1.Entity.LoginInfo;

import java.util.List;

public interface LoginInfoRepository extends CrudRepository<LoginInfo, Long> {
    List<LoginInfo> findByUserName(String username);
}
