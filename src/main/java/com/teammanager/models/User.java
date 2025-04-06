package com.teammanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Set;
import java.util.HashSet;

//domain models/entities : have java classes works between services and repositories

//represents each user of the platform
//Used  in: Login, chat, profile view, presence(online or not), GetStream integration etc..
@Data
@Document(collection = "users") //indicates this class maps to a Mongodb collection named "users"
public class User {
    @Id
    private String id;

    private String name;

    @Indexed(unique = true) //index on email: used for faster search + provides uniqueness
    private String email; //used for finding users by email inside database(via repository)

    private String password;

    private String profilePicture;

    private Set<String> channels = new HashSet<>();

    private Set<String> directMessages = new HashSet<>(); //set of individual persons this user is connected to

    private String streamToken; //authenticating with GetStream.io API

    private boolean online;

    private String lastSeen;
}