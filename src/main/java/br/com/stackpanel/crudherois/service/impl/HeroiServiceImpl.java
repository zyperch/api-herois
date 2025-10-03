package br.com.stackpanel.crudherois.service.impl;

import br.com.stackpanel.crudherois.domain.Heroi;
import br.com.stackpanel.crudherois.domain.dto.HeroiDTO;
import br.com.stackpanel.crudherois.repository.HeroiRepository;
import br.com.stackpanel.crudherois.service.HeroiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroiServiceImpl implements HeroiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HeroiServiceImpl.class);

    private final HeroiRepository heroiRepository;

    public HeroiServiceImpl(HeroiRepository heroiRepository) {
        this.heroiRepository = heroiRepository;
    }

    @Override
    public HeroiDTO criarHeroi(HeroiDTO heroiDTO) {
        try{
            Heroi heroi = new Heroi(heroiDTO);

            Heroi heroiSalvo = heroiRepository.save(heroi);

            return new HeroiDTO(heroiSalvo);
        }catch (Exception e){
            LOGGER.error("Erro ao salvar usuario: ", e);
            return null;
        }


    }

    @Override
    public List<HeroiDTO> listarHerois() {
        List<Heroi> listaDeHerois = heroiRepository.listarHerois();

        List<HeroiDTO> listaDeHeroisDTO = new ArrayList<>();

        for (Heroi heroi : listaDeHerois) {
            listaDeHeroisDTO.add(new HeroiDTO(heroi));
        }

        return listaDeHeroisDTO;
    }
}
