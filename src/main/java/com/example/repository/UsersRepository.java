package com.example.repository;

import com.example.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//  mapper 인터페이스와 같은 역할
//  Long 인 이유는 그 클래스에서 id를 어떤 타입으로 지정하였느냐.
//  Users라는 Model에서 Id 를 Long으로 지정했기 때문

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    //  ORM에서 함수이름을 만들면 함수이름대로 쿼리를 실행할수 있게 만들어준다.

    Users findByUserIdAndPassword(String userId, String userPw);

}
