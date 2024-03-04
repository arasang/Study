package park.sangeun.codestudy.technic.concurrency;


import org.springframework.web.bind.annotation.*;
import park.sangeun.codestudy.technic.concurrency.model.TransactionReq;
import park.sangeun.codestudy.technic.concurrency.model.TransactionResp;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping("/request")
    public @ResponseBody
    TransactionResp request(@RequestBody TransactionReq request){
        TransactionResp response = new TransactionResp();

        return response;
    }
}
