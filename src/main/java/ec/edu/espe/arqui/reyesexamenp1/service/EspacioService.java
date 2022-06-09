package ec.edu.espe.arqui.reyesexamenp1.service;

import ec.edu.espe.arqui.reyesexamenp1.dao.EspacioRepository;
import ec.edu.espe.arqui.reyesexamenp1.dao.UsuarioEspacioRepository;
import ec.edu.espe.arqui.reyesexamenp1.dao.UsuarioRepository;
import ec.edu.espe.arqui.reyesexamenp1.exception.EntitiyNotFoundException;
import ec.edu.espe.arqui.reyesexamenp1.model.Espacio;
import ec.edu.espe.arqui.reyesexamenp1.model.Usuario;
import ec.edu.espe.arqui.reyesexamenp1.model.UsuarioEspacio;
import ec.edu.espe.arqui.reyesexamenp1.model.UsuarioEspacioPk;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspacioService {
    private final UsuarioRepository usuarioRepository;
    private final EspacioRepository espacioRepository;
    private final UsuarioEspacioRepository usuarioEspacioRepository;

    public void agregarUsuario(Integer codEspacio, Integer codUsuario) {
        Usuario usuarioDb = usuarioRepository.findById(codUsuario)
                .orElseThrow(() -> new EntitiyNotFoundException(
                        "No se ha encontrado un usuario con el id " + codUsuario));
        Espacio espacioDb = espacioRepository.findById(codEspacio)
                .orElseThrow(() -> new EntitiyNotFoundException(
                        "No se ha encontrado un espacio con el id " + codEspacio));

        UsuarioEspacio usuarioEspacio = usuarioEspacioRepository.findByCodEspacioAndCodUsuario(
                espacioDb, usuarioDb
        );

        if (usuarioEspacio != null) {
            throw new RuntimeException(
                    "El usuario ya se encuentra en el espacio."
            );
        }

        usuarioEspacio = new UsuarioEspacio(
                new UsuarioEspacioPk(codEspacio, codUsuario));

        usuarioEspacio.setEstado("ACT");

        usuarioEspacioRepository.save(usuarioEspacio);
    }
}