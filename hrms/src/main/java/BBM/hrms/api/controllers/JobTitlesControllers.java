package BBM.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BBM.hrms.business.abstracts.JobTitleService;
import BBM.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("hrms/job")
public class JobTitlesControllers {
	
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitlesControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getAll")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
	}
	
	@PostMapping("/add/{jobTitle}")
	public void add(@PathVariable String jobTitle) {
		this.jobTitleService.add(jobTitle);
	}
	

}
