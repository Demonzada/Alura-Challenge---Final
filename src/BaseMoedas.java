import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;


public class BaseMoedas {
    private double cotacaoMoeda;


    public void converter(escolhaQualMoeda opc, String opc2) throws IOException, InterruptedException {
// Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/bbd8e0e5633c291e78b5318a/latest/" + opc.getEscolhaConversao();

// Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
        JsonObject req_result = jsonobj.get("conversion_rates").getAsJsonObject();

        this.cotacaoMoeda = Double.parseDouble(String.valueOf(req_result.get(opc2)));

    }

    public double getCotacaoMoeda() {
        return cotacaoMoeda;
    }
}
