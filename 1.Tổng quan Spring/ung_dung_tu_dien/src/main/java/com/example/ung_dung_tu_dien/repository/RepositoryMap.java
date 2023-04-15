package com.example.ung_dung_tu_dien.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositoryMap {
    static Map<String, String> exchangeEnFromVn =new HashMap<>();
    static  {
        exchangeEnFromVn.put("một", "one");
        exchangeEnFromVn.put("hai", "two");
        exchangeEnFromVn.put("ba", "three");
        exchangeEnFromVn.put("bốn", "four");
        exchangeEnFromVn.put("năm", "five");
        exchangeEnFromVn.put("sáu", "six");
    }
    public static String findByKey(String vn ){
        return exchangeEnFromVn.get(vn);
    }

}
