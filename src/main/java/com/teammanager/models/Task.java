package com.teammanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

//Represents a task assigned to a team member.
// Used in: Project task manager UI, channel dashboard, notifications etc..
@Data
@Document(collection = "tasks")//indicates this class maps to a Mongodb collection named "tasks"
public class Task {
    @Id
    private String id;

    private String title;

    private String description;

    private String assignedTo;

    private String assignedBy;

    private String channelId;

    private String status; // PENDING, IN_PROGRESS, COMPLETED

    private LocalDateTime dueDate;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private int priority; // 1-5 (5 being highest)
}