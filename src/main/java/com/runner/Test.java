package com.runner;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @author runner
 * @create 2020-06-08 20:27
 */
public class Test {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.88.130",6379);
        Jedis jedis2 = new Jedis("192.168.88.130",6380);
//        jedis.flushAll();
        System.out.println(jedis2.ping());

        jedis2.slaveof("192.168.88.130",6379);

        jedis.set("k0","v0");
        System.out.println(jedis2.get("k0"));


//        jedis.set("k1","v1");
//        Transaction transaction = jedis.multi();
//        jedis.watch("k1");
//        transaction.set("k2","v2");
//        transaction.set("k3","v3");
//        transaction.set("k4","v4");
//        transaction.discard();
//        if (!jedis.get("k1").equals("v1")){
//            jedis.unwatch();
//            System.out.println("false");
//        }

//        System.out.println(jedis.get("k2"));
//        jedis.flushDB();
    }
}
