package web.homework4.homework4_1.Entity;

import lombok.Data;
import javax.persistence.*;



@Data
@Entity
public class LoginInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;
    private String passWord;
    private String message;

    public LoginInfo(String userName,String passWord,String message){
        this.userName = userName;
        this.passWord = passWord;
        this.message = message;
    }
    public LoginInfo(){

    }
}
