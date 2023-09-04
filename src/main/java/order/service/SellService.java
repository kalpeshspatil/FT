package order.service;

import order.dto.CreateSellDto;
import org.springframework.stereotype.Service;


public interface SellService {

    public void sellOrderFromRetailers(CreateSellDto orderDto);
}
