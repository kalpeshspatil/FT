package order.repository;

import order.dto.CreateSellDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRepository extends CrudRepository<CreateSellDto,Long> {
}
