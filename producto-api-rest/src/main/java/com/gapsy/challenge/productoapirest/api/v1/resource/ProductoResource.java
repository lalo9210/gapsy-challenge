package com.gapsy.challenge.productoapirest.api.v1.resource;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gapsy.challenge.productoapirest.api.v1.entity.Producto;
import com.gapsy.challenge.productoapirest.api.v1.repository.ProductoRepository;
import com.gapsy.challenge.productoapirest.api.v1.service.ProductoService;
import com.gapsy.challenge.productoapirest.api.v1.util.ResourceNotFoundException;
import com.gapsy.challenge.productoapirest.api.v1.util.RespuestaDTO;

@Component
@Path("/api/v1/productos")
public class ProductoResource {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	ProductoService productoService;
	
	@GET
	@Produces("application/json")
	@Path("/{idArticulo}")
	public RespuestaDTO obtenerProductoPorId(@PathParam(value = "idArticulo") String idArticulo) {
		
		return productoService.obtenerProductoPorId(idArticulo);
		
	}
	
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/{idArticulo}")
	public RespuestaDTO actualizarProducto(@PathParam(value = "idArticulo") String idArticulo,
			@Valid @RequestBody Producto productoDto){
		return productoService.actualizarProducto(idArticulo, productoDto);
	}

	@DELETE
	@Path("/{idArticulo}")
	public Map<String, Boolean> eliminarProducto(@PathParam(value = "idArticulo") String idArticulo)
			throws ResourceNotFoundException {
		Producto producto = productoRepository.findById(idArticulo)
				.orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado :: " + idArticulo));

		productoRepository.delete(producto);
		
		Map<String, Boolean> response = new HashMap<>();
		
		response.put("borrado", Boolean.TRUE);
		return response;
	}

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/")
	@PostMapping("/")
	public Producto crearProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
}
