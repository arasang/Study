package park.sangeun.codestudy.technic;

import org.springframework.web.bind.annotation.*;
import park.sangeun.codestudy.technic.model.TransactionReq;
import park.sangeun.codestudy.technic.model.TransactionResp;

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
