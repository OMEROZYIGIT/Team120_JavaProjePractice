package day04_ProjePractice;

import java.time.LocalDateTime;

public class User {

    // 1- Bir user(Kullanıcı) class oluşturun.

    // fields: name ,
    // registerDate(kayıtZamanı) (LocalDateTime cinsinden)
    String name;
    LocalDateTime registerDate;

    // parametreli cons. oluşturuldu.
    public User(String name, LocalDateTime registerDate) {

        this.name = name;
        this.registerDate = registerDate;

    }
}
