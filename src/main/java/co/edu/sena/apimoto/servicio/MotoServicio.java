package co.edu.sena.apimoto.servicio;

import co.edu.sena.apimoto.entidad.Moto;
import co.edu.sena.apimoto.repositorio.MotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoServicio {

    //Realizamos un crud para nuestra moto
    @Autowired
    private MotoRepositorio motoRepositorio;
    public Moto guardarMoto(Moto moto) {
        return motoRepositorio.save(moto);
    }

    public List<Moto> obtenerTodos(){
        return motoRepositorio.findAll();
    }

    public Moto encontrarMotoPorId(Long id) {
        Moto moto = motoRepositorio.findById(id).orElse(null);
        if(null == moto){
            System.out.println("No se encontró la moto que buscas " + id);
            return null;
        }
        return moto;
    }
}
