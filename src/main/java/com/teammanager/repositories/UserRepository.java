package com.teammanager.repositories;

//Starting with data access layer from database operations ----->
import com.teammanager.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional; //handles null values and avoid NullPointer exception

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    boolean existsByEmail(String email); //is any user with this email exits(to be used in Authentication Service during SignUP)
    Optional<User> findByEmail(String email);
    //will be used during Login process, to fetch user by email and further generating jwt token which will be sent to user in response created
}
