package com.javatpoint.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CacheService {

    @Autowired
    CacheManager cacheManager;

    public void refreshAllCaches() {
        cacheManager.getCacheNames().stream()
          .forEach(cacheName -> cacheManager.getCache("customerInfo").clear());
        // reload whole dataset here, dummy example here:
//        dataRepository.findAll().forEach(a -> cacheManager.getCache("cache-name")).put(a.getKey(), a));
//        cacheManager.getCacheNames().clear();
    }

//    @Scheduled(cron = "[Seconds] [Minutes] [Hours] [Day of month] [Month] [Day of week] [Year]")
    // In milliseconds
//    @Scheduled(fixedDelay = 6000)
    @Scheduled(cron="0 28 13 * * ?")// Fires at 12 PM every day
    public void refreshAllcachesAtIntervals() {
        System.out.println("====="+ LocalDateTime.now());
        refreshAllCaches();

    }

}