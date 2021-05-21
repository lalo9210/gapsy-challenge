package com.gapsy.challenge.productoapirest.api.v1.util;

public class ApiRespCodeConstant {
	
	private ApiRespCodeConstant() {
		throw new IllegalStateException("Constants class");
	}

	// MENSAJE|ESTATUS|CODIGO|CODIGO_HTTP
		public static final String CORE_E001 = "Error al transaccionar en base de datos|ERROR|CORE_001|500";
		public static final String CORE_E002 = "Petición mal formada JSON/XML|ERROR|CORE_002|422";
		public static final String CORE_E003 = "Uno o más de los parámetros requeridos no existe en base de datos|ERROR|CORE_003|422";
		public static final String CORE_E004 = "Error interno de la aplicación|ERROR|CORE_004|500";
		public static final String CORE_N001 = "No se encontró información|NOK|CORE_005|200";
		public static final String CORE_N002 = "Recurso no creado, el id ya existe en BDD|NOK|CORE_006|200";
		public static final String CORE_N003 = "Recurso no actualizado, violación de integridad única de datos|NOK|CORE_007|200";
		public static final String CORE_N004 = "Recurso no actualizado, uno o más de los recursos asociados no existe en BDD|NOK|CORE_008|200";
		public static final String CORE_N005 = "Recurso no eliminado, uno o más de los recursos asociados no existe en BDD|NOK|CORE_009|200";
		public static final String CORE_N006 = "Operación fallida, uno o más de los recursos asociados no existe en BDD|NOK|CORE_010|200";
		public static final String CORE_N007 = "El recurso solicitado no existe. |NOK|CORE_011|404";
		public static final String CORE_N008 = "Se requiere que los paramétros de la URL tengan una estrutura correcta (revise contrato de interfaz)|NOK|CORE_N008|400";
		public static final String CORE_N009 = "Se requiere que la propiedad X de la petición tenga una estrutura correcta|NOK|CORE_N009|400";
		public static final String CORE_O000 = "Operación realizada correctamente|OK|CORE_000|200";
		
}
