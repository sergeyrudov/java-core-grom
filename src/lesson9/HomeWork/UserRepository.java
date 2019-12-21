package lesson9.HomeWork;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }
    //2
    public String[] getUserNames() {
        if (users != null) {
            int count = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    count++;
                }
            }

            String[] userNames = new String[count];

            count = 0;

            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    userNames[count] = users[i].getName();
                    count++;
                }
            }

            return userNames;
        }
        return null;

    }

    public long[] getUserIds() {
        if (users != null) {

            int count = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    count++;
                }
            }
            long[] userIds = new long[count];

            count = 0;

            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    userIds[count] = users[i].getId();
                    count++;
                }
            }

            return userIds;
        }
        return null;
    }


    public String getUserNameById(long id) {
        String name = null;
        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getId() == id)
                        name = user.getName();
            }
        }
        return name;
    }
    //3
    public User getUserByName(String name) {
        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getName() == name)
                        return user;
            }
        }
        return null;
    }

    public User getUserById(long id) {

        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getId() == id)
                        return user;
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {

        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getSessionId() == sessionId)
                        return user;
            }
        }
        return null;
    }
    //4
    public User save(User user) {
        if (user != null) {
            if (user.equals(findById(user.getId())))
                return null;
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    return user;
                }
            }
        }
        return null;
    }

    private User findById(long id) {

        if (users != null) {
            int aa = 0;
            for (User user1 : users) {
                if (user1 != null)
                    if (user1.getId() == id)
                        return user1;
            }
        }
        return null;
    }
    //5-6
    public User update(User user) {
        if (user != null)
            if (users != null) {
                User myUser = findById(user.getId());
                if (myUser != null)
                    if (user.getId() == myUser.getId()) {
                        for (int i = 0; i < users.length; i++) {
                            if (users[i] != null)
                                if (users[i].getId() == user.getId()) {
                                    users[i] = user;
                                }
                        }
                        return user;
                    }

            }
        return null;
    }

    public void delete(long id) {
        if (users != null) {
            User myUser = findById(id);
            if (myUser != null)
                if (id == myUser.getId()) {
                    for (int i = 0; i < users.length; i++) {
                        if (users[i] != null)
                            if (users[i].getId() == id) {
                                users[i] = null;
                            }
                    }
                }
        }
    }
}