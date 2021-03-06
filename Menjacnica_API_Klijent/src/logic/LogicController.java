package logic;

import java.io.IOException;
import java.util.ArrayList;

import util.GetCountriesUtil;
import util.ReturnExchangeRateUtil;
import util.SaveExcahngeUtil;
import util.URLConnectionUtil;

public class LogicController {

	public String URLConnection(String url) throws IOException {
		return URLConnectionUtil.getContent(url);
	}
	
	public ArrayList<Country> getCountries(){
		return GetCountriesUtil.listOfCountries();
	}
	
	public double returnExchangeRate(String from, String to) throws Exception{
		return ReturnExchangeRateUtil.convert(from, to);
	}
	
	public void saveExchange(String from, String to, Double rate) throws Exception {
		SaveExcahngeUtil.save(from, to, rate);
	}
}
