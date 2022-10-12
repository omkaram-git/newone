package Example.core.models.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import Example.core.models.Multifield;

public class Multifiedimpl  implements Multifield {

	@ValueMapValue
	private String title;
	
	
	@ValueMapValue
	private String subtitle;
	
	
	@ValueMapValue
	private List<String> description;
	
	@Override
	public String getTitletext() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getTitlesubtext() {
		// TODO Auto-generated method stub
		return subtitle;
	}

	@Override
	public List<Map<String, String>> getAccordion() {
		
		if(description != null) {
			List<Map<String,String>> policy=new ArrayList();
			for(int i=0;i<description.size();i++) {
				Map<String,String> result= new HashMap();
				result.put("description", description.get(i));
				policy.add(result);
			}
			return policy;
		}else {
			return Collections.emptyList();
		}
		
		
	
		
	}


}
