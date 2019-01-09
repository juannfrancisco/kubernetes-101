package cl.zenta.advocate.examples.users.controllers;

import cl.zenta.advocate.examples.users.model.Photo;
import cl.zenta.advocate.examples.users.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Value("${api.photos.url}")
    private String apiPhotos;

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public User findById(String idUsuario ){

        User user = new User("123", "juanfrancisco", null);

        RestTemplate restTemplate = new RestTemplate();

        Photo[] photos = restTemplate.getForObject(apiPhotos + "/api/v1/photos/"+ "123", Photo[].class);

        user.setPhotos(photos);

        return user;

    }
}
