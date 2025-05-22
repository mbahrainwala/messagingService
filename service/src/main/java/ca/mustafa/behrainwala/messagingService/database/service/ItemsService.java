package ca.mustafa.behrainwala.messagingService.database.service;

import ca.mustafa.behrainwala.messagingService.database.dbo.Items;
import ca.mustafa.behrainwala.messagingService.database.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {
    @Autowired
    private ItemsRepository itemsRepository;

    public List<Items> getItems(){
        addItems();
        return itemsRepository.findAll();
    }

    public void addItems(){
        itemsRepository.deleteAll();
        Items item = new Items();
        item.setDescription("Description for Item1");
        item.setTitle("Item1");
        itemsRepository.save(item);

        item = new Items();
        item.setDescription("Description for Item2");
        item.setTitle("Item2");
        itemsRepository.save(item);

        item = new Items();
        item.setDescription("Description for Item3");
        item.setTitle("Item3");
        itemsRepository.save(item);
    }
}
