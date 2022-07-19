package ec.edu.insteclrg.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.service.ProvinciaService;

@RestController
@RequestMapping(value="/api/provincia/")
public class ProvinciaController {

	@Autowired
	ProvinciaService provinciaService;
	
	@PostMapping
	public String nuevo(@RequestBody ProvinciaDTO provinciaDto) {
		provinciaService.guardar(provinciaDto);
		return "Guardardo correctamente";
	}
}
