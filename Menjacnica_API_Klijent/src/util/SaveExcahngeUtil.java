package util;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import logic.Exchange;

public class SaveExcahngeUtil {

	public static void save(String from, String to, Double rate) throws Exception {
		Exchange exchange = new Exchange();
		exchange.setIzValute(from);
		exchange.setuValutu(to);
		exchange.setKurs(rate);

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		exchange.setDatumVreme(format.format(date));

		Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		String s = gson.toJson(exchange);
		JsonObject objJSON = gson.fromJson(s, JsonObject.class);
		JsonArray log = null;

		FileReader reader = new FileReader("Data/log.json");
		log = gson.fromJson(reader, JsonArray.class);
		reader.close();
		
		FileWriter writer = new FileWriter("Data/log.json");
		if(log == null) 
			log = new JsonArray();

		log.add(objJSON);
		writer.append(gson.toJson(log));
		writer.close();
	}
}
