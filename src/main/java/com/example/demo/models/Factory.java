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

@Document("factories")
@Getter @Setter @NoArgsConstructor
public class Factory {

    @Id
    private String _id;
    private String factory_id;
    private String name;
    private String address;


    private List<Camera> cameras = new ArrayList<Camera>();

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;
    
}
