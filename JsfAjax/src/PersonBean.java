import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String selamVer() {
		if(name!=null) {
			return "merhaba "+ name +"aramýza hoþ geldin";
		}
		return "";
		
	}
	
}
