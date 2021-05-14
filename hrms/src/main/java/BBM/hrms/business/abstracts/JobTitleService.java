package BBM.hrms.business.abstracts;

import java.util.List;

import BBM.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
	void add(String jobTitle);

}
