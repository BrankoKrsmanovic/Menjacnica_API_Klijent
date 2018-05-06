package logic;

import java.io.IOException;
import java.util.ArrayList;

import util.GetCountriesUtil;
import util.URLConnectionUtil;

public class LogicController {

	public String URLConnection(String url) throws IOException {
		return URLConnectionUtil.getContent(url);
	}
	
	public ArrayList<Country> getCountries(){
		return GetCountriesUtil.listOfCountries();
	}
}
