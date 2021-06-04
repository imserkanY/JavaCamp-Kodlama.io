package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.TechSkill;

public interface TechSkillDao extends JpaRepository<TechSkill,Integer>{

}
