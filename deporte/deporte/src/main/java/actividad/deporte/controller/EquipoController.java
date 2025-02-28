package actividad.deporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import actividad.deporte.dto.EquipoDTO;
import actividad.deporte.service.EquipoService;
@RestController
@RequestMapping("equipos")
public class EquipoController {

	@Autowired
    private  EquipoService equipoService;

    @PostMapping
    public ResponseEntity<EquipoDTO> crearEquipo(@RequestBody EquipoDTO equipoDTO) {
        EquipoDTO equipoGuardado = equipoService.saveEquipo(equipoDTO);
        return new ResponseEntity<>(equipoGuardado, HttpStatus.CREATED);
    }
}
