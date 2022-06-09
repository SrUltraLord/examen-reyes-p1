package ec.edu.espe.arqui.reyesexamenp1.controller;

import ec.edu.espe.arqui.reyesexamenp1.service.EspacioService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/espacio")
@RequiredArgsConstructor
public class EspacioController {
    private final EspacioService espacioService;

    @PostMapping("/{espacioId}/agregar/usuario/{usuarioId}")
    public ResponseEntity<String> agregarUsuario(
            @PathVariable Integer espacioId,
            @PathVariable Integer usuarioId) {
        espacioService.agregarUsuario(espacioId, usuarioId);
        return ResponseEntity.ok("Espacio Usuario creado");
    }
}
