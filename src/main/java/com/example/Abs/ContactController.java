package com.example.Abs;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

 

@Controller
public class ContactController {
	@Autowired
    private ContactRepository contactRepository;
	
	@Autowired
	private Userservice userService;
	 

	@GetMapping("/Website")
    public String hello(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "Website";
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute ContactForm contactForm) {
        contactRepository.save(contactForm);
        return "redirect:/Website";
    }
    
    
    @GetMapping("/AboutAbhishyandh")
    public String About(Model model) {
    	return "AboutAbhishyandh";
    }
    
    @GetMapping("/ITSERVICES")
    public String ITServices(Model model) {
    	return "ITSERVICES";
    }
    
    @GetMapping("/ITTRAININGS")
    public String ITTrainings(Model model) {
    	return "ITTRAININGS";
    }
    
    @GetMapping("/Careers")
    public String Careers(Model model) {
    	return "Careers";
    }
    
    
    @GetMapping("/HRSERVICES")
    public String HRServices(Model model) {
    	 
    	return "HRSERVICES";
    }
    
    
    @GetMapping("/BPOSERVICES")
    public String BPOServices(Model model) {
    	return "BPOSERVICES";
    }
    
    
    @GetMapping("/FullStackJavaCourse")
    public String FullStackJava(Model model) {
    	 List<String> courseList = Arrays.asList(
    	            "Fundamentals Of Java programming",
    	            "Core Java concepts",
    	            "Advanced Java",
    	            "SpringBoot Framework",
    	            "HTML",
    	            "CSS",
    	            "Bootstrap",
    	            "JS",
    	            "MySQL"
    	        );
    	        model.addAttribute("courseList", courseList);
    	return "FullStackJavaCourse";
    }
    
    @GetMapping("/PythonFullStack")
    public String PythonFullStackk(Model model) {
    	 List<String> courseList = Arrays.asList(
 	            "Fundamentals Of Python programming",
 	            "Core Python concepts",
 	            "Advanced Python",
 	            "Django Framework",
 	            "HTML",
 	            "CSS",
 	            "Bootstrap",
 	            "JS",
 	            "MySQL"
 	        );
 	        model.addAttribute("courseList", courseList);
    	return "PythonFullStack";
    }
    
    @GetMapping("/DotNetCourse")
    public String DotNet(Model model) {
    	 List<String> courseList = Arrays.asList(
 	            "Fundamentals Of Dot Net programming",
 	            "Core Dot Net concepts",
 	            "Advanced Dot Net",
 	            ".Net Entity Framework",
 	            "HTML",
 	            "CSS",
 	            "Bootstrap",
 	            "JS",
 	            "MySQL"
 	        );
 	        model.addAttribute("courseList", courseList);
    return "DotNetCourse";
    }
    
    @GetMapping("/PowerBi")
    public String PowerBi(Model model) {
    	 List<String> courseList = Arrays.asList(
 	            "Introduction To Sisense Bi",
 	            "Data integration",
 	            "Data Visualization and Preparation",
 	            "Data Modeling",
 	            "Advanced Analytics",
 	            "DashBoard and Report Design",
 	            "User and Access Management",
 	            "Performance Optimization",
 	            "Sisense APIs and Extensions",
 	            "Deployement and Administration"
 	        );
 	        model.addAttribute("courseList", courseList);
    	return "PowerBi";
    }
    
    @GetMapping("/ArtificialIntelligenceMl")
    public String AIML(Model model) {
    	 List<String> courseList = Arrays.asList(
 	            "Introduction to AI/ML",
 	            "Data Preparation",
 	            "Supervised Learning",
 	            "UnSuperVised Learning",
 	            "Neural Networks and Deep Learning",
 	            "Model Evaluation and Tuning",
 	            "Advanced Machine Learning Topics",
 	            "AI AND ML Application",
 	            "Deployement and Production"
 	        );
 	        model.addAttribute("courseList", courseList);
    	return "ArtificialIntelligenceML";
    }
    
    
    @GetMapping("/Angular")
    public String Angular(Model model) {
    	return "Angular";
    }
    
    @GetMapping("/React")
    public String React(Model model) {
    	return "ReactJs";
    }
    
    @GetMapping("/ionic")
    public String Ionic(Model model) {
    	return "Ionic";
    }
    
    @GetMapping("/Hr/recruitmentservice")
    public String RecruitmentService(Model model) {
    return "RecruitmentService";
    }
    
    
    @GetMapping("/Hr/thirdpartypayroll")
    public String ThirdPartyPayroll(Model model) {
    	return "ThirdPartyPayroll";
    }
    
    @GetMapping("/Hr/payroll")
    public String Payroll(Model model) {
    	return "Payroll";
    }
    
    
    
    
    
    @GetMapping("/Hr/EmployeeEngagement")
    public String EmployeeEngage(Model model) {
    	return "EmployeeEngagement";
    }
    
    @GetMapping("/Hr/backgroundverification")
    public String BackgroundVerification(Model model) {
    	return "BackgroundVerification";
    }
    
    @GetMapping("/Hr/Internship")
    public String InternshipProgram(Model model) {
    	return "InternshipProgram";
    }
    
    @GetMapping("/recruitment")
    public String Recruitment(Model model) {
    	return "Recruitment";
    }
    
    
    
    @GetMapping("/resumebuilding")
    public String ResumeBuilding(Model model) {
    	return "ResumeBuilding";
    }
    
    
    @GetMapping("/interviewskillsdevelopment")
    public String InterviewSkillDevelopment(Model model) {
    	return "InterviewSkillDevelopment";
    }
    @GetMapping("businessdevelop")
    public String BusinessDevelopment(Model model) {
    	return "BusinessDevelopment";
    }
    
    @GetMapping("/Hroperations")
    public String HR(Model model) {
    	return "HROperations";
    	
    }
    
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "AbhishyandhRegister";  
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, RedirectAttributes redirectAttributes, Model model) {
        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("message", "Registration successful!");
        if (user.getFirstName() == null || user.getFirstName().isEmpty()) {
            model.addAttribute("message", "First name is required");
            return "AbhishyandhRegister";
        }
        if (user.getLastName() == null || user.getLastName().isEmpty()) {
            model.addAttribute("message", "Last name is required");
            return "AbhishyandhRegister";
        }
        if (user.getEmail() == null || user.getEmail().isEmpty() || !user.getEmail().matches("\\S+@\\S+\\.\\S+")) {
            model.addAttribute("message", "Valid email is required");
            return "AbhishyandhRegister";
        }
        if (user.getPhone() != null && !user.getPhone().isEmpty() && !user.getPhone().matches("\\d{10}")) {
            model.addAttribute("message", "Phone must be 10 digits");
            return "AbhishyandhRegister";
        }

        // If validation passes, process the registration
        // Add your registration logic here (e.g., saving to database)

        model.addAttribute("message", "Registration successful!");
        return "redirect:/Website";
    }

   
    
    
    
}
