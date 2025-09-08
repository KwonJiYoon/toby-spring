package springbook.user.dao;

public class DaoFactory {
    public UserDao userDao() {
        // 팩토리의 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 준비시킬지 결정
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);
        return dao;
    }
}
