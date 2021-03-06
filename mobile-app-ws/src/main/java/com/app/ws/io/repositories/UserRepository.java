package com.app.ws.io.repositories;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.app.ws.io.entity.UserEntity;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
	
	//all regular CRUD methods are a part of the CrudRepository, no need to define them
	
	UserEntity findByEmail(String email);

	UserEntity findByUserId(String userId);				//Spring will form these queries. Use kerywords- findByFieldName

}
