package com.shahbaz.repository;

import org.springframework.data.repository.CrudRepository;

import com.shahbaz.model.MemeItem;

public interface IMemeRepository extends CrudRepository<MemeItem, Long>{

}
