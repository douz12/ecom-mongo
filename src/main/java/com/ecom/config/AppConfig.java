package com.ecom.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver;

@Configuration
@EnableMongoRepositories("com.ecom.repository")
public class AppConfig extends AbstractMongoConfiguration{

    @Override
    protected String getDatabaseName() {
        return "ecom";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost", 27017);
    }
}
