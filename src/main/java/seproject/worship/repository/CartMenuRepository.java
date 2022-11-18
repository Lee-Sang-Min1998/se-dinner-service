package seproject.worship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seproject.worship.entity.CartMenu;

import java.util.List;
import java.util.Optional;

public interface CartMenuRepository extends JpaRepository<CartMenu, Long> {

    List<CartMenu> findAllByCustomerId(Long id);
    List<CartMenu> findAllByCustomerIdAndMenuId(Long customerId, Long menuId);
}
