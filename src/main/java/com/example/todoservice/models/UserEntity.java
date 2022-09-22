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
public class UserEntity {

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
    List<TodoEntity> userTodoList;

    @OneToMany(mappedBy = "userWhoSendMassage")
    List<MassageEntity> userMassageList;

    @OneToMany(mappedBy = "userWhoHavaItem")
    List<ItemsEntity> userItemsList;

    @OneToMany(mappedBy = "userWhoHaveBucket")
    List<BucketEntity> userBucketList;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "userFriends")
    List<FriendsEntity> userFriendsList;

    public UserEntity(String name, String email, String age, String password, String point, String antiPoint, boolean showUserBucket) {
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
