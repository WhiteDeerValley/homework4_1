package web.homework4.homework4_1.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import web.homework4.homework4_1.Entity.Contact;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    List<Contact> findByName(String name);
    List<Contact> findAll();
    List<Contact> findByTelephone(String tel);

    Object findAll(Pageable pageable);
}