package in.healthhepta.repository;


import org.springframework.data.repository.CrudRepository;

import in.healthhepta.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}