package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {

}
