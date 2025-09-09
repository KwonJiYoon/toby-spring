package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 애플리케이션 컨텍스트 또는 빈 팩토리가 사용할 설정 정보라는 표시
@Configuration
public class DaoFactory {

    // 오브젝트 생성을 담당하는 IoC용 메소드라는 표시
    @Bean
    public UserDao userDao() {
        // 팩토리의 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 준비시킬지 결정
        return new UserDao(connectionMaker());
    }

    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }

    @Bean
    // 분리해서 중복을 제거한 ConnectionMaker 타입 오브젝트 생성 코드
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}



