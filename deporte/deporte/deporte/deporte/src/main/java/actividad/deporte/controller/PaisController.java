package actividad.deporte.controller;

import actividad.deporte.dto.PaisDTO;
import actividad.deporte.dto.RepresentanteDTO;
import actividad.deporte.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pais")
public class PaisController {
    @Autowired
    private PaisService paisService;

    @PostMapping
    public ResponseEntity<PaisDTO> crear(@RequestBody PaisDTO paisDTO) {
        PaisDTO createdPais = paisService.savePais(paisDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPais);
    }

    //listar
    @GetMapping("/list")
    public List<PaisDTO> getAllPaises() {
        return paisService.getAllPais();
    }


}
