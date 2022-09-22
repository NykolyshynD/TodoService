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
public class UserItems_ {

    @Id
    String id;
    String itemName;
    String itemBoost;
    String itemPrice;

    @OneToMany(mappedBy = "userItem")
    List<UserBucket_> userItemInBucket;

    @ManyToOne(cascade = CascadeType.ALL)
    User_ userWhoHavaItem;

    @Override
    public String toString() {
        return "UserItems_{" +
                "id='" + id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemBoost='" + itemBoost + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }
}
