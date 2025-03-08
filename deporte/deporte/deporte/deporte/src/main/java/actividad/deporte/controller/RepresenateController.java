package actividad.deporte.controller;

import actividad.deporte.dto.RepresentanteDTO;
import actividad.deporte.service.RepresentanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/representante")
public class RepresenateController {

    @Autowired
    private RepresentanteService representanteService;

    //guardar informacion
    @PostMapping
    public ResponseEntity<RepresentanteDTO> crear(@RequestBody RepresentanteDTO representanteDTO) {
        RepresentanteDTO createdRepresentante = representanteService.saveRepresentante(representanteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRepresentante);
    }

    //listar
    @GetMapping("/list")
    public List<RepresentanteDTO> getAllRepresentantes() {
        return representanteService.getAllRepresentantes();
    }



}