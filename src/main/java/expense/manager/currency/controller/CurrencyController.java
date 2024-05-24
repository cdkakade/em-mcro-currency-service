package expense.manager.currency.controller;

import expense.manager.common.dto.currency.response.CurrencyResponse;
import expense.manager.currency.service.CurrencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currencies")
@Slf4j
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<CurrencyResponse> findAll() {
        log.info("currencies API called");
        return service.findAll();
    }

    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public CurrencyResponse findById(@PathVariable Long id) throws Exception {
        log.info("currencies/{id} API called");
        return service.findById(id);
    }

}
