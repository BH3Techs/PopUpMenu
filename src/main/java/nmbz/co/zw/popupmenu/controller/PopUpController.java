package nmbz.co.zw.popupmenu.controller;
import java.util.List;

import nmbz.co.zw.popupmenu.model.PopUpMenu;
import nmbz.co.zw.popupmenu.service.PopUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  

//mark class as Controller  
@RestController  
public class PopUpController {
//autowire the PopUpService class  
@Autowired
PopUpService popUpsService;


@GetMapping("/getpopUps")
private List<PopUpMenu> getPopUps()
{  
return popUpsService.getAllPopUps();
}  

@GetMapping("/getPopUp/{id}")
private PopUpMenu getPopUp(@PathVariable("id") long id)
{  
return popUpsService.getPopUpById(id);  
}  

@DeleteMapping("/deletePopUp/{id}")
private void deletePopUp(@PathVariable("id") long id){
popUpsService.delete(id);
}  

@PostMapping("/savePopUps")
private long savePopUp(@RequestBody PopUpMenu popUpMenu) {
popUpsService.saveOrUpdate(popUpMenu);
return popUpMenu.getId();
}  

@PutMapping("/updatePopUps")
private PopUpMenu update(@RequestBody PopUpMenu popUpMenu)
{  
popUpsService.saveOrUpdate(popUpMenu);
return popUpMenu;
}  
} 