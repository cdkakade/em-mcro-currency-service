package expense.manager.currency.service;

import expense.manager.common.dto.currency.response.CurrencyResponse;
import java.util.List;

public interface CurrencyService {
    List<CurrencyResponse> findAll();

    CurrencyResponse findById(Long id);
}
