package park.sangeun.codestudy.common.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import park.sangeun.codestudy.technic.concurrency.model.TransactionReq;

@Component
@Slf4j
public class RedisUtils {
    private final static int MAX_SIZE = 100000;

    private final RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public RedisUtils(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void add(String key, TransactionReq request) {
        if (getCurrentSize(key) >= MAX_SIZE) throw new OutOfMemoryError();

        long now = System.currentTimeMillis();
        try {
            redisTemplate.opsForZSet().add(key, request, now);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void get(String key) {
        redisTemplate.opsForZSet().range(key, 0, 0).iterator().next();
        log.info("#1 test : {}", redisTemplate.opsForZSet().range(key, 0, 0).iterator().next());

    }

    private long getCurrentSize(String key) {
        if (redisTemplate.opsForZSet().size(key) == null) {
            return 0;
        }

        return redisTemplate.opsForZSet().size(key);
    }
}
