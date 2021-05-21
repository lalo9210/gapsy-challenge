package com.gapsy.challenge.productoapirest.api.v1.service.impl;

import static com.gapsy.challenge.productoapirest.api.v1.util.ApiRespCodeConstant.CORE_O000;
import static com.gapsy.challenge.productoapirest.api.v1.util.ApiRespCodeConstant.CORE_N007;
import static com.gapsy.challenge.productoapirest.api.v1.util.ApiRespCodeConstant.CORE_E001;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gapsy.challenge.productoapirest.api.v1.entity.Producto;
import com.gapsy.challenge.productoapirest.api.v1.repository.ProductoRepository;
import com.gapsy.challenge.productoapirest.api.v1.service.ProductoService;
import com.gapsy.challenge.productoapirest.api.v1.util.RespuestaDTO;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public RespuestaDTO obtenerProductoPorId(String idArticulo) {
		
		RespuestaDTO respuesta = new RespuestaDTO();
				
		Optional<Producto> producto = productoRepository.findById(idArticulo);
		if(producto.isPresent()) {
			respuesta.separarMensaje(CORE_O000);
			respuesta.setResultado(producto.get());
		}else {
			respuesta.separarMensaje(CORE_N007);
		}
		
		return respuesta;
	}

	@Override
	public RespuestaDTO actualizarProducto(String idArticulo, Producto productoDto) {
		
		RespuestaDTO respuesta = new RespuestaDTO();
		
		Optional<Producto> producto = productoRepository.findById(idArticulo);
		if(producto.isPresent()) {
			
			producto.get().setDescripcion(productoDto.getDescripcion());
			producto.get().setModelo(productoDto.getModelo());
			
			try {
				productoRepository.save(producto.get());
				
				respuesta.separarMensaje(CORE_O000);
				respuesta.setResultado(producto.get());
			}catch(Exception ex) {
				respuesta.separarMensaje(CORE_E001);
			}
			
		}else {
			respuesta.separarMensaje(CORE_N007);
		}
		
		return respuesta;

	}

}
