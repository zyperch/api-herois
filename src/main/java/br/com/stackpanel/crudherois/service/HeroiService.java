package br.com.stackpanel.crudherois.service;


import br.com.stackpanel.crudherois.domain.dto.HeroiDTO;

import java.util.List;

public interface HeroiService {

    HeroiDTO criarHeroi(HeroiDTO heroiDTO);

    List<HeroiDTO> listarHerois();
}
