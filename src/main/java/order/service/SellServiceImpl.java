package order.service;

import order.dto.CreateSellDto;
import org.springframework.stereotype.Service;

@Service("SellService")
public class SellServiceImpl implements SellService{
    @Override
    public void sellOrderFromRetailers(CreateSellDto orderDto) {

    }
}
