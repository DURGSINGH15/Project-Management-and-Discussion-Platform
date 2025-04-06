package com.teammanager.repositories;

import com.teammanager.models.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//***Spring data MongoDB parses the method name and translates it into the corresponding MongoDB query
//***SPRING injects implementation into interfaces at runtime using proxy beans.

@Repository
public interface ChannelRepository extends MongoRepository<Channel, String> {
    List<Channel> findByMembersContaining(String userId);
    //finds channel where given user is a member

    boolean existsByName(String name);
    //avoids creating duplicate channel names(will be used in ChannelService => createChannel())

    List<Channel> findByNameContainingIgnoreCase(String name);
    //helps implement a search bar to find channels with a fuzzy match.

}
