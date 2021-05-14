package BBM.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BBM.hrms.business.abstracts.JobTitleService;
import BBM.hrms.dataAccess.abstracts.JobTitleDao;
import BBM.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleDao.findAll();
	}

	@Override
	public void add(String jobTitle) {
		JobTitle job = new JobTitle();
		job.setTitle(jobTitle);
		this.jobTitleDao.save(job);
		
	}

}
