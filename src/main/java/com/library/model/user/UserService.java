package com.library.model.user;

public interface UserService {
    void insertUser(UserVO vo);

    UserVO getLoginUser(UserVO vo);
}
