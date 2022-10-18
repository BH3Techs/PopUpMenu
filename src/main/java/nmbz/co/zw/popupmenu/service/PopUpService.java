package nmbz.co.zw.popupmenu.service;

import java.util.ArrayList;
    import java.util.List;

import nmbz.co.zw.popupmenu.model.PopUpMenu;
import nmbz.co.zw.popupmenu.repository.PopUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    //defining the business logic  
    @Service  
    public class PopUpService {
        @Autowired
        PopUpRepo popUpRepo;
        //getting all popUps record by using the method findaAll() of CrudRepository
        public List<PopUpMenu> getAllPopUps() {
            List<PopUpMenu> popUps = new ArrayList<PopUpMenu>();
            popUpRepo.findAll().forEach(popUpMenu1 -> popUps.add(popUpMenu1));
            return popUps;
        }

        //getting a specific record by using the method findById() of CrudRepository
        public PopUpMenu getPopUpById(Long id) {
            return popUpRepo.findById(id).get();
        }

        //saving a specific record by using the method save() of CrudRepository
        public void saveOrUpdate(PopUpMenu popUpMenu) {
            popUpRepo.save(popUpMenu);
        }

        //deleting a specific record by using the method deleteById() of CrudRepository
        public void delete(long id)
        {
        popUpRepo.deleteById(id);
        }
        //updating a record
        public void update(PopUpMenu popUpMenu, long id)
        {
        popUpRepo.save(popUpMenu);
        }
    }  