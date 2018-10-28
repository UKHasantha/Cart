package lk.ijse.alma.service;

import lk.ijse.alma.dto.FeedBackDTO;
import java.util.ArrayList;

public interface FeedBackRepositoryService {
    public ArrayList<FeedBackDTO>getAllFeedBack();
    public boolean savefdback(FeedBackDTO feedBackDTO);
    public boolean deletefdback(FeedBackDTO feedBackDTO);
}
