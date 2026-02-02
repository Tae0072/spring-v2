package com.example.boardv1.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(UserRepository.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    // @Test
    // public void save_fail_test() {
    // // given
    // User user = new User(); // 비영속 객체
    // user.setUsername("cos");
    // -----cos가 유일 더미 데이터로 입력되어 있기에 오류가 발생한다. (ssar도마찬가지)User에서 unique로 설정을 해 두었기에
    // user.setPassword("1234");
    // user.setEmail("cos@nate.com");
    // // when
    // User fiUser = userRepository.save(user);
    // // eye
    // System.out.println(fiUser);
    // }

    @Test
    public void save_test() {
        // given
        User user = new User(); // 비영속 객체
        user.setUsername("love");
        user.setPassword("1234");
        user.setEmail("love@nate.com");
        // when
        User fiUser = userRepository.save(user);
        // eye
        System.out.println(fiUser);
    }

    @Test
    public void findByUsername_test() {
        // given
        String username = "cos";
        // when
        User findUser = userRepository.findByUsername(username);
        // eye
        System.out.println(findUser);
    }
}
// given
// when
// eye
