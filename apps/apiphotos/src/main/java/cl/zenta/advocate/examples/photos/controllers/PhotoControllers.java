package cl.zenta.advocate.examples.photos.controllers;

import cl.zenta.advocate.examples.photos.model.Photo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/photos")
public class PhotoControllers {


    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public List<Photo> findById( String idUsuario ){

        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo( "1","1.jpg","Imagen 1 ","http://link1","12-01-2019" ));
        photos.add(new Photo( "2","2.jpg","Imagen 2 ","http://link2","12-01-2019" ));
        photos.add(new Photo( "3","3.jpg","Imagen 3 ","http://link3","12-01-2019" ));
        photos.add(new Photo( "4","4.jpg","Imagen 4 ","http://link4","12-01-2019" ));
        return photos;

    }
}
