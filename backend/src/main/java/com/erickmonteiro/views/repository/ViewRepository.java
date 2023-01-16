package com.erickmonteiro.views.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erickmonteiro.views.entities.View;

@Repository
public interface ViewRepository extends JpaRepository<View,Long>{

}
