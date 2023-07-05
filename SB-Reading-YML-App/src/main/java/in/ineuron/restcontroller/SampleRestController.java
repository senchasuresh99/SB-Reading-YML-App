package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.constants.AppConstants;
import in.ineuron.props.DemoConfigProps;

@RestController
@RequestMapping("/api/test")
public class SampleRestController {

	@Autowired
	private DemoConfigProps demoConfigProps;

	@GetMapping("/wish")
	public String welcomeMsg() {
		return demoConfigProps.getProperties().get(AppConstants.WELCOME_MSG);
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return demoConfigProps.getProperties().get(AppConstants.GREET_MSG);
	}
	
	@GetMapping("/tst")
	public String testMsg() {
		return demoConfigProps.getProperties().get(AppConstants.TEST_MSG);
	}
}
