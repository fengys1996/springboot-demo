package com.dlut.gson;

import com.dlut.gson.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class testConvertJsonFromObject
{
    public static void main(String[] args)
    {
        List Alist = new ArrayList();
        Alist.add(1);
        Alist.add(2);
        User user1 = new User();
        user1.setAge(22);
        user1.setName("fys");
        user1.setVisitTypeList(Alist);

        User user2 = new User();
        user2.setAge(26);
        user2.setName("zs");
        user2.setVisitTypeList(Alist);

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);

        String  strJson;
        Gson gson = new Gson();
        strJson = gson.toJson(list);



        //System.out.println(strJson);
        log.info("Json is :" + strJson);

        /**
         * 转化为Object,也再次一并测试
         */
        List<User> list1 = gson.fromJson(strJson,new TypeToken<List<User>>(){}.getType());
        log.info("name :" + list1.get(0).getName());
        log.info("age :" + list1.get(0).getAge());
        log.info("age :" + list1.get(0).getVisitTypeList().toString());


    }
}
