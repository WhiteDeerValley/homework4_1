package web.homework4.homework4_1.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String telephone;
    private String email;
    private String address;
    private String qq;
    private String nickName;


    public Contact(String name,String telephone,String email,String address,String qq,String nickName)
    {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.qq = qq;
        this.nickName = nickName;
    }
    public Contact(){

    }

}
