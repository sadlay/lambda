package com.lay.lambda.function;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.jackson.JsonObjectDeserializer;

import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sixth {
    private static List<Person> personList=Util.personList();

    public static List<Person> findByName(String name){

        return find(person -> name.equals(person.getName()));
    }

    public static List<Person> findBySex(String sex){

        return find(person -> sex.equals(person.getSex()));
    }

    public static List<Person> findByAgeRange(Integer startAge,Integer endAge){
        return find(person -> startAge<=person.getAge()&&endAge>=person.getAge());
    }

    public static List<Person> find(Predicate<Person> predicate){
        return personList.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args){
        //findByName("zhangsan").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
        //findBySex("男").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
        //findByAgeRange(10,50).stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
        //personList.stream().forEach(s-> System.out.println(JSONObject.toJSONString(s)));
        //personList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(s-> System.out.println(JSONObject.toJSONString(s)));
        System.out.println(JSONObject.toJSONString(personList.stream().max(Comparator.comparing(Person::getAge)).get()));
    }
}
