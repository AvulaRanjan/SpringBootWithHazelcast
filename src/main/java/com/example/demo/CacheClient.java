package com.example.demo;

import org.springframework.stereotype.Component;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

@Component
class CacheClient {

  public static final String CARS = "cars";
  private final HazelcastInstance hazelcastInstance
              = Hazelcast.newHazelcastInstance();

  public UserBean put(String number, UserBean car){
    IMap<String, UserBean> map = hazelcastInstance.getMap(CARS);
    return map.putIfAbsent(number, car);
  }

  public UserBean get(String key){
    IMap<String, UserBean> map = hazelcastInstance.getMap(CARS);
    return map.get(key);
  }
}