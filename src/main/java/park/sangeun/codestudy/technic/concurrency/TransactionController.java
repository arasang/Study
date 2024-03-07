package park.sangeun.codestudy.technic.concurrency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import park.sangeun.codestudy.common.redis.RedisUtils;
import park.sangeun.codestudy.technic.concurrency.model.TransactionReq;
import park.sangeun.codestudy.technic.concurrency.model.TransactionResp;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    RedisUtils utils;

    @Value("${redis.key.transaction}")
    private String key;

    @PostMapping("/request")
    public @ResponseBody
    TransactionResp request(@RequestBody TransactionReq request){
        TransactionResp response = new TransactionResp();

        utils.get(key);


        return response;
    }
}
