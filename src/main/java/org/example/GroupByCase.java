package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCase {


    //1. 按照年龄分组，统计每个年龄的人数
    public Map<Integer, Integer> countPeopleGroupByAge(List<User> users) {
        Map<Integer, Integer> result = new HashMap<>();
        for (User user : users) {
            Integer age = user.getAge();
            Integer count = result.get(age);
            if (count == null) {
                count = 0;
            }
            count++;
            result.put(age, count);
        }
        return result;
    }

    public Map<Integer, Integer> countPeopleGroupByAge2(List<User> users) {
        Map<Integer, Integer> result = new HashMap<>();
        for (User user : users) {
            Integer age = user.getAge();
            Integer count = result.getOrDefault(age, 0);
            count++;
            result.put(age, count);
        }
        return result;
    }

    public Map<Integer, Integer> countPeopleGroupByAge3(List<User> users) {
        Map<Integer, Integer> result = new HashMap<>();

        return result;
    }

    public Map<Integer, Integer> countPeopleGroupByAge4(List<User> users) {
        Map<Integer, Integer> result = new HashMap<>();
        users.stream().collect(Collectors.groupingBy(User::getAge)).forEach((age, list) -> {
            result.put(age, list.size());
        });
        return result;
    }


    //2. 按照性别分组，统计每个性别的人数
    //3. 按照性别分组，统计每个性别的平均年龄
    //4. 按照性别分组，统计每个性别的平均分数
    //5. 按照性别分组，统计每个性别的最大分数
    //6. 按照性别分组，统计每个性别的最小分数


}
