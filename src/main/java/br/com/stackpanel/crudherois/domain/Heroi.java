package br.com.stackpanel.crudherois.domain;

import br.com.stackpanel.crudherois.domain.classe.ClasseHeroi;
import br.com.stackpanel.crudherois.domain.dto.HeroiDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "THERO")
public class Heroi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal life;

    private BigDecimal power;

    private ClasseHeroi classe;

    public Heroi() {
    }

    public Heroi(Long id, String name, BigDecimal life, BigDecimal power, ClasseHeroi classe) {
        this.id = id;
        this.name = name;
        this.life = life;
        this.power = power;
        this.classe = classe;
    }

    public Heroi(HeroiDTO dto){
        this.id = dto.getId();
        this.name = dto.getName();
        this.life = dto.getLife();
        this.power = dto.getPower();
        this.classe = dto.getClasse();
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
