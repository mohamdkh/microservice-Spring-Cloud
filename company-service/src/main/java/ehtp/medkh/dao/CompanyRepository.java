package ehtp.medkh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ehtp.medkh.entities.company;
@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<company,Long>{

}
