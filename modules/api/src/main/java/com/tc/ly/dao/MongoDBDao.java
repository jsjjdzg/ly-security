package com.tc.ly.dao;

import com.mongodb.MongoClient;
import org.springframework.stereotype.Repository;

/**
 * Created by wangyong on 2016/8/16.
 */
@Repository
public class MongoDBDao {

    private MongoClient mongoClient;

    private String dbName;

}
