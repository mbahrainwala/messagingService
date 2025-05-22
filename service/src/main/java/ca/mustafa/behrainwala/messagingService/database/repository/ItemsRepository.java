package ca.mustafa.behrainwala.messagingService.database.repository;

import ca.mustafa.behrainwala.messagingService.database.dbo.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {
}
