package com.example.todoservice.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserTodo_ {

    @Id
    String id;
    String todoName;
    String description;
    Date liveTime;

    @ManyToOne(cascade = CascadeType.ALL)
    User_ userWhoHaveTodo;

    public UserTodo_(String todoName, String description, Date liveTime) {
        this.todoName = todoName;
        this.description = description;
        this.liveTime = liveTime;
    }

    @Override
    public String toString() {
        return "UserTodo_{" +
                "id='" + id + '\'' +
                ", todoName='" + todoName + '\'' +
                ", description='" + description + '\'' +
                ", liveTime=" + liveTime +
                '}';
    }
}
