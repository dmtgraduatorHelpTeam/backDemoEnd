package testUtil;

import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dmsdbj.dmt.graduatorHelp.facade.CommercialOppotunityFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.CompanyFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.DictionaryFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.EducationFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.HomeInfoFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.LandScapeFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.LocalProductFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.PersonalInfoFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.PersonCompanyFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.PictureFacade;
import com.dmsdbj.dmt.graduatorHelp.facade.SkillPointFacade;

public class CommonFacade {
	public BeanFactory factory;
    public CommercialOppotunityFacade commercialOppotunityFacade;
    public CompanyFacade companyFacade;
    public DictionaryFacade dictionaryFacade;
    public EducationFacade educationFacade;
    public HomeInfoFacade homeInfoFacade;
    public LandScapeFacade landScapeFacade;
    public LocalProductFacade localProductFacade;
    public PersonalInfoFacade personalInfoFacade;
    public PersonCompanyFacade personCompanyFacade;
    public PictureFacade pictureFacade;
    public SkillPointFacade skillPointFacade;
	

	@Before
	public void setUp() {
		factory = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		commercialOppotunityFacade = (CommercialOppotunityFacade) factory.getBean("commercialOppotunityFacade");
		companyFacade = (CompanyFacade) factory.getBean("companyFacade");
		dictionaryFacade = (DictionaryFacade) factory.getBean("dictionaryFacade");
		educationFacade = (EducationFacade) factory.getBean("educationFacade");
		homeInfoFacade = (HomeInfoFacade) factory.getBean("homeInfoFacade");
		landScapeFacade = (LandScapeFacade) factory.getBean("landScapeFacade");
		localProductFacade = (LocalProductFacade) factory.getBean("localProductFacade");
		personalInfoFacade = (PersonalInfoFacade) factory.getBean("personalInfoFacade");
		personCompanyFacade = (PersonCompanyFacade) factory.getBean("personCompanyFacade");
		pictureFacade = (PictureFacade) factory.getBean("pictureFacade");
		skillPointFacade = (SkillPointFacade) factory.getBean("skillPointFacade");
	}
}
