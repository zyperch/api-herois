package br.com.stackpanel.crudherois.repository;

import br.com.stackpanel.crudherois.domain.Heroi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroiRepository extends JpaRepository<Heroi, Long> {

    @Query(value = "select * from THERO", nativeQuery = true)
    List<Heroi> listarHerois();

}
