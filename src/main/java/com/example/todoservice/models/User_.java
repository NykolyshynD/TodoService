package com.example.todoservice.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User_ {

    @Id
    String id;
    String name;
    String email;
    String age;
    String password;
    String point;
    String antiPoint;
    boolean showUserBucket;

    @OneToMany(mappedBy = "userWhoHaveTodo")
    List<UserTodo_> userTodoList;

    @OneToMany(mappedBy = "userWhoSendMassage")
    List<UserMassage_> userMassageList;

    @OneToMany(mappedBy = "userWhoHavaItem")
    List<UserItems_> userItemsList;

    @OneToMany(mappedBy = "userWhoHaveBucket")
    List<UserBucket_> userBucketList;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "userFriends")
    List<UserFriends_> userFriendsList;

    public User_(String name, String email, String age, String password, String point, String antiPoint, boolean showUserBucket) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.point = point;
        this.antiPoint = antiPoint;
        this.showUserBucket = showUserBucket;
    }

    @Override
    public String toString() {
        return "User_{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", password='" + password + '\'' +
                ", point='" + point + '\'' +
                ", antiPoint='" + antiPoint + '\'' +
                ", showUserBucket=" + showUserBucket +
                '}';
    }
}
