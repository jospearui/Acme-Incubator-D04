
package acme.features.anonymous.technologyRecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.technologyRecords.TechnologyRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/technology-record/")
public class AnonymousTechnologyRecordController extends AbstractController<Anonymous, TechnologyRecord> {

	@Autowired
	private AnonymousTechnologyRecordListService	listservice;
	@Autowired
	private AnonymousTechnologyRecordShowService	showservice;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listservice);
		super.addBasicCommand(BasicCommand.SHOW, this.showservice);
	}

}
