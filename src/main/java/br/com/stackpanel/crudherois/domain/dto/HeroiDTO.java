package br.com.stackpanel.crudherois.domain.dto;

import br.com.stackpanel.crudherois.domain.Heroi;
import br.com.stackpanel.crudherois.domain.classe.ClasseHeroi;

import java.math.BigDecimal;

public class HeroiDTO {

    private Long id;
    private String name;
    private BigDecimal life;
    private BigDecimal power;
    private ClasseHeroi classe;

    public HeroiDTO() {
    }

    public HeroiDTO(Long id, String name, BigDecimal life, BigDecimal power, ClasseHeroi classe) {
        this.id = id;
        this.name = name;
        this.life = life;
        this.power = power;
        this.classe = classe;
    }

    public HeroiDTO(Heroi entidade){
        this.id = entidade.getId();
        this.name = entidade.getName();
        this.life = entidade.getLife();
        this.power = entidade.getPower();
        this.classe = entidade.getClasse();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLife() {
        return life;
    }

    public void setLife(BigDecimal life) {
        this.life = life;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public ClasseHeroi getClasse() {
        return classe;
    }

    public void setClasse(ClasseHeroi classe) {
        this.classe = classe;
    }
}
