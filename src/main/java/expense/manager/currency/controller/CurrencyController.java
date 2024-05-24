package expense.manager.currency.controller;

import expense.manager.common.dto.currency.response.CurrencyResponse;
import expense.manager.currency.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<CurrencyResponse> findAll() {
        return service.findAll();
    }

}
