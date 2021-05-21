package com.gapsy.challenge.productoapirest.api.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gapsy.challenge.productoapirest.api.v1.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, String>{

}