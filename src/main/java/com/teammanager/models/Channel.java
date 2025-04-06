package com.teammanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Set;
import java.util.HashSet;
import java.time.LocalDateTime;

//Represents a chat channel/project room.
// Used in: Chat sidebar, joining/creating channels, permission handling, and task display inside channels.
@Data
@Document(collection = "channels") //indicates this class maps to a Mongodb collection named "channels"
public class Channel {
    @Id
    private String id;

    private String name;

    private String description;

    private String createdBy; //admin id

    private LocalDateTime createdAt; //timestamp

    private Set<String> members = new HashSet<>(); //set of member ids which are part of the channel

    private Set<String> pendingRequests = new HashSet<>();

    private Set<Task> tasks = new HashSet<>();

    private boolean isPrivate = false;
}