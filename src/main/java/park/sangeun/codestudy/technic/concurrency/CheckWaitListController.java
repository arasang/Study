package park.sangeun.codestudy.technic.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import park.sangeun.codestudy.common.redis.RedisUtils;
import park.sangeun.codestudy.technic.concurrency.model.TransactionReq;


/**
 * @apiNote 거래 요청 시 대기열에 등록함.
 * */
@Slf4j
@RestController
@RequestMapping("/transaction")
public class CheckWaitListController {

    @Value("${redis.key.transaction}")
    private String KEY_TRCN;

    private RedisUtils redisUtils;

    @Autowired
    public CheckWaitListController(RedisUtils redisUtils) {
        this.redisUtils = redisUtils;
    }

    @PostMapping("/checkwait")
    public @ResponseBody void checkWait(@RequestBody TransactionReq request) {
        log.info("[checkWait] key : {}, request : {}", KEY_TRCN, request);
        try {
            redisUtils.add(KEY_TRCN, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
