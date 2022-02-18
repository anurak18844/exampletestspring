package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("cameras")
@Getter @Setter @NoArgsConstructor
public class Camera {
    @Id
    private String _id;
    private String camera_id;
    private String name;
    private String location;
    private String factory_id;

    private List<Event> events = new ArrayList<Event>();

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;
    
}
