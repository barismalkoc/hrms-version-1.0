package BBM.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import BBM.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
