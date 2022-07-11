package com.example.demo.controller;

import com.example.demo.entity.Plan;
import com.example.demo.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plan")
public class PlanController {

    @Autowired
    PlanService planService;


    @PostMapping(value = "/insert",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Plan insertPlan(@RequestBody Plan plan){
        planService.insertPlan(plan);
        Plan plan1=planService.getPlan(plan.getPlanId());
        return plan1;
    }

    @GetMapping(value = "/get/{planId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Plan getOnePlan(@PathVariable("planId") Integer planId){
        return planService.getPlan(planId);
    }


}
