package com.blu4ck.converter;

import com.blu4ck.converter.history.HistoryManager;
import com.blu4ck.converter.lenght.service.LConverter;
import com.blu4ck.converter.temperature.service.TConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	private final HistoryManager historyManager;

	public Application(HistoryManager historyManager) {
		this.historyManager = historyManager;}





	@Bean
	public LConverter lConverter(HistoryManager historyManager) {
		return new LConverter(historyManager);
	}

	@Bean
	public TConverter tConverter(HistoryManager historyManager) {
		return new TConverter(historyManager);
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/temperature")
	public String Temperature() {
		return "Temperature";
	}
	@GetMapping("/length")
	public String Length() {
		return "Length";
	}
	@GetMapping("/history")
	public  String History(){
		return "history";
	}
}

