package br.com.stackpanel.crudherois.controller;

import br.com.stackpanel.crudherois.domain.dto.HeroiDTO;
import br.com.stackpanel.crudherois.service.HeroiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("herois")
public class HeroiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeroiController.class);

    private final HeroiService heroiService;

    public HeroiController(HeroiService heroiService) {
        this.heroiService = heroiService;
    }

    @GetMapping("/buscar")
    public ResponseEntity<?> buscarHerois() {
        try{
            if (heroiService == null) {
                LOGGER.warn("Erro ao buscar herois");
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body("HeroiService is null");
            }

            return ResponseEntity.ok(heroiService.listarHerois());

        }catch (Exception ex){
            LOGGER.error(ex.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }catch (InternalError error){
            LOGGER.error(error.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error.getMessage());
        }
    }

}
