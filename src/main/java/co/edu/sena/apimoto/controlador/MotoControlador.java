package co.edu.sena.apimoto.controlador;

import co.edu.sena.apimoto.entidad.Moto;
import co.edu.sena.apimoto.servicio.MotoServicio;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotoControlador {
    @Autowired
    private MotoServicio motoServicio;

    @PostMapping
    public Moto guardarMoto(@RequestBody Moto moto) {
        System.out.println(moto);
        return motoServicio.guardarMoto(moto);
    }

    @GetMapping("/{id}")
    public Moto obtenerMoto(Principal principal, @PathVariable Long id) {
        return motoServicio.encontrarMotoPorId(id);
    }

    @GetMapping("/total")
    public List<Moto> obtenerTodos() {
        return motoServicio.obtenerTodos();
    }

}
