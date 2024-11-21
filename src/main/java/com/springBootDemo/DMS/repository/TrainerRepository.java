package com.springBootDemo.DMS.repository;

/**
 * @author S572178 Ceemarla Yogeshwar Reddy
 */

import org.springframework.data.repository.CrudRepository;

import com.springBootDemo.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
