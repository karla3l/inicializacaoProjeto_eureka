package ifms.edu.br.mspayroll.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifms.edu.br.mspayroll.model.Payment;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping(value = "/{days}")
    public ResponseEntity<Payment>getPayment(@PathVariable Integer days){
        return ResponseEntity.ok(payment);

    }  
}
