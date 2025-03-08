package actividad.deporte.controller;

import actividad.deporte.dto.PatrocinadorDTO;
import actividad.deporte.service.PatrocinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patrocinadores")
public class PatrocinadorController {

    @Autowired
    private PatrocinadorService patrocinadorService;

    @PostMapping
    public ResponseEntity<PatrocinadorDTO> crearPatrocinador(@RequestBody PatrocinadorDTO patrocinadorDTO) {
        PatrocinadorDTO patrocinadorGuardado = patrocinadorService.saveEquipo(patrocinadorDTO);
        return new ResponseEntity<>(patrocinadorGuardado, HttpStatus.CREATED);
    }
}
