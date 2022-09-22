package com.example.todoservice.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserFriends_ {

    @Id
    String id;
    @ManyToMany(cascade = CascadeType.ALL)
    List<User_> userFriends;


    @Override
    public String toString() {
        return "UserFriends_{" +
                "id='" + id + '\'' +
                '}';
    }
}
