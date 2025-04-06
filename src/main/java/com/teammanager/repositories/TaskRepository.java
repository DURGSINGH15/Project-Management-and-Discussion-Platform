package com.teammanager.repositories;

import com.teammanager.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findByChannelId(String channelId);
    List<Task> findByAssignedTo(String userId);
//  retrieving tasks based on team(getChannelTasks()) or particular user(getUserTasks())
}
