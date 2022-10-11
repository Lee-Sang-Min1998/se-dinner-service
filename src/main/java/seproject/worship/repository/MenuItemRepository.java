package seproject.worship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seproject.worship.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
