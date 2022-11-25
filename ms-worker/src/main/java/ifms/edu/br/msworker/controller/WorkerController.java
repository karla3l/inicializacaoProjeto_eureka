package ifms.edu.br.msworker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifms.edu.br.msworker.model.Worker;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    @GetMapping()
    public ResponseEntity<Worker> getWorker ()  {
      Worker worker = new Worker("Zezinho", 100.000);
        return ResponseEntity.ok(worker);
    }

    //@GetMapping("/{id}/salary")
    //public ResponseEntity<Double> getSalaryWorker (@PathVariable Integer id) {
    //var worker = new Worker(id);
    //return ResponseEntity.ok(worker.getSalary());
    }

