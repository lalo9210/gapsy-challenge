package com.gapsy.challenge.productoapirest.api.v1.service;

import com.gapsy.challenge.productoapirest.api.v1.entity.Producto;
import com.gapsy.challenge.productoapirest.api.v1.util.RespuestaDTO;

public interface ProductoService {
	
	RespuestaDTO obtenerProductoPorId(String idActividad);
	RespuestaDTO actualizarProducto(String idArticulo, Producto productoDto);

}
