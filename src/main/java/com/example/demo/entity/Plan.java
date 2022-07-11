package com.example.demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "plan_details")
public class Plan {
    @Id
    @Column(name = "plan_id", nullable = false)
    Integer planId;
    @Column(name = "plan_name", nullable = false, length = 50)
    String planName;
    @Column(name = "national_rate", nullable = false)
    Integer nationalRate;
    @Column(name = "local_rate", nullable = false)
    Integer localRate;
}
