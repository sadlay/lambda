package com.lay.lambda.function;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Fifth {
    private static List<Person> personList=Util.personList();

    public static List<Person> findByName(String name){

        return find(person -> name.equals(person.getName()));
    }

    public static List<Person> findBySex(String sex){

        return find(person -> sex.equals(person.getSex()));
    }

    public static List<Person> find(Predicate<Person> predicate){
        return personList.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args){
        findByName("zhangsan").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
        findBySex("男").stream().forEach(p-> System.out.println(JSONObject.toJSONString(p)));
    }
}
