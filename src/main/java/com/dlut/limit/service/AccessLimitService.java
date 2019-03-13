package com.dlut.limit.service;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Service;

@Service
public class AccessLimitService {
    //每秒只能发出五个令牌
    RateLimiter rateLimiter = RateLimiter.create(5);

    /**
     * 尝试获取令牌
     */
    public boolean tryAcquire()
    {
        return rateLimiter.tryAcquire();
    }

}
