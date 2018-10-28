package lk.ijse.alma.service.impl;

import lk.ijse.alma.dto.FeedBackDTO;
import lk.ijse.alma.entity.FeedBack;
import lk.ijse.alma.entity.Item;
import lk.ijse.alma.repository.FeedBackRepository;
import lk.ijse.alma.repository.ItemRepository;
import lk.ijse.alma.service.FeedBackRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FeedBackServiceImpl implements FeedBackRepositoryService {

    @Autowired
    private FeedBackRepository feedBackRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ArrayList<FeedBackDTO> getAllFeedBack() {
        ArrayList<FeedBackDTO> allfdback=new ArrayList<>();
        Item item=new Item();
        item.setItemcode(item.getItemcode());
        List<FeedBack>feedBacks=feedBackRepository.findAll();
        for (FeedBack feedBack:feedBacks) {
            FeedBackDTO fdback=new FeedBackDTO(feedBack.getFdmsg(),
                    feedBack.getFddate());
            allfdback.add(fdback);
        }
        return allfdback;
    }

    @Override
    public boolean savefdback(FeedBackDTO feedBackDTO) {
        Item item=new Item();
        item.setItemcode(feedBackDTO.getItemcode());
        FeedBack fd=new FeedBack(feedBackDTO.getFdmsg(),feedBackDTO.getFddate());
        feedBackRepository.save(fd);
        return true;
    }

    @Override
    public boolean deletefdback(FeedBackDTO feedBackDTO) {
        return false;
    }
}
