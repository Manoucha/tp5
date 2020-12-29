package com.ensim.tp5.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


import com.ensim.tp5.models.Apiadresse;
import com.ensim.tp5.models.Meteo;
import com.ensim.tp5.models.WeatherResult;

@Controller
public class MeteoController {

    private static final String KEY_API= "0f91cda3dcfab39273db7bf88b0b15ca";
 


    @PostMapping("/meteo")
    public String getMeteoGPS(@RequestParam( name ="adresse", required=true) String adresse, Model model) {
		String url = String.format("https://api-adresse.data.gouv.fr/search/?q=\"%s\"&limit=1", adresse);

        RestTemplate restTemplate = new RestTemplate();
        Apiadresse adresseResponse = restTemplate.getForObject(url , Apiadresse.class);

        Float lat = adresseResponse.getFeatures().get(0).getGeometry().getCoordinates().get(1);
        Float lon = adresseResponse.getFeatures().get(0).getGeometry().getCoordinates().get(0);

        
        url = String.format("http://api.openweathermap.org/data/2.5/weather?lon=%f&lat=%f&appid=%s&lang=fr&units=metric", lat, lon, MeteoController.KEY_API );
        WeatherResult reponse_meteo = new RestTemplate().getForObject(url, WeatherResult.class);
		

        model.addAttribute("adresse", adresse);
        model.addAttribute("lat", lat);
        model.addAttribute("lon", lon);
        model.addAttribute("meteo", reponse_meteo.weather[0].description);
        model.addAttribute("temp", reponse_meteo.main.temp);

        model.addAttribute("response", reponse_meteo.main.temp);
        

        return "meteo";
    }
}
