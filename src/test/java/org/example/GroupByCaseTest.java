package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GroupByCaseTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void countPeopleGroupByAge() {

        User user = new User(1L, "zhangsan1", 18);
        User user2 = new User(2L, "zhangsan2", 19);
        User user3 = new User(3L, "zhangsan3", 19);
        User user4 = new User(4L, "zhangsan4", 20);
        User user5 = new User(5L, "zhangsan5", 20);
        User user6 = new User(6L, "zhangsan6", 20);
        List<User> users = Arrays.asList(user, user2, user3, user4, user5, user6);

        GroupByCase groupByCase = new GroupByCase();
        Map<Integer, Integer> actual = groupByCase.countPeopleGroupByAge(users);
        Map<Integer, Integer> expected = Map.of(18,1,19,2,20,3);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void countPeopleGroupByAge2() {

        User user = new User(1L, "zhangsan1", 18);
        User user2 = new User(2L, "zhangsan2", 19);
        User user3 = new User(3L, "zhangsan3", 19);
        User user4 = new User(4L, "zhangsan4", 20);
        User user5 = new User(5L, "zhangsan5", 20);
        User user6 = new User(6L, "zhangsan6", 20);
        List<User> users = Arrays.asList(user, user2, user3, user4, user5, user6);

        GroupByCase groupByCase = new GroupByCase();
        Map<Integer, Integer> actual = groupByCase.countPeopleGroupByAge2(users);
        Map<Integer, Integer> expected = Map.of(18,1,19,2,20,3);
        assertEquals(expected, actual);
    }
}