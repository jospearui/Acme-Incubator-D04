
package acme.features.anonymous.notices;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.notices.Notice;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/notice/")
public class AnonymousNoticeController extends AbstractController<Anonymous, Notice> {

	@Autowired
	private AnonymousNoticeListService	listservice;
	@Autowired
	private AnonymousNoticeShowService	showservice;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listservice);
		super.addBasicCommand(BasicCommand.SHOW, this.showservice);
	}

}
