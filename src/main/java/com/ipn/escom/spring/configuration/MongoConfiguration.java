package com.ipn.escom.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.ipn.escom.spring.repository")
@PropertySource(value = {"classpath:appProperties.properties"})
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Autowired
    private Environment environment;

    @Override
    protected String getDatabaseName() {
        return environment.getRequiredProperty("mongo.database");
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient(environment.getRequiredProperty("mongo.url"),
                environment.getProperty("mongo.port", Integer.class));
    }

    @Bean
    @Override
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.ipn.escom.spring";
    }
}
