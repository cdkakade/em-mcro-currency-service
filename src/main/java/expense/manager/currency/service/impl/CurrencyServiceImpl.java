package expense.manager.currency.service.impl;

import expense.manager.common.dto.currency.response.CurrencyResponse;
import expense.manager.currency.entity.CurrencyEntity;
import expense.manager.currency.repository.CurrencyRepository;
import expense.manager.currency.service.CurrencyService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository repository;

    @Override
    public List<CurrencyResponse> findAll() {
        Iterable<CurrencyEntity> currencies = repository.findAll();
        ModelMapper mapper = new ModelMapper();

        return mapper.map(currencies, new TypeToken<List<CurrencyResponse>>() {
        }.getType());
    }
}
