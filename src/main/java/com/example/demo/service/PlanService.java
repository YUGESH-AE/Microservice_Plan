package com.example.demo.service;

import com.example.demo.entity.Plan;
import com.example.demo.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {

    @Autowired
    PlanRepository planRepository;

    public void insertPlan(Plan plan){
        planRepository.save(plan);
    }

    public Plan getPlan(Integer planId){
        Plan plan=planRepository.findById(planId).get();
        return plan;
    }
}
