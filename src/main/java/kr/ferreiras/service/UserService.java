package kr.ferreiras.service;

import kr.ferreiras.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
