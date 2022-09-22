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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MassageEntity {

    @Id
    String id;
    String massage;
    @ManyToOne(cascade = CascadeType.ALL)
    UserEntity userWhoSendMassage;

    @Override
    public String toString() {
        return "UserMassage_{" +
                "id='" + id + '\'' +
                ", massage='" + massage + '\'' +
                '}';
    }
}
