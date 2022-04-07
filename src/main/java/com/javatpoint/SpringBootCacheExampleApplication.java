package com.javatpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//enabling caching
@EnableCaching
@EnableScheduling
public class SpringBootCacheExampleApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootCacheExampleApplication.class, args);
}
}
