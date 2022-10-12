package Example.core.services.impl;

import org.osgi.service.component.annotations.Component;

import Examples.core.utils.Network;

import static Example.core.constants.AppConstants.URL;



/**
 * @author Anirudh Sharma



 * 
 * Implementation of ReadJsonService
 */
@Component(immediate = true, service = Example.core.services.ReadJsonService.class)
public class ReadJsonDataImpl implements Example.core.services.ReadJsonService {

	@Override
	public String getDataDetails() {
		String responce =Network.readJson(URL);
		return responce;
	}


	

}