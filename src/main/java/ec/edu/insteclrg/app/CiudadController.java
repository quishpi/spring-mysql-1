package ec.edu.insteclrg.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.CiudadDTO;
import ec.edu.insteclrg.service.CiudadService;

@RestController
@RequestMapping(value="/api/ciudad/")
public class CiudadController {

	@Autowired
	CiudadService ciudadService;
	
	@PostMapping
	public String nuevo(@RequestBody CiudadDTO ciudadDto) {
		ciudadService.guardar(ciudadDto);
		return "Guardardo Ciudad correctamente";
	}
}
