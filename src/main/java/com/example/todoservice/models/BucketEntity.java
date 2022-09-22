package com.example.todoservice.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BucketEntity {

    @Id
    String id;
    int bucketSize;
    long countSumThingsInBucket;

    @ManyToOne(cascade = CascadeType.ALL)
    UserEntity userItem;

    @ManyToOne(cascade = CascadeType.ALL)
    UserEntity userWhoHaveBucket;
}
