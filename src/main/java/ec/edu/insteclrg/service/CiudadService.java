package ec.edu.insteclrg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Ciudad;
import ec.edu.insteclrg.domain.Provincia;
import ec.edu.insteclrg.dto.CiudadDTO;
import ec.edu.insteclrg.persistence.CiudadRepository;

@Service
public class CiudadService {

	@Autowired
	private CiudadRepository ciudadRepository;

	public void guardar(CiudadDTO ciudadDto) {
		Ciudad ciudad = new Ciudad();
		ciudad.setId(ciudadDto.getId());
		ciudad.setNombre(ciudadDto.getNombre());

		Provincia provincia = new Provincia();
		provincia.setId(ciudadDto.getProvincia().getId());
		ciudad.setProvincia(provincia);

		ciudadRepository.save(ciudad);
	}
}
